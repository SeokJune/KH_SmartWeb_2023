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

		// �ش� IP�� FTP�� ����
		try {
			client.connect(ip, port);
			System.out.println("���� ����");
		} catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ����");
			e.printStackTrace();
			System.exit(0);
		}

		// ID, PWD �Է�
		try {
			client.login(id, pwd);
			System.out.println("�α��� ����");
		} catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException e) {
			// TODO Auto-generated catch block
			System.out.println("�α��� ����");
			e.printStackTrace();
		}

		// ���ڵ�
		client.setCharset("UTF-8");

		try {
			System.out.println("--------------------");
			for (String name : client.listNames()) {
				System.out.println(name);
			}
			System.out.println("--------------------");
		} catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException
				| FTPDataTransferException | FTPAbortedException | FTPListParseException e2) {
			System.out.println("����Ʈ Ȯ�� ����");
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		// �ٿ�ε�
		try {
			client.download(hostFileName, new java.io.File(downloadPath + downloadFileName));
			System.out.println("�ٿ�ε� ����");
		} catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException
				| FTPDataTransferException | FTPAbortedException e1) {
			System.out.println("�ٿ�ε� ����");
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// ���� ����
		try {
			client.disconnect(true);
			System.out.println("���� ���� ����");
		} catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ���� ����");
			e.printStackTrace();
			System.exit(0);
		}


	}

}
