package quiz02;

import java.util.ArrayList;

public class Manager {
	ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	public int insert(Contact contact) {
		this.contacts.add(contact);
		return this.contacts.size();
	}
	
	public boolean selectByID(int id) {
		for(Contact contact : this.contacts) {
			if(contact.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	public void selectByAll() {
		System.out.println("ID\t이름\t전화번호");
		for(Contact contact : this.contacts) {
			System.out.println(contact.getId()+"\t"+contact.getName()+"\t"+contact.getPhone());
		}
	}
}
