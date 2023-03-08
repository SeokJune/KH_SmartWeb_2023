package exam02;

public class TargetMinus extends Thread {

	@Override
	public void run() {
		
		while(true) {
			Main.target--;
		}
		
	}
	
}
