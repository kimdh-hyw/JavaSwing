package sec01.createjframe;

import javax.swing.JFrame;


public class Ex01_CreateJFrame_1 {
	
	public static void main(String[] args) {
		
		//#1. JFrame 객체 생성
		JFrame jf = new JFrame();
		
		//#2. JFrame 설정 (타이틀, 크기, x 버튼 동작, 보이기 상태)
		jf.setTitle("JFrame 생성하기 방법#1");
		jf.setBounds(100, 100, 350, 200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로그램 종료
		jf.setVisible(true);
		//jf.setLocationRelativeTo(null);//화면가운데 배치
						
		/* 여러 개의 프레임 생성 가능 		
		//#3. JFrame 객체 생성
		JFrame jf2 = new JFrame();
		
		//#4. JFrame 설정 (타이틀, 크기, x 버튼 동작, 보이기 상태)
		jf2.setTitle("JFrame 생성하기 방법#1");
		jf2.setBounds(100, 100, 350, 200);
		jf2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //자신의 프레임만 종료
		jf2.setVisible(true);
		*/
						
	}

}
