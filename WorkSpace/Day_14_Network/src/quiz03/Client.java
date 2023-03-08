package quiz03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception {

		String hostIp = "192.168.50.5";
		hostIp = "192.168.50.62";
		int portNum = 6767;

		Socket socket = new Socket(hostIp, portNum);

		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);

		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("<< 연락처 관리 프로그램 >>");
			System.out.println("1. 연락처 신규 등록");
			System.out.println("2. 연락처 목록 확인");
			System.out.println("3. 연락처 검색 - 이름");
			System.out.println("4. 연락처 삭제 - ID");
			System.out.println("0. 프로그램 종료");
			System.out.print(">>> ");
			int menu = Integer.parseInt(scan.nextLine());

			// 메뉴 번호 확인
			if(!(menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 0)) {
				System.out.println("!! 메뉴 번호를 확인해 주세요 !!");
				continue;
			}

			// 0번 종료
			if(menu == 0) {
				System.out.println("<< 프로그램을 종료합니다. >>");
				socket.close();
				System.exit(0);
			}

			// 메뉴 번호 전송
			dos.writeInt(menu);
			dos.flush();
			
			if(menu == 1) { // 1. 연락처 신규 등록
				// 아이디 입력받은 후 서버에 전송
				System.out.print("아이디 입력 >>");
				dos.writeInt(Integer.parseInt(scan.nextLine()));
				dos.flush();
				
				// 아이디 중복 체크 결과 서버로 부터 받기(true - 중복 O)
				if(dis.readBoolean()) {
					System.out.println("!! 아이디 중복 !!");
					continue;
				}
				
				// 이름, 연락처 입력 받은 후 서버에 전송
				System.out.print("이름 입력 >>");
				dos.writeUTF(scan.nextLine());
				System.out.print("연락처 입력 >>");
				dos.writeUTF(scan.nextLine());
				dos.flush();
				
				// 등록 성공 여부 출력
				System.out.println(dis.readBoolean() ? "<< 등록 성공 >>" : "!! 등록 실패 !!");
			} else if(menu == 2) { // 2. 연락처 목록 확인
				System.out.println("아이디\t이름\t연락처");
				// 서버로부터 배열의 사이즈 받기 -> 반복 횟수를 위해서
				int size = dis.readInt();
				
				// 출력
				for(int i = 0 ; i < size ; i++) {
					System.out.print(dis.readInt() + "\t");
					System.out.print(dis.readUTF() + "\t");
					System.out.println(dis.readUTF());
				}
				
			} else if(menu == 3) { // 3. 연락처 검색 - 이름
				// 이름 입력받은 후 서버에 전송
				System.out.print("이름 입력 >>");
				dos.writeUTF(scan.nextLine());
				dos.flush();
				
				// 이름 체크 (true - 존재함)
				if(!dis.readBoolean()) {
					System.out.println("!! 이름 없음 !!");
					continue;
				}
				
				// 서버로 부터 아이디, 이름, 연락처 전송 받은 후 출력
				System.out.println("아이디\t이름\t연락처");
				System.out.print(dis.readInt() + "\t");
				System.out.print(dis.readUTF() + "\t");
				System.out.println(dis.readUTF());
				
			} else if(menu == 4) { // 4. 연락처 삭제 - ID
				// 아이디 입력받은 후 서버에 전송
				System.out.print("아이디 입력 >>");
				dos.writeInt(Integer.parseInt(scan.nextLine()));
				dos.flush();
				
				// 아이디 체크
				if(!dis.readBoolean()) {
					System.out.println("!! 아이디 없음 !!");
					continue;
				}
				
			}

		}

	}

}
