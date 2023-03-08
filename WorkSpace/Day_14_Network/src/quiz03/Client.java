package quiz03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception {

		String hostIp = "192.168.50.5";
		hostIp = "192.168.50.62";
		int portNum = 6767;

		Socket socket = new Socket(hostIp, portNum);

		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);

		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("<< ����ó ���� ���α׷� >>");
			System.out.println("1. ����ó �ű� ���");
			System.out.println("2. ����ó ��� Ȯ��");
			System.out.println("3. ����ó �˻� - �̸�");
			System.out.println("4. ����ó ���� - ID");
			System.out.println("0. ���α׷� ����");
			System.out.print(">>> ");
			int menu = Integer.parseInt(scan.nextLine());

			// �޴� ��ȣ Ȯ��
			if(!(menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 0)) {
				System.out.println("!! �޴� ��ȣ�� Ȯ���� �ּ��� !!");
				continue;
			}

			// 0�� ����
			if(menu == 0) {
				System.out.println("<< ���α׷��� �����մϴ�. >>");
				socket.close();
				System.exit(0);
			}

			// �޴� ��ȣ ����
			dos.writeInt(menu);
			dos.flush();
			
			if(menu == 1) { // 1. ����ó �ű� ���
				// ���̵� �Է¹��� �� ������ ����
				System.out.print("���̵� �Է� >>");
				dos.writeInt(Integer.parseInt(scan.nextLine()));
				dos.flush();
				
				// ���̵� �ߺ� üũ ��� ������ ���� �ޱ�(true - �ߺ� O)
				if(dis.readBoolean()) {
					System.out.println("!! ���̵� �ߺ� !!");
					continue;
				}
				
				// �̸�, ����ó �Է� ���� �� ������ ����
				System.out.print("�̸� �Է� >>");
				dos.writeUTF(scan.nextLine());
				System.out.print("����ó �Է� >>");
				dos.writeUTF(scan.nextLine());
				dos.flush();
				
				// ��� ���� ���� ���
				System.out.println(dis.readBoolean() ? "<< ��� ���� >>" : "!! ��� ���� !!");
			} else if(menu == 2) { // 2. ����ó ��� Ȯ��
				System.out.println("���̵�\t�̸�\t����ó");
				// �����κ��� �迭�� ������ �ޱ� -> �ݺ� Ƚ���� ���ؼ�
				int size = dis.readInt();
				
				// ���
				for(int i = 0 ; i < size ; i++) {
					System.out.print(dis.readInt() + "\t");
					System.out.print(dis.readUTF() + "\t");
					System.out.println(dis.readUTF());
				}
				
			} else if(menu == 3) { // 3. ����ó �˻� - �̸�
				// �̸� �Է¹��� �� ������ ����
				System.out.print("�̸� �Է� >>");
				dos.writeUTF(scan.nextLine());
				dos.flush();
				
				// �̸� üũ (true - ������)
				if(!dis.readBoolean()) {
					System.out.println("!! �̸� ���� !!");
					continue;
				}
				
				// ������ ���� ���̵�, �̸�, ����ó ���� ���� �� ���
				System.out.println("���̵�\t�̸�\t����ó");
				System.out.print(dis.readInt() + "\t");
				System.out.print(dis.readUTF() + "\t");
				System.out.println(dis.readUTF());
				
			} else if(menu == 4) { // 4. ����ó ���� - ID
				// ���̵� �Է¹��� �� ������ ����
				System.out.print("���̵� �Է� >>");
				dos.writeInt(Integer.parseInt(scan.nextLine()));
				dos.flush();
				
				// ���̵� üũ
				if(!dis.readBoolean()) {
					System.out.println("!! ���̵� ���� !!");
					continue;
				}
				
			}

		}

	}

}
