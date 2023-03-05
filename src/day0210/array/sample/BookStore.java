package day0210.array.sample;

//책들을 저장
public class BookStore {
	//main에서는 객체 생성과 객체 안에 있는 메서드 호출작업을 한다.
	public static void main(String[] args) {
		Book[] store = new Book[5];
		
		store[0] = new Book("The having","Lee");
		store[1] = new Book("The property of Money","Kim");
		store[2] = new Book("Almond","Cho");
		store[3] = new Book("Havard","Park");
		store[4] = new Book("The Life is real","Gang");
		
		for(Book b : store ) {
			System.out.println(b);
		}
		
		//스캐너를 통해 작가 이름 입력시 해당 작가의 책 이름을 출력하세요.
		//입력한 값.equals(book.getAuthor())
		//해당 작가가 없는 경우 책이 없습니다. 출력
		//BookSearch 메서드 사용할 것임
		
		BookSearch bs = new BookSearch();
		bs.search(store);
		
	}

}
