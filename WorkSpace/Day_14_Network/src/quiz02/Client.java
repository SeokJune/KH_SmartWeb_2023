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
			String id = JOptionPane.showInputDialog("���� ID");
			
			if(Integer.parseInt(id) < 1001 && Integer.parseInt(id) > 1100) {
				JOptionPane.showMessageDialog(null, "ID ������ ������ϴ�.");
				continue;
			}
			
			dos.writeUTF(id);
			dos.flush();

			if(dis.readUTF().equals("true")) {
				JOptionPane.showMessageDialog(null, "�����ϴ� ID�Դϴ�.");
				continue;
			}

			dos.writeUTF(JOptionPane.showInputDialog("�̸�"));
			dos.flush();
			dos.writeUTF(JOptionPane.showInputDialog("��ȭ��ȣ (XXX-XXXX-XXXX)"));
			dos.flush();

			if(dis.readUTF().equals("ack")) {
				JOptionPane.showMessageDialog(null, "���� �Ϸ�");
			}

		}

		//1. Ŭ���̾�Ʈ�� ������ �����Ѵ�.
		//2. Ŭ���̾�Ʈ�� ����� ����ID (1001 ~ 1100)�� �Է��Ͽ� ������ �����Ѵ�.
		//3. Ŭ���̾�Ʈ�� ����� �̸��� �Է��Ͽ� ������ �����Ѵ�.
		//4. Ŭ���̾�Ʈ�� ����� ����ó(��ȭ��ȣ)�� �Է��Ͽ� ������ �����Ѵ�.
		//5. ������ Ŭ���̾�Ʈ�� ���� ���޵� 3���� �����͸� Contact Instance�� �����.
		//   Contact [���� ���� ����]
		//   id, name, phone 3���� ����ʵ忡 ���Ͽ�
		//   getter, setter, constructor, default constructor �� ������.
		//6. ������ ������� �ν��Ͻ��� ������ ���� ���� �ν��Ͻ��� Manager���� �����Ͽ�
		//   Contact�� �����ϴ� ArrayLisy�� �����Ѵ�.
		//   (���� �� ��, ArrayList�� ���� ��� �����Ͱ� �ִ��� Server Console�� ����ϼ���.)
		//7. ������ �Ϸ� �� ��, ������ Ŭ���̾�Ʈ���� ���� �Ϸ��� �ǹ̸� ack �� ��ȯ�Ѵ�.
		//8. Ŭ���̾�Ʈ�� ack�� ��ȯ�Ǹ�, ����ڿ��� "���� �Ϸ�" �޼����� ����Ѵ�.
		//9. 2 ~ 8�� ������ �۾��� ���� �ݺ��Ѵ�.

	}

}
