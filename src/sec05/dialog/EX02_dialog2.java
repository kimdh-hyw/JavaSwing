package sec05.dialog;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

//JFileChooser and JColorChooser

public class EX02_dialog2 extends JFrame{
	public EX02_dialog2() {
		
		//@Step1. 최상위 컨테이너 가져오기
		Container root = this.getContentPane();
		//@Step2. 레이아웃 설정
		root.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		//@Step3. 컴퍼넌트 추가하기
		
		//# 기본속성 설정
		this.setTitle("JFileChooser and JColorChooser");
		this.setBounds(100, 100, 600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		
		//JFileChooser
		//@file Open 
		JFileChooser fileChooser1 = new JFileChooser();		
		FileNameExtensionFilter filter1 = new FileNameExtensionFilter("Word 파일", "txt", "hwp", "docx");	
		FileNameExtensionFilter filter2= new FileNameExtensionFilter("Image 파일", "jpg", "bmp", "png", "gif");		
		//fileChooser1.setFileFilter(filter); //하나만 설정하는 경우		
		fileChooser1.addChoosableFileFilter(filter1);
		fileChooser1.addChoosableFileFilter(filter2);
		
		int openResult = fileChooser1.showOpenDialog(root); //부모컨테이너 중앙
		switch(openResult) {
		case JFileChooser.APPROVE_OPTION: //파일을 선택한 경우
			String path = fileChooser1.getSelectedFile().getPath();
			JOptionPane.showMessageDialog(null, "파일열기 : " + path);
		case JFileChooser.CANCEL_OPTION: //선택 취소한 경우
			JOptionPane.showMessageDialog(null, "파일열기 취소");
		}
		
		//@file Save
		JFileChooser fileChooser2 = new JFileChooser("C:\\temp");		
		int saveResult = fileChooser2.showSaveDialog(null); //화면 중앙 (부모 미지정)
		
		//@dir Open
		JFileChooser fileChooser3 = new JFileChooser();		
		fileChooser3.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); //폴더만 열림		
		int dirOpenResult = fileChooser3.showOpenDialog(null); //화면 중앙 (부모 미지정)
		
		//#JColorChooser
		JColorChooser colorChooser = new JColorChooser();
		Color selectedColor = colorChooser.showDialog(root, "컬러선택", Color.RED);
		if (selectedColor == null)
			JOptionPane.showMessageDialog(null, "컬러선택 취소");
		else
			JOptionPane.showMessageDialog(null, "컬러선택: "+selectedColor.toString());
	}
	
	public static void main(String[] args) {
		new EX02_dialog2();
	}
}
