
public class Exam_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println((int) (Math.random() * 5 + 1));
		//System.out.println((int) (Math.random() * 5 + 1));
		//System.out.println((int) (Math.random() * 5 + 1));

		int[] nums = new int[] {1, 2, 3, 4, 5};
		int printCnt = 3;
		
		for (int i = 0 ; i < nums.length * 100 ; i++) {
			int x = (int) (Math.random() * nums.length * 100);
			int y = (int) (Math.random() * nums.length * 100);
			
			int tmp = nums[x];
			nums[x] = nums[y];
			nums[y] = tmp;
		}

		// 결과 출력
		for (int i = 0 ; i < printCnt ; i++) {
			System.out.println(nums[i]);
		}

	}

}
