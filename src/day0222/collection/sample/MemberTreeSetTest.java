package day0222.collection.sample;

import java.util.*;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet treeSet = new MemberTreeSet();
		
		
		Member m1 = new Member(1001, "Kim");
		Member m2 = new Member(1002, "Park");
		Member m3 = new Member(1003, "Lee");
		
		treeSet.addMember(m3);
		treeSet.addMember(m2);
		treeSet.addMember(m1);
		
		treeSet.showAllMember();
		
	}

}
