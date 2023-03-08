
public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "asldkjasudhasASsadasdASDasDqwErasAdQWeasdQWasdADSqweaAADQWedasd";
		
		int count1 = countA(str);
		System.out.println("알파벳 A의 개수 : " + count1);
		
		char ch = 'a';
		int count2 = count(str, ch);
		System.out.println("알파벳 " + ch + "의 개수 : " + count2);

	}
	
	public static int countA(String str) {
		int result = 0;
		
		for (int i = 0 ; i < str.length() ; i++) {
			if (str.charAt(i) == 'A') {
				result++;
			}
		}
		
		return result;
	}
	
	public static int count(String str, char c) {
		int result = 0;
		
		for (int i = 0 ; i < str.length() ; i++) {
			if (str.charAt(i) == c) {
				result++;
			}
		}
		
		return result;
	}

}
