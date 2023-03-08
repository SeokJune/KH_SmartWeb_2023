package exam02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Manager manager = new Manager();

		while(true) {
			System.out.println("1. �޴� �Է�");
			System.out.println("2. �޴� ��ü ���");
			System.out.println("3. �޴� �� ��� - ID");
			System.out.println("4. �޴� ���� - ID");
			System.out.println("5. �޴� ���� - ID");
			System.out.println("0. ����");
			System.out.print(">>> ");
			int menu = -1;
			try {
				menu = Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				System.out.println("���ڸ� �Է��� �ּ���.");
				e.getStackTrace();
			}

			if(menu == 1) {
				manager.autoInsert();
			} else if(menu == 2) {
				ArrayList<CafeMenu> cafeMenus = manager.selectByAll();

				if(cafeMenus.size() == 0) {
					System.out.println("�޴��� �����ϴ�.");
				} else {
					System.out.println("ID\t�̸�\t����");
					for(CafeMenu cafeMenu : cafeMenus) {
						System.out.println(cafeMenu.getId() + "\t" + cafeMenu.getMenuName() + "\t" + cafeMenu.getPrice());
					}
				}
			} else if(menu == 3) {
				System.out.print("�޴� ID >> ");
				int id = -1;
				try {
					id = Integer.parseInt(scan.nextLine());
				} catch (Exception e) {
					System.out.println("���ڸ� �Է��� �ּ���.");
					e.getStackTrace();
				}

				int index = manager.selectIndexById(id);
				if(index == -1) {
					System.out.println("���� ���� �ʴ� ID �Դϴ�.");
					continue;
				}
				
				CafeMenu cafeMenu = manager.selectByIndex(manager.selectIndexById(id));
				System.out.println(cafeMenu.getId() + "\t" + cafeMenu.getMenuName() + "\t" + cafeMenu.getPrice());
			} else if(menu == 4) {
				System.out.print("�޴� ID >> ");
				int id = -1;
				try {
					id = Integer.parseInt(scan.nextLine());
				} catch (Exception e) {
					System.out.println("���ڸ� �Է��� �ּ���.");
					e.getStackTrace();
				}
				
				int index = manager.selectIndexById(id);
				if(index == -1) {
					System.out.println("���� ���� �ʴ� ID �Դϴ�.");
					continue;
				}

				System.out.print("�޴� �̸� >> ");
				String menuName = scan.nextLine();
				int menuPrice = 0;
				while(true) {
					System.out.print("�޴� ���� >> ");
					try {
						menuPrice = Integer.parseInt(scan.nextLine());
						break;
					} catch (Exception e) {
						System.out.println("���ڸ� �Է��� �ּ���.");
						e.getStackTrace();
					}
				}
				
				manager.updateById(manager.selectIndexById(id), new CafeMenu(id, menuName, menuPrice));
				

			} else if(menu == 5) {
				System.out.print("�޴� ID >> ");
				int id = -1;
				try {
					id = Integer.parseInt(scan.nextLine());
				} catch (Exception e) {
					System.out.println("���ڸ� �Է��� �ּ���.");
					e.getStackTrace();
				}
				
				int index = manager.selectIndexById(id);
				if(index == -1) {
					System.out.println("���� ���� �ʴ� ID �Դϴ�.");
					continue;
				}
				
				manager.deleteById(index);
			} else if(menu == 0) {
				System.out.println("�����մϴ�.");
				System.exit(0);
			} else {
				System.out.println("�޴��� Ȯ���� �ּ���.");
			}
		}

	}


}
