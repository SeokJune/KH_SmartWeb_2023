
public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0 ; i < 10 ; i ++) {
			//System.out.println("0 ~ 9 까지의 랜덤 수 : " + (int) (Math.random() * 10));
			//System.out.println("1 ~ 10 까지의 랜덤 수 : " + (int) (Math.random() * 10 + 1));
			//System.out.println("20 ~ 35 까지의 랜덤 수 : " + (int) (Math.random() * 16 + 20));
			//System.out.println("0 또는 1 : " + (int) (Math.random() * 2));
			
			System.out.print((int) (Math.random() * 10));
			System.out.print("\t" + (int) (Math.random() * 10 + 1));
			System.out.print("\t" + (int) (Math.random() * 16 + 20));
			System.out.println("\t" + (int) (Math.random() * 2));
		}

	}

}
