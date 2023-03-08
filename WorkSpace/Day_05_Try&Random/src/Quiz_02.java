import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		while(true) {
			int num = (int) (Math.random() * 2 + 1);

			System.out.println("=== 동전 앞 뒤 맞추기 ===");

			while(true) {
				System.out.print("숫자를 입력해주세요 (1.앞면 / 2.뒷면 / 3.종료) : ");
				try {
					int input = Integer.parseInt(scan.nextLine());
					
					if (input == 3) {
						System.out.println("시스템을 종료합니다.");
						System.exit(0);
					}
					
					if (!(input == 1 || input == 2)) {
						System.out.println("1 또는 2를 입력해주세요.");
						continue;
					}
					
					if (num == input) {
						System.out.println("\r\n맞췄습니다^^\r\n");
					} else {
						System.out.println("\r\n땡! 틀렸습니다.!\r\n");
					}
					
					break;
				} catch(NumberFormatException e) {
					System.out.println("숫자를 입력해야 됩니다.");
				}
			}
		}
	}

}
