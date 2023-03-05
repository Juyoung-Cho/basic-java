package book;

public class CylinderTest {
	public static void main(String[] args) {
		Circle cir = new Circle(2.8);
		Cylinder c = new Cylinder(cir, 5.6);
		System.out.println("원기둥의 부피 : " + c.getVolume());

	}

}
