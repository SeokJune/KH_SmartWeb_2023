import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1~100 사이 입력: ");
		int num = Integer.parseInt(scan.nextLine());
		
		System.out.println("=== 결 과 ===");
		
		if (num >= 1 && num <= 100) {
			if (num % 2 == 0) {
				System.out.println("입력한 수는 짝수 입니다.");
			} else {
				System.out.println("입력한 수는 홀수 입니다.");
			}
		} else {
			System.out.println("범위를 벗어난 숫자를 입력하셨습니다.");
		}
		
	}

}
