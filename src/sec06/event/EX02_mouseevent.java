package sec06.event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EX02_mouseevent extends JFrame {

	JLabel mouseEventLb;
	JLabel mousePositionLb;
		
	EX02_mouseevent(){
		
		//@Step1. 최상위 컨테이너 가져오기
		Container root = this.getContentPane();
		//@Step2. 레이아웃 설정
		root.setLayout(new BorderLayout());

		//@Step3. 컴퍼넌트 추가하기
		mouseEventLb = new JLabel("-", JLabel.CENTER);
		mousePositionLb = new JLabel("-", JLabel.CENTER);
		root.add(mouseEventLb, BorderLayout.CENTER);
		root.add(mousePositionLb, BorderLayout.SOUTH);	
				
		/*
		//PPT에만 추가하는 예
		//root가 마우스 이벤트를 처리 ===================================		
		//@방법#1. MouseListener 객체 생성 + 모든 추상메서드 구현 + 등록
		root.addMouseListener(new MouseListener() {			
			@Override
			public void mouseReleased(MouseEvent e) {				
				//마우스 버튼이 떨어졌을때
			}			
			@Override
			public void mousePressed(MouseEvent e) {				
				//마우스 버튼이 눌렸을때
			}			
			@Override
			public void mouseExited(MouseEvent e) {				
				//마우스가 창을 벗어났을때
			}			
			@Override
			public void mouseEntered(MouseEvent e) {				
				//마우스가 창안으로 들어왔을때
			}			
			@Override
			public void mouseClicked(MouseEvent e) { //Press와 Release가 같은 자리				
				//마우스가 클릭되었을때				
			}
		});
		//@방법#2. MouseAdapter 객체 생성 + 필요한  추상메서드 구현 + 등록
		root.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {			
				//필요한 메서드만 구현
			}			
		});
		*/
		
		//@ MouseAdapter 객체 생성 + 필요한  추상메서드 구현 + 등록
		root.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {			
				int x = e.getX();
				int y = e.getY();				
				mouseEventLb.setText("mouse Pressed");
				mousePositionLb.setText("Mouse Pressed At ("+x+", "+y+")");
			}			
		});
		//=========================================================

		/*
		//PPT에만 추가하는 예
		//마우스 움직임 이벤트 처리
		//방법#1. MouseMotionListener 객체 생성 + 모든 추상메서드 구현 + 등록
		root.addMouseMotionListener(new MouseMotionListener() {			
			@Override
			public void mouseMoved(MouseEvent e) {
				//마우스가 움직일때
			}			
			@Override
			public void mouseDragged(MouseEvent e) {
				//마우스가 드레그할 때				
			}
		});

		//방법#2. MouseMotionAdapter 객체 생성  + 필요한  추상메서드 구현 + 등록
		root.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//필요한 메서드만 구현		
			}
		});
		*/
		// MouseMotionAdapter 객체 생성  + 필요한  추상메서드 구현 + 등록
		root.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				mouseEventLb.setText("Mouse Move");
				mousePositionLb.setText("Mouse Moved At ("+x+", "+y+")");			
			}
		});
		
		// MouseMotionAdapter 객체 생성  + 필요한  추상메서드 구현 + 등록
		root.addMouseWheelListener(new MouseWheelListener() {
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				mouseEventLb.setText("Mouse Wheel Move");
				if(e.getWheelRotation()>0) //양수:wheel down, 음수:wheel up
					mousePositionLb.setText("Mouse Wheel : Down");
				else
					mousePositionLb.setText("Mouse Wheel : Up");
			}
		});
		
		//# 기본속성 설정
		this.setTitle("MouseEvent");
		this.setBounds(100, 100, 300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new EX02_mouseevent();
	}
}

