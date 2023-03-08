package quiz02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception {
		
		int portNum = 6767;
		ServerSocket server = new ServerSocket(portNum);
		
		System.out.println("������ ���� �Ǿ����ϴ�.");
		Socket socket = server.accept();
		System.out.println(socket.getInetAddress() + " �� ���� ����");
		
		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		Manager manager = new Manager();
		while(true) {
			int id = Integer.parseInt(dis.readUTF());

			if(manager.selectByID(id)) {
				dos.writeUTF("true");
				dos.flush();
				continue;
			} else {
				dos.writeUTF("false");
				dos.flush();
			}

			String name = dis.readUTF();
			String phone = dis.readUTF();
			
			int result = manager.insert(new Contact(id, name, phone));
			System.out.println("���� ����� ������ ��: " + result);
			manager.selectByAll();
			
			dos.writeUTF("ack");
			dos.flush();
		}
		
	}
	
}
