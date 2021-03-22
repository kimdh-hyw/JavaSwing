package sec04.uicomponent;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JToolBar;

//JMenuBar, JMenu, JMenuItem + JToolBar
public class EX06_uicomponents6 extends JFrame {
	public EX06_uicomponents6() {
				
		//@Step1. 최상위 컨테이너 가져오기
		Container root = this.getContentPane();
		//@Step2. 레이아웃 설정
		root.setLayout(new BorderLayout()); //ToolBar는 BorderLayout에서만 제대로 동작
		//@Step3. 컴퍼넌트 추가하기
		
		//JMenuBar
		JMenuBar menuBar = new JMenuBar(); //MenuBar 생성 <- Menu <- MenuItem
	
		JMenu menuFile = new JMenu("File");		
		JMenuItem item11 = new JMenuItem("New");
		JMenuItem item12 = new JMenuItem("Open", (int)'O');
		JMenuItem item13 = new JMenuItem("Exit");		
		menuFile.add(item11);
		menuFile.add(item12);
		JMenu menuEdit = new JMenu("Edit");
		menuEdit.add(new JMenuItem("Copy", new ImageIcon("images/menuicon1.png")));
		menuEdit.add(new JMenuItem("Paste"));		
		menuFile.add(menuEdit);
		menuFile.add(new JSeparator());
		menuFile.add(item13);		
		JMenu menuHelp = new JMenu("Help");
				
		menuBar.add(menuFile);
		menuBar.add(menuHelp);
		
		this.setJMenuBar(menuBar); //JFrame 메서드
		
		
		//JToolBar
		JToolBar toolBar = new JToolBar();
		
		toolBar.add(new JButton(new ImageIcon("images/menuicon1.png")));
		toolBar.add(new JButton(new ImageIcon("images/menuicon2.png")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("images/menuicon3.png")));
		toolBar.add(new JButton(new ImageIcon("images/menuicon4.png")));
		
		toolBar.setFloatable(true);//위치 변경 불가 (디폴트 true)		
		root.add(toolBar, BorderLayout.NORTH);
		
		//# 기본속성 설정
		this.setTitle("UICompoents(JComboBox and JList)");
		this.setBounds(100, 100, 300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new EX06_uicomponents6();
	}
}
