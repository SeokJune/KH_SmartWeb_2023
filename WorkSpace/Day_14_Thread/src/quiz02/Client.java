package quiz02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

class WriteThread extends Thread {
	@Override
	public void run() {
		while(true) {
			try {
				Client.dos.writeUTF(JOptionPane.showInputDialog("서버에게 보낼 메세지"));
				Client.dos.flush();
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}

public class Client {
	public static DataOutputStream dos;
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("192.168.50.62", 8080);
		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		OutputStream os = socket.getOutputStream();
		dos = new DataOutputStream(os);
		new WriteThread().start();
		while(true) {
			System.out.println("서버가 보낸 메세지: " + dis.readUTF());
		}
	}
}
