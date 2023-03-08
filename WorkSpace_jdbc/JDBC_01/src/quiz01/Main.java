package quiz01;

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
			
			Statement stat = conn.createStatement();
			
			String sql = "SELECT EMP_ID AS \"사번\", EMP_NAME AS \"사원명\", SALARY AS \"급여\" FROM EMPLOYEE ";
			ResultSet rs = stat.executeQuery(sql);
			System.out.println(rs.getMetaData().getColumnName(1) + "\t" + rs.getMetaData().getColumnName(2) + "\t" + rs.getMetaData().getColumnName(3));
			System.out.println("-----------------------------------------");
			while(rs.next()) {
				System.out.println(rs.getInt("사번") + "\t" + rs.getString("사원명") + "\t" + rs.getInt("급여"));
			}
			
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
