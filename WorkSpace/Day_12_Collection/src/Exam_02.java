import java.util.ArrayList;

public class Exam_02 {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Hello");
		arr.add("World");
		arr.add("Collection");
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		System.out.println("------------------------------");
		
		arr.remove(0);
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println("------------------------------");
		
		arr.add(1,"Java");
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		System.out.println("------------------------------");
		
		System.out.println(arr.size());
		System.out.println("------------------------------");
		
		
		for(String str : arr) {
			System.out.println(str);
		}
		System.out.println("------------------------------");
		
	}
	
}
