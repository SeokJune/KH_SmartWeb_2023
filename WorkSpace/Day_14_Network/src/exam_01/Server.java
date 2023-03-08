package exam_01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Server {

	public static void main(String[] args) throws Exception {

		int portNum = 8080;

		ServerSocket server = new ServerSocket(portNum);
		System.out.println(portNum + " 번 포트 실행 중");
		Socket socket = server.accept();
		System.out.println(socket.getInetAddress() + " 로 부터 연결");

		OutputStream os =  socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);

		while(true) {
			JOptionPane pane = new JOptionPane();
			dos.writeUTF(JOptionPane.showInputDialog("클라이언트에게 보낼 메세지"));
			dos.flush();

			JOptionPane.showMessageDialog(null, dis.readUTF());

		}
	}

}
