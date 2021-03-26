package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc18";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			//쿼리 작성
			String sql = "INSERT INTO TB_JDBC_BOARD VALUES ((SELECT NVL(MAX(BOARD_NO), 0) + 1 FROM TB_JDBC_BOARD), ?, ?, ?, SYSDATE)";
			
			ps = con.prepareStatement(sql);
			ps.setObject(1, "제목입니다.");
			ps.setObject(2, "내용입니다.");
			ps.setObject(3, "a001");
			
			int result = ps.executeUpdate();
			System.out.println("영향받은 행의 수 : " + result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
	}

}
