
public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double rand = Math.random(); // 0 ~ 1.0 ������ �Ǽ��� �������� ����
		
		System.out.println((int) (rand * 10)); // 0 ~ 9 ������ ����ϴ� �ڵ�
		
		System.out.println((int) (rand * 6 + 1));
		
		// 37 ~ 52 ������ ������ ����Ϸ���>
		// ���� ���� ����
		// ���ϰ��� �ϴ� ������ �ּҰ��� X
		// ���ϰ��� �ϴ� ������ �ִ밪�� Y
		// rand * (Y - X + 1 ) + X
	}

}
