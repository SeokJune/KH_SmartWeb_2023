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
			
			String sql = "SELECT EMP_ID AS \"���\", EMP_NAME AS \"�����\", SALARY AS \"�޿�\" FROM EMPLOYEE ";
			ResultSet rs = stat.executeQuery(sql);
			System.out.println(rs.getMetaData().getColumnName(1) + "\t" + rs.getMetaData().getColumnName(2) + "\t" + rs.getMetaData().getColumnName(3));
			System.out.println("-----------------------------------------");
			while(rs.next()) {
				System.out.println(rs.getInt("���") + "\t" + rs.getString("�����") + "\t" + rs.getInt("�޿�"));
			}
			
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
