package quiz01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Client {

	public static void main(String[] args) throws Exception {

		String hostIp = "192.168.50.5";
		//hostIp = "192.168.50.62";
		int portNum = 6767;

		Socket socket = new Socket(hostIp, portNum);

		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);

		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		// 1. 클라이언트가 서버에 접속한다.

		// 2. 클라이언트가 먼저 +, -, *, / 중 하나를 입력하여 서버에 전송한다.

		// 3. 클라이언트가 숫자 하나를 입력하여 서버에 전송한다.

		// 4. 클라이언트가 숫자를 하나 더 입력하여 서버에 전송한다.

		// 5. 서버는 클라이언트가 전송한 데이터들을 전달 받아 두 숫자에 대하여 2전에서 전송된 연산을 처리하고 그 결과를 클라이언트에 반환한다.

		while(true) {
			String op = JOptionPane.showInputDialog("사칙연산(+, -, *, /) 입력");
			if(!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
				continue;
			}
			dos.writeUTF(op);
			dos.flush();

			dos.writeUTF(JOptionPane.showInputDialog("첫 번째 숫자 입력"));
			dos.flush();

			dos.writeUTF(JOptionPane.showInputDialog("두 번째 숫자 입력"));
			dos.flush();

			JOptionPane.showMessageDialog(null, dis.readUTF());

		}

	}

}
