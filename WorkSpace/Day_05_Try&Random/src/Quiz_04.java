import java.util.Scanner;

public class Quiz_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		// 보유 잔액
		int money = 0;

		while (true) {
			// 메뉴 출력
			System.out.println("경마 게임에 오신 것을 환영합니다.");
			System.out.println("1. 게임 시작");
			System.out.println("2. 잔액 충전");
			System.out.println("3. 잔액 조회");
			System.out.println("4. 종료");
			System.out.print("메뉴를 선택해주세요.>> ");

			// 사용자로 부터 메뉴 입력 받기 및 예외 처리
			int menu = 0;
			try {
				menu = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
				continue;
			}

			// 1,2,3,4를 제외한 번호 입력되었는지를 판별
			if (!(menu == 1 || menu == 2 || menu == 3 || menu == 4)) {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
				continue;
			}

			// 1,2,3,4 메뉴 실행
			switch (menu) {
			case 1: // 게임 시작
				
				// 잔액 0일때 
				if (money == 0) {
					System.out.println("현재 잔액은 " + money + "원 입니다.");
					System.out.println("잔액을 충전해 주세요.");
					break;
				}
				
				// msg 출력
				System.out.println("!! 경마 게임을 시작하겠습니다 !!");
				System.out.println("1. 우승 경력이 많지만 은퇴를 앞둔 말");
				System.out.println("2. 이번 달 성적이 제일 좋은 말");
				System.out.println("3. 최근 떠오르는 신예인 말");

				int horse = 0, bet = 0;
				while (true) {
					// 말 선택 예외 처리
					try {
						System.out.print("베팅 하고 싶은 말을 선택해주세요.>> ");
						horse = Integer.parseInt(scan.nextLine());
						
						if (horse == 1 || horse == 2 || horse == 3) {
						break;
						} else {
							System.out.println("번호를 잘못 입력하셨습니다.");
							continue;
						}
					} catch (NumberFormatException e) {
						System.out.println("숫자를 입력해주세요.");
					}
				}

				while (true) {
					// 배팅 금액 예외 처리
					try {
						System.out.print("얼마를 배팅 하시겠습니까?>> ");
						bet = Integer.parseInt(scan.nextLine());
						
						// 금액이 부족한 경우
						if (money < bet) {
							System.out.println("잔액이 부족합니다.");
							continue;
						} else {
							break;
						}
					} catch (NumberFormatException e) {
						System.out.println("숫자를 입력해주세요.");
					}
				}
				
				// 승리 말 랜덤 생성
				int winHorse = (int) (Math.random() * 3 + 1);
				
				// 결과 확인
				if (winHorse == horse) {
					System.out.println("당신이 선택한 " + horse + "번 말이 승리하였습니다.");
					System.out.println((bet * 2) + "원 축하합니다!!");
					money += bet * 2;
				} else {
					System.out.println("배팅에 실패하셨습니다 ㅠ^ㅠ");
					System.out.println("배팅 금액 " + bet + "원을 모두 잃으셧습니다.");
					money -= bet;
				}
				

				break;
			case 2: // 잔액 충전
				// 충전 금액 입력 받기
				int input = 0;

				while (true) {
					System.out.print("얼마를 충전하시겠습니까? >>");
					try {
						input = Integer.parseInt(scan.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.println("숫자를 입력해주세요.");
					}
				}
				System.out.println(input + "원이 충전됐습니다.");
				money += input;
				break;
			case 3: // 잔액 조회
				System.out.println("현재 잔액은 " + money + "원 입니다.");
				break;
			case 4: // 4번 입력시 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			}

		}

	}

}
