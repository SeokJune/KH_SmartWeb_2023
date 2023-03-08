
public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello World";
		
		System.out.println(str.length());
		
		for (int i = 0 ; i < str.length() ; i++) {
			System.out.print(str.charAt(i) + "\t");
		}
		System.out.println();
		
		System.out.println(str.indexOf('o'));
		
		System.out.println(str.startsWith("H"));
		System.out.println(str.endsWith("ld"));
		
		System.out.println(str.equals("Hello"));
		
		System.out.println(str.contains("Wo"));
		
		String[] strArr = str.split(" ");
		for (int i = 0 ; i < strArr.length ; i++) {
			System.out.println(strArr[i]);
		}
		
	}

}
