package exam02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int portNum = 45000;
		String filePath = "C:\\Users\\teufe\\Downloads\\����Ʈ�� Ŀ��ŧ�� (������)_230113_212231.pdf";

		// ���� ���� ����
		ServerSocket server = null;
		try {
			server = new ServerSocket(portNum);
			System.out.println("���� ���� ����");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
			e.printStackTrace();
		}
		
		while(true) {
			Socket socket = null;
			try {
				
				socket = server.accept();
				System.out.println(socket.getInetAddress() + " �� ���� ����");
				
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				
				// �ϵ��ũ���� ������ ������ File ��ü�� ����
				File root = new File(filePath);
				
				// ������ File ��ü�� ���Ͽ� InputStream ������ DataStream���� ���׷��̵�
				FileInputStream fis = new FileInputStream(root);
				DataInputStream dis = new DataInputStream(fis);
				
				// �ϵ��ũ�� ������ ������ ũ�⸸ŭ ���� ������ �غ�
				byte[] fileContents = new byte[(int) root.length()];
				
				// �ϵ��ũ�� ������ ������ ������ ���� �غ�� ������ ���� ����
				dis.readFully(fileContents);
				
				// �ε� �Ϸ�� ���� ����� Ŭ���̾�Ʈ�� ����
				dos.writeInt((int) root.length());
				dos.flush();
				
				// �ε� �Ϸ�� ���� ������ Ŭ���̾�Ʈ�� ����
				dos.write(fileContents);
				dos.flush();
				
			} catch(Exception e) {
				e.getStackTrace();
			}
		}

	}

}
