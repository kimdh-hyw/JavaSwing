package sec02.addcomponents;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EX02_AddComponents_2 extends JFrame{
	
	public EX02_AddComponents_2() {
		//# 기본속성 설정
		this.setTitle("컴포넌트 추가 방법 #2");
		this.setBounds(100, 100, 320, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		
		//@Step1. 최상위 컨테이너 가져오기
		Container root = this.getContentPane();
		//@Step2. 레이아웃 설정
		root.setLayout(new FlowLayout());
		//@Step3. 컴퍼넌트 추가하기
		root.add(new JButton("Button1"));
		root.add(new JButton("Button2"));
		root.add(new JButton("Button3"));
		root.add(new JButton("Button4"));
		root.add(new JButton("Button5"));
	}
	
	public static void main(String[] args) {
		new EX02_AddComponents_2();
	}
}
