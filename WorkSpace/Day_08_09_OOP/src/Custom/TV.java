package Custom;

// Class를 더 좋게 만드는 방법
// 정보은닉 - 접근제한자 : public, protected, package, private
//  외부애 노툴 될 필요가 없는 정보를 private 키워드로 숨겨서
//  클래스 설계자의 의도대로 안정적인 클래스 운용이 가능하게 만드는 방식
//  클래스 설계자에게 안정성을 제공
//  클래스 사용자의 편의성에 영향을 줌.

public class TV {

	// 설계도에서 속성을 저장하는 변수 - 멤버 변수 (Member Field)
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

	// Constructor - 매우 중요

	//Nested Class - 중요도 떨어짐
}
