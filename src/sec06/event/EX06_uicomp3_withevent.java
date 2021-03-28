package sec06.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import javafx.scene.control.CheckBox;

//JCheckBox and JRadioButton

public class EX06_uicomp3_withevent extends JFrame {
	public EX06_uicomp3_withevent() {
				
		//@Step1. 최상위 컨테이너 가져오기
		Container root = this.getContentPane();
		//@Step2. 레이아웃 설정
		root.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		//@Step3. 컴퍼넌트 추가하기
		
		//JCheckBox
		JCheckBox cb1 = new JCheckBox("CheckBox1"); //기본 CheckBox 
		JCheckBox cb2 = new JCheckBox("CheckBox2", true); //기본 CheckBox + 초기선택 
				
		ImageIcon imageIcon1 = new ImageIcon("images/icon1.png");			
		JCheckBox cb3 = new JCheckBox("CheckBox3",imageIcon1); //기본 CheckBox + 이미지 아이콘 (선택확인 불가능)
		JCheckBox cb4 = new JCheckBox("CheckBox4",imageIcon1);
							
		JCheckBox cb5 = new JCheckBox(imageIcon1); //기본 CheckBox + 이미지아이콘만 구성 + BorderPaint로 선택확인
		JCheckBox cb6 = new JCheckBox(imageIcon1);		
		cb5.setBorderPainted(true);
		cb6.setBorderPainted(true);
			
		//JRadioButton (ButtonGroup()은 일종의 Container처럼 보이지만 절대로 Container는 아님
		ButtonGroup bg1 = new ButtonGroup(); //그룹에 두개의 기본 라디오 버튼 추가
		JRadioButton rb1 = new JRadioButton("RadioBtn1");
		JRadioButton rb2 = new JRadioButton("RadioBtn2", true);
		bg1.add(rb1);
		bg1.add(rb2);
		
		ImageIcon imageIcon2 = new ImageIcon("images/icon2.png");		
		ButtonGroup bg2 = new ButtonGroup(); //그룹에 두개의 기본 라디오 버튼 추가 + (텍스트+이미지아이콘) 설정 (선택확인 불가능)
		JRadioButton rb3 = new JRadioButton("RadioBtn3", imageIcon2);
		JRadioButton rb4 = new JRadioButton("RadioBtn4", imageIcon2);
		bg2.add(rb3);
		bg2.add(rb4);
		
		ButtonGroup bg3 = new ButtonGroup(); //그룹에 두개의 기본 라디오 버튼 추가 + (이미지아이콘) 설정 + BorderPaint로 선택확인
		JRadioButton rb5 = new JRadioButton(imageIcon2);
		JRadioButton rb6 = new JRadioButton(imageIcon2, true);
		bg3.add(rb5);
		bg3.add(rb6);
		rb5.setBorderPainted(true);
		rb6.setBorderPainted(true);
				
		root.add(cb1);
		root.add(cb2);
		root.add(cb3);
		root.add(cb4);
		root.add(cb5);
		root.add(cb6);
		
		root.add(rb1);
		root.add(rb2);
		root.add(rb3);
		root.add(rb4);
		root.add(rb5);
		root.add(rb6);
		
		//event 처리. (익명이너클래스)=======================		
		//이벤트 @1.cb1이 선택되면 cb3글자색 빨간색으로 변경 / 해제가 되면 다시 검은색
		//이벤트 @2.cb2가 선택되면 cb4글자색 빨간색으로 변경 / 해제가 되면 다시 검은색
//		cb1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("...");
//				JCheckBox cb = (JCheckBox)e.getSource();
//				if(cb.isSelected()) {	
//					cb3.setForeground(Color.RED);					
//				}
//				
//				
//			}
//		});
//		
		//event 처리. ==================================		
		//이벤트 @1.첫번째 cb1이 선택되면 cb3는 빨간색 해제하면 다시 검은색으로 변경
		//		   두번째 cb2가 선택되면 cb4는 빨간색 해제되면 다시 검은색으로 변경		
		cb4.setForeground(Color.RED);//초기값이 선택이기 때문에
		class MyCheckBoxHandler implements ActionListener{ //Check 박스는ItemListener로도 동일한 결과		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("...");
				JCheckBox cb = (JCheckBox)e.getSource();
				if(cb==cb1) {
					if(cb.isSelected())
						cb3.setForeground(Color.RED);
					else
						cb3.setForeground(Color.BLACK);
				}
				else {
					if(cb.isSelected())
						cb4.setForeground(Color.RED);
					else
						cb4.setForeground(Color.BLACK);
				}
			}			
		}
		cb1.addActionListener(new MyCheckBoxHandler());
		cb2.addActionListener(new MyCheckBoxHandler());
		
		//이벤트 @2.첫번째 rb1이 선택되면 rb3와 rb4는 disable
		//		   두번째 rb2가 선택되면 rb3와 rb4는 enable		
		class MyRadioBtnHandler implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == rb1) { // RadioButton은 클릭시 선택만 가능하기 때문에 isSelected 검사 불필요
					rb3.setEnabled(false);
					rb4.setEnabled(false);
				} else {
					rb3.setEnabled(true);
					rb4.setEnabled(true);
				}
			}
		}	
		rb1.addActionListener(new MyRadioBtnHandler());
		rb2.addActionListener(new MyRadioBtnHandler());
			
		
		
		//# 기본속성 설정
		this.setTitle("UICompoents(JCheckBox and JRadioButton)");
		this.setBounds(100, 100, 650, 180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new EX06_uicomp3_withevent();
	}
}
