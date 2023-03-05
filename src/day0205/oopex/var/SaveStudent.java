package day0205.oopex.var;

public class SaveStudent {

	public static void main(String[] args) {
		Student stu1 = new Student();
		Address addr1 = new Address();
		
		stu1.studentNo = 2021789;
		stu1.name = "김길동";
		addr1.postCode = "12345";
		addr1.area1 = "서울시 종로구 15길";
		addr1.area2 = "종로코아 503호";
		
		stu1.addr = addr1;
		
		System.out.println("이름 : "+ stu1.name);
		System.out.println("학번 : "+ stu1.studentNo);
		System.out.println("주소 : "+ stu1.addr.toString());

	}

}
