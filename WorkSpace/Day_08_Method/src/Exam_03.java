
public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Method Overloading : 매개변수의 갯수 or 타입에 따라 중복된 Method 이름도 구분지어 사용할 수 있는 기법
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
