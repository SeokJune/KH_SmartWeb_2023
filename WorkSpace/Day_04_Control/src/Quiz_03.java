import java.util.Scanner;

public class Quiz_03 {

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

				int num1 = 0, num2 = 0;

				while(true) {
					try {
						System.out.print("첫 번째 숫자 입력 : ");
						num1 = Integer.parseInt(scan.nextLine());
						
						break;
					} catch (NumberFormatException e) {
						System.out.println("숫자를 입력해야 합니다.");
					}
				}

				while(true) {
					try {
						System.out.print("두 번째 숫자 입력 : ");
						num2 = Integer.parseInt(scan.nextLine());
						
						break;
					} catch (NumberFormatException e) {
						System.out.println("숫자를 입력해야 합니다.");
					}
				}
				
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

}
