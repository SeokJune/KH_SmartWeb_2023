package exam01;

public class Exam_01 {

	public static void main(String[] args) {
		
		Movie[] movies = new Movie[] {new Movie("�ƹ�Ÿ2", "SF/�׼�", 8.8), 
									  new Movie("����", "���", 8.42)};
		
		movies[1].setScore(10);
		
		
		for(int i = 0 ; i < movies.length ; i++) {
			System.out.println(movies[i].getTitle() + "\t" + movies[i].getGenre() + "\t" + movies[i].getScore());
		}
	}
	
}
