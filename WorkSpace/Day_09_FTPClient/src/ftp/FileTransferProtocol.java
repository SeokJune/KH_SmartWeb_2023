package ftp;

import java.io.IOException;

import it.sauronsoftware.ftp4j.FTPAbortedException;
import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPDataTransferException;
import it.sauronsoftware.ftp4j.FTPException;
import it.sauronsoftware.ftp4j.FTPIllegalReplyException;
import it.sauronsoftware.ftp4j.FTPListParseException;

public class FileTransferProtocol {

	// Member Field
	private String ip;
	private int port = 21;
	private String id;
	private String pwd;
	private String encordingType = "UTF-8";
	private String hostFileName;
	private String downloadPath = "D:\\WorkSpace\\dwonload\\";

	// Setter & Getter
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEncordingType() {
		return encordingType;
	}

	public void setEncordingType(String encordingType) {
		this.encordingType = encordingType;
	}

	public String getHostFileName() {
		return hostFileName;
	}

	public void setHostFileName(String hostFileName) {
		this.hostFileName = hostFileName;
	}

	public String getDownloadPath() {
		return downloadPath;
	}

	public void setDownloadPath(String downloadPath) {
		this.downloadPath = downloadPath;
	}

	// 연결
	public void connect(FTPClient client) {
		try {
			client.connect(this.ip, this.port);
			//encording(client, encordingType);
			System.out.println("FTP Server is connected");
		} catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException e) {
			// TODO Auto-generated catch block
			System.out.println("FTP Server is not connected");
			e.printStackTrace();
			System.exit(0);
		}
	}

	// 로그인
	public void login(FTPClient client) {
		try {
			client.login(this.id, this.pwd);
			System.out.println("Login Success!");
		} catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException e) {
			// TODO Auto-generated catch block
			System.out.println("Login Fail!");
			e.printStackTrace();
		}
	}

	// 종료
	public void disconnect(FTPClient client) {
		try {
			client.disconnect(true);
			System.out.println("FTP Server is disconnected");
		} catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException e) {
			// TODO Auto-generated catch block
			System.out.println("FTP Server is not disconnected");
			e.printStackTrace();
			System.exit(0);
		}
	}

	// 인코딩
	public void encording(FTPClient client, String encordingType) {
		client.setCharset(encordingType);
	}
	
	// 리스트 출력
	public void fileList(FTPClient client) {

		try {
			for(int i = 0 ; i < client.listNames().length ; i++) {
				System.out.println((i + 1) + ". " + client.listNames()[i]);
			}
		} catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException
				| FTPDataTransferException | FTPAbortedException | FTPListParseException e2) {
			System.out.println("List Check Fail!");
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}

	// 업로드
	public void upload(FTPClient client) {
		try {
			client.upload(new java.io.File(this.downloadPath + this.hostFileName));
			System.out.println("Upload Succesee!");
		} catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException
				| FTPDataTransferException | FTPAbortedException e1) {
			System.out.println("Upload Fail!");
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	// 다운로드
	public void download(FTPClient client) {
		try {
			//encording(client, this.encordingType);
			System.out.println(this.downloadPath + this.hostFileName);
			client.download(this.hostFileName, new java.io.File(this.downloadPath + this.hostFileName));
			System.out.println("Download Succesee!");
		} catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException
				| FTPDataTransferException | FTPAbortedException e1) {
			System.out.println("Download Fail!");
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void delete(FTPClient client) {
		try {
			client.deleteFile(hostFileName);
			System.out.println("Delete Succesee!");
		} catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException e) {
			System.out.println("Delete Fail!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
