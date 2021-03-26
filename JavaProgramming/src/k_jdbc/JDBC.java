package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
		/*
JDBC(Java Database Connectivity)
- 자바와 데이터베이스를 연결해주는 라이브러리
- ojdbc : 오라클 JDBC

JDBC 작성단계
1. Connection 생성(DB 연결)
2. Statement 생성(쿼리 작성)
3. Query 실행
4. ResultSet에서 결과 추출(select인 경우)
5. ResultSet, Statement, Connetion 닫기
		*/
		
		//데이터베이스 접속 정보

		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //접속할 DB의 주소
//'jdbc:oracle:thin' : 오라클에 접속한다.
//'@localhost' : 사용자 IP주소
//'1521' : 포트번호
//'xe' : DB이름
		
		String user = "pc18"; //사용자 계정
		String password = "java"; //계정 비밀번호
		
		//변수 생성
		Connection con = null; //DB에 연결된 상태를 담는 객체
		PreparedStatement ps = null; //작성한 쿼리문을 담는 객체
		ResultSet rs = null; //select의 결과를 담기위한 변수 이므로 select를 하지 않을 때는 필요 없다.
		
		try {
			//1. Connection 생성(DB 연결)
			//Driver 등록 
			//자바와 오라클은 서로 다른 프로그램이므로 서로 커뮤니케이션이 필요한데, 그 중간다리 역할이 드라이버이다.
			//DriverManager : DB에 접속하기 위한 드라이버들을 관리해주는, JDBC의 가장 기본적인 서비스이다.
			//getgetConnection() : 입력된 파라미터를 바탕으로 오라클에 접속하게 한다.
			con = DriverManager.getConnection(url, user, password); 
			
			//2. Statement 생성(쿼리 작성)
			String sql = "SELECT * FROM MEMBER";
			ps = con.prepareStatement(sql); // prepareStatement()메서드를 통해 DB에 작성한 쿼리문을 보낸다.
			
			//3. Query 실행
			//executeQuery()메서드는 쿼리문을 실행하게 한다.
			//executeUpdate()메서드는 쿼리문 실행에 영향받은 행의 개수를 저장한다.
			//실행은 두 가지로 나뉜다.
			//(1)select
			rs = ps.executeQuery(); //select문의 결과를 저장한다.
			
			//(2)그 외(insert, update, delete)
//			int result = ps.executeUpdate(); // 여기서는 select문을 사용하므로 주석처리하겠다.
			
			//4. ResultSet에서 결과 추출(select인 경우)
			while(rs.next()){ //다음 행을 바라보면서 다음 행이 존재하는지 여부를 리턴해준다., 데이터가 없을때까지 반복한다. 
				String memId = rs.getString(1); //인덱스 번호 사용 : 첫 번째 컬럼('MEM_ID')의 값을 가져오겠다.
				String memPass= rs.getString("MEM_PASS"); //컬럼명 사용 : select 결과 중 'MEM_PASS'에대한 정보 저장
				System.out.println("MEM_ID : " + memId + "/ MEM_PASS : " + memPass);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {//5. ResultSet, Statement, Connetion 닫기 : DB 연결 종료, 닫을 때는열 때의 역순으로 닫아야한다.
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
	}

}



























