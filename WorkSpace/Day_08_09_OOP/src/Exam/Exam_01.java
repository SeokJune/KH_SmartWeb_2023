package Exam;

import java.util.Scanner;
import Custom.TV;

public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TV는 참조 자료형
		TV samsung = new TV(); // new TV() : TV instance 생성
		//samsung.brand = "SAMSUNG";
		//samsung.price = 1000000;

		samsung.setBrand("SAMSUNG");
		samsung.setPrice(1000000);
		samsung.setChannel(10);
		
		System.out.println(samsung.getBrand());
		System.out.println(samsung.getPrice());
		System.out.println(samsung.getChannel());
		
		samsung.powerON();
		samsung.powerOFF();
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String str1 = new String("Apple");
		System.out.println("Apple" == "Apple");
		System.out.println(str1 == "Apple");

	}

}
