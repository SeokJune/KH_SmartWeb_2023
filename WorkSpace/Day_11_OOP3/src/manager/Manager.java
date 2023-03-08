package manager;

import java.util.ArrayList;

import classes.Member;

public class Manager {
	private ArrayList<Member> members = new ArrayList<Member>();

	public void insert(Member member) {
		this.members.add(member);
	}
	public ArrayList<Member> getMembers() {
		return this.members;
	}

}