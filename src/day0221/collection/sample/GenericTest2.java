package day0221.collection.sample;

public class GenericTest2 {

	public static void main(String[] args) {
		GenericPrinter<Powder> powder = new GenericPrinter<>();
		powder.setMaterial(new Powder());
		powder.printing();
		//Water는 Material과 상속 관계가 없음.
		//GenericPrinter<Water> water = new GenericPrinter<Water>();
		
		GenericPrinter<Plastic> plastic = new GenericPrinter<>();
		plastic.setMaterial(new Plastic());
		plastic.printing();
	}

}
