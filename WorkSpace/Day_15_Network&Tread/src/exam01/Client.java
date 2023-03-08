package exam01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

import thread.ClientReadThread;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hostIP = "192.168.50.65";
		hostIP = "192.168.50.62";
		int portNum = 35000;

		// ���� ����
		Socket socket = null;
		try {
			socket = new Socket(hostIP, portNum);
		} catch(Exception e) {
			System.out.println("Server ���� ����");
			e.getStackTrace();
		}

		// �Է� ��Ʈ�� ����
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			dis = new DataInputStream(socket.getInputStream());

			// ��� ��Ʈ�� ����
			dos = new DataOutputStream(socket.getOutputStream());
		} catch(Exception e) {
			System.out.println("����� ��Ʈ�� ���� ����");
			e.getStackTrace();
		}

		while(true) {
			// ���� �޴� ������
			Thread crt = new Thread(new ClientReadThread(dis));
			crt.start();
			
			// ������ ���ڿ� ������
			try {
				String msg = JOptionPane.showInputDialog("�Է�");
				System.out.println(socket.getInetAddress() + ">>>>>>>>>>>>> " + msg);
				dos.writeUTF(msg);
				dos.flush();
			} catch (IOException e) {
				System.out.println("���ڿ� ���� ����");
				e.printStackTrace();
			}

		}

	}

}
