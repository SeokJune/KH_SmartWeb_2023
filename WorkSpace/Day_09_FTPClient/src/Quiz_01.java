import java.util.Scanner;

import ftp.FileTransferProtocol;
import it.sauronsoftware.ftp4j.FTPClient;

public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		// ���� �޴� ��� 1
		System.out.println("=== FTP Client Program ===");
		System.out.println("1. Connect FTP Server");
		System.out.println("2. Exit Program");
		while(true) {
			System.out.print(">>> ");

			try {
				int menu = Integer.parseInt(scan.nextLine());

				// 2. Exit Program
				if(menu == 2) {
					System.exit(0);
				}

				// 1. Connect FTP Server
				break;
			} catch (Exception e) {
				System.out.println("���ڸ� �Է��� �ּ���.");
				e.printStackTrace();
			}
		}

		// FTPClient �ν��Ͻ� ����
		FTPClient client = new FTPClient();

		// FileTransferProtocol �ν��Ͻ� ����
		FileTransferProtocol  ftp = new FileTransferProtocol();

		// URL �Է� �ޱ� >> ���� >> ����
		System.out.println("input url");
		System.out.print(">>> ");
		ftp.setIp(scan.nextLine());
		ftp.connect(client);

		// ID, PWD �Է� �ޱ� >> ���� >> �α���
		System.out.print("input ID: ");
		ftp.setId(scan.nextLine());
		System.out.print("input PassWord: ");
		ftp.setPwd(scan.nextLine());
		ftp.login(client);

		// File �۾� ����
		while(true) {
			System.out.println("========== File ==========");
			System.out.println("1. Upload File");
			System.out.println("2. Download File");
			System.out.println("3. Disconnect FTP Server");
			System.out.println("4. Delete File");
			int fileMenu = 0;
			while(true) {
				System.out.print(">>> ");
				try {
					fileMenu = Integer.parseInt(scan.nextLine());

					if(!(fileMenu == 1 || fileMenu == 2 || fileMenu == 3 || fileMenu == 4)) {
						System.out.println("��ȣ�� Ȯ���� �ּ���.");
					}

					break;
				} catch (Exception e) {
					System.out.println("���ڸ� �Է��� �ּ���.");
					e.printStackTrace();
				}
			}

			switch(fileMenu) {
			case 1:
				// ���ε�
				System.out.println("���ε� ������ ��θ� �Է����ּ���.");
				System.out.println("ex) D:\\WorkSpace\\dwonload\\");
				System.out.print(">>> ");
				ftp.setDownloadPath(scan.nextLine());
				System.out.println("���ε��� ������ Ȯ���ڱ��� �Է����ּ���.");
				System.out.println("ex) ����.txt");
				System.out.print(">>> ");
				ftp.setHostFileName(scan.nextLine());

				ftp.upload(client);
				break;
			case 2:
				// �ٿ�ε�
				// File List ��� >> ����
				System.out.println("���� ��� �߿� ������.");
				ftp.fileList(client);
				System.out.println("�ٿ�ε��� ������ Ȯ���ڱ��� �Է����ּ���.");
				System.out.println("ex) ����.txt");
				System.out.print(">>> ");
				ftp.setHostFileName(scan.nextLine());
				System.out.println("�ٿ�ε��� ��� �� ���� �̸��� �Է����ּ���.");
				System.out.println("ex) D:\\WorkSpace\\dwonload\\");
				System.out.print(">>> ");
				ftp.setDownloadPath(scan.nextLine());

				ftp.download(client);

				break;
			case 3:
				// ���� ����
				ftp.disconnect(client);
				break;
			case 4:
				// ���� ����
				// File List ��� >> ����
				System.out.println("���� ��� �߿� ������.");
				ftp.fileList(client);
				System.out.println("������ ������ Ȯ���ڱ��� �Է����ּ���.");
				System.out.println("ex) ����.txt");
				System.out.print(">>> ");
				ftp.setHostFileName(scan.nextLine());
				ftp.delete(client);
				break;
			}
		}

	}

}
