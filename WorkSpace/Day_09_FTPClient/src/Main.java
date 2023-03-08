import java.io.IOException;

import it.sauronsoftware.ftp4j.FTPAbortedException;
import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPDataTransferException;
import it.sauronsoftware.ftp4j.FTPException;
import it.sauronsoftware.ftp4j.FTPIllegalReplyException;
import it.sauronsoftware.ftp4j.FTPListParseException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FTPClient client = new FTPClient();
		
		String ip = "192.168.50.23";
		//String ip = "192.168.50.65";
		int port = 21;
		String id = "java";
		String pwd = "1234";
		String hostFileName = "download.txt";
		String downloadPath = "D:\\WorkSpace\\dwonload\\";
		String downloadFileName = "success.txt";

		// 해당 IP에 FTP로 접속
		try {
			client.connect(ip, port);
			System.out.println("접속 성공");
		} catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException e) {
			// TODO Auto-generated catch block
			System.out.println("접속 실패");
			e.printStackTrace();
			System.exit(0);
		}

		// ID, PWD 입력
		try {
			client.login(id, pwd);
			System.out.println("로그인 성공");
		} catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException e) {
			// TODO Auto-generated catch block
			System.out.println("로그인 실패");
			e.printStackTrace();
		}

		// 인코딩
		client.setCharset("UTF-8");

		try {
			System.out.println("--------------------");
			for (String name : client.listNames()) {
				System.out.println(name);
			}
			System.out.println("--------------------");
		} catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException
				| FTPDataTransferException | FTPAbortedException | FTPListParseException e2) {
			System.out.println("리스트 확인 실패");
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		// 다운로드
		try {
			client.download(hostFileName, new java.io.File(downloadPath + downloadFileName));
			System.out.println("다운로드 성공");
		} catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException
				| FTPDataTransferException | FTPAbortedException e1) {
			System.out.println("다운로드 실패");
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// 연결 해제
		try {
			client.disconnect(true);
			System.out.println("연결 해제 성공");
		} catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException e) {
			// TODO Auto-generated catch block
			System.out.println("연결 해제 실패");
			e.printStackTrace();
			System.exit(0);
		}


	}

}
