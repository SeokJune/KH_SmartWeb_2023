package classes;

public class Silver extends Member {

	public Silver() {
		super();
	}

	public Silver(int id, String name, double point) {
		super(id, name, point);
	}
	
	@Override
	public double getBonus() {
		return  this.getPoint() * 0.02;
	}
	
}
