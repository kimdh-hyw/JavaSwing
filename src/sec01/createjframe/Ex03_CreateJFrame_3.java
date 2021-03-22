package sec01.createjframe;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Ex03_CreateJFrame_3 extends JFrame {	
	
	Ex03_CreateJFrame_3() {
		this.setTitle("JFrame 생성하기 방법#3"); //super("JFrame 생성하기 방법#3")
		this.setBounds(100, 100, 350, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로그램 종료
		this.setVisible(true);	
		//this.setLocationRelativeTo(null);//화면가운데 배치
	}
	
	public static void main(String[] args) {		
		//#1. MyJFrame 객체 생성
		new Ex03_CreateJFrame_3();				
	}
}
 