package sec04.uicomponent;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//JTextField and JTextArea
public class EX02_uicomponents2 extends JFrame {
	public EX02_uicomponents2() {
				
		//@Step1. 최상위 컨테이너 가져오기
		Container root = this.getContentPane();
		//@Step2. 레이아웃 설정
		root.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		//@Step3. 컴퍼넌트 추가하기		
		//JTextField
		JTextField tf1 = new JTextField("TextField"); //기본텍스트필드		
		JTextField tf2 = new JTextField("TextField"); //기본텍스트필드 + 배경색 + 글자색 
		tf2.setBackground(Color.GREEN);
		tf2.setForeground(Color.RED);
		JTextField tf3 = new JTextField(10); //기본텍스트필드 + 입력 폭 지정 (10) 
		JTextField tf4 = new JTextField("TextField",10); //기본텍스트필드 + 입력 폭 지정 + 편집불가
		tf4.setEditable(false);
				
		//JTextArea		
		JTextArea ta1 = new JTextArea("TextArea"); //기본 TextArea
		JTextArea ta2 = new JTextArea("TextArea", 3,10); //기본 TextArea + 행의 크기 + 열의 크기 지정 (텍스트를 계속 입력하면 크기가 늘어남)		
		JTextArea ta3 = new JTextArea("TextArea", 3,10); //기본 TextArea + 행의 크기 + 열의 크기 지정 + 크기 고정 (텍스트를 계속 입력하면 화면을 벗어남)
		ta3.setPreferredSize(new Dimension(3,10));		
		JTextArea ta4 = new JTextArea("TextArea", 3,10); //기본 TextArea + 행의 크기 + 열의 크기 지정 + 스크롤기능 포함 (텍스트를 계속 입력하면 스크롤링 가능)				
		JScrollPane sp = new JScrollPane(ta4,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		root.add(tf1);
		root.add(tf2);
		root.add(tf3);
		root.add(tf4);
		root.add(ta1);
		root.add(ta2);
		root.add(ta3);
		root.add(sp);
		
		//# 기본속성 설정
		this.setTitle("UICompoents(JTextField and JTextArea)");
		this.setBounds(100, 100, 480, 180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new EX02_uicomponents2();
	}
}
