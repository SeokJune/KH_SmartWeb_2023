
public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� ���� Heap �޸𸮸� ����ϰڴ� -> new
		int[] arr; // << ���� �迭�� ����� �ƴ�. / ������� �迭�� �ּҸ� ������ ���� ������ �����ߴ�. (���� ����)
		//arr = new int[4]; // << �迭 ���� ���� : int�� ���� 4�� ����
						  // �迭�� ÷��(Index)�� offset(���������κ��� �󸶳� �������°�?)�� �ǹ�
		
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
