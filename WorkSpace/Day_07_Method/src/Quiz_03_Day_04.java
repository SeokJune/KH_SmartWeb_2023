import java.util.Scanner;

public class Quiz_03_Day_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("=== ���� ���α׷� ===\r\n");
			System.out.print("������ �Է� ( +, -, *, / ) : ");
			String op = scan.nextLine();

			if (op.equals("q")) {
				break;
				//System.exit(0);
			} else if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {

				int num1 = validNum("ù ��° �� : ", scan);
				int num2 = validNum("�� ��° �� : ", scan);


				System.out.println("\r\n====== �� �� ======\r\n");

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
				System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
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
				System.out.println("���ڸ� �Է��ؾ� �մϴ�.");
			}
		}
	}

}
