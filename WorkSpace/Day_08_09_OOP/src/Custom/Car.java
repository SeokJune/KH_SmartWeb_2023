package Custom;

public class Car {
	
	// this : 가지 참조 변수, 멤버 필드
	//  클래스를 바탕으로 인스턴스가 생성되면, 클래스 내부에서 인스턴스 주소를 알수 있게 자바에 의해 미리 준비된 멤버 필드.
	
	private String model;
	private String color;
	private int price;
	
	// Getter & Setter 단축키 : Alt + s > r > a > r
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
