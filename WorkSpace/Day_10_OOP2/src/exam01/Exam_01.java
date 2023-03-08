package exam01;

public class Exam_01 {

	public static void main(String[] args) {
		
		Movie[] movies = new Movie[] {new Movie("아바타2", "SF/액션", 8.8), 
									  new Movie("영웅", "드라마", 8.42)};
		
		movies[1].setScore(10);
		
		
		for(int i = 0 ; i < movies.length ; i++) {
			System.out.println(movies[i].getTitle() + "\t" + movies[i].getGenre() + "\t" + movies[i].getScore());
		}
	}
	
}
