import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("�����ϴ� OTT��?");
		System.out.println("1.Netflix 2.Disney 3.Watcha");
		System.out.println(">> ");

		int num = Integer.parseInt(scan.nextLine());

		switch (num) {
		case 1:
			System.out.println("Netflix�� �� �۷θ��� �α��Դϴ�.");
			break;
		case 2:
			System.out.println("Disney�� ī���밡 �α��Դϴ�.");
			break;
		case 3:
			System.out.println("Watcha�� �𸣰ڽ��ϴ�. ���߳׿�...");
			break;
		default:
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			break;
		}

	}

}
