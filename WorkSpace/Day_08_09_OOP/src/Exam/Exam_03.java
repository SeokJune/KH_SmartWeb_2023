package Exam;
import Custom.Car;

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car santafe = new Car();

		santafe.setModel("Santa Fe Calligraphy");
		santafe.setColor("Creamy White Pearl");
		santafe.setPrice(40070000);

		System.out.println(santafe.getModel());
		System.out.println(santafe.getColor());
		System.out.println(santafe.getPrice());

		System.out.println("------------------------------------");

		Car sonata = new Car();

		sonata.setModel("Sonata Premium Plus");
		sonata.setColor("Abyss Black Pearl");
		sonata.setPrice(29270000);

		System.out.println(sonata.getModel());
		System.out.println(sonata.getColor());
		System.out.println(sonata.getPrice());

	}
}
