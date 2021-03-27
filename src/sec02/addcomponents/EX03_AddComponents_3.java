package sec02.addcomponents;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EX03_AddComponents_3 extends JFrame{
	
	public EX03_AddComponents_3() {
		//# 기본속성 설정
		this.setTitle("컴포넌트 추가 방법 #3");
		this.setBounds(100, 100, 320, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		
		//@Step1. JPanel 객체 생성하기 
		JPanel panel = new JPanel();		
		//@Step2. 레이아웃 설정
		panel.setLayout(new FlowLayout());
		//@Step3. 컴퍼넌트 추가하기
		panel.add(new JButton("Button1"));
		panel.add(new JButton("Button2"));
		panel.add(new JButton("Button3"));
		panel.add(new JButton("Button4"));
		panel.add(new JButton("Button5"));
		//@Step4. JPanel을 JFrame에 설정하기
		this.setContentPane(panel);
	}
	
	public static void main(String[] args) {
		new EX03_AddComponents_3();
	}
}
