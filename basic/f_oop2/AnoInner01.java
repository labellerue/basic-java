package f_oop2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 익명클래스 anonymous
 * 업그레이드 버전 : AnoInner02 
 *
 */
public class AnoInner01 {
	public static void main(String[] args) {
		Button b = new Button();
		
		ActionListener ac = new EventHandler();//다형성
		b.addActionListener(ac); //행위를 읽어주는 역할
		
		
	}
}


class EventHandler implements ActionListener{ //ActionListener 인터페이스

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼눌림");
		
	}
	
	
}