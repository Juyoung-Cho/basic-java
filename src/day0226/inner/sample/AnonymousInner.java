package day0226.inner.sample;

import java.awt.*;
import java.awt.event.*;

public class AnonymousInner extends Frame {
	Button b = new Button("버튼1");
	Button b2 = new Button("버튼2");
	Button b3 = new Button("버튼3");
	
	AnonymousInner() {
		b.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("버튼이 눌림");	
					}
				}
				);
		add(b);
		setBounds(200, 200, 500, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AnonymousInner();
	}
}
//class EventHandler implements ActionListener {
//	//버튼에 Action이 발생하는 순간 actionPerformed() 자동 호출
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("버튼이 눌렸습니다.");
//	}
//}
