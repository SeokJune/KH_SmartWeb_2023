
public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int num = Integer.parseInt("123");
			System.out.println("분석된 숫자는 : " + num);
		} catch(NumberFormatException e) {
			// 예외가 발생했을 때, 개발자가 취해주고자 하는 행동
			System.out.println("분석할 데이터가 숫자 형식이 아닙니다.");
		} finally {
			System.out.println("프로그램 정상 종료");
		}
		
	}

}
