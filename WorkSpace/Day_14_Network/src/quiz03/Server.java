package quiz03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

	public static void main(String[] args) throws Exception {

		int portNum = 6767;
		ServerSocket server = new ServerSocket(portNum);

		System.out.println("������ ���� �Ǿ����ϴ�.");
		Socket socket = server.accept();
		System.out.println(socket.getInetAddress() + " �� ���� ����");

		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);

		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		Manager manager = new Manager();

		while(true) {
			// Ŭ���̾�Ʈ�κ��� ������ �޴� ��ȣ �ޱ�
			int menu = dis.readInt();

			if(menu == 1) { // 1. ����ó �ű� ���
				int id = dis.readInt();

				// ����Ʈ�� ���̵� ���� �ϴ��� üũ�ϰ� ��� Ŭ���̾�Ʈ�� ����(true - ���� / false - ����)
				if(manager.checkById(id)) {
					dos.writeBoolean(true);
					continue;
				} else {
					dos.writeBoolean(false);
				}

				// Ŭ���̾�Ʈ�κ��� �̸�, ��ȭ��ȣ �ޱ�
				String name = dis.readUTF();
				String phone = dis.readUTF();

				// ���̵�, �̸�, ��ȭ��ȣ�� ������ Contact�� �̿��Ͽ� �߰�
				manager.insert(new Contact(id, name, phone));

				// ���� ���� ����(true - ����)
				dos.writeBoolean(true);
				dos.flush();
			} else if(menu == 2) { // 2. ����ó ��� Ȯ��
				// ��ü ����Ʈ �˻�
				ArrayList<Contact> contact =  manager.selectByAll();
				// �ݺ��� ���� Ŭ���̾�Ʈ���� ������ ����
				dos.writeInt(contact.size());
				dos.flush();

				// �ݺ����� ������ ���̵�, �̸�, ��ȭ��ȣ ����
				for(Contact constact : manager.selectByAll()) {
					dos.writeInt(constact.getId());
					dos.writeUTF(constact.getName());
					dos.writeUTF(constact.getPhone());
					dos.flush();
				}
			} else if(menu == 3) { // 3. ����ó �˻� - �̸�
				// Ŭ���̾�Ʈ�κ��� �̸� ���� �ޱ�
				String name = dis.readUTF();

				// ����Ʈ�� �̸��� ���� �ϴ��� üũ�ϰ� ��� Ŭ���̾�Ʈ�� ����(true - ���� / false - ����)
				if(manager.checkByName(name)) {
					dos.writeBoolean(true);
				} else {
					dos.writeBoolean(false);
					continue;
				}

				// �̸����� �˻��� Contact �ν��Ͻ��� �Ѱ� ����
				Contact contact = manager.selectByName(name);

				// Contact �ν��Ͻ��� ����� ���̵�, �̸�, ��ȭ��ȣ Ŭ���̾�Ʈ�� ����
				dos.writeInt(contact.getId());
				dos.writeUTF(contact.getName());
				dos.writeUTF(contact.getPhone());
				dos.flush();

			} else if(menu == 4) { // 4. ����ó ���� - ID
				int id = dis.readInt();

				// ����Ʈ�� ���̵� ���� �ϴ��� üũ�ϰ� ��� Ŭ���̾�Ʈ�� ����(true - ���� / false - ����)
				if(manager.checkById(id)) {
					dos.writeBoolean(true);
				} else {
					dos.writeBoolean(false);
					continue;
				}

				// ���̵� �̿��Ͽ� Contact ����
				manager.deleteById(id);
			}

		}

	}

}
