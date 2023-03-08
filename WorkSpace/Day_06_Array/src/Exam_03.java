import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		/*
		int x = 0, y = 0, z = 0;

		System.out.print("x : ");
		x = Integer.parseInt(scan.nextLine());

		System.out.print("y : ");
		y = Integer.parseInt(scan.nextLine());

		System.out.print("z : ");
		z = Integer.parseInt(scan.nextLine());

		System.out.println("입력된 값은 ");
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
		System.out.println("Z : " + z);
		 */

		String[] arr1 = new String[] {"x", "y", "z"};
		int[] arr2 = new int[3];

		for (int i = 0 ; i < arr1.length ; i++) {
			while (true) {
				System.out.print(arr1[i] + " : ");
				try {
					int input = Integer.parseInt(scan.nextLine());
					arr2[i] = input;
					break;
				} catch (NumberFormatException e) {
					System.out.println("숫자를 입력해 주세요.");
				}
			}
		}

		System.out.println("입력된 값은 ");
		for (int i = 0 ; i < arr1.length ; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}


	}

}
