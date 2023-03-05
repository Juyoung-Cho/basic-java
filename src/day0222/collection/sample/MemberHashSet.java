package day0222.collection.sample;

import java.util.*;

public class MemberHashSet {
	
	private HashSet<Member> set;
	
	public MemberHashSet() {
		set = new HashSet<Member>();
	}
	public void addMember(Member member) {
		set.add(member);
	}
	public boolean removeMember(int memberId) {
		Iterator<Member> iter = set.iterator();
		while(iter.hasNext()) {
			Member m = iter.next();
			if(memberId == m.getMemberId()) {
				set.remove(m);
				return true;
			}
		}
		System.out.println("맞는 아이디없음");
		return false;
				
	}
	public void showAllMember() {
		for(Member m : set) {
			System.out.println(m);
		}
		System.out.println();
	}

}
