
public class Exam_01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// plus Method�� �����ϴ� 10�� 5�� '���ڰ�(Parameter)'or '�μ���(Argument)' �̶�� �θ���.
		System.out.println(plus(10, 5)); 
		System.out.println(minus(10, 5)); 
		System.out.println(divide(10, 5)); 
		System.out.println(bigger(10, 5)); 
		System.out.println(bigger(5, 5)); 
		System.out.println(bigger(5, 100)); 
		System.out.println(translate("����"));
		System.out.println(translate("���"));
		System.out.println(translate("�ٳ���"));

	};

	// int num1, int num2 �� ���� �޴� ���� '�Ű�����' ��� �θ���.
	public static int plus(int num1, int num2) {
		return num1 + num2;
	}
	
	// �� ������ ���ڷ� ���޹޾� ������ ����� ��ȯ�ϴ� minus �޼���
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	// �� ������ ���ڷ� ���޹޾� �������� ����� �Ǽ��� ��ȯ�ϴ� divide �޼���
	public static double divide(int num1, int num2) {
		return num1 / (double) num2;
	}
	
	// �� ������ ���ڷ� ���޹޾� �� ū���� ��ȯ�ϴ� bigger �޼���
	// �� ���� ���ٸ� 0�� ��ȯ
	public static int bigger(int num1, int num2) {
		return num1 > num2 ? num1 : num1 == num2 ? 0 : num2;
	}
	
	// "���"�� ���ڷ� �����ϸ� Apple�� "����"�� ���ڷ� �����ϸ� Strawberry��
	// ��ȯ�ϴ� translate �޼��� ����
	// ����� ���Ⱑ �ƴ� �ٸ� ���� ���޵Ǹ� None ��ȯ
	public static String translate(String str) {
		return str.equals("���") ? "Apple" : str.equals("����") ? "Strawberry" : "None";
	}
	
}
