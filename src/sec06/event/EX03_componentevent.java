package sec06.event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

//JComponent and JWindowEvent

public class EX03_componentevent extends JFrame {
	public EX03_componentevent() {
		
		//@Step1. 최상위 컨테이너 가져오기
		Container root = this.getContentPane();
		//@Step2. 레이아웃 설정
		root.setLayout(new BorderLayout());
		//@Step3. 컴퍼넌트 추가하기
		JLabel label = new JLabel("Hello", JLabel.HORIZONTAL);
		root.add(label);
		
		/*
		//방법1. ComponentListener 객체생성 + 모든 추상메서드 구현 + 등록
		root.addComponentListener(new ComponentListener() {			
			@Override
			public void componentShown(ComponentEvent e) {
				System.out.println("ComponetShown");				
			}			
			@Override
			public void componentResized(ComponentEvent e) {
				//가로폭에 따라 텍스트 크기 변경
				int fontSize = e.getComponent().getWidth()/10;
				label.setFont(new Font(null, Font.BOLD, fontSize));				
			}			
			@Override
			public void componentMoved(ComponentEvent e) {
				System.out.println("componentMoved");				
			}			
			@Override
			public void componentHidden(ComponentEvent e) {
				System.out.println("componentHidden");
			}
		});
		*/
		//방법2. ComponentAdpater 객체생성 + 필요 추상메서드 구현 + 등록
		root.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				//가로폭에 따라 텍스트 크기 변경
				int fontSize = e.getComponent().getWidth()/10;
				label.setFont(new Font(null, Font.BOLD, fontSize));				
			}		
		});
								
		//# 기본속성 설정
		this.setTitle("Event(ComponentEvent)");
		this.setBounds(100, 100, 200, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new EX03_componentevent();
	}
}
