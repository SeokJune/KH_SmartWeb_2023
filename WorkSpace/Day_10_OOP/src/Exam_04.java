
public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Temp t1 = new Temp();
		Temp t2 = new Temp();
		
		t1.a = 10;
		t2.a = 20;
		
		System.out.println(t1.a);
		System.out.println(t2.a);
		
		Temp.b = 30;
		
		System.out.println(Temp.b);
		
		/*
		 * 지역변수 >> Stack Memory
		 * 매개변수 >> Stack Memory
		 * 멤버변수 >> Heap Memory
		 * 정적변수 >> Data Memory
		 */
		
	}

}
