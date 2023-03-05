package day0228.io.sample;
//아직 고쳐지지 않음.
import java.io.*;

public class InputStreamReaderEx {
	public static void main(String[] args) {
		System.out.println("원하는 문자열을 입력하세요.");
		int i;
		try {
			InputStreamReader is = new InputStreamReader(System.in);
			while((i = is.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
