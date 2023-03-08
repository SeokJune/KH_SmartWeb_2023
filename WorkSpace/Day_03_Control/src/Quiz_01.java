import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("오늘 점심메뉴를 선택하세요. ");
		System.out.print("1.한식  2.중식  3.일식  >> ");
		
		int menuNum = Integer.parseInt(scan.nextLine());
		
		// 가계이름 출력
		if (menuNum == 1) {
			System.out.println("가까운 한식 가게는 'XXXXX' 입니다.");
		} else if (menuNum == 2) {
			System.out.println("가까운 중식 가게는 'XXXXX' 입니다.");
		} else if (menuNum == 3) {
			System.out.println("가까운 일식 가게는 'XXXXX' 입니다.");
		} else {
			System.out.println("잘못된 번호를 입력 하셨습니다.");
		}
		
	}

}
