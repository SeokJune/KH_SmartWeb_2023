package Custom;

public class Car {
	
	// this : ���� ���� ����, ��� �ʵ�
	//  Ŭ������ �������� �ν��Ͻ��� �����Ǹ�, Ŭ���� ���ο��� �ν��Ͻ� �ּҸ� �˼� �ְ� �ڹٿ� ���� �̸� �غ�� ��� �ʵ�.
	
	private String model;
	private String color;
	private int price;
	
	// Getter & Setter ����Ű : Alt + s > r > a > r
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
