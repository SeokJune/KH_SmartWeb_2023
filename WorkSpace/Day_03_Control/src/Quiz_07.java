import java.util.Scanner;

public class Quiz_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("��� ����ұ��? >> ");
		int cnt = Integer.parseInt(scan.nextLine());
		
		while (cnt > 0) {
			System.out.println("Hello Java World.");
			cnt--;
		}
	}

}
