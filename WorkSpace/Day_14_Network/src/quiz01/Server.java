package quiz01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception {
		
		int portNum = 6767;
		ServerSocket server = new ServerSocket(portNum);
		
		System.out.println("서버가 가동 되었습니다.");
		Socket socket = server.accept();
		System.out.println(socket.getInetAddress() + " 로 부터 연결");
		
		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		while(true) {
			String op = dis.readUTF();
			int num1 = Integer.parseInt(dis.readUTF());
			int num2 = Integer.parseInt(dis.readUTF());
			System.out.println(num1 + " / " + num2);
			double result = oper(op, num1, num2);
			System.out.println(Double.toString(result));
			dos.writeUTF(op.equals("/") ? Double.toString(result) : Integer.toString((int) result));
			dos.flush();
			
		}
		
		
		
	}
	
	public static double oper(String op, int num1, int num2) {
		if(op.equals("+")) {
			return num1 + num2;
		} else if(op.equals("-")) {
			return num1 - num2;
		} else if(op.equals("*")) {
			return num1 * num2;
		} else if(op.equals("/")) {
			return num1 / (double) num2;
		}
		
		
		return 0.0;
	}
	
}
