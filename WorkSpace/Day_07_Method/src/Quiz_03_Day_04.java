import java.util.Scanner;

public class Quiz_03_Day_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("=== 계산기 프로그램 ===\r\n");
			System.out.print("연산자 입력 ( +, -, *, / ) : ");
			String op = scan.nextLine();

			if (op.equals("q")) {
				break;
				//System.exit(0);
			} else if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {

				int num1 = validNum("첫 번째 수 : ", scan);
				int num2 = validNum("두 번째 수 : ", scan);


				System.out.println("\r\n====== 결 과 ======\r\n");

				if (op.equals("+")) {
					System.out.println(String.format("%d %s %d = %d", num1, op, num2, (num1 + num2)));
				} else if (op.equals("-")) {
					System.out.println(String.format("%d %s %d = %d", num1, op, num2, (num1 - num2)));
				} else if (op.equals("*")) {
					System.out.println(String.format("%d %s %d = %d", num1, op, num2, (num1 * num2)));
				} else if (op.equals("/")) {
					System.out.println(String.format("%d %s %d = %.2f", num1, op, num2, ( num1 / (float) num2)));
				}
			} else {
				System.out.println("연산자를 잘못 입력하셨습니다.");
				continue;
			}

		}
	}

	public static int validNum(String msg, Scanner scan) {
		while(true) {
			try {
				System.out.print(msg);
				return Integer.parseInt(scan.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해야 합니다.");
			}
		}
	}

}
