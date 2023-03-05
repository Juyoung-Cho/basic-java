package day0210.array.sample;

public class Book {
	private String bookName;
	private String author;
	public Book() {}
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	//참조변수(주소)출력시 해당 객체 안에 있는 toString()가 자동 호출
	//리턴값을 출력
	//객체안에 저장된 값들을 하나의 문자열로 만들어 주는 작업
	public String toString() {
		return bookName + " : " + author;
	}
	
	
	
	
	

}
