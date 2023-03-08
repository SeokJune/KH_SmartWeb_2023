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
				System.out.println("클라이언트가 보낸 메세지: " + Server.dis.readUTF());
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
			dos.writeUTF(JOptionPane.showInputDialog("클라이언트에게 보낼 메세지"));
			dos.flush();
		}
	}
}
