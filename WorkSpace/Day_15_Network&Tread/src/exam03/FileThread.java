package exam03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;

public class FileThread extends Thread{

	private Socket socket;
	private String filePath = "C:\\Users\\teufe\\Downloads\\";

	public FileThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {

		System.out.println(socket.getInetAddress() + " 접속 확인");
		try {
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			
			File root = new File(filePath);
			File[] fileList = root.listFiles();
			
			dos.writeInt(fileList.length);
			dos.flush();
			
			for(File file : fileList) {
				dos.writeUTF(file.getName());
				dos.flush();
			}
			
			String targetName = dis.readUTF();
			System.out.println(socket.getInetAddress() + " 님이 선택한 파일: " + targetName);
			
			File target = new File(root.getAbsoluteFile() + "/" + targetName);
			DataInputStream fis = new DataInputStream(new FileInputStream(target));
			byte[] fileContents = new byte[(int) target.length()];
			fis.readFully(fileContents);
			
			dos.writeInt((int) target.length());
			dos.write(fileContents);
			dos.flush();
			
		} catch (Exception e) {
			System.out.println(socket.getInetAddress() + " 접속 해제");
		}
	}

}
