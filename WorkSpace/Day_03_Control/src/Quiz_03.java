import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1~100 ���� �Է�: ");
		int num = Integer.parseInt(scan.nextLine());
		
		System.out.println("=== �� �� ===");
		
		if (num >= 1 && num <= 100) {
			if (num % 2 == 0) {
				System.out.println("�Է��� ���� ¦�� �Դϴ�.");
			} else {
				System.out.println("�Է��� ���� Ȧ�� �Դϴ�.");
			}
		} else {
			System.out.println("������ ��� ���ڸ� �Է��ϼ̽��ϴ�.");
		}
		
	}

}
