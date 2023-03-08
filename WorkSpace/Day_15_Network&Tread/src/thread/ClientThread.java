package thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class ClientThread extends ClientList implements Runnable{
	private int index;

	public ClientThread(Socket socket) {
		super(socket);
		this.index = super.getSocketList().size() - 1;
	}

	@Override
	public void run() {

		// ����� ��Ʈ�� ���� �� ������ �����
		try {
			DataInputStream dis = new DataInputStream(super.getSocketList().get(index).getInputStream());
			DataOutputStream dos = new DataOutputStream(super.getSocketList().get(index).getOutputStream());

			String msg = dis.readUTF();

			System.out.println(super.getSocketList().get(this.index).getInetAddress() + ": " + msg);

			// ������ ������
			for(int i = 0 ; i < super.getSocketList().size() ; i++) {
				System.out.println(super.getSocketList().get(i).getInetAddress() + "!!!!!!!!!" + this.index);
				if(i != index) {
					dos.writeUTF(super.getSocketList().get(i).getInetAddress() + ": " + msg);
				}
			}

		} catch (IOException e) {
			System.out.println(super.getSocketList().get(index).getInetAddress() + " ���� ����");
			e.printStackTrace();
		}

	}

}
