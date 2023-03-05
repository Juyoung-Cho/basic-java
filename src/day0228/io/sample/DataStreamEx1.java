package day0228.io.sample;

import java.io.*;

public class DataStreamEx1 {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("data.txt");
			DataOutputStream dos = new DataOutputStream(fos)){
			
			dos.writeInt(100);
			dos.writeChar('A');
			dos.writeFloat(3.14f);
			dos.writeUTF("안녕");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("data.txt");
			DataInputStream dis = new DataInputStream(fis)){
			
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
