package sec03.layout;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EX02_BorderLayout extends JFrame{
	
	public EX02_BorderLayout() {
		//# 기본속성 설정
		this.setTitle("BorderLayout");
		this.setBounds(100, 100, 300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		
		//@Step1. 최상위 컨테이너 가져오기
		Container root = this.getContentPane();
		//@Step2. 레이아웃 설정
		root.setLayout(new BorderLayout());
		//@Step3. 컴퍼넌트 추가하기
		root.add(new JButton("Button1"), BorderLayout.CENTER); 	//"Center"로 대체 가능
		root.add(new JButton("Button2"), BorderLayout.NORTH);	//"North"로 대체 가능
		root.add(new JButton("Button3"), BorderLayout.WEST);	//"West"로 대체 가능
		root.add(new JButton("Button4"), BorderLayout.EAST);	//"East"로 대체 가능
		
		/* PPT 삽입 예
		root.add(new JButton("Button1"), BorderLayout.CENTER); 	//"Center"로 대체 가능
		root.add(new JButton("Button2"), BorderLayout.NORTH);	//"North"로 대체 가능
		root.add(new JButton("Button3"), BorderLayout.SOUTH);	//"South"로 대체 가능
		root.add(new JButton("Button4"), BorderLayout.WEST);	//"West"로 대체 가능
		root.add(new JButton("Button5"), BorderLayout.EAST);	//"East"로 대체 가능
		*/
		/* PPT 삽입 예
		root.add(new JButton("Button1"), "Center"); 	//"Center"로 대체 가능
		root.add(new JButton("Button2"), "North");	//"North"로 대체 가능
		root.add(new JButton("Button3"), "South");
		*/
		/* PPT 삽입 예
		root.add(new JButton("Button1")); 	//"Center"로 대체 가능
		root.add(new JButton("Button2"));	//"North"로 대체 가능
		root.add(new JButton("Button3"));
		*/
		

	}
	
	public static void main(String[] args) {
		new EX02_BorderLayout();
	}
}
