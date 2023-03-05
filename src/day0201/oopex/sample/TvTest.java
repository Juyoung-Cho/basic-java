package day0201.oopex.sample;

//Tv객체 생성 후 전원을 켜고 channel를 10번으로 맞추고 볼륨은 20으로 설정후 채널올림 두번.
public class TvTest {
	public static void main(String[] args) {
		
		Tv t = new Tv();
		
		t.power();
		t.setChannel(10); //ctrl누른 상태에서 메서드 누르면 메서드 위치로 이동
		t.volume = 20;
		t.upChannel();
		t.upChannel();

	}

}
