import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �� ������ �Է¹޾� ������ ����� ����ϴ� ���α׷��� �ۼ����ּ���.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� ������ �Է����ּ���. >> ");
		String[] str = scan.nextLine().split(" ");
		
		System.out.println(Integer.parseInt(str[0]) + " + " + 
							Integer.parseInt(str[1]) + " = " +
							(Integer.parseInt(str[0]) + Integer.parseInt(str[1])) + " �Դϴ�.");
		
	}

}
