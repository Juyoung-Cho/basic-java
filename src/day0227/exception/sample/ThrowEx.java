package day0227.exception.sample;

public class ThrowEx {
	
	public void methodA(String[] n) throws Exception {
		if(n.length > 0) {
			for(String s : n) {
				System.out.println(s);
			}
		}else {
			throw new Exception("전달받은 argument값이 없습니다.");
		}
	}

	public static void main(String[] args) {
		ThrowEx ex = new ThrowEx();
		try {
			ex.methodA(args);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
			}
}
