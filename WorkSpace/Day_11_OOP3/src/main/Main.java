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

		// 상속
		// 다형성
		// 추상화
		// Collection: 
		//  배열 문제를 해결하기 위한 첫번째 대안
		//   1. 동적 배열: Vector -> ArrayList
		//   2. LinkedList
		//   3. Hash / Tree 

		// 회원관리 시스템: 회원 ID, 회원 이름, 회원 포인트
		// 등급 클래스: Silver Class
		
		// 완성된 코드의 문제점 3가지
		// 코드 중복도 (유지 보수 문제점) - 상속 [IS - A 관계]
		// 코드 결합도 == 의존도 (유지 보수 문제점 / 낮을수록 좋음) - 다형성
		// 저장소 이슈 - Collection

		Scanner scan = new Scanner(System.in);
		Manager manager = new Manager();

		while(true) {
			System.out.println("== 회원 관리 시스템 ==");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 출력");
			System.out.println("0. 종료");

			int menu = 0;
			while(true) {
				System.out.print(">>  ");

				try {
					menu = Integer.parseInt(scan.nextLine());
					break;
				} catch(Exception e) {
					System.out.println("숫자를 입력해 주세요.");
					e.printStackTrace();
				}
			}
			
			if(menu == 0) { 
				// 0. 종료
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			} else if(menu == 1) { 
				// 1. 신규 회원 등록
				manager.insert(new Silver(1001, "Tom", 1000));
				manager.insert(new Silver(1002, "Jane", 2000));
				manager.insert(new Silver(1003, "Mike", 3000));
				manager.insert(new Gold(1004, "Susan", 4000));
				manager.insert(new Ruby(1005, "Jack", 5000));
			} else if(menu == 2) {
				// 2. 회원 정보 출력
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
				System.out.println("메뉴를 다시 확인해주세요.");
			}
		}
		
	}

}
