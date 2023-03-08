package classes;

public class Gold extends Member {

	public Gold() {
		super();
	}

	public Gold(int id, String name, double point) {
		super(id, name, point);
	}
	
	// 부모 클래스로부터 상속받은 메서드를 무시하고 동일한 프로토타입을 다시 정의하면
	// 상속받은 메서드를 덮어 씌우는 효과를 가진다.
	@Override
	public double getBonus() {
		return  this.getPoint() * 0.04;
	}
	
}
