package quiz03;

import java.util.ArrayList;

public class Manager {
	private ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	public boolean checkById(int id) {
		for(Contact constact : this.contacts) {
			if(constact.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkByName(String name) {
		for(Contact constact : this.contacts) {
			if(constact.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	public void insert(Contact contact) {
		this.contacts.add(contact);
	}
	
	public ArrayList<Contact> selectByAll() {
		return this.contacts;
	}
	
	public Contact selectByName(String name) {
		for(Contact constact : this.contacts) {
			if(constact.getName().equals(name)) {
				return constact;
			}
		}
		return null;
	}
	
	public void deleteById(int id) {
		for(int i = 0 ; i < this.contacts.size() ; i++) {
			if(this.contacts.get(i).getId() == id) {
				this.contacts.remove(i);
			}
		}
	}
	
	
}
