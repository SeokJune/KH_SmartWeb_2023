import java.util.Scanner;

public class Quiz_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===============");
		System.out.print("�� �� : ");
		String name = scan.nextLine();
		System.out.println("===============");
		System.out.print("�� �� : ");
		int ko = Integer.parseInt(scan.nextLine());
		//double ko = Double.parseDouble(scan.netLine());
		System.out.print("�� �� : ");
		int en = Integer.parseInt(scan.nextLine());
		System.out.print("�� �� : ");
		int ma = Integer.parseInt(scan.nextLine());
		System.out.println("===============");
		System.out.println(String.format("�� �� : %d", ko + en + ma));
		System.out.println(String.format("�� �� : %.2f", (ko + en + ma) / 3.0));
		System.out.println("===============");
	}
}
