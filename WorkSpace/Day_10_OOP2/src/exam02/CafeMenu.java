package exam02;

public class CafeMenu {
	private int id;
	private String menuName;
	private int price;
	
	public CafeMenu() {
		
	}

	public CafeMenu(int id, String menuName, int price) {
		super();
		this.id = id;
		this.menuName = menuName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
