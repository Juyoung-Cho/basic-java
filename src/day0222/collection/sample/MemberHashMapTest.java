package day0222.collection.sample;

import java.util.*;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap memberMap = new MemberHashMap();
		
		Member m1 = new Member(1001, "Kim");
		Member m2 = new Member(1002, "Park");
		Member m3 = new Member(1003, "Lee");
		Member m4 = new Member(1004, "Cho");
		
		memberMap.addMember(m1);
		memberMap.addMember(m2);
		memberMap.addMember(m3);
		memberMap.addMember(m4);
		
		memberMap.showAllMember();
		
		memberMap.removeMember(1004);
		
		memberMap.showAllMember();
	}

}
