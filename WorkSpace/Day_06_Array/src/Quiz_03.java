
public class Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 ~ 45 사이의 난수를 중첩되지 않게 7개를 뽑아서 출력하세요.
		// 오늘의 추천 로또 번호 만들기
		
		// 배열 생성
		int[] num = new int[45];
		// 뽑을 7개의 인덱스 배열 생성 : 0 ~ 44 까지 45개 숫자중 7개
		int[] pNum = new int[] {5, 10, 15, 20, 25, 30, 35};
		
		// 배열에 값 넣기
		for (int i = 0 ; i < num.length ; i++) {
			num[i] = i + 1;
		}
		
		// 배열 셔플 하기
		for (int i = 0 ; i < num.length * 100 ; i++) {
			int x = (int) (Math.random() * num.length);
			int y = (int) (Math.random() * num.length);
			
			int tmp = num[x];
			num[x] = num[y];
			num[y] = tmp;
		}
		
		// 출력하기
		for (int i = 0 ; i < pNum.length ; i++) {
			System.out.println((i + 1) + "번째 숫자는 " + num[pNum[i]] + " 입니다.");
		}

	}

}
