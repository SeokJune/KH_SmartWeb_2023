package quiz03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

	public static void main(String[] args) throws Exception {

		int portNum = 6767;
		ServerSocket server = new ServerSocket(portNum);

		System.out.println("서버가 가동 되었습니다.");
		Socket socket = server.accept();
		System.out.println(socket.getInetAddress() + " 로 부터 연결");

		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);

		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		Manager manager = new Manager();

		while(true) {
			// 클라이언트로부터 선택한 메뉴 번호 받기
			int menu = dis.readInt();

			if(menu == 1) { // 1. 연락처 신규 등록
				int id = dis.readInt();

				// 리스트에 아이디가 존재 하는지 체크하고 결과 클라이언트로 전송(true - 있음 / false - 없음)
				if(manager.checkById(id)) {
					dos.writeBoolean(true);
					continue;
				} else {
					dos.writeBoolean(false);
				}

				// 클라이언트로부터 이름, 전화번호 받기
				String name = dis.readUTF();
				String phone = dis.readUTF();

				// 아이디, 이름, 전화번호를 가지는 Contact를 이용하여 추가
				manager.insert(new Contact(id, name, phone));

				// 성공 여부 전송(true - 성공)
				dos.writeBoolean(true);
				dos.flush();
			} else if(menu == 2) { // 2. 연락처 목록 확인
				// 전체 리스트 검색
				ArrayList<Contact> contact =  manager.selectByAll();
				// 반복을 위해 클라이언트에게 사이즈 전송
				dos.writeInt(contact.size());
				dos.flush();

				// 반복문을 돌려서 아이디, 이름, 전화번호 전송
				for(Contact constact : manager.selectByAll()) {
					dos.writeInt(constact.getId());
					dos.writeUTF(constact.getName());
					dos.writeUTF(constact.getPhone());
					dos.flush();
				}
			} else if(menu == 3) { // 3. 연락처 검색 - 이름
				// 클라이언트로부터 이름 전달 받기
				String name = dis.readUTF();

				// 리스트에 이름이 존재 하는지 체크하고 결과 클라이언트로 전송(true - 있음 / false - 없음)
				if(manager.checkByName(name)) {
					dos.writeBoolean(true);
				} else {
					dos.writeBoolean(false);
					continue;
				}

				// 이름으로 검색된 Contact 인스턴스를 넘겨 받음
				Contact contact = manager.selectByName(name);

				// Contact 인스턴스에 저장된 아이디, 이름, 전화번호 클라이언트로 전송
				dos.writeInt(contact.getId());
				dos.writeUTF(contact.getName());
				dos.writeUTF(contact.getPhone());
				dos.flush();

			} else if(menu == 4) { // 4. 연락처 삭제 - ID
				int id = dis.readInt();

				// 리스트에 아이디가 존재 하는지 체크하고 결과 클라이언트로 전송(true - 있음 / false - 없음)
				if(manager.checkById(id)) {
					dos.writeBoolean(true);
				} else {
					dos.writeBoolean(false);
					continue;
				}

				// 아이디를 이용하여 Contact 삭제
				manager.deleteById(id);
			}

		}

	}

}
