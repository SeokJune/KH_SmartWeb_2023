import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		while(true) {
			int num = (int) (Math.random() * 2 + 1);

			System.out.println("=== ���� �� �� ���߱� ===");

			while(true) {
				System.out.print("���ڸ� �Է����ּ��� (1.�ո� / 2.�޸� / 3.����) : ");
				try {
					int input = Integer.parseInt(scan.nextLine());
					
					if (input == 3) {
						System.out.println("�ý����� �����մϴ�.");
						System.exit(0);
					}
					
					if (!(input == 1 || input == 2)) {
						System.out.println("1 �Ǵ� 2�� �Է����ּ���.");
						continue;
					}
					
					if (num == input) {
						System.out.println("\r\n������ϴ�^^\r\n");
					} else {
						System.out.println("\r\n��! Ʋ�Ƚ��ϴ�.!\r\n");
					}
					
					break;
				} catch(NumberFormatException e) {
					System.out.println("���ڸ� �Է��ؾ� �˴ϴ�.");
				}
			}
		}
	}

}
