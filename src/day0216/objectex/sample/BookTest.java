package day0216.objectex.sample;

class Book{
	String title;
	int bookPrice;
	public Book(String title, int bookPrice) {
		super();
		this.title = title;
		this.bookPrice = bookPrice;
	}
	@Override
	public int hashCode() {
		return title.hashCode();
	}
	
	//책의 이름이 같으면 같은 책이다.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			return title.equals(((Book)obj).title);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", bookPrice=" + bookPrice + "]";
	}//오버라이딩을 했으므로 문자열 출력한다.
	
	
	
}

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book("Rrr",10000);
		Book b2 = new Book("Rrr",8000);
		if(b1.equals(b2)) {
			System.out.println("b1과 b2는 같습니다.");
		}else {
			System.out.println("b1과 b2는 다릅니다.");
		}
		System.out.println(b1); //오버라이딩안했으니까 toString()메서드 호출될 때 주소값이 나온다.
								//day0216.objectex.sample.Book@7c30a502
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
	}

}
