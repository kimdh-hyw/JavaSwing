package sec03.layout;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EX05_NullLayout extends JFrame{
	
	public EX05_NullLayout() {
		//# 기본속성 설정
		this.setTitle("NullLayout");
		this.setBounds(100, 100, 300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		
		//@Step1. 최상위 컨테이너 가져오기
	    Container root = this.getContentPane();
	    //@Step2. 레이아웃 객체 생성 및 설정	    
	    root.setLayout(null);
	    //@Step3. 컴퍼넌트 추가하기
	    	    
	    JButton btn1=new JButton("Button1"); 
	    JButton btn2=new JButton("Button2"); 
	    JButton btn3=new JButton("Button3"); 
	    
	    btn1.setLocation(10, 10);	    
	    btn1.setSize(new Dimension(160,50));
	    root.add(btn1);
	    
	    btn2.setLocation(190, 10);	    
	    btn2.setSize(new Dimension(80,140));
	    root.add(btn2);
	    
	    btn3.setLocation(10, 70);	    
	    btn3.setSize(new Dimension(160,80));
	    root.add(btn3);
	    
	}
	
	public static void main(String[] args) {
		new EX05_NullLayout();
	}
}
