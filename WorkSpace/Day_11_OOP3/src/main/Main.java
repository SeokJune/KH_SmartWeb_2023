package main;

import java.util.ArrayList;
import java.util.Scanner;

import classes.Gold;
import classes.Member;
import classes.Ruby;
import classes.Silver;
import manager.Manager;

public class Main {

	public static void main(String[] args) {

		// ���
		// ������
		// �߻�ȭ
		// Collection: 
		//  �迭 ������ �ذ��ϱ� ���� ù��° ���
		//   1. ���� �迭: Vector -> ArrayList
		//   2. LinkedList
		//   3. Hash / Tree 

		// ȸ������ �ý���: ȸ�� ID, ȸ�� �̸�, ȸ�� ����Ʈ
		// ��� Ŭ����: Silver Class
		
		// �ϼ��� �ڵ��� ������ 3����
		// �ڵ� �ߺ��� (���� ���� ������) - ��� [IS - A ����]
		// �ڵ� ���յ� == ������ (���� ���� ������ / �������� ����) - ������
		// ����� �̽� - Collection

		Scanner scan = new Scanner(System.in);
		Manager manager = new Manager();

		while(true) {
			System.out.println("== ȸ�� ���� �ý��� ==");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���� ���");
			System.out.println("0. ����");

			int menu = 0;
			while(true) {
				System.out.print(">>  ");

				try {
					menu = Integer.parseInt(scan.nextLine());
					break;
				} catch(Exception e) {
					System.out.println("���ڸ� �Է��� �ּ���.");
					e.printStackTrace();
				}
			}
			
			if(menu == 0) { 
				// 0. ����
				System.out.println("�ý����� �����մϴ�.");
				System.exit(0);
			} else if(menu == 1) { 
				// 1. �ű� ȸ�� ���
				manager.insert(new Silver(1001, "Tom", 1000));
				manager.insert(new Silver(1002, "Jane", 2000));
				manager.insert(new Silver(1003, "Mike", 3000));
				manager.insert(new Gold(1004, "Susan", 4000));
				manager.insert(new Ruby(1005, "Jack", 5000));
			} else if(menu == 2) {
				// 2. ȸ�� ���� ���
				ArrayList<Member> members =  manager.getMembers();
				
				System.out.println("ID\tName\tPoint\tBonus");
				
//				for(int i = 0 ; i < members.size() ; i++) {
//					System.out.println(members.get(i).getId() + "\t" +
//										members.get(i).getName() + "\t" +
//										members.get(i).getPoint() + "\t" +
//										members.get(i).getBonus());
//				}
				
				for(Member member : members) {
					System.out.println(member.getId() + "\t" +
										member.getName() + "\t" +
										member.getPoint() + "\t" +
										member.getBonus());
				}
				
			} else {
				System.out.println("�޴��� �ٽ� Ȯ�����ּ���.");
			}
		}
		
	}

}
