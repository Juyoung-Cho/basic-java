package day0211.inheritance.sample;

class Point{
	int x;
	int y;
	Point(){}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String getLocation() {
		return x+", "+y;
	}
}

class Point3D extends Point{
	int z;
	
	Point3D(int x, int y, int z){
		//super(); Point 클래스에 기본생성자 추가하고 이렇게 해도 된다.
		super(x, y);
		this.z = z;
	}
	// @Override : alt + shift + s >> override할 수 있음.
	public String getLocation() {
		// return x+", "+y+", "+z;
		return super.getLocation()+", "+z;
	}
}

public class PointTest {

	public static void main(String[] args) {
		Point3D p1 = new Point3D(1,2,3);
		System.out.println(p1.x +" "+ p1.y +" "+ p1.z);

	}

}
