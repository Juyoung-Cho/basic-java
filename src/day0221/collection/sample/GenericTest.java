package day0221.collection.sample;

public class GenericTest {
	public static void main(String[] args) {
		GenericEx<String> g1 = new GenericEx<>();
		g1.setMaterial("test1");
		System.out.println(g1.getMaterial());
		
		GenericEx<Integer> g2 = new GenericEx<>();
		g2.setMaterial(10);
		System.out.println(g2.getMaterial());
		
		GenericEx<Object> g3 = new GenericEx<>(); //명시안하는 거 가능은 하다. 그러나 여러 객체를 사용하고자 한다면 object
		g3.setMaterial("test");
		System.out.println(g3.getMaterial());
	}

}
