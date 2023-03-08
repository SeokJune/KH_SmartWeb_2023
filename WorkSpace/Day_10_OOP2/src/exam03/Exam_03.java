package exam03;

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contact cont1 = new Contact("홍길동", "01012344321", "hong@naver.com");
		Contact cont2 = new Contact("조성태", "01090062139", "stj@gmail.com");
		
		System.out.println(cont1.getName() + "\t" +
						   cont1.getTel().substring(0, 3) + "-" + 
						   cont1.getTel().substring(3, 7) + "-" +
						   cont1.getTel().substring(7, 11) + "\t" +
						   cont1.getEmail());
		System.out.println(cont2.getName() + "\t" +
				   		   cont2.getTel().substring(0, 3) + "-" + 
				   		   cont2.getTel().substring(3, 7) + "-" +
				   		   cont2.getTel().substring(7, 11) + "\t" +
				   		   cont2.getEmail());
		
	}

}
