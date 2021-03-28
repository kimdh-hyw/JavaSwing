package sec06.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

//JTextField and JTextArea

public class EX05_uicomp2_withevent extends JFrame {
	public EX05_uicomp2_withevent() {
				
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
		
		//===이벤트 처리 추가 부분 Start
				
		//event 처리. (익명이너클래스)=======================		
		//이벤트 @1.TextField3에 문자열을 입력하면 TextField4에 글자수가 출력		
		tf3.addCaretListener(new CaretListener() {			
			@Override
			public void caretUpdate(CaretEvent e) {
				tf4.setText(String.valueOf(tf3.getText().length()));				
			}
		});		 
		//이벤트 @2.TextArea2에 문자열을 입력하면 동일한 문자를 TextArea3에 입력
		ta2.addCaretListener(new CaretListener() {			
			@Override
			public void caretUpdate(CaretEvent e) {
				ta3.setText(ta2.getText());
			}
		});
		//=====================================================
		
		//===이벤트 처리 추가 부분 End
		
		
		//# 기본속성 설정
		this.setTitle("UICompoents(JTextField and JTextArea)");
		this.setBounds(100, 100, 480, 180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new EX05_uicomp2_withevent();
	}
}
