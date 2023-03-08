package quiz01;

public class Main {
	public static void main(String[] args) {
		
		PlusThread plus = new PlusThread();
		MinusThread minus = new MinusThread();
		MplyThread mply = new MplyThread();
		
		plus.start();
		minus.start();
		mply.start();
		
	}
}
