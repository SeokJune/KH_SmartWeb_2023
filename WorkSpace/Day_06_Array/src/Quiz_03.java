
public class Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 ~ 45 ������ ������ ��ø���� �ʰ� 7���� �̾Ƽ� ����ϼ���.
		// ������ ��õ �ζ� ��ȣ �����
		
		// �迭 ����
		int[] num = new int[45];
		// ���� 7���� �ε��� �迭 ���� : 0 ~ 44 ���� 45�� ������ 7��
		int[] pNum = new int[] {5, 10, 15, 20, 25, 30, 35};
		
		// �迭�� �� �ֱ�
		for (int i = 0 ; i < num.length ; i++) {
			num[i] = i + 1;
		}
		
		// �迭 ���� �ϱ�
		for (int i = 0 ; i < num.length * 100 ; i++) {
			int x = (int) (Math.random() * num.length);
			int y = (int) (Math.random() * num.length);
			
			int tmp = num[x];
			num[x] = num[y];
			num[y] = tmp;
		}
		
		// ����ϱ�
		for (int i = 0 ; i < pNum.length ; i++) {
			System.out.println((i + 1) + "��° ���ڴ� " + num[pNum[i]] + " �Դϴ�.");
		}

	}

}
