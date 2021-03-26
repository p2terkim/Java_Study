package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	//생성자
	public DBConnection(String url, String user, String password){
		//연결
		try {
			con = DriverManager.getConnection(url, user, password);
			
			System.out.println("DB 연결 성공");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//생성자
	
}
