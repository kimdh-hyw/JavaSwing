package sec04.uicomponent;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

//JCheckBox and JRadioButton
public class EX03_uicomponents3 extends JFrame {
	public EX03_uicomponents3() {
				
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
	
		
		//# 기본속성 설정
		this.setTitle("UICompoents(JCheckBox and JRadioButton)");
		this.setBounds(100, 100, 650, 180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new EX03_uicomponents3();
	}
}
