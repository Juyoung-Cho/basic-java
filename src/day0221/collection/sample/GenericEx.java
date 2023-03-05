package day0221.collection.sample;
//객체 생성시 지정한 타입을 받아온다.
public class GenericEx<T> {
	
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	public T getMaterial() {
		return material;
	}

}
