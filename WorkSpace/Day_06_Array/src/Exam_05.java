
public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {99, 48, 27, 15};

		// �迭 ���
		System.out.print(" ���� �� :");
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		// sort (����) - Bubble Sort
		for (int i = 0 ; i < arr.length - 1 ; i++) {
			for (int j = 0 ; j < arr.length - 1 - i ; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}

		System.out.println("===================================================");
		
		// ��� ���
		System.out.print(" ���� �� :");
		for (int i : arr) {
			System.out.print(i + "\t");
		}

	}

}
