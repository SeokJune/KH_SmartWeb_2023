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
				System.out.println("1. �ű� ��ȭ ���");
				System.out.println("2. ��ȭ ��� ���");
				System.out.println("3. ��ȭ �˻�");
				System.out.println("4. ��ȭ ����");
				System.out.println("5. ��ȭ ����");
				System.out.println("0. ����");
				System.out.print(">>  ");
				try {
					num = Integer.parseInt(scan.nextLine());
					break;
				} catch(Exception e) {
					System.out.println("���ڸ� �Է��� �ּ���.");
					e.printStackTrace();
				}
			}
			if (num == 1) { // 1. �ű� ��ȭ ��� // ��ȭ ���� �ߺ� �Ұ�
				String title = null;
				System.out.print("��ȭ ���� �Է� >> ");
				title = scan.nextLine();

				// ��ȭ ���� �ߺ� �Ұ�
				ArrayList<Movie> movies = manager.select(title);

				if(movies.size() != 0) {
					System.out.println(title + "�� �����մϴ�.");
					continue;
				}
				System.out.print("��ȭ �帣 �Է� >> ");
				String genre = scan.nextLine();
				
				while (true) {
					try {
						System.out.print("��ȭ ���� �Է� >> ");
						double score = Double.parseDouble(scan.nextLine());
						manager.insert(new Movie(title, genre, score));
						break;
					} catch(Exception e) {
						System.out.println("���ڸ� �Է��� �ּ���.");
						e.printStackTrace();
					}
				}

			} else if (num == 2) { // 2. ��ȭ ��� ���
				ArrayList<Movie> movies = manager.select();

				System.out.println("����\t�帣\t����");
				for(Movie movie : movies) {
					System.out.println(movie.getTitle() + "\t" +
							movie.getGenre() + "\t" + 
							movie.getScore());
				}
			} else if (num == 3) { // 3. ��ȭ �˻�
				System.out.print("��ȭ ���� �Է� >> ");
				String title = scan.nextLine();

				ArrayList<Movie> movies = manager.select(title);

				if(movies.size() == 0) {
					System.out.println(title + " ��(��) ã�� �� �����ϴ�....");
				} else {
					System.out.println("����\t�帣\t����");
					for(Movie movie : movies) {
						System.out.println(movie.getTitle() + "\t" +
								movie.getGenre() + "\t" + 
								movie.getScore());
					}
				}
			} else if (num == 4) { // 4. ��ȭ ����
				System.out.print("��ȭ ���� �Է� >> ");
				String title = scan.nextLine();

				int index = manager.selectIndex(title);

				if(index == -1) {
					System.out.println(title + " ��(��) ã�� �� �����ϴ�....");
				} else {
					System.out.println("=== " + title + " ===");
					System.out.print("��ȭ ���� �Է� >> ");
					String upTitle = scan.nextLine();
					System.out.print(upTitle + "�� �帣 �Է� >> ");
					String upGenre = scan.nextLine();

					while (true) {
						try {
							System.out.print(upTitle + "�� ���� �Է� >> ");
							double upScore = Double.parseDouble(scan.nextLine());
							manager.update(index, new Movie(upTitle, upGenre, upScore));
							break;
						} catch(Exception e) {
							System.out.println("���ڸ� �Է��� �ּ���.");
							e.printStackTrace();
						}
					}
				}
			} else if (num == 5) { // 5. ��ȭ ����
				System.out.print("��ȭ ���� �Է� >> ");
				String title = scan.nextLine();

				int index = manager.selectIndex(title);

				if(index == -1) {
					System.out.println(title + " ��(��) ã�� �� �����ϴ�....");
				} else {
					manager.delete(index);
				}
			} else if (num == 0) {
				System.out.println("Netflix�� �����մϴ�.");
				scan.close();
				System.exit(0);
			} else {
				System.out.println("�޴� ��ȣ�� �ٽ� Ȯ�����ּ���.");
			}

		}

	}

}
