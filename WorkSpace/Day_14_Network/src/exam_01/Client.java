package exam_01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Client {
	public static void main(String[] args) throws Exception {
		// IP: 192.168.50.62
		// IP: 192.168.50.5
		String serverIp = "192.168.50.5";
		int portNum = 6767;
		Socket client = new Socket(serverIp, portNum);

		InputStream is = client.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		OutputStream os =  client.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			JOptionPane.showMessageDialog(null, dis.readUTF());
			
			dos.writeUTF(JOptionPane.showInputDialog("서버에게 보낼 메세지"));
			dos.flush();
		}
	}

}
