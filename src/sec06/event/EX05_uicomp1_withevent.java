package sec06.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

//JButton and JLabel
public class EX05_uicomp1_withevent extends JFrame {
	public EX05_uicomp1_withevent() {
		
		
		//@Step1. 최상위 컨테이너 가져오기
		Container root = this.getContentPane();
		//@Step2. 레이아웃 설정
		root.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		//@Step3. 컴퍼넌트 추가하기		
		//Button
		JButton btn1 = new JButton("Button"); //기본버튼		
		JButton btn2 = new JButton("Button"); //기본버튼 + 배경색 + 글자색
		btn2.setBackground(Color.GREEN);
		btn2.setForeground(Color.RED);		
		ImageIcon imageIcon = new ImageIcon("images/icon1.png"); //기본버튼 + 이미지아이콘 
		JButton btn3 = new JButton("Button",imageIcon);		
		JButton btn4 = new JButton(imageIcon); //이미지버튼
		
		//Label		
		JLabel label1 = new JLabel("Label"); //기본레이블		
		JLabel label2 = new JLabel("Label"); //기본레이블 + 배경색(불투명설정) + 글자색
		label2.setBackground(Color.YELLOW);
		label2.setOpaque(true);
		label2.setForeground(Color.BLUE);		
		JLabel label3 = new JLabel("Label", JLabel.RIGHT); //기본레이블 + 크기변경 + 우측정렬 + 폰트 + 테두리그리기
		label3.setBorder(new LineBorder(Color.RED, 1));
		label3.setPreferredSize(new Dimension(100, 20));
		label3.setFont(new Font("Consolas", Font.BOLD, 20));
		JLabel label4 = new JLabel(imageIcon); //이미지레이블
		
		root.add(btn1);
		root.add(btn2);
		root.add(btn3);
		root.add(btn4);
		root.add(label1);
		root.add(label2);
		root.add(label3);
		root.add(label4);
		
		
		//event 처리 방법 #1. (익명이너클래스)=======================
		//이벤트 @1.첫번째 버튼을 누르면 첫번째 Label의 텍스트를 ABCDE로 변경
		//이벤트 @2.두번째 버튼을 누르면 두번째 Label 배경식 변경
		/*
		btn1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				label1.setText("ABCDE");				
			}
		});
		//
		btn2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				label2.setBackground(Color.RED);				
			}
		});
		*/
		
		//event 처리 방법 #2. (별도의 클래스 생성)=======================
		//이벤트 @1.첫번째 버튼을 누르면 첫번째 Label의 텍스트를 ABCDE로 변경
		//이벤트 @2.두번째 버튼을 누르면 두번째 Label 배경식 변경
		class MyBtnHandler implements ActionListener{ //로컬이너가 아닌 멤버이너로 구성하려면 btn, label을 모두 멤버로 변경

			@Override
			public void actionPerformed(ActionEvent e) {
				//e.getActionCommand().equals("Button") 두 개의 버튼명이 다른 경우 이렇게도 가능
				if(e.getSource()==btn1) {
					label1.setText("ABCDE");
				} 
				else if (e.getSource()== btn2) {
					label2.setBackground(Color.RED);
				}
			}
		}
		btn1.addActionListener(new MyBtnHandler());
		btn2.addActionListener(new MyBtnHandler());
		//========================================================
		
				
		//# 기본속성 설정
		this.setTitle("UICompoents(JButton and JLabel)");
		this.setBounds(100, 100, 450, 180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	
	
	public static void main(String[] args) {
		new EX05_uicomp1_withevent();
	}
}
