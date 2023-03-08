package exam02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hostIP = "192.168.50.65";
		hostIP = "192.168.50.62";
		int portNum = 45000;

		// ���� ����
		Socket socket = null;
		try {
			socket = new Socket(hostIP, portNum);
		} catch(Exception e) {
			System.out.println("���� ���� ����");
			e.getStackTrace();
		}

		// ��.��� ��Ʈ�� ����
		try {
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			
			byte[] fileContents = new byte[dis.readInt()];
			
			dis.readFully(fileContents);
			
			FileOutputStream fos = new FileOutputStream(new File("D:/WorkSpace/xxx.pdf"));
			DataOutputStream dos = new DataOutputStream(fos);
			dos.write(fileContents);
			dos.flush();
			
			fos.close();

		} catch(Exception e) {
			System.out.println("����� ��Ʈ�� ���� ����");
			e.getStackTrace();
		}
		
	}

}
