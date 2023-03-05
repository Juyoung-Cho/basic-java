package day0302.io.sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeSet;

public class AddressList {
	TreeSet<Address> set = new TreeSet<>();
	public void input() {
		try(FileReader fr = new FileReader("addrInput.txt");
			BufferedReader br = new BufferedReader(fr)){
			String addr = "";
			while((addr = br.readLine()) != null) {
				String[] address = addr.split(",");
				Address a = new Address(address[0],address[1],address[2]);
				set.add(a);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void output() {
		try(FileWriter fw = new FileWriter("addrOutput.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter ps = new PrintWriter(bw, true)){
			
			for(Address addr : set) {
				ps.println(addr);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		AddressList list = new AddressList();
		list.input();
		
		System.out.println(list.set);
		
		list.output();

	}

}
