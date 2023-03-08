package exam03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hostIP = "192.168.50.65";
		hostIP = "192.168.50.62";
		int portNum = 45000;

		// 소켓 생성
		Socket socket = null;
		try {
			socket = new Socket(hostIP, portNum);
		} catch(Exception e) {
			System.out.println("서버 접속 실패");
			e.getStackTrace();
		}

		// 입.출력 스트림 생성
		try {
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

			ArrayList<String> list = new ArrayList<String>();
			int len = dis.readInt();
			for(int i = 0 ; i < len ; i++) {
				list.add(dis.readUTF());
				System.out.println((i + 1) + ". " + list.get(i));
			}
			int index = Integer.parseInt(JOptionPane.showInputDialog(">>>>>>>>>>?")) - 1;
			dos.writeUTF(list.get(index));
			dos.flush();
			
			byte[] fileContents  = new byte[dis.readInt()];
			
			dis.readFully(fileContents);
			
			DataOutputStream fos = new DataOutputStream(new FileOutputStream(new File("D:/WorkSpace/" + list.get(index))));
			fos.write(fileContents);
			fos.flush();
			
			fos.close();
			
		} catch(Exception e) {
			System.out.println("입출력 스트림 생성 실패");
			e.getStackTrace();
		}

	}

}
