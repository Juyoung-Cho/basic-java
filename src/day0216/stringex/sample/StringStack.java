package day0216.stringex.sample;

public class StringStack implements Stack {
	
	   private int num; // 저장 가능한 개수
	   private int set; // 저장 인덱스
	   private String[] stack;
	   public StringStack(int num) {
	      this.num = num;
	      this.set = 0;
	      stack = new String[num];
	   }
	   
	@Override
	public int length() {
		return set;
	}

	@Override
	public int capacity() {
		return stack.length;
	}

	@Override
	public String pop() {
		if(set-1<0) {
			return null; //stack에 아무것도 넣지 않았을 때
		}
		set--;//stack[set]은 빈공간을 가리키고 있으므로, stack 한 칸 내려줌.
		String s = stack[set]; //맨 위의 값.
		return s;
	}

	@Override
	public boolean push(String val) {
		if(set < num) {
			stack[set]=val; //맨 위에 문자열을 넣어줌
			set++; //stack 한 칸 올려줌
			return true;
		}else {
		return false;
		}
	}

}
