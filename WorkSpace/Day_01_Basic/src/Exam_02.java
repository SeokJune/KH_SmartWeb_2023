public class Exam_02 {
	public static void main(String[] args) {
		/*
		 * Data Type 변수명 기본형 변수 > 정수형: byte(1), short(2), char(2), int(4), long(8) >
		 * 실수형: float(4), double(8) > 논리형: boolean(1)
		 */
		// byte: 2^8 > -128 ~ 127
		byte a = 127;
		// short: 2^16 > -32768 ~ 32767
		short b = 32767;
		// char: 2^16 > 0 ~
		char c = 'A';
		// int: 2^32
		int d = 1000000000;
		// long: 2^64
		long e = 10000000000L;

		float f = 3.14F;
		double g = 5.12;

		// boolean: true | false
		boolean h = true;
		
		// i에는 "Hello World"의 주소를 저장
		String i = "Hello World";
	}
}
