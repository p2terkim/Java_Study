package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc18";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DriverManager.getConnection(url, user, password);
			
			//쿼리 작성
			String sql = " DELETE FROM  TB_JDB_BOARD WHERE BOARD_NO = ?";
			
			ps = con.prepareStatement(sql);
			ps.setObject(1, 1);
			
			int result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
	}

}
