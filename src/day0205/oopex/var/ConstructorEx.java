package day0205.oopex.var;

class Data1 {
	int x;
	Data1(){}
}
class Data2 {
	int x;
	Data2(){}
	Data2(int i){
		x = i;
	}
}
public class ConstructorEx {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(5);

	}

}
