package exams;

abstract class Animal {
	public abstract void sound();
}

class Dog extends Animal {
	public void sound() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("�߿�");
	}
}

class Crow extends Animal {
	public void sound() {
		System.out.println("���");
	}
}

public class Exam_01 {

	public static void main(String[] args) {

		// ������
		//  Ŭ���� �� ��Ӱ��迡�� �θ�Ŭ���� �ڷ������� ���� ���� �������� �����Ǵ� ����
		//  ���� Ŭ���� ���� ������ ���� Ŭ���� �ν��Ͻ��� �ּҸ� ������ �� �ִ�.
//		A a1 = new B(); // up casting: �ڽ� -> �θ�
//		A a2 = new C();
//		
//		a1.funcA();
//		((B)a1).funcB(); // down casting: �θ� -> �ڽ�

		//�������� ������ �θ� Ŭ���� ���������� �⺻������ �ڽ��� Type��ŭ�� ������ ����
		// ���� �ڽ��� Type�� �ƴ� ���Ե� �ν��Ͻ��� ��� ����� ����ϰ� �ʹٸ� Down casting �ʿ�
		// * ���ܻ�Ȳ: �ڽ� Ŭ�������� Overriding�� �޼���� Down casting ���� ��� ����
		
		//Cat cat = new Cat();
		Animal cat = new Cat();
		//Dog dog = new Dog();
		Animal dog = new Dog();
		//Crow crow = new Crow();
		Animal crow = new Crow();
		
		System.out.print("�۸���: ");
		dog.sound();
		System.out.print("�߿���: ");
		cat.sound();
		System.out.print("���: ");
		crow.sound();
		
	}

}
