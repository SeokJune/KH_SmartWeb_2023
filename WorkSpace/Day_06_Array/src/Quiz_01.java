
public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int �� ���� 100���� arr1�� �����ϰ�, 
		// 1 ���� 100 ���� ������ �� ����غ�����.
		
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
		
		// char �� ���� 26���� arr2�� �����ϰ�,
		// ���ĺ� A ���� Z ���� ������ �� ����غ�����.
		
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

		// int �� ���� 100���� arr3�� �����ϰ�,
		// 100���� 1���� �����غ�����.
		
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
