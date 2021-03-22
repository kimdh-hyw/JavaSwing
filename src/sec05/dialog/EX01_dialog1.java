package sec05.dialog;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//JOptionPane InputDialog, ConfirmDialog, MessageDialog

public class EX01_dialog1 extends JFrame{
	public EX01_dialog1() {
		
		//@Step1. 최상위 컨테이너 가져오기
		Container root = this.getContentPane();
		//@Step2. 레이아웃 설정
		root.setLayout(new BorderLayout());
		//@Step3. 컴퍼넌트 추가하기
		JLabel label = new JLabel("입력값");
		label.setFont(new Font("궁서",Font.BOLD, 30));
		label.setHorizontalAlignment(JLabel.CENTER);
		root.add(label);
		//# 기본속성 설정
		this.setTitle("JOptionPane InputDialog, ConfirmDialog, MessageDialog");
		this.setBounds(100, 100, 300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		
		//JOptionPane
		//@InputDialog
		String inputStr = JOptionPane.showInputDialog("텍스트를 입력하세요");
		label.setText(inputStr);
		//@ConfirmDialog
		int confirmResult = JOptionPane.showConfirmDialog(null, "종료하시겠습니까", "종료확인", JOptionPane.YES_NO_OPTION);
		switch(confirmResult) {
		case JOptionPane.YES_OPTION:
			label.setText("YES를 선택"); break;
		case JOptionPane.NO_OPTION:
			label.setText("No를 선택"); break;
		case JOptionPane.CLOSED_OPTION:
			label.setText("창 닫음"); break;
		}		
		//@MessageDialog
		JOptionPane.showMessageDialog(null, "경고메세지", "메세지창", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "에러메세지", "메세지창", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "일반메세지", "메세지창", JOptionPane.PLAIN_MESSAGE);

	}
	
	public static void main(String[] args) {
		new EX01_dialog1();
	}
}
