package day0216.objectex.sample;
//implements Cloneable : 클론 허락
class Point implements Cloneable{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	@Override						//복제를 허용하지 않았으면 에러를 발생시키겠다.
	protected Point clone() throws CloneNotSupportedException {
		return (Point)super.clone();
	}
	
	
}

public class ObjectCloneTest {
	public static void main(String[] args)throws CloneNotSupportedException {
		Point orig = new Point(3,5);
		Point copy = orig.clone();

		System.out.println(orig);
		System.out.println(copy);
		System.out.println(orig == copy);
		
		orig.x = 10;
		System.out.println(orig);
		System.out.println(copy);
	}

}
