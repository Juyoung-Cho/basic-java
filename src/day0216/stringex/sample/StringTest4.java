package day0216.stringex.sample;
//split(), join()
public class StringTest4 {
	public static void main(String[] args) {
		
		String rainbow = "red,orange,yellow,green,blue,navy,purple";
		String[] color = rainbow.split(",");
		for (String s : color) {
			System.out.println(s);
		}
		
		String colors = String.join("+", color);
		System.out.println(colors);

	}

}
