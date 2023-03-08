package exam01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

import thread.ClientReadThread;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hostIP = "192.168.50.65";
		hostIP = "192.168.50.62";
		int portNum = 35000;

		// 소켓 생성
		Socket socket = null;
		try {
			socket = new Socket(hostIP, portNum);
		} catch(Exception e) {
			System.out.println("Server 접속 실패");
			e.getStackTrace();
		}

		// 입력 스트림 생성
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			dis = new DataInputStream(socket.getInputStream());

			// 출력 스트림 생성
			dos = new DataOutputStream(socket.getOutputStream());
		} catch(Exception e) {
			System.out.println("입출력 스트림 생성 실패");
			e.getStackTrace();
		}

		while(true) {
			// 문자 받는 쓰레드
			Thread crt = new Thread(new ClientReadThread(dis));
			crt.start();
			
			// 서버로 문자열 보내기
			try {
				String msg = JOptionPane.showInputDialog("입력");
				System.out.println(socket.getInetAddress() + ">>>>>>>>>>>>> " + msg);
				dos.writeUTF(msg);
				dos.flush();
			} catch (IOException e) {
				System.out.println("문자열 전송 실패");
				e.printStackTrace();
			}

		}

	}

}
