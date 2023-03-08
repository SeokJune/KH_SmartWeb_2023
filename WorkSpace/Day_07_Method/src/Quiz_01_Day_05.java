
public class Quiz_01_Day_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 5 ~ 10 난수
		// myRand(5, 10)
		
		for (int i = 0 ; i < 10 ; i ++) {
			//System.out.println("0 ~ 9 까지의 랜덤 수 : " + (int) (Math.random() * 10));
			//System.out.println("1 ~ 10 까지의 랜덤 수 : " + (int) (Math.random() * 10 + 1));
			//System.out.println("20 ~ 35 까지의 랜덤 수 : " + (int) (Math.random() * 16 + 20));
			//System.out.println("0 또는 1 : " + (int) (Math.random() * 2));
			
			System.out.print(myRand(0, 9));
			System.out.print("\t" + myRand(1, 10));
			System.out.print("\t" + myRand(20, 35));
			System.out.println("\t" + myRand(0, 1));
		}

	}
	
	public static int myRand(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}

}
