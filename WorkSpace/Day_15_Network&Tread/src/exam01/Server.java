package exam01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import thread.ClientThread;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int portNum = 35000;

		// ���� ���� ����
		ServerSocket server = null;
		try {
			server = new ServerSocket(portNum);
			System.out.println("���� ���� ����");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
			e.printStackTrace();
		}

		// ������ ������ ���� ����
		Socket socket = null;

		while(true) {
			try {
				socket = server.accept();
				System.out.println(socket.getInetAddress() + " ����");
			} catch (IOException e) {
				System.out.println(socket.getInetAddress() + " ���� ����");
				e.printStackTrace();
			}

			// Thread ����
			Thread cThread = new Thread(new ClientThread(socket));
			cThread.start();

		} 

	}

}
