package day0227.exception.sample;

public class PasswordException extends IllegalArgumentException {
//적합하지 않거나 적절하지 못한 인자를 메서드에 넘겨 주었을 때.
	private static final long serialVersionUID = 1L;

	public PasswordException(String message) {
		super(message);
	}
	
	public PasswordException() {
		super("비밀번호는 5자 이상이어야 합니다.");
	}
	
	

}
