package exam01;

class Worker extends Thread{

	@Override
	public void run() {

		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println("�� ��° for: " + i);
		}

	}

}

public class Main {

	public static void main(String[] args) {

		// Thread �����00
		// Step1. Thread Ŭ������ ��ӹ޴� ����� ���� Ŭ������ �ۼ��Ѵ�.
		// Step2. Thread Ŭ�����κ��� ��ӹ޴� run() �޼��带 Overriding �Ѵ�. 
		// Step3. ���� ó���ϰ��� �ϴ� �ҽ��ڵ带 run() ���ο� �����Ѵ�.
		// Step4. ���� �Ϸ�� Ŭ������ ���ν��Ͻ�ȭ �Ѵ�.
		// Step5. ������� �ν��Ͻ��κ��� start() �޼��带 call �Ѵ�.
		
		Worker work = new Worker();
		work.start();
		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println("ù ��° for: " + i);
		}

	}

}
