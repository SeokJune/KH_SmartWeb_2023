import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� ���ɸ޴��� �����ϼ���. ");
		System.out.print("1.�ѽ�  2.�߽�  3.�Ͻ�  >> ");
		
		int menuNum = Integer.parseInt(scan.nextLine());
		
		// �����̸� ���
		if (menuNum == 1) {
			System.out.println("����� �ѽ� ���Դ� 'XXXXX' �Դϴ�.");
		} else if (menuNum == 2) {
			System.out.println("����� �߽� ���Դ� 'XXXXX' �Դϴ�.");
		} else if (menuNum == 3) {
			System.out.println("����� �Ͻ� ���Դ� 'XXXXX' �Դϴ�.");
		} else {
			System.out.println("�߸��� ��ȣ�� �Է� �ϼ̽��ϴ�.");
		}
		
	}

}
