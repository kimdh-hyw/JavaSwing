package sec06.event;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EX01_keyevent extends JFrame {

	JLabel keyCodeLb;
	JLabel keyCharLb;
	JLabel keyTextLb;
		
	EX01_keyevent(){
		
		
		//@Step1. 최상위 컨테이너 가져오기
		Container root = this.getContentPane();
		//@Step2. 레이아웃 설정
		root.setLayout(new GridLayout(3,2));

		//@Step3. 컴퍼넌트 추가하기
		keyCodeLb = new JLabel("-", JLabel.CENTER);
		keyCharLb = new JLabel("-", JLabel.CENTER);
		keyTextLb = new JLabel("-", JLabel.CENTER);
		root.add(new JLabel("키코드값(KeyCode):", JLabel.RIGHT));
		root.add(keyCodeLb);
		root.add(new JLabel("키코드문자(KeyChar):", JLabel.RIGHT));
		root.add(keyCharLb);
		root.add(new JLabel("키텍스트(KeyText):", JLabel.RIGHT));
		root.add(keyTextLb);
			
		/*
		//root가 키보드 이벤트를 처리 ===================================
		//PPT에만 추가하는 예
		//@방법#1. KeyListener 객체 생성 + 모든 추상메서드 구현 + 등록
		root.addKeyListener(new KeyListener() {			
			@Override
			public void keyTyped(KeyEvent e) { 	
				//키보드의 Press + Release가 결합될때 (타입가능한 키)
			}			
			@Override
			public void keyReleased(KeyEvent e) {
				//키가 떨어질때
			}			
			@Override
			public void keyPressed(KeyEvent e) {
				//키가 눌릴때
			}
		});
		
		//@방법#2. KeyAdapter 객체 생성 + 필요한  추상메서드 구현 + 등록
		root.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//필요한 메서드만 구현
			}
		});
		//=========================================================
		*/	
		
		
		
		//KeyAdapter 객체 생성 후 필요한 추상메서드 오버라이드
		root.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				char keyChar = e.getKeyChar();
				String keyText = e.getKeyText(keyCode);
				keyCodeLb.setText(String.valueOf(keyCode));
				keyCharLb.setText(String.valueOf(keyChar));
				keyTextLb.setText(keyText);
			}
		});
		
			
		
		//# 기본속성 설정
		this.setTitle("KeyEvent");
		this.setBounds(100, 100, 300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		//키보드이벤트를 처리하는 대상은 반드시 포커스를 받아야 함
		root.requestFocus();
	}
	
	public static void main(String[] args) {
		new EX01_keyevent();
	}
}

