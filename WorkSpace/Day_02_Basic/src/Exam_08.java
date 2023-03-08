import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문장을 입력받는 기능
		Scanner scan = new Scanner(System.in);
		
		System.out.print("메세지를 남겨주세요. >> ");
		// System.in.read(); << 아직 정해지지 않은 한 글자
		String str = scan.nextLine(); // 아직 정해지지 않은 문자열 하나
		System.out.println("<< 당신이 남긴 메세지는 >> " + str);
		
	}

}
