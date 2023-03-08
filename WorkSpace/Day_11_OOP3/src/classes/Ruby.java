package classes;

public class Ruby extends Member{

	public Ruby() {
		super();
	}

	public Ruby(int id, String name, double point) {
		super(id, name, point);
	}
	
	@Override
	public double getBonus() {
		return this.getPoint() * 0.05;
	}

}
