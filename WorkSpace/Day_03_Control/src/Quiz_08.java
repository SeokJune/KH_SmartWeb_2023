import java.util.Scanner;

public class Quiz_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("=== ������ ��� ���α׷� ===\r\n");
			System.out.print("2~9�� �� ���� (0 -> ����) : ");

			int dan = Integer.parseInt(scan.nextLine());

			if (dan == 0) {
				System.out.println("�������� �����մϴ�.");
				// System.exit(0); << ������� ���α׷� ����.
				System.exit(0);
			}
			
			if (dan >= 2 && dan <= 9) {
				int num = 1;

				while(num < 10) {
					System.out.println(dan + " * " + num + " = " + (dan * num));
					num++;
				}
			} else {
				System.out.println("���� �߸� �Է� �ϼ̽��ϴ�.");
			}
		}
	}

}
