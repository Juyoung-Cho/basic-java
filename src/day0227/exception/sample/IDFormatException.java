package day0227.exception.sample;

public class IDFormatException extends Exception {

	private static final long serialVersionUID = 1L;

	public IDFormatException(String message) {
		super(message);
	}
	
	public IDFormatException() {
		super("ID값은 8~20글자 사이로 넣어주세요");
	}
	
	

}
