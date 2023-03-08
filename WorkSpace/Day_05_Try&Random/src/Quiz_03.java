import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("=== 가위 바위 보 게임 ===");

			while (true) {
				int rand = (int) (Math.random() * 3 + 1);
				System.out.print("숫자를 선택하세요(1.'가위' / 2.'바위' / 3.'보' / 0.종료) : ");
				try {
					int input = Integer.parseInt(scan.nextLine());

					// 0입력시 종료
					if (input == 0) {
						System.out.println("시스템을 종료합니다.");
						System.exit(0);
					}

					// 0, 1, 2, 3를 제외한 나머지
					if (!(input == 0 || input == 1 || input == 2 || input == 3)) {
						System.out.println("숫자를 확인해주세요.");
						continue;
					}

					System.out.println("======== 결과 ========");
					System.out.println("당신은 " + (input == 1 ? "가위" : input == 2 ? "바위" : "보") + "를 냈습니다.");
					System.out.println("컴퓨터는 " + (rand == 1 ? "가위" : rand == 2 ? "바위" : "보") + "를 냈습니다.");
					System.out.println("=====================");

					if ((rand == 1 && input == 2) || (rand == 2 && input == 3) || (rand == 3 && input == 1)) {
						System.out.println("당신이 이겼습니다.");
					} else if (rand == input) {
						System.out.println("비겼습니다.");
					} else {
						System.out.println("컴퓨터가 이겼습니다.");
					}
					
					break;

				} catch (NumberFormatException e) {
					System.out.println("숫자를 입력해 주세요.");
				}
			}
		}

	}

}
