import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է�: ");
		int num1 = Integer.parseInt(scan.nextLine());
		System.out.print("�ι�° ���� �Է�: ");
		int num2 = Integer.parseInt(scan.nextLine());
		
		System.out.println("\r\n==== �� �� ====\r\n");
		
		if (num1 > num2) {
			System.out.println("ù ��° �Է��� ���� �� ũ��.");
		} else if (num1 < num2) {
			System.out.println("�� ��° �Է��� ���� �� ũ��.");
		} else {
			System.out.println("�Է��� ���� ���� ����.");
		}
		

	}

}
