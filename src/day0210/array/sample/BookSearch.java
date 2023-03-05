package day0210.array.sample;

import java.util.Scanner;

public class BookSearch {
	
	public void search(Book[]store) {
		boolean empty = true; //true : 작가 없음 false : 작가의 책 있음.
		Scanner s = new Scanner(System.in);
		System.out.print("작가 이름 : ");
		String str = s.next();
		for(Book b : store) {
			if(str.equals(b.getAuthor())) {
				System.out.println(b.getBookName());
				empty = false;
			}
		}
		if(empty) {
			System.out.println("입력한 정보에 해당하는 책이 없습니다.");
		}
	}

}
