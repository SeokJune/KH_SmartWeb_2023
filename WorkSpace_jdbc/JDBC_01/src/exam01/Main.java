package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// JDBC : JAVA DataBase Connectivity
		// JAVA 프로그램에서 DBMS를 사용하기 위한 하이브러리 및 문법
		// OJDBC.JAR

		Scanner scan = new Scanner(System.in);

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "kh";
		String pwd ="kh";
		Connection conn;
		try {
			conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결 성공");
			
			Statement stat = conn.createStatement();
			
			System.out.print("신규 등록할 메뉴의 이름 : ");
			String name = scan.nextLine();
			
			System.out.print(name + "의 가격 : ");
			int price = Integer.parseInt(scan.nextLine());
			
			System.out.print("ICE 가능 여부 (Y, N) : ");
			String isIce = scan.nextLine();
			
			String sql = "INSERT INTO CAFE VALUES(CAFE_SEQ.NEXTVAL, '" + name + "', " + price + ", '" + isIce + "')";
			int result = stat.executeUpdate(sql);
			
			System.out.println(result > 0 ? "입력 성공" : "입력 실패");
			conn.commit();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}
		
		

	}

}
