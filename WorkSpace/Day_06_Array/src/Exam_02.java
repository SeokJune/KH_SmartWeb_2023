
public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int �� ���� 3ĭ¥���� arr1�� �ۼ��ϰ�,
		// 0 : 48, 1 : 99, 2 : 33 �� ������ ��
		// ȭ�鿡 ����غ��ô�.
		System.out.println("--- int ---");
		int[] arr1 = new int[] {48, 99, 33};
		
		for (int i : arr1) {
			System.out.println(i);
		}
		
		// String �� ���� 2ĭ¥���� arr2�� �ۼ��ϰ�,
		// 0 : "Hello", 1 : "World" �� ������ ��
		// ȭ�鿡 ����غ��ô�.
		System.out.println("--- String ---");
		String[] arr2 = new String[] {"Hello", "World"};
		
		for (String str : arr2) {
			System.out.print(str);
		};
		System.out.println();
		
		// char �� ���� 5ĭ¥���� arr3�� �ۼ��ϰ�,
		// 0 : 'A', 1 : 'r', 2 : 'r', 3 : 'a', 4 : 'y' �� ������ ��
		// ȭ�鿡 ����غ��ô�.
		System.out.println("--- char ---");
		char[] arr3 = new char[] {'A', 'r', 'r', 'a', 'y'};
		
		for (char ch : arr3) {
			System.out.print(ch);
		}

	}

}
