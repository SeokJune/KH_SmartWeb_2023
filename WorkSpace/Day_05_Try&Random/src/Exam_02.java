
public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double rand = Math.random(); // 0 ~ 1.0 사이의 실수를 무작위로 생성
		
		System.out.println((int) (rand * 10)); // 0 ~ 9 까지를 출력하는 코드
		
		System.out.println((int) (rand * 6 + 1));
		
		// 37 ~ 52 사이의 난수를 출력하려면>
		// 난수 범위 공식
		// 구하고자 하는 난수의 최소값을 X
		// 구하고자 하는 난수의 최대값을 Y
		// rand * (Y - X + 1 ) + X
	}

}
