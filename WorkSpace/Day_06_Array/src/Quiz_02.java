import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int cnt = 3;
		String[] nameArr = new String[cnt];
		int[] korArr = new int[cnt];
		int[] engArr = new int[cnt];

		// �̸�, ����, ���� �Է� �޾� �迭�� ����
		for (int i = 0 ; i < cnt ; i++) {
			System.out.print((i + 1) + " ��° �л� �̸� : ");
			nameArr[i] = scan.nextLine();

			while (true) {
				try {
					System.out.print(nameArr[i] + " �л� ���� : ");
					korArr[i] = Integer.parseInt(scan.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("���ڸ� �Է��� �ּ���.");
				}
			}

			while (true) {
				try {
					System.out.print(nameArr[i] + " �л� ���� : ");
					engArr[i] = Integer.parseInt(scan.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("���ڸ� �Է��� �ּ���.");
				}
			}
		}
		
		// ��� ���
		System.out.println("�̸�\t����\t����\t�հ�\t���");
		
		for (int i = 0 ; i < cnt ; i++) {
			System.out.print(nameArr[i] + "\t");
			System.out.print(korArr[i] + "\t");
			System.out.print(engArr[i] + "\t");
			System.out.print((korArr[i] + engArr[i]) + "\t");
			System.out.print(((korArr[i] + engArr[i]) / 2.0) + "\r\n");
		}

	}

}
