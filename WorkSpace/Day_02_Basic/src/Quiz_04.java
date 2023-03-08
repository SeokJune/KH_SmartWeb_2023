import java.util.Scanner;

public class Quiz_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===============");
		System.out.print("이 름 : ");
		String name = scan.nextLine();
		System.out.println("===============");
		System.out.print("국 어 : ");
		int ko = Integer.parseInt(scan.nextLine());
		//double ko = Double.parseDouble(scan.netLine());
		System.out.print("영 어 : ");
		int en = Integer.parseInt(scan.nextLine());
		System.out.print("수 학 : ");
		int ma = Integer.parseInt(scan.nextLine());
		System.out.println("===============");
		System.out.println(String.format("합 계 : %d", ko + en + ma));
		System.out.println(String.format("평 균 : %.2f", (ko + en + ma) / 3.0));
		System.out.println("===============");
	}
}
