package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// JDBC : JAVA DataBase Connectivity
		// JAVA ���α׷����� DBMS�� ����ϱ� ���� ���̺귯�� �� ����
		// OJDBC.JAR

		Scanner scan = new Scanner(System.in);

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "kh";
		String pwd ="kh";
		Connection conn;
		try {
			conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("���� ����");
			
			Statement stat = conn.createStatement();
			
			System.out.print("�ű� ����� �޴��� �̸� : ");
			String name = scan.nextLine();
			
			System.out.print(name + "�� ���� : ");
			int price = Integer.parseInt(scan.nextLine());
			
			System.out.print("ICE ���� ���� (Y, N) : ");
			String isIce = scan.nextLine();
			
			String sql = "INSERT INTO CAFE VALUES(CAFE_SEQ.NEXTVAL, '" + name + "', " + price + ", '" + isIce + "')";
			int result = stat.executeUpdate(sql);
			
			System.out.println(result > 0 ? "�Է� ����" : "�Է� ����");
			conn.commit();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ���� ����");
			e.printStackTrace();
		}
		
		

	}

}
