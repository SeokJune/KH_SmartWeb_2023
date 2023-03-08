package exams;

abstract class Animal {
	public abstract void sound();
}

class Dog extends Animal {
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("야옹");
	}
}

class Crow extends Animal {
	public void sound() {
		System.out.println("까악");
	}
}

public class Exam_01 {

	public static void main(String[] args) {

		// 다형성
		//  클래스 간 상속관계에서 부모클래스 자료형으로 만든 참조 변수에게 발현되는 성질
		//  상위 클래스 참조 변수는 하위 클래스 인스턴스의 주소를 저장할 수 있다.
//		A a1 = new B(); // up casting: 자식 -> 부모
//		A a2 = new C();
//		
//		a1.funcA();
//		((B)a1).funcB(); // down casting: 부모 -> 자식

		//다형성을 가지는 부모 클래스 참조변수는 기본적으로 자신의 Type만큼의 참조만 가능
		// 만약 자신의 Type이 아닌 대입된 인스턴스의 모든 기능을 사용하고 싶다면 Down casting 필요
		// * 예외상황: 자식 클래스에서 Overriding한 메서드는 Down casting 없이 사용 가능
		
		//Cat cat = new Cat();
		Animal cat = new Cat();
		//Dog dog = new Dog();
		Animal dog = new Dog();
		//Crow crow = new Crow();
		Animal crow = new Crow();
		
		System.out.print("멍멍이: ");
		dog.sound();
		System.out.print("야옹이: ");
		cat.sound();
		System.out.print("까마귀: ");
		crow.sound();
		
	}

}
