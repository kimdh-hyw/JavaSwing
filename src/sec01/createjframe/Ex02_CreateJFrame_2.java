package sec01.createjframe;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.border.LineBorder;

class MyFrame extends JFrame {
	public MyFrame() {
		this.setTitle("JFrame 생성하기 방법#2"); //super("JFrame 생성하기 방법#2")
		this.setBounds(100, 100, 350, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로그램 종료
		this.setVisible(true);		
		//this.setLocationRelativeTo(null);//화면가운데 배치
	}
}

public class Ex02_CreateJFrame_2 {	
	public static void main(String[] args) {		
		//#1. MyJFrame 객체 생성
		new MyFrame();				
	}
}
