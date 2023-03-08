package Exam;
import Custom.Student;

public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		
		student.setName("Jack");
		student.setKor(95);
		student.setEng(84);
		student.setMath(68);
		
		System.out.println(student.getName() + "학생의 합계 : " + student.getSum());
		System.out.println(student.getName() + "학생의 평균 : " + student.getAvg());
		
		Student student2 = new Student("Jane", 100, 50, 95);

		System.out.println(student2.getName() + "학생의 합계 : " + student2.getSum());
		System.out.println(student2.getName() + "학생의 평균 : " + student2.getAvg());

	}

}
