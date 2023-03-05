package day0222.collection.sample;

import java.util.*;

public class MemberArrayList {
	
	private ArrayList<Member> list;
	
	public MemberArrayList() {
		list = new ArrayList<>();
	}
	
	public void addMember(Member member) {
		list.add(member);
	}
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = list.iterator();
		while(ir.hasNext()) {
			Member m = ir.next();
			if(memberId == m.getMemberId()) {
				list.remove(m);
				return true;
			}
		}
		System.out.println("맞는 아이디 없음");
		return false;
		
		
		
		/*for(int i = 0; i <list.size();i++) {
			Member mem = list.get(i);
			if(memberId == mem.getMemberId()) {
				list.remove(i);
				return true;
			}
		}
		System.out.println("아이디가 맞지 않습니다.");
		return false;*/
	}
	public void showAllMember() {
		Iterator<Member> ir = list.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		/*
		 * for(Member m : list ) { System.out.println(m); }
		 */
		System.out.println();
	}
	
}
