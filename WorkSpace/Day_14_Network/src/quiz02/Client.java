package quiz02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

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

		while(true) {
			String id = JOptionPane.showInputDialog("고유 ID");
			
			if(Integer.parseInt(id) < 1001 && Integer.parseInt(id) > 1100) {
				JOptionPane.showMessageDialog(null, "ID 범위를 벗어났습니다.");
				continue;
			}
			
			dos.writeUTF(id);
			dos.flush();

			if(dis.readUTF().equals("true")) {
				JOptionPane.showMessageDialog(null, "존재하는 ID입니다.");
				continue;
			}

			dos.writeUTF(JOptionPane.showInputDialog("이름"));
			dos.flush();
			dos.writeUTF(JOptionPane.showInputDialog("전화번호 (XXX-XXXX-XXXX)"));
			dos.flush();

			if(dis.readUTF().equals("ack")) {
				JOptionPane.showMessageDialog(null, "저장 완료");
			}

		}

		//1. 클라이언트는 서버에 접속한다.
		//2. 클라이언트는 사람의 고유ID (1001 ~ 1100)를 입력하여 서버에 전송한다.
		//3. 클라이언트는 사람의 이름을 입력하여 서버에 전송한다.
		//4. 클라이언트는 사람의 연락처(전화번호)를 입력하여 서버에 전송한다.
		//5. 서버는 클라이언트로 부터 전달된 3다지 데이터를 Contact Instance로 만든다.
		//   Contact [정보 은닉 적용]
		//   id, name, phone 3가지 멤버필드에 대하여
		//   getter, setter, constructor, default constructor 를 가진다.
		//6. 서버는 만들어진 인스턴스를 데이터 관리 전용 인스턴스인 Manager에게 전달하여
		//   Contact를 저장하는 ArrayLisy에 보관한다.
		//   (저장 한 후, ArrayList에 현재 몇개의 데이터가 있는지 Server Console에 출력하세요.)
		//7. 보관을 완료 한 후, 서버는 클라이언트에게 저장 완료의 의미린 ack 를 반환한다.
		//8. 클라이언트는 ack가 반환되면, 사용자에게 "저장 완료" 메세지를 출력한다.
		//9. 2 ~ 8번 까지의 작업은 무한 반복한다.

	}

}
