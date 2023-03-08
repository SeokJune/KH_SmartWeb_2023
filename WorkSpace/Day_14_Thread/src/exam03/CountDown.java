package exam03;

public class CountDown extends Thread{

	static int i = 10;
	static int score = 0;
	
	@Override
	public void run() {
	
		for( ; i > 0 ; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
				score++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("버틴 시간: " + score);
		System.out.println("Game Over.....");
		System.exit(0);
		
	}
	
}
