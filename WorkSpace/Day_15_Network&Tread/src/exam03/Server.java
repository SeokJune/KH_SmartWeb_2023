package exam03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int portNum = 45000;

		// 서버 소켓 생성
		ServerSocket server = null;
		try {
			server = new ServerSocket(portNum);
		} catch (IOException e) {
			System.exit(0);
		}
		System.out.println("서버를 구동했습니다..");

		
		while(true) {
			Socket socket = null;
			try {
				socket = server.accept();
				new FileThread(socket).start();
			} catch (Exception e) {
				System.out.println(socket.getInetAddress() + " 접속 해제");
			}
		}
	}

}
