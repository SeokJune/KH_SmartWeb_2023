package classes;

public class Gold extends Member {

	public Gold() {
		super();
	}

	public Gold(int id, String name, double point) {
		super(id, name, point);
	}
	
	// �θ� Ŭ�����κ��� ��ӹ��� �޼��带 �����ϰ� ������ ������Ÿ���� �ٽ� �����ϸ�
	// ��ӹ��� �޼��带 ���� ����� ȿ���� ������.
	@Override
	public double getBonus() {
		return  this.getPoint() * 0.04;
	}
	
}
