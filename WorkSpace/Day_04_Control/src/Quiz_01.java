import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int money = 0;


		while (true) {
			System.out.println("*** ATM 시뮬레이터 ***");
			System.out.println("1. 잔액조회");
			System.out.println("2. 입금하기");
			System.out.println("3. 출금하기");
			System.out.println("4. 종료하기");
			System.out.print(">> ");

			int num = 0;
			try {
				num = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해 주세요.");
				continue;
			}

			if (num == 4) {
				System.out.println("종료 기능 선택");
				break;
			}

			switch (num) {
			case 1:
				//System.out.println("잔액조회 기능을 선택");
				System.out.println("현재 보유 잔액은 " + money + "원입니다.");
				break;
			case 2:
				int dMoney = 0;
				
				while(true) {
					//System.out.println("입금하기 기능을 선택");
					System.out.print("얼마를 입금하시겠습니까? >> ");
					try {
						dMoney = Integer.parseInt(scan.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.println("숫자를 입력해 주세요.");
					}
				}
				
				money += dMoney;

				System.out.println(dMoney + "원이 입금되었습니다.");

				break;
			case 3:
				int wMoney = 0;
				
				while(true) {
					try {
						//System.out.println("출금하기 기능을 선택");
						System.out.print("얼마를 출금하시겠습니까? >> ");

						wMoney = Integer.parseInt(scan.nextLine());

						break;
					} catch (NumberFormatException e) {
						System.out.println("숫자를 입력해 주세요.");
					}
				}

				if (wMoney > money) {
					System.out.println("잔액이 부족합니다.");
					continue;
				}

				money -= wMoney;

				System.out.println(wMoney + "원이 출금되었습니다.");

				break;
			default:
				System.out.println("메뉴를 다시 확인해주세요.");
				break;
			}
		}

	}

}
