
public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int 형 변수 100개를 arr1로 생성하고, 
		// 1 부터 100 까지 저장한 후 출력해보세요.
		
		System.out.println("--- 1 ~ 100 ---");
		
		int[] arr1 = new int[100];
		
		for (int i = 0 ; i < arr1.length ; i++) {
			arr1[i] = i + 1;
		}
		
		for (int i : arr1) {
			System.out.print(i + " ");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		
		// char 형 변수 26개를 arr2로 생성하고,
		// 알파벳 A 부터 Z 가지 저장한 후 출력해보세요.
		
		System.out.println("--- A ~ Z ---");
		
		char[] arr2 = new char[26];
		
		for (int i = 0 ; i < arr2.length ; i++) {
			arr2[i] = (char) (65 + i);
		}
		
		for (char c : arr2) {
			if (c % 10 == 5 && c != 65) {
				System.out.println();
			}
			System.out.print(c + " ");
		}
		System.out.println();

		// int 형 변수 100개를 arr3로 생성하고,
		// 100부터 1까지 저장해보세요.
		
		System.out.println("--- 100 ~ 1 ---");
		
		int[] arr3 = new int[100];
		
		for (int i = 0 ; i < arr3.length ; i++) {
			arr3[i] = 100 - i;
		}
		
		for (int i : arr3) {
			System.out.print(i + " ");
			if (i % 10 == 1) {
				System.out.println();
			}
		}
		
	}

}
