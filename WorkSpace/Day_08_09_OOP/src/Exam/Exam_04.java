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
		
		System.out.println(student.getName() + "�л��� �հ� : " + student.getSum());
		System.out.println(student.getName() + "�л��� ��� : " + student.getAvg());
		
		Student student2 = new Student("Jane", 100, 50, 95);

		System.out.println(student2.getName() + "�л��� �հ� : " + student2.getSum());
		System.out.println(student2.getName() + "�л��� ��� : " + student2.getAvg());

	}

}
