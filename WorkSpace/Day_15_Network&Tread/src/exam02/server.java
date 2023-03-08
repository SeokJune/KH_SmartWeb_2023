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
		String filePath = "C:\\Users\\teufe\\Downloads\\스마트웹 커리큘럼 (배포용)_230113_212231.pdf";

		// 서버 소켓 생성
		ServerSocket server = null;
		try {
			server = new ServerSocket(portNum);
			System.out.println("서버 실행 성공");
		} catch (IOException e) {
			System.out.println("서버 실행 실패");
			e.printStackTrace();
		}
		
		while(true) {
			Socket socket = null;
			try {
				
				socket = server.accept();
				System.out.println(socket.getInetAddress() + " 로 부터 연결");
				
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				
				// 하드디스크에서 전송할 파일을 File 객체로 생성
				File root = new File(filePath);
				
				// 생성된 File 객체에 대하여 InputStream 개방후 DataStream으로 업그레이드
				FileInputStream fis = new FileInputStream(root);
				DataInputStream dis = new DataInputStream(fis);
				
				// 하드디스크에 보관된 파일의 크기만큼 램에 공간을 준비
				byte[] fileContents = new byte[(int) root.length()];
				
				// 하드디스크에 보관된 파일의 내용을 램에 준비된 공간에 전부 복사
				dis.readFully(fileContents);
				
				// 로딩 완료된 파일 사이즈를 클라이언트에 전송
				dos.writeInt((int) root.length());
				dos.flush();
				
				// 로딩 완료된 파일 내용을 클라이언트에 전송
				dos.write(fileContents);
				dos.flush();
				
			} catch(Exception e) {
				e.getStackTrace();
			}
		}

	}

}
