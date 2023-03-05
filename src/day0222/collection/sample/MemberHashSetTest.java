package day0222.collection.sample;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberSet = new MemberHashSet();
		
		Member m1 = new Member(1001, "Kim");
		Member m2 = new Member(1002, "Park");
		Member m3 = new Member(1003, "Lee");
		Member m4 = new Member(1001, "Kim");
		
		memberSet.addMember(m1);
		memberSet.addMember(m2);
		memberSet.addMember(m3);
		memberSet.addMember(m4);
		
		memberSet.showAllMember();

	}

}
