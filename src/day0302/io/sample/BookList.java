package day0302.io.sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookList {
	List<Book> bookList = new ArrayList<>();
	public void input() {
		try(FileReader fr = new FileReader("book_list.csv");
			BufferedReader br = new BufferedReader(fr)){
			String str ="";
			while((str = br.readLine()) != null) {
				String[] book = str.split(",");
				Book b = new Book(Integer.parseInt(book[0]),book[1],book[2],Integer.parseInt(book[3]));
				bookList.add(b);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		BookList bList = new BookList();
		bList.input();
		
		System.out.println(bList.bookList);
		

	}

}
