package day0227.exception.sample;

public class PasswordTest {
	
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException {
		if(password == null) {
			throw new PasswordException("Password는 null값일 수 없습니다.");
		}else if(password.length() < 5) {
			throw new PasswordException();
		}else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자를 포함해야 합니다.");
		}
		
		this.password = password;
	}

	public static void main(String[] args) {

		PasswordTest test = new PasswordTest();
		String password = null;
		try {
			test.setPassword(password);
			System.out.println("오류 없음1");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

		password = "abcd";
		try {
			test.setPassword(password);
			System.out.println("오류 없음2");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

		password = "abcde";
		try {
			test.setPassword(password);
			System.out.println("오류 없음3");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

		password = "abcde1";
		try {
			test.setPassword(password);
			System.out.println("오류 없음4");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}