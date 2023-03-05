package day0302.io.sample;


public class Address implements Comparable<Address> {
	
	String name;
	String email;
	String tel;
	
	public Address() {}
	public Address(String name, String email, String tel) {
		this.name = name;
		this.email = email;
		this.tel = tel;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Address) {
			return name.equals(((Address)obj).name);
		}
		return false;
	}
	@Override
	public int compareTo(Address address) {
		return name.compareTo(address.name);
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 이메일 : " + email + ", 번호 : " + tel + "\n";
	}
	
	
	
	
	
	
	
	
	
	

}
