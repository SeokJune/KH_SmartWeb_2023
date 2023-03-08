package Custom;

// Class�� �� ���� ����� ���
// �������� - ���������� : public, protected, package, private
//  �ܺξ� ���� �� �ʿ䰡 ���� ������ private Ű����� ���ܼ�
//  Ŭ���� �������� �ǵ���� �������� Ŭ���� ����� �����ϰ� ����� ���
//  Ŭ���� �����ڿ��� �������� ����
//  Ŭ���� ������� ���Ǽ��� ������ ��.

public class TV {

	// ���赵���� �Ӽ��� �����ϴ� ���� - ��� ���� (Member Field)
	private String brand;
	private int price;
	private int channel;


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(channel > 0) {
			this.channel = channel;
		}
	}

	// Member Method
	public void powerON() {
	}

	public void powerOFF() {

	}

	// Constructor - �ſ� �߿�

	//Nested Class - �߿䵵 ������
}
