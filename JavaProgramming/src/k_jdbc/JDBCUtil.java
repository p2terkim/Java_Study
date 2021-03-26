package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {

	//싱글톤 패턴 : 인스턴스의 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴 - 메모리 절약 가능
	//이 클래스에서 객체를 생성하고 사용한다음에 다른 클래스에 빌려주는 의미
	private JDBCUtil(){ //생성자 앞에 private을 붙이면 다른 클래스에서 호출을 못하므로 객체생성도 할 수 없게된다. 객체를 이 클래스에서만 생성할 수있다.

	}

	//인스턴스를 보관할 변수
	private static JDBCUtil instance;

	//객체를 생성해서 (인스턴스를)빌려주는 메서드 - 다른 클래스에서 이 메서드를 호출하면된다.
	public static JDBCUtil getInstance(){
		if(instance == null){//객체 저장 공간이 null일 경우에만 객체 생성이 가능하다. - 처음에만  객체 생성이 가능하다.
			instance = new JDBCUtil();
		}
		return instance;
	}

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "pc18";
	String password = "java";

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	/*
Map<String, Object> selectOne(String sql) - 조회 결과가 한 줄인 경우에 사용, ?가 하나
Map<String, Object> selectOne(String sql, List<Object> param) - ?가 많은 경우
List<Map<String, Object>> selectList(String sql) - 조회결과가 여러 줄인 경우, ?가 하나
List<Map<String, Object>> selectList(String sql, List<Object> param) - ?가 많은 경우
int update(String sql) -  외 쿼리문(update, insert, delete)에서는 이런 형태 
int update(String sql, List<Object> param)

이렇게 총 여섯 개의 메서드를 작성해줘야한다.

	 *String sql : 작성한 쿼리
	 *List<Object> param : ?에 들어갈 값을 순서대로 List에 담는다.

	 */

	//selectOne(String sql) 메서드 - 한 줄 조회(조회 결과가 한 줄)
	public Map<String, Object> selectOne(String sql) {
		
		Map<String, Object> row = null;
		
		try {
			//오라클 연결
			con = DriverManager.getConnection(url, user, password);
			
			//쿼리 준비
			ps = con.prepareStatement(sql);
			
			//쿼리 실행
			rs = ps.executeQuery();
			
			//쿼리 실행 결과에 대한 메타데이터 - 컬럼 수 알기위해...
			ResultSetMetaData metaData = rs.getMetaData();
			
			int columnCount = metaData.getColumnCount();
			
			//실행결과 출력	
			//컬럼 수 만큼 반복
			if(rs.next()){//rs.next를 하면 첫 번째 줄을 바라본다. 한 줄도 조회 되지않을 경우를 대비해서 if문을 작성하였다.
				row = new HashMap<>();
				for(int i = 1; i < columnCount; i++){
					row.put(metaData.getColumnName(i), rs.getObject(i));//키는 컬럼명, 값은 데이터 
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		return row;
		
	} //selectOne(String sql) 메서드
	
	//selectOne(String sql, List<Object> param) 메서드
	public Map<String, Object> selectOne(String sql, List<Object> param) {
		Map<String, Object> row = null;
		
		try {
			//오라클 연결
			con = DriverManager.getConnection(url, user, password);
			
			//쿼리 준비
			ps = con.prepareStatement(sql);
			
			//?값 셋팅
			for(int i = 0; i < param.size(); i++){ //?에 들어가야할 값을 정리
				ps.setObject(i + 1, param.get(i)); //?는 1부터 시작하므로 i + 1을 해준다.
			}
			//쿼리 실행
			rs = ps.executeQuery();
			
			//쿼리 실행 결과에 대한 메타데이터
			ResultSetMetaData metaData = rs.getMetaData();
			
			int columnCount = metaData.getColumnCount();
			
			//실행결과 출력	
			//컬럼 수 만큼 반복
			if(rs.next()){
				row = new HashMap<>();
				for(int i = 1; i <= columnCount; i++){
					row.put(metaData.getColumnName(i), rs.getObject(i));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		return row;
	} //selectOne(String sql, List<Object> param) 메서드
	
	//selectList(String sql) 메서드
	public List<Map<String, Object>> selectList(String sql){
		List<Map<String, Object>> list = new ArrayList<>();

		try {
			//오라클 연결
			con = DriverManager.getConnection(url, user, password);
			
			//쿼리 준비
			ps = con.prepareStatement(sql);
			
			//쿼리 실행
			rs = ps.executeQuery();

			//쿼리 실행 결과에 대한 메타데이터
			ResultSetMetaData metaData = rs.getMetaData();

			int columnCount = metaData.getColumnCount();

			//실행 결과 출력
			while(rs.next()){

				//HashMap row 생성
				Map<String, Object> row = new HashMap<String, Object>();

				//컬럼 수 만큼 반복
				for(int i = 1; i < columnCount; i++){
					row.put(metaData.getColumnName(i), rs.getObject(i));//키는 컬럼명, 값은 데이터 
				}
				list.add(row);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}

		return list;

	} //selectList(String sql) 메서드



	// selectList(String sql, List<Object> param) 메서드
	public List<Map<String, Object>> selectList(String sql, List<Object> param) {

		//'list' List 생성
		List<Map<String, Object>> list = new ArrayList<>();

		//파라미터를 사용하여 쿼리문 실행
		try {
			//오라클 연결
			con = DriverManager.getConnection(url, user, password);
			
			//쿼리 준비
			ps = con.prepareStatement(sql);
			
			//?값 셋팅
			for(int i = 0; i < param.size(); i++){ //?에 들어가야할 값을 정리
//				System.out.println(i + 1 + "번 물음표의 값 : " + param.get(i));
				ps.setObject(i + 1, param.get(i)); //?는 1부터 시작하므로 i + 1을 해준다.
			}
			
			//쿼리 실행
			rs = ps.executeQuery();

			//쿼리문 실행 결과에 대한 메타데이터
			ResultSetMetaData metaData = rs.getMetaData();

			int columnCount = metaData.getColumnCount();

			//실행결과 출력
			while(rs.next()){

				//HashMap row 생성
				Map<String, Object> row = new HashMap<String, Object>();

				//컬럼 수 만큼 반복
				for(int i = 1; i < columnCount; i++){
					row.put(metaData.getColumnName(i), rs.getObject(i));//키는 컬럼명, 값은 데이터 
				}
				list.add(row);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}

		return list;

	} // selectList(String sql, List<Object> param) 메서드


	//update(String sql) 메서드
	public int update(String sql){

		int result = 0;

		try {
			//오라클 연결
			con = DriverManager.getConnection(url, user, password);
			
			//쿼리 준비
			ps = con.prepareStatement(sql);
			
			//쿼리 실행
			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		return result;
	} //update(String sql) 메서드

	//update(String sql, List<Object> param) 메서드
	public int update(String sql, List<Object> param){

		int result = 0;

		try {
			//오라클 연결
			con = DriverManager.getConnection(url, user, password);
			
			//쿼리 준비
			ps = con.prepareStatement(sql);
			
			//?값 실행
			for(int i = 0; i < param.size(); i++){ //?에 들어가야할 값을 정리
				ps.setObject(i + 1, param.get(i)); //?는 1부터 시작하므로 i + 1을 해준다.
			}
			
			//쿼리 실행
			result = ps.executeUpdate();
//			if(0 < result){
//				System.out.println("완료되었습니다.");
//			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		return result;
	}//update(String sql, List<Object> param) 메서드
}


























