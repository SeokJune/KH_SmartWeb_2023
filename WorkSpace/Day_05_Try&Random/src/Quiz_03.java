import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("=== ���� ���� �� ���� ===");

			while (true) {
				int rand = (int) (Math.random() * 3 + 1);
				System.out.print("���ڸ� �����ϼ���(1.'����' / 2.'����' / 3.'��' / 0.����) : ");
				try {
					int input = Integer.parseInt(scan.nextLine());

					// 0�Է½� ����
					if (input == 0) {
						System.out.println("�ý����� �����մϴ�.");
						System.exit(0);
					}

					// 0, 1, 2, 3�� ������ ������
					if (!(input == 0 || input == 1 || input == 2 || input == 3)) {
						System.out.println("���ڸ� Ȯ�����ּ���.");
						continue;
					}

					System.out.println("======== ��� ========");
					System.out.println("����� " + (input == 1 ? "����" : input == 2 ? "����" : "��") + "�� �½��ϴ�.");
					System.out.println("��ǻ�ʹ� " + (rand == 1 ? "����" : rand == 2 ? "����" : "��") + "�� �½��ϴ�.");
					System.out.println("=====================");

					if ((rand == 1 && input == 2) || (rand == 2 && input == 3) || (rand == 3 && input == 1)) {
						System.out.println("����� �̰���ϴ�.");
					} else if (rand == input) {
						System.out.println("�����ϴ�.");
					} else {
						System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					}
					
					break;

				} catch (NumberFormatException e) {
					System.out.println("���ڸ� �Է��� �ּ���.");
				}
			}
		}

	}

}
