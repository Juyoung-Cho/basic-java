package day0222.collection.sample;

import java.util.Objects;

public class Member implements Comparable<Member> {
	private int memberId;
	private String memberName;
	
	public Member() {
	}

	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName+"님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m =(Member)obj;
			return memberId == m.memberId;
		}
		return false;
	}

	@Override
	public int compareTo(Member o) {
		//어차피 int니까 간단히 축약 가능
		return memberId - o.getMemberId();
		
		/*
		 * if(memberId < o.getMemberId()) { return -1; }else if(memberId >
		 * o.getMemberId()) { return 1; }else { return 0; }
		 */
		
	}
	
	
	

}
