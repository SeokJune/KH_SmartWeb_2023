
public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int num = Integer.parseInt("123");
			System.out.println("�м��� ���ڴ� : " + num);
		} catch(NumberFormatException e) {
			// ���ܰ� �߻����� ��, �����ڰ� �����ְ��� �ϴ� �ൿ
			System.out.println("�м��� �����Ͱ� ���� ������ �ƴմϴ�.");
		} finally {
			System.out.println("���α׷� ���� ����");
		}
		
	}

}
