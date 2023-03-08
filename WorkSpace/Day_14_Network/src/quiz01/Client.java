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

		// 1. Ŭ���̾�Ʈ�� ������ �����Ѵ�.

		// 2. Ŭ���̾�Ʈ�� ���� +, -, *, / �� �ϳ��� �Է��Ͽ� ������ �����Ѵ�.

		// 3. Ŭ���̾�Ʈ�� ���� �ϳ��� �Է��Ͽ� ������ �����Ѵ�.

		// 4. Ŭ���̾�Ʈ�� ���ڸ� �ϳ� �� �Է��Ͽ� ������ �����Ѵ�.

		// 5. ������ Ŭ���̾�Ʈ�� ������ �����͵��� ���� �޾� �� ���ڿ� ���Ͽ� 2������ ���۵� ������ ó���ϰ� �� ����� Ŭ���̾�Ʈ�� ��ȯ�Ѵ�.

		while(true) {
			String op = JOptionPane.showInputDialog("��Ģ����(+, -, *, /) �Է�");
			if(!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
				continue;
			}
			dos.writeUTF(op);
			dos.flush();

			dos.writeUTF(JOptionPane.showInputDialog("ù ��° ���� �Է�"));
			dos.flush();

			dos.writeUTF(JOptionPane.showInputDialog("�� ��° ���� �Է�"));
			dos.flush();

			JOptionPane.showMessageDialog(null, dis.readUTF());

		}

	}

}
