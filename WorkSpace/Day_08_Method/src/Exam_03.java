
public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Method Overloading : �Ű������� ���� or Ÿ�Կ� ���� �ߺ��� Method �̸��� �������� ����� �� �ִ� ���
		func();
		func(10);
		func(10, 20);
		func("");
		
	}
	
	public static void func() {
		System.out.println("Hello");
	}
	
	public static void func(int a) {
		System.out.println("World");
	}
	
	public static void func(int a, int b) {
		System.out.println("Method");
	}
	
	public static void func(String str) {
		System.out.println("Overloading");
	}

}
