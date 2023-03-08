package thread;

import java.io.DataInputStream;
import java.io.IOException;

public class ClientReadThread implements Runnable{
	
	DataInputStream dis;
	
	public ClientReadThread(DataInputStream dis) {
		this.dis = dis;
	}
	
	@Override
	public void run() {
		
		try {
			System.out.println(dis.readUTF());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
