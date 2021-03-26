package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc18";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//연결
			con = DriverManager.getConnection(url, user, password);
			
			//쿼리 작성
			String sql = "SELECT * FROM CART WHERE CART_MEMBER = ?"; //'?' : 항상 다른 값이(동적으로) 들어가므로
			
			ps = con.prepareStatement(sql);
			ps.setString(1, "a001"); // 첫 번째 '?'에 'a001'의 값을 넣겠다.
//			ps.setInt(parameterIndex, x);
//			ps.setDate(parameterIndex, x);
//			ps.setObject(parameterIndex, x); 
			//타입에 맞게 사용하면된다.
			
			//select 결과 저장
			rs = ps.executeQuery();
			
			//메타데이터 보기
			ResultSetMetaData metaData = rs.getMetaData(); //메타 데이터 : 데이터에 대한 데이터
			
			int columnCount = metaData.getColumnCount();
			
			//데이터 추출
			while(rs.next()) {
				for(int i = 1; i <= columnCount; i++){
					Object value = rs.getObject(i);
					System.out.println(value + "\t");
				}
				System.out.println();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
	}

}
