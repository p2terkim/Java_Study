package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import e_oop.ScanUtil;

public class C_JDBCBoard {
	
	/*
	 * 오라클 데이터베이스에 게시판 테이블을 생성하고, 게시판 프로그램을 만들어주세요.
	 * 테이블 : TB_JDBC_BOARD
	 * 컬럼 : BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE
	 */
	
	//접속정보
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "pc18";
	String password = "java";
	//변수
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
	
	//main() 메서드
	public static void main(String[] args) {
		new C_JDBCBoard().start();
	}//main() 메서드
	
	//start() 메서드
	private void start() {
		while(true) {
			try { //게시판 정보(번호/제목/작성자/작성일)출력을 위한 블럭
				
				//오라클 연결
				con = DriverManager.getConnection(url, user, password);
				
				//쿼리 작성
				String sql = "SELECT BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE FROM TB_JDBC_BOARD";
				
				//쿼리 준비
				ps =con.prepareStatement(sql);
				
				//쿼리 실행
				rs = ps.executeQuery();
				
				System.out.println("-----------------------------------");
				System.out.println("번호\t제목\t작성자\t작성일");
				System.out.println("-----------------------------------");
				
				//쿼리문 결과 출력
				while(rs.next()){
					
					//등록일 형식
					java.util.Date date = rs.getDate("reg_date");
					String regDate = format.format(date);
					
					//결과 정보 불러오기(getInt, getString...) - 타입에 맞게 사용하자
					System.out.println(rs.getInt("board_no") + "\t"
							+ rs.getString("title") + "\t"
							+ rs.getString("user_id") + "\t"
							+ regDate);
				}
				System.out.println("-----------------------------------");

			} catch (SQLException e) {
				e.printStackTrace();
			} finally { //접속 닫기
				if(rs != null) try { rs.close(); } catch(Exception e) {}
				if(ps != null) try { ps.close(); } catch(Exception e) {}
				if(con != null) try { con.close(); } catch(Exception e) {}
			}
			System.out.println("1.조회\t2.등록\t0.종료");
			System.out.print("입력>");
			int input = ScanUtil.nextInt();
			
			switch(input) {
			case 1://조회
				selectBoard();
				break;
			case 2://등록
				insertBoard();
				break;
			case 0://종료
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			}
		}
	}
	
	//selectBoard() 메서드
	private void selectBoard() {
		System.out.print("조회할 게시물 번호>");
		int input = ScanUtil.nextInt();
		int boardNo = 0;
		
		try {
			//오라클 연결
			con = DriverManager.getConnection(url, user, password);
			
			//쿼리 작성
			String sql = "SELECT BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE FROM TB_JDBC_BOARD WHERE BOARD_NO = ?";
			
			//쿼리 준비
			ps = con.prepareStatement(sql);
			//?값 셋팅
			ps.setInt(1, input);
			
			//쿼리 실행
			rs = ps.executeQuery();
			
			//결과 출력
			while(rs.next()){
				boardNo = rs.getInt("board_no");
				System.out.println("번호\t: " + rs.getInt("board_no"));
				System.out.println("작성자\t: " + rs.getString("user_id"));
				System.out.println("작성일\t: " + rs.getDate("reg_date"));
				System.out.println("제목\t: " + rs.getString("title"));
				System.out.println("내용\t: " + rs.getString("content"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		System.out.println("1.수정\t2.삭제\t0.목록");
		System.out.println("입력>");
		input = ScanUtil.nextInt();
		
		switch (input) {
		case 1: //수정
			updateBoard(boardNo);
			break;
		case 2: //삭제
			deleteBoard(boardNo);
			break;
		}
		
	}//selectBoard() 메서드
	
	//updateBoard(int boardNo) 메서드
	private void updateBoard(int boardNo) {
		
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		
		try {
			//오라클 연결
			con = DriverManager.getConnection(url, user, password);
			
			//쿼리 작성
			String sql = "UPDATE TB_JDBC_BOARD SET TITLE = ?, CONTENT = ? WHERE BOARD_NO = ?";
			
			//쿼리 준비
			ps = con.prepareStatement(sql);
			
			//?값 셋팅
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, boardNo);
			
			//쿼리 실행
			int result = ps.executeUpdate();
			if(0 < result){
				System.out.println("수정이 완료되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
	}//updateBoard(int boardNo) 메서드
	
	//deleteBoard(int boardNo) 메서드
	private void deleteBoard(int boardNo) {
		try {
			//오라클 연결
			con = DriverManager.getConnection(url, user, password);
			
			//쿼리 작성
			String sql = "DELETE FROM TB_JDBC_BOARD WHERE BOARD_NO = ?";
			
			//쿼리 준비
			ps = con.prepareStatement(sql);
			
			//?값 셋팅
			ps.setInt(1, boardNo);
			
			//쿼리 실행
			int result = ps.executeUpdate();
			if(0 < result) {
				System.out.println("삭제가 완료되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}//deleteBoard(int boardNo) 메서드

	//insertBoard() 메서드
	private void insertBoard() {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		System.out.print("작성자>");
		String user = ScanUtil.nextLine();
		//게시글 번호와 작성일자는 자동으로 입력되게 한다.
		
		try {
			//오라클 연결
			con = DriverManager.getConnection(url, this.user, password);
			
			//쿼리 작성
			String sql = "INSERT INTO TB_JDBC_BOARD VALUES((SELECT NVL(MAX(BOARD_NO),0) + 1 FROM TB_JDBC_BOARD), ?, ?, ?, SYSDATE)";
			
			//쿼리 준비
			ps = con.prepareStatement(sql);
			
			//?값 셋팅
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, user);
			
			//쿼리 실행
			int result = ps.executeUpdate();
			if(0 < result) {
				System.out.println("등록이 완료되었습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}//insertBoard() 메서드

}//class
