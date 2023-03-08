import java.util.Scanner;

public class Exam_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요: ");
		//int num = scan.nextInt();
		String str = scan.nextLine();
		System.out.println("입력한 숫자는 >> " + Integer.parseInt(str));
		
	}

}
