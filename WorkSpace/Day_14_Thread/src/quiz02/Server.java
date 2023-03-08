package quiz02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

class ReadThread extends Thread {
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("Ŭ���̾�Ʈ�� ���� �޼���: " + Server.dis.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}

public class Server {
	public static DataInputStream dis;
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(8080);
		Socket socket = server.accept();
		InputStream is = socket.getInputStream();
		dis = new DataInputStream(is);
		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		new ReadThread().start();
		
		while(true) {
			dos.writeUTF(JOptionPane.showInputDialog("Ŭ���̾�Ʈ���� ���� �޼���"));
			dos.flush();
		}
	}
}
