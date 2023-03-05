package day0222.collection.sample;

public class MemberArrayListTest {
	public static void main(String[] args) {
		
		MemberArrayList memberList  = new MemberArrayList();
		
		Member m1 = new Member(1001, "Kim");
		Member m2 = new Member(1002, "Park");
		Member m3 = new Member(1003, "Lee");
		Member m4 = new Member(1004, "Cho");
		
		memberList.addMember(m1);
		memberList.addMember(m2);
		memberList.addMember(m3);
		memberList.addMember(m4);
		
		memberList.showAllMember();
		
		memberList.removeMember(1001);
		memberList.removeMember(1001);
		memberList.showAllMember();
		

	}

}
