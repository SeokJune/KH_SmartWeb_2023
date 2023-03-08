import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 두 정수를 입력받아 덧셈한 결과를 출력하는 프로그램을 작성해주세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 정수를 입력해주세요. >> ");
		String[] str = scan.nextLine().split(" ");
		
		System.out.println(Integer.parseInt(str[0]) + " + " + 
							Integer.parseInt(str[1]) + " = " +
							(Integer.parseInt(str[0]) + Integer.parseInt(str[1])) + " 입니다.");
		
	}

}
