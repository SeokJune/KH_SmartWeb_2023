import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����� �����ϴ� ������ �����Դϱ�? ");
		System.out.println("1.���  2.����  3.����");
		System.out.print(">> ");

		int menu = Integer.parseInt(scan.nextLine());
		
		/*
		if (menu == 1) {
			System.out.println("����� ����� 'Apple'�Դϴ�.");
		} else if (menu == 2) {
			System.out.println("����� ����� 'Mango'�Դϴ�.");
		} else if (menu == 3) {
			System.out.println("����� ����� 'Strawberry'�Դϴ�.");
		} else {
			System.out.println("�޴��� �ٽ� Ȯ�����ּ���.");
		}
		*/
		
		if (menu == 1 || menu == 2 || menu == 3) {
			if (menu == 1) {
				System.out.println("����� ����� 'Apple'�Դϴ�.");
			} else if (menu == 2) {
				System.out.println("����� ����� 'Mango'�Դϴ�.");
			} else if (menu == 3) {
				System.out.println("����� ����� 'Strawberry'�Դϴ�.");
			}
		} else {
			System.out.println("�޴��� �ٽ� Ȯ�����ּ���.");
		}
	}

}
