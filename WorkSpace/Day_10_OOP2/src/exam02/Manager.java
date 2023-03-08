package exam02;

import java.util.ArrayList;

public class Manager {
	private ArrayList<CafeMenu> cafeMenus = new ArrayList<>(); 
	
	public void autoInsert() {
		this.insert(new CafeMenu(1001, "Americano", 2500));
		this.insert(new CafeMenu(1002, "CafeLatte", 3000));
		this.insert(new CafeMenu(1003, "Strawberry Latte", 4000));
		this.insert(new CafeMenu(1004, "Sweet Potato Latte", 3000));
		this.insert(new CafeMenu(1005, "Hot Choco", 3500));
	}

	// selectByAll
	public ArrayList<CafeMenu> selectByAll() {
		return this.cafeMenus;
	}

	// selectById
	public CafeMenu selectByIndex(int index) {
		return this.cafeMenus.get(index);
	}

	// selectIndexById
		public int selectIndexById(int id) {
			for(int i = 0 ; i < this.cafeMenus.size() ; i++) {
				if(this.cafeMenus.get(i).getId() == id) {
					return i;
				}
			}
			return -1;
		}

	// insert
	public void insert(CafeMenu cafemenu) {
		this.cafeMenus.add(cafemenu);
	}

	// updateById
	public void updateById(int index, CafeMenu cafemenu) {
		this.cafeMenus.set(index, cafemenu);
	}

	// deleteById
	public void deleteById(int index) {
		this.cafeMenus.remove(index);
	}

}
