import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("메세지를 입력하세요 : ");
		
		String msg = scan.nextLine();
		
		//if (msg == "Apple") {
		if (msg.equals("Apple")) {
			System.out.println("사과 입니다.");
		} else if (msg.equals("Strawberry")) {
			System.out.println("딸기 입니다.");
		} else {
			System.out.println("메세지를 확인 할 수 없습니다.");
		}

	}
}
