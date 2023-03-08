import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int money = 0;


		while (true) {
			System.out.println("*** ATM �ùķ����� ***");
			System.out.println("1. �ܾ���ȸ");
			System.out.println("2. �Ա��ϱ�");
			System.out.println("3. ����ϱ�");
			System.out.println("4. �����ϱ�");
			System.out.print(">> ");

			int num = 0;
			try {
				num = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("���ڸ� �Է��� �ּ���.");
				continue;
			}

			if (num == 4) {
				System.out.println("���� ��� ����");
				break;
			}

			switch (num) {
			case 1:
				//System.out.println("�ܾ���ȸ ����� ����");
				System.out.println("���� ���� �ܾ��� " + money + "���Դϴ�.");
				break;
			case 2:
				int dMoney = 0;
				
				while(true) {
					//System.out.println("�Ա��ϱ� ����� ����");
					System.out.print("�󸶸� �Ա��Ͻðڽ��ϱ�? >> ");
					try {
						dMoney = Integer.parseInt(scan.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.println("���ڸ� �Է��� �ּ���.");
					}
				}
				
				money += dMoney;

				System.out.println(dMoney + "���� �ԱݵǾ����ϴ�.");

				break;
			case 3:
				int wMoney = 0;
				
				while(true) {
					try {
						//System.out.println("����ϱ� ����� ����");
						System.out.print("�󸶸� ����Ͻðڽ��ϱ�? >> ");

						wMoney = Integer.parseInt(scan.nextLine());

						break;
					} catch (NumberFormatException e) {
						System.out.println("���ڸ� �Է��� �ּ���.");
					}
				}

				if (wMoney > money) {
					System.out.println("�ܾ��� �����մϴ�.");
					continue;
				}

				money -= wMoney;

				System.out.println(wMoney + "���� ��ݵǾ����ϴ�.");

				break;
			default:
				System.out.println("�޴��� �ٽ� Ȯ�����ּ���.");
				break;
			}
		}

	}

}
