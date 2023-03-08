
public class Exam_01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// plus Method에 전달하는 10과 5는 '인자값(Parameter)'or '인수값(Argument)' 이라고 부른다.
		System.out.println(plus(10, 5)); 
		System.out.println(minus(10, 5)); 
		System.out.println(divide(10, 5)); 
		System.out.println(bigger(10, 5)); 
		System.out.println(bigger(5, 5)); 
		System.out.println(bigger(5, 100)); 
		System.out.println(translate("딸기"));
		System.out.println(translate("사과"));
		System.out.println(translate("바나나"));

	};

	// int num1, int num2 는 값을 받는 변수 '매개변수' 라고 부른다.
	public static int plus(int num1, int num2) {
		return num1 + num2;
	}
	
	// 두 정수를 인자로 전달받아 뺄셈한 결과를 반환하는 minus 메서드
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	// 두 정수를 인자로 전달받아 나눗셈한 결과를 실수로 반환하는 divide 메서드
	public static double divide(int num1, int num2) {
		return num1 / (double) num2;
	}
	
	// 두 정수를 인자로 전달받아 더 큰수를 반환하는 bigger 메서드
	// 두 수가 같다면 0을 반환
	public static int bigger(int num1, int num2) {
		return num1 > num2 ? num1 : num1 == num2 ? 0 : num2;
	}
	
	// "사과"를 인자로 전달하면 Apple을 "딸기"를 인자로 전달하면 Strawberry를
	// 반환하는 translate 메서드 제작
	// 사과나 딸기가 아닌 다른 값이 전달되면 None 반환
	public static String translate(String str) {
		return str.equals("사과") ? "Apple" : str.equals("딸기") ? "Strawberry" : "None";
	}
	
}
