import java.util.Scanner;

import ftp.FileTransferProtocol;
import it.sauronsoftware.ftp4j.FTPClient;

public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		// 시작 메뉴 출력 1
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
				System.out.println("숫자를 입력해 주세요.");
				e.printStackTrace();
			}
		}

		// FTPClient 인스턴스 생성
		FTPClient client = new FTPClient();

		// FileTransferProtocol 인스턴스 생성
		FileTransferProtocol  ftp = new FileTransferProtocol();

		// URL 입력 받기 >> 세팅 >> 연결
		System.out.println("input url");
		System.out.print(">>> ");
		ftp.setIp(scan.nextLine());
		ftp.connect(client);

		// ID, PWD 입력 받기 >> 세팅 >> 로그인
		System.out.print("input ID: ");
		ftp.setId(scan.nextLine());
		System.out.print("input PassWord: ");
		ftp.setPwd(scan.nextLine());
		ftp.login(client);

		// File 작업 선택
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
						System.out.println("번호를 확인해 주세요.");
					}

					break;
				} catch (Exception e) {
					System.out.println("숫자를 입력해 주세요.");
					e.printStackTrace();
				}
			}

			switch(fileMenu) {
			case 1:
				// 업로드
				System.out.println("업로드 파일의 경로를 입력해주세요.");
				System.out.println("ex) D:\\WorkSpace\\dwonload\\");
				System.out.print(">>> ");
				ftp.setDownloadPath(scan.nextLine());
				System.out.println("업로드할 파일을 확장자까지 입력해주세요.");
				System.out.println("ex) 예시.txt");
				System.out.print(">>> ");
				ftp.setHostFileName(scan.nextLine());

				ftp.upload(client);
				break;
			case 2:
				// 다운로드
				// File List 출력 >> 선택
				System.out.println("다음 목록 중에 고르세요.");
				ftp.fileList(client);
				System.out.println("다운로드할 파일을 확장자까지 입력해주세요.");
				System.out.println("ex) 예시.txt");
				System.out.print(">>> ");
				ftp.setHostFileName(scan.nextLine());
				System.out.println("다운로드할 경로 및 파일 이름을 입력해주세요.");
				System.out.println("ex) D:\\WorkSpace\\dwonload\\");
				System.out.print(">>> ");
				ftp.setDownloadPath(scan.nextLine());

				ftp.download(client);

				break;
			case 3:
				// 연결 해제
				ftp.disconnect(client);
				break;
			case 4:
				// 파일 삭제
				// File List 출력 >> 선택
				System.out.println("다음 목록 중에 고르세요.");
				ftp.fileList(client);
				System.out.println("삭제할 파일을 확장자까지 입력해주세요.");
				System.out.println("ex) 예시.txt");
				System.out.print(">>> ");
				ftp.setHostFileName(scan.nextLine());
				ftp.delete(client);
				break;
			}
		}

	}

}
