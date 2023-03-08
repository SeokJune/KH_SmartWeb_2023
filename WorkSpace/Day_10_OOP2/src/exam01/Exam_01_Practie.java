package exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_01_Practie {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Manager manager = new Manager();

		while(true) {
			int num = 0;
			while(true) {
				System.out.println("<< Netflix Simulator >>");
				System.out.println("1. 신규 영화 등록");
				System.out.println("2. 영화 목록 출력");
				System.out.println("3. 영화 검색");
				System.out.println("4. 영화 수정");
				System.out.println("5. 영화 삭제");
				System.out.println("0. 종료");
				System.out.print(">>  ");
				try {
					num = Integer.parseInt(scan.nextLine());
					break;
				} catch(Exception e) {
					System.out.println("숫자를 입력해 주세요.");
					e.printStackTrace();
				}
			}
			if (num == 1) { // 1. 신규 영화 등록 // 영화 제목 중복 불가
				String title = null;
				System.out.print("영화 제목 입력 >> ");
				title = scan.nextLine();

				// 영화 제목 중복 불가
				ArrayList<Movie> movies = manager.select(title);

				if(movies.size() != 0) {
					System.out.println(title + "은 존재합니다.");
					continue;
				}
				System.out.print("영화 장르 입력 >> ");
				String genre = scan.nextLine();
				
				while (true) {
					try {
						System.out.print("영화 평점 입력 >> ");
						double score = Double.parseDouble(scan.nextLine());
						manager.insert(new Movie(title, genre, score));
						break;
					} catch(Exception e) {
						System.out.println("숫자를 입력해 주세요.");
						e.printStackTrace();
					}
				}

			} else if (num == 2) { // 2. 영화 목록 출력
				ArrayList<Movie> movies = manager.select();

				System.out.println("제목\t장르\t평점");
				for(Movie movie : movies) {
					System.out.println(movie.getTitle() + "\t" +
							movie.getGenre() + "\t" + 
							movie.getScore());
				}
			} else if (num == 3) { // 3. 영화 검색
				System.out.print("영화 제목 입력 >> ");
				String title = scan.nextLine();

				ArrayList<Movie> movies = manager.select(title);

				if(movies.size() == 0) {
					System.out.println(title + " 을(를) 찾을 수 없습니다....");
				} else {
					System.out.println("제목\t장르\t평점");
					for(Movie movie : movies) {
						System.out.println(movie.getTitle() + "\t" +
								movie.getGenre() + "\t" + 
								movie.getScore());
					}
				}
			} else if (num == 4) { // 4. 영화 수정
				System.out.print("영화 제목 입력 >> ");
				String title = scan.nextLine();

				int index = manager.selectIndex(title);

				if(index == -1) {
					System.out.println(title + " 을(를) 찾을 수 없습니다....");
				} else {
					System.out.println("=== " + title + " ===");
					System.out.print("영화 제목 입력 >> ");
					String upTitle = scan.nextLine();
					System.out.print(upTitle + "의 장르 입력 >> ");
					String upGenre = scan.nextLine();

					while (true) {
						try {
							System.out.print(upTitle + "의 평점 입력 >> ");
							double upScore = Double.parseDouble(scan.nextLine());
							manager.update(index, new Movie(upTitle, upGenre, upScore));
							break;
						} catch(Exception e) {
							System.out.println("숫자를 입력해 주세요.");
							e.printStackTrace();
						}
					}
				}
			} else if (num == 5) { // 5. 영화 삭제
				System.out.print("영화 제목 입력 >> ");
				String title = scan.nextLine();

				int index = manager.selectIndex(title);

				if(index == -1) {
					System.out.println(title + " 을(를) 찾을 수 없습니다....");
				} else {
					manager.delete(index);
				}
			} else if (num == 0) {
				System.out.println("Netflix를 종료합니다.");
				scan.close();
				System.exit(0);
			} else {
				System.out.println("메뉴 번호를 다시 확인해주세요.");
			}

		}

	}

}
