package exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "kh";
		String pwd = "kh";
		
		try {
			Connection conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("���� ����");
			
			Statement stat = conn.createStatement();
			
			System.out.print("������ �޴� : ");
			String name = scan.nextLine();
			
			String sql = "DELETE FROM CAFE WHERE NAME = '" + name + "'";
			System.out.println(stat.executeUpdate(sql) > 0 ? "���� ����" : "���� ����");
			
			conn.commit();
			conn.close();
		} catch (SQLException e) {
			System.out.println("���� ����");
			e.printStackTrace();
		}
		
	}
	
}
