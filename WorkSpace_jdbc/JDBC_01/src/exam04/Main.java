package exam04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "kh";
		String pwd = "kh";
		
		try {
			Connection conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결 성공");
			Statement stat = conn.createStatement();
			
			String sql = "SELECT * FROM DEPARTMENT";
			ResultSet rs = stat.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getString("DEPT_ID") + "\t" + rs.getString("DEPT_TITLE") + "\t" + rs.getString("LOCATION_ID"));
			}
			
			rs.close();
			stat.close();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		}
		
	}
	
}
