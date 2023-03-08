
public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 나는 지금 Heap 메모리를 사용하겠다 -> new
		int[] arr; // << 아직 배열을 만든게 아님. / 만들어진 배열의 주소를 저장할 참조 변수를 선언했다. (참조 변수)
		//arr = new int[4]; // << 배열 생성 문법 : int형 변수 4개 생성
						  // 배열의 첨자(Index)는 offset(기준점으로부터 얼마나 떨어졌는가?)의 의미
		
		arr = new int[] {10, 20, 30, 40};
		
		//arr[0] = 10;
		//arr[1] = 20;
		//arr[2] = 30;
		//arr[3] = 40;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		System.out.println("----- for -----");
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("--- foreach ---");
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
