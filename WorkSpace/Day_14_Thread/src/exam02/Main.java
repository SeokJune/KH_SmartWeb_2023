package exam02;


public class Main {
	
	static int target = 0;
	
	public static void main(String[] args) {
		
		new TargetPlus().start();
		new TargetMinus().start();

		
		while(true) {
			System.out.println(target);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
