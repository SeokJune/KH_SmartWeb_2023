package main;

import java.util.List;
import java.util.Scanner;

import dto.MoviesDTO;
import model.MoviesDAO;

public class Main {

	public static void main(String[] args) {
		// Netflix ��ȭ ���� ���α׷�
		// ���̺� �̸� : movies
		// id - 1001 ~ ���� ���� 1�� ����
		// title - ���ڿ� �ִ� 50����Ʈ
		// gerne - ���ڿ� 20����Ʈ
		// ��� not null
		try (Scanner scan = new Scanner(System.in);) {
			MoviesDAO mDAO = new MoviesDAO();
			while(true) {
				// �޴� ���
				System.out.println("<< NetFlix ��ȭ ���� ���α׷� >>");
				System.out.println("1. �ű� ��ȭ ���");
				System.out.println("2. ��ȭ ��� ��ȸ");
				System.out.println("3. ��ȭ ���� ���� (ID)");
				System.out.println("4. ��ȭ ���� ���� (ID)");
				System.out.println("5. ��ȭ ���� ��ȸ (TITLE)");
				System.out.println("0. ���α׷� ����");
				System.out.print(">> ");
				String menu = scan.nextLine();

				try {
					if(menu.equals("0")) {
						//0. ���α׷� ����
						System.out.println("���α׷� ����");
						// DB ���� ����
						System.exit(0);
					} else if(menu.equals("1")) {
						// 1. �ű� ��ȭ ���
						System.out.print("�ű� ��ȭ ���� : ");
						String title = scan.nextLine();
						System.out.print(title + "�� �帣 : ");
						String gerne = scan.nextLine();
						// DTO�� �� ����
						MoviesDTO mDTO = new MoviesDTO();
						mDTO.setTitle(title);
						mDTO.setGanre(gerne);
						// ���� ����
						System.out.println(mDAO.movieInsert(mDTO) > 0 ? "��� ����" : "��� ����");
					} else if(menu.equals("2")) {
						// 2. ��ȭ ��� ��ȸ
						// �˻� ���� (��ü)
						List<MoviesDTO> mlist = mDAO.movieSelectAll();
						// ��� ���
						System.out.println("ID\tTITLE\tGENRE");
						for(MoviesDTO movie : mlist) {
							System.out.println(movie.getId() + "\t" + movie.getTitle() + "\t" + movie.getGanre());
						}
					} else if(menu.equals("3")) {
						// 3. ��ȭ ���� ���� - ID / ��� ����
						System.out.print("������ ��ȭ ID : ");
						int id = Integer.parseInt(scan.nextLine());
						// DTO�� �� ����
						MoviesDTO mDTO = new MoviesDTO();
						mDTO.setId(id);
						// ��ȭ ���� üũ - �˻� ���� (ID) [true : ����, false : ����]
						if(!mDAO.isIdExist(mDTO)) {
							System.out.println("ID : [" + id + "] ��ȭ ����");
							continue;
						}

						System.out.print("�ű� ��ȭ ���� : ");
						String title = scan.nextLine();
						System.out.print("�ű� ��ȭ �帣 : ");
						String gerne = scan.nextLine();
						// DTO�� �� ����
						mDTO = new MoviesDTO();
						mDTO.setId(id);
						mDTO.setTitle(title);
						mDTO.setGanre(gerne);
						// ���� ����
						System.out.println(mDAO.movieUpdate(mDTO) > 0 ? "���� ����" : "���� ����");
					} else if(menu.equals("4")) {
						// 4. ��ȭ ���� ���� - ID
						System.out.print("������ ��ȭ ID : ");
						int id = Integer.parseInt(scan.nextLine());
						// DTO�� �� ����
						MoviesDTO mDTO = new MoviesDTO();
						mDTO.setId(id);
						// ���� ����
						System.out.println(mDAO.movieDelete(mDTO) > 0 ? "���� ����" : "���� ����");
					} else if (menu.equals("5")) {
						// 5. ��ȭ ���� ��ȸ (TITLE)
						System.out.print("�˻��� ��ȭ�� ���� : ");
						String title = scan.nextLine();
						// DTO�� �� ����
						MoviesDTO mDTO = new MoviesDTO();
						mDTO.setTitle(title);
						// �˻� ���� (TITLE)
						List<MoviesDTO> mlist = mDAO.movieSerchByTitle(mDTO);
						// ��� ���
						System.out.println("ID\tTITLE\tGENRE");
						for(MoviesDTO movie : mlist) {
							System.out.println(movie.getId() + "\t" + movie.getTitle() + "\t" + movie.getGanre());
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("�����ڿ��� �����ϼ���.");
				}
			}
		}
	}

}