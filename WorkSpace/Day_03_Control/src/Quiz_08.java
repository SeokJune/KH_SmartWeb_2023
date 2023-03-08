import java.util.Scanner;

public class Quiz_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("=== 구구단 출력 프로그램 ===\r\n");
			System.out.print("2~9단 중 선택 (0 -> 종료) : ");

			int dan = Integer.parseInt(scan.nextLine());

			if (dan == 0) {
				System.out.println("구구단을 종료합니다.");
				// System.exit(0); << 실행즉시 프로그램 종료.
				System.exit(0);
			}
			
			if (dan >= 2 && dan <= 9) {
				int num = 1;

				while(num < 10) {
					System.out.println(dan + " * " + num + " = " + (dan * num));
					num++;
				}
			} else {
				System.out.println("단을 잘못 입력 하셨습니다.");
			}
		}
	}

}
