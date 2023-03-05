package day0209.oopex.sample;

public class Song {
	String title;
	String artist;
	String year;
	String country;
	
	public Song(){} //생성자의 접근제어자는 일반적으로 클래스의 접근제어자와 같다.

	public Song(String title, String artist, String year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.println(country + ", " + year + "년 "+ artist + " " + title);
	}
	
	

}
