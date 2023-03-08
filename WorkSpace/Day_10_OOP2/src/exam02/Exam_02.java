package exam02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Manager manager = new Manager();

		while(true) {
			System.out.println("1. 메뉴 입력");
			System.out.println("2. 메뉴 전체 출력");
			System.out.println("3. 메뉴 상세 출력 - ID");
			System.out.println("4. 메뉴 수정 - ID");
			System.out.println("5. 메뉴 삭제 - ID");
			System.out.println("0. 종료");
			System.out.print(">>> ");
			int menu = -1;
			try {
				menu = Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				System.out.println("숫자를 입력해 주세요.");
				e.getStackTrace();
			}

			if(menu == 1) {
				manager.autoInsert();
			} else if(menu == 2) {
				ArrayList<CafeMenu> cafeMenus = manager.selectByAll();

				if(cafeMenus.size() == 0) {
					System.out.println("메뉴가 없습니다.");
				} else {
					System.out.println("ID\t이름\t가격");
					for(CafeMenu cafeMenu : cafeMenus) {
						System.out.println(cafeMenu.getId() + "\t" + cafeMenu.getMenuName() + "\t" + cafeMenu.getPrice());
					}
				}
			} else if(menu == 3) {
				System.out.print("메뉴 ID >> ");
				int id = -1;
				try {
					id = Integer.parseInt(scan.nextLine());
				} catch (Exception e) {
					System.out.println("숫자를 입력해 주세요.");
					e.getStackTrace();
				}

				int index = manager.selectIndexById(id);
				if(index == -1) {
					System.out.println("존재 하지 않는 ID 입니다.");
					continue;
				}
				
				CafeMenu cafeMenu = manager.selectByIndex(manager.selectIndexById(id));
				System.out.println(cafeMenu.getId() + "\t" + cafeMenu.getMenuName() + "\t" + cafeMenu.getPrice());
			} else if(menu == 4) {
				System.out.print("메뉴 ID >> ");
				int id = -1;
				try {
					id = Integer.parseInt(scan.nextLine());
				} catch (Exception e) {
					System.out.println("숫자를 입력해 주세요.");
					e.getStackTrace();
				}
				
				int index = manager.selectIndexById(id);
				if(index == -1) {
					System.out.println("존재 하지 않는 ID 입니다.");
					continue;
				}

				System.out.print("메뉴 이름 >> ");
				String menuName = scan.nextLine();
				int menuPrice = 0;
				while(true) {
					System.out.print("메뉴 가격 >> ");
					try {
						menuPrice = Integer.parseInt(scan.nextLine());
						break;
					} catch (Exception e) {
						System.out.println("숫자를 입력해 주세요.");
						e.getStackTrace();
					}
				}
				
				manager.updateById(manager.selectIndexById(id), new CafeMenu(id, menuName, menuPrice));
				

			} else if(menu == 5) {
				System.out.print("메뉴 ID >> ");
				int id = -1;
				try {
					id = Integer.parseInt(scan.nextLine());
				} catch (Exception e) {
					System.out.println("숫자를 입력해 주세요.");
					e.getStackTrace();
				}
				
				int index = manager.selectIndexById(id);
				if(index == -1) {
					System.out.println("존재 하지 않는 ID 입니다.");
					continue;
				}
				
				manager.deleteById(index);
			} else if(menu == 0) {
				System.out.println("종료합니다.");
				System.exit(0);
			} else {
				System.out.println("메뉴를 확인해 주세요.");
			}
		}

	}


}
