package day0219.wrapper.sample;
//wrapper클래스에서는 toString, equals 메서드 오버라이딩 되어 있음.
public class WrapperEx1 {
	public static void main(String[] args) {
		
		Integer i = new Integer(100); //100을 저장하고 있는 i엔 주소값 저장
		Integer i2 = new Integer("100");
		
		System.out.println("i==i2 : "+(i==i2)); //주소값이 다르므로.
		//equals() : 객체안에 저장된 기본형 값을 비교
		System.out.println("i.equals(i2) :"+i.equals(i2));
		//toString() : 객체 안에 저장된 기본형 값을 리턴
		System.out.println(i);
		System.out.println(i.toString());
		//compareTo() : 객체 안에 저장된 기본형 값의 크기 비교
		System.out.println("i.compareTo(i2) : "+i.compareTo(i2));
		
		System.out.println("MAX_VALUE : "+Integer.MAX_VALUE);
		System.out.println("MIN_VALUE : "+Integer.MIN_VALUE);
		System.out.println("SIZE : "+Integer.SIZE); //비트로
		System.out.println("BYTES : "+Integer.BYTES);
		System.out.println("TYPE : "+Integer.TYPE);
		
		
	}

}
