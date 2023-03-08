import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		//System.out.print("소지금을 입력해주세요.: ");
		
		int money = 10000;//Integer.parseInt(scan.nextLine());
		int cola = 0;
		int cider = 0;
		int plum = 0;

		while (true) {
			System.out.println("=== 자판기 시뮬레이터 ===");
			System.out.println("음료수를 선택하세요.");
			System.out.println("1. 콜라(1000)  2. 사이다(800)  3. 매실차(1500)  [0. 소지품확인] [4. 종료]");

			int num = Integer.parseInt(scan.nextLine());

			switch (num) {
			case 0:
				System.out.println("====== 소지품 목록 ======");
				System.out.println("소지금 : " + money);
				System.out.println("콜라 : " + cola + "개");
				System.out.println("사이다 : " + cider + "개");
				System.out.println("매실차 : " + plum + "개");
				System.out.println("======================");
				break;
			case 1:
				if (money >= 1000) {
					cola++;
					money -= 1000;
					System.out.println("콜라를 구매했습니다.");
					System.out.println("콜라 : " + cola + "개");
					System.out.println("소지금 : " + money);
				} else {
					System.out.println("소지금이 부족합니다.");
				}
				break;
			case 2:
				if (money >= 800) {
					cider++;
					money -= 800;
					System.out.println("콜라를 구매했습니다.");
					System.out.println("콜라 : " + cider + "개");
					System.out.println("소지금 : " + money);
				} else {
					System.out.println("소지금이 부족합니다.");
				}
				break;
			case 3:
				if (money >= 1500) {
					plum++;
					money -= 1500;
					System.out.println("콜라를 구매했습니다.");
					System.out.println("콜라 : " + plum + "개");
					System.out.println("소지금 : " + money);
				} else {
					System.out.println("소지금이 부족합니다.");
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
				break;
			}
		}

	}

}
