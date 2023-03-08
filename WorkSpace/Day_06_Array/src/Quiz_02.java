import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int cnt = 3;
		String[] nameArr = new String[cnt];
		int[] korArr = new int[cnt];
		int[] engArr = new int[cnt];

		// 이름, 국어, 영어 입력 받아 배열에 저장
		for (int i = 0 ; i < cnt ; i++) {
			System.out.print((i + 1) + " 번째 학생 이름 : ");
			nameArr[i] = scan.nextLine();

			while (true) {
				try {
					System.out.print(nameArr[i] + " 학생 국어 : ");
					korArr[i] = Integer.parseInt(scan.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("숫자를 입력해 주세요.");
				}
			}

			while (true) {
				try {
					System.out.print(nameArr[i] + " 학색 영어 : ");
					engArr[i] = Integer.parseInt(scan.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("숫자를 입력해 주세요.");
				}
			}
		}
		
		// 결과 출력
		System.out.println("이름\t국어\t영어\t합계\t평균");
		
		for (int i = 0 ; i < cnt ; i++) {
			System.out.print(nameArr[i] + "\t");
			System.out.print(korArr[i] + "\t");
			System.out.print(engArr[i] + "\t");
			System.out.print((korArr[i] + engArr[i]) + "\t");
			System.out.print(((korArr[i] + engArr[i]) / 2.0) + "\r\n");
		}

	}

}
