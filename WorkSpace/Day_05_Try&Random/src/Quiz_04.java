import java.util.Scanner;

public class Quiz_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		// ���� �ܾ�
		int money = 0;

		while (true) {
			// �޴� ���
			System.out.println("�渶 ���ӿ� ���� ���� ȯ���մϴ�.");
			System.out.println("1. ���� ����");
			System.out.println("2. �ܾ� ����");
			System.out.println("3. �ܾ� ��ȸ");
			System.out.println("4. ����");
			System.out.print("�޴��� �������ּ���.>> ");

			// ����ڷ� ���� �޴� �Է� �ޱ� �� ���� ó��
			int menu = 0;
			try {
				menu = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("���ڸ� �Է����ּ���.");
				continue;
			}

			// 1,2,3,4�� ������ ��ȣ �ԷµǾ������� �Ǻ�
			if (!(menu == 1 || menu == 2 || menu == 3 || menu == 4)) {
				System.out.println("�޴��� �߸� �Է��ϼ̽��ϴ�.");
				continue;
			}

			// 1,2,3,4 �޴� ����
			switch (menu) {
			case 1: // ���� ����
				
				// �ܾ� 0�϶� 
				if (money == 0) {
					System.out.println("���� �ܾ��� " + money + "�� �Դϴ�.");
					System.out.println("�ܾ��� ������ �ּ���.");
					break;
				}
				
				// msg ���
				System.out.println("!! �渶 ������ �����ϰڽ��ϴ� !!");
				System.out.println("1. ��� ����� ������ ���� �յ� ��");
				System.out.println("2. �̹� �� ������ ���� ���� ��");
				System.out.println("3. �ֱ� �������� �ſ��� ��");

				int horse = 0, bet = 0;
				while (true) {
					// �� ���� ���� ó��
					try {
						System.out.print("���� �ϰ� ���� ���� �������ּ���.>> ");
						horse = Integer.parseInt(scan.nextLine());
						
						if (horse == 1 || horse == 2 || horse == 3) {
						break;
						} else {
							System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
							continue;
						}
					} catch (NumberFormatException e) {
						System.out.println("���ڸ� �Է����ּ���.");
					}
				}

				while (true) {
					// ���� �ݾ� ���� ó��
					try {
						System.out.print("�󸶸� ���� �Ͻðڽ��ϱ�?>> ");
						bet = Integer.parseInt(scan.nextLine());
						
						// �ݾ��� ������ ���
						if (money < bet) {
							System.out.println("�ܾ��� �����մϴ�.");
							continue;
						} else {
							break;
						}
					} catch (NumberFormatException e) {
						System.out.println("���ڸ� �Է����ּ���.");
					}
				}
				
				// �¸� �� ���� ����
				int winHorse = (int) (Math.random() * 3 + 1);
				
				// ��� Ȯ��
				if (winHorse == horse) {
					System.out.println("����� ������ " + horse + "�� ���� �¸��Ͽ����ϴ�.");
					System.out.println((bet * 2) + "�� �����մϴ�!!");
					money += bet * 2;
				} else {
					System.out.println("���ÿ� �����ϼ̽��ϴ� ��^��");
					System.out.println("���� �ݾ� " + bet + "���� ��� �����˽��ϴ�.");
					money -= bet;
				}
				

				break;
			case 2: // �ܾ� ����
				// ���� �ݾ� �Է� �ޱ�
				int input = 0;

				while (true) {
					System.out.print("�󸶸� �����Ͻðڽ��ϱ�? >>");
					try {
						input = Integer.parseInt(scan.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.println("���ڸ� �Է����ּ���.");
					}
				}
				System.out.println(input + "���� �����ƽ��ϴ�.");
				money += input;
				break;
			case 3: // �ܾ� ��ȸ
				System.out.println("���� �ܾ��� " + money + "�� �Դϴ�.");
				break;
			case 4: // 4�� �Է½� ���α׷� ����
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;
			}

		}

	}

}
