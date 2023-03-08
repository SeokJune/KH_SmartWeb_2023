package exam01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import thread.ClientThread;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int portNum = 35000;

		// 辑滚 家南 积己
		ServerSocket server = null;
		try {
			server = new ServerSocket(portNum);
			System.out.println("辑滚 角青 己傍");
		} catch (IOException e) {
			System.out.println("辑滚 角青 角菩");
			e.printStackTrace();
		}

		// 立加磊 乐栏搁 家南 积己
		Socket socket = null;

		while(true) {
			try {
				socket = server.accept();
				System.out.println(socket.getInetAddress() + " 立加");
			} catch (IOException e) {
				System.out.println(socket.getInetAddress() + " 立加 秦力");
				e.printStackTrace();
			}

			// Thread 角青
			Thread cThread = new Thread(new ClientThread(socket));
			cThread.start();

		} 

	}

}
