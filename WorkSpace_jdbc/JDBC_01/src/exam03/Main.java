package exam03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("라이브러리???");
			e.printStackTrace();
		}

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "kh";
		String pwd = "kh";

		try {
			Connection conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결 성공");
			
			Statement stat = conn.createStatement();
			
			String sql = "UPDATE CAFE SET PRICE = 5000 WHERE NAME = 'Americano'";
			System.out.println(stat.executeUpdate(sql) > 0 ? "수정 성공" : "수정 실패");
			
			conn.commit();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		}

	}

}
