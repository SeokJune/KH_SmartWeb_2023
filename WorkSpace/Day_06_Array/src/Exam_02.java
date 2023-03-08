
public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int 형 변수 3칸짜리를 arr1로 작성하고,
		// 0 : 48, 1 : 99, 2 : 33 을 저장한 후
		// 화면에 출력해봅시다.
		System.out.println("--- int ---");
		int[] arr1 = new int[] {48, 99, 33};
		
		for (int i : arr1) {
			System.out.println(i);
		}
		
		// String 형 변수 2칸짜리를 arr2로 작성하고,
		// 0 : "Hello", 1 : "World" 를 저장한 후
		// 화면에 출력해봅시다.
		System.out.println("--- String ---");
		String[] arr2 = new String[] {"Hello", "World"};
		
		for (String str : arr2) {
			System.out.print(str);
		};
		System.out.println();
		
		// char 형 번수 5칸짜리를 arr3로 작성하고,
		// 0 : 'A', 1 : 'r', 2 : 'r', 3 : 'a', 4 : 'y' 를 저장한 후
		// 화면에 출력해봅시다.
		System.out.println("--- char ---");
		char[] arr3 = new char[] {'A', 'r', 'r', 'a', 'y'};
		
		for (char ch : arr3) {
			System.out.print(ch);
		}

	}

}
