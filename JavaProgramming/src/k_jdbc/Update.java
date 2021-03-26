package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc18";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			//쿼리 작성
//			String sql = "UPDATE HAKGWA SET SUBJCT_NM = '경영학과' SUBJCT_CODE = 'H005'";
			String sql = "UPDATE MEMBER SET MEM_HP = ?, MEM_MAIL = ? WHERE MEM_ID = ?";			
			ps = con.prepareStatement(sql);
			ps.setObject(1, "010-101-0202");
			ps.setObject(2, "something@naver.com");
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
