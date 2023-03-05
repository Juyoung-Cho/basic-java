package day0222.collection.sample;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(),member);
	}
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			Member m = hashMap.remove(memberId);
			System.out.println(m.getMemberName()+"을 삭제했습니다.");
			return true;
		}
		
		System.out.println("맞는 아이디없음");
		return false;
				
	}
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member m = hashMap.get(key);
			System.out.println(m);
		}
		System.out.println();
	}

}
