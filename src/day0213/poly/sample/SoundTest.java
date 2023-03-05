package day0213.poly.sample;

import java.util.Scanner;

public class SoundTest {
	public static void main(String[] args) {
		
		boolean ch = true;
		while(ch) {
		Animal animal = null;
		System.out.print("동물의 종류를 입력하세요(사람,개,고양이) : ");
		Scanner s = new Scanner(System.in);
		String kind = s.next();
		
		if(kind.equals("사람")) {
			animal = new Human();
		}else if(kind.equals("개")){
			animal = new Dog();
		}else if(kind.equals("고양이")) {
			animal = new Cat();
		}
		if(animal != null) {
			animal.sound();
			ch = false;
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		}

	}

}
