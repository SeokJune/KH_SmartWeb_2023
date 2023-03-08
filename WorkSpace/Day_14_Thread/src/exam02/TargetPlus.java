package exam02;

public class TargetPlus extends Thread {

	@Override
	public void run() {
		
		while(true) {
			Main.target++;
		}
		
	}
	
}
