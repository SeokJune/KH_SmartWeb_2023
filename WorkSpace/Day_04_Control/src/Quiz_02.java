import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		//System.out.print("�������� �Է����ּ���.: ");
		
		int money = 10000;//Integer.parseInt(scan.nextLine());
		int cola = 0;
		int cider = 0;
		int plum = 0;

		while (true) {
			System.out.println("=== ���Ǳ� �ùķ����� ===");
			System.out.println("������� �����ϼ���.");
			System.out.println("1. �ݶ�(1000)  2. ���̴�(800)  3. �Ž���(1500)  [0. ����ǰȮ��] [4. ����]");

			int num = Integer.parseInt(scan.nextLine());

			switch (num) {
			case 0:
				System.out.println("====== ����ǰ ��� ======");
				System.out.println("������ : " + money);
				System.out.println("�ݶ� : " + cola + "��");
				System.out.println("���̴� : " + cider + "��");
				System.out.println("�Ž��� : " + plum + "��");
				System.out.println("======================");
				break;
			case 1:
				if (money >= 1000) {
					cola++;
					money -= 1000;
					System.out.println("�ݶ� �����߽��ϴ�.");
					System.out.println("�ݶ� : " + cola + "��");
					System.out.println("������ : " + money);
				} else {
					System.out.println("�������� �����մϴ�.");
				}
				break;
			case 2:
				if (money >= 800) {
					cider++;
					money -= 800;
					System.out.println("�ݶ� �����߽��ϴ�.");
					System.out.println("�ݶ� : " + cider + "��");
					System.out.println("������ : " + money);
				} else {
					System.out.println("�������� �����մϴ�.");
				}
				break;
			case 3:
				if (money >= 1500) {
					plum++;
					money -= 1500;
					System.out.println("�ݶ� �����߽��ϴ�.");
					System.out.println("�ݶ� : " + plum + "��");
					System.out.println("������ : " + money);
				} else {
					System.out.println("�������� �����մϴ�.");
				}
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;
			default:
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}

	}

}
