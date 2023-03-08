
public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 지역변수: local variable
		
		int a = 20;
		{ 
			//int a = 10;
			System.out.println(a);
		}
		//int a = 20;
		//System.out.println(a);
		
		String str = null;
		int menu = 1;
		
		if (menu == 1) {
			//String str = "Hello";
			str = "Hello";
		} else if (menu == 2) {
			//String str = "World";
			str = "World";
		}
		
		System.out.println(str);
		

	}

}
