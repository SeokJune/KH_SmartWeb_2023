import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�޼����� �Է��ϼ��� : ");
		
		String msg = scan.nextLine();
		
		//if (msg == "Apple") {
		if (msg.equals("Apple")) {
			System.out.println("��� �Դϴ�.");
		} else if (msg.equals("Strawberry")) {
			System.out.println("���� �Դϴ�.");
		} else {
			System.out.println("�޼����� Ȯ�� �� �� �����ϴ�.");
		}

	}
}
