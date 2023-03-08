package thread;

import java.net.Socket;
import java.util.ArrayList;

public class ClientList {
	private ArrayList<Socket> socketList = new ArrayList<Socket>() ;
	
	public ClientList(Socket socket) {
		this.socketList.add(socket);
	}

	public ArrayList<Socket> getSocketList() {
		return socketList;
	}

	public void setSocketList(ArrayList<Socket> socketList) {
		this.socketList = socketList;
	}

	
	
}
