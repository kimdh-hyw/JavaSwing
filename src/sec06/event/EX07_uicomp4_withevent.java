package sec06.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

//JSlider and JProgressBar

public class EX07_uicomp4_withevent extends JFrame {
	public EX07_uicomp4_withevent() {
				
		//@Step1. 최상위 컨테이너 가져오기
		Container root = this.getContentPane();
		//@Step2. 레이아웃 설정
		root.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		//@Step3. 컴퍼넌트 추가하기
		
		//JSlider
		JSlider slider1 = new JSlider(); //기본 Slider (디폴트 0~100, 50)
		
		JSlider slider2 = new JSlider(100, 300); //기본 Slider  + 구간설정 + Tick(Major, Minor) + Label 표시
		slider2.setMajorTickSpacing(50);
		slider2.setMinorTickSpacing(10);		
		slider2.setPaintTicks(true); //디폴트가 false이기 때문에 이걸 해주야 스페이싱이 보여		
		slider2.setPaintLabels(true); ////디폴트가 false이기 때문에 이걸 해주야 레이블이 보임 (Major Spacing마다 표시)
		
		JSlider slider3 = new JSlider(JSlider.VERTICAL); //세로 Slider + 크기 지정
		slider3.setPreferredSize(new Dimension(20, 100));
		
		
		//JProgressBar
				
		JProgressBar pb1 = new JProgressBar(); //기본 ProgressBar
		
		JProgressBar pb2 = new JProgressBar(JProgressBar.VERTICAL, 100, 300); //세로 ProgressBar + 위치값 지정 + 크기지정 + 색 지정
		pb2.setValue(250);		
		pb2.setPreferredSize(new Dimension(10, 80));		
		pb2.setForeground(Color.RED);
		
		JProgressBar pb3 = new JProgressBar(100, 300); //기본 ProgressBar + 위치값 지정 + 진행률 표시(%)		
		pb3.setValue(200);
		pb3.setStringPainted(true);		
						
		root.add(slider1);
		root.add(slider2);
		root.add(slider3);
		root.add(pb1);
		root.add(pb2);		
		root.add(pb3);
		
		//event 처리. ==================================		
		//이벤트 @1.두번째 slider2를 변경하면 세번째 ProgressBar(pb3)에 진행률이 표시	
		slider2.addChangeListener(new ChangeListener() {			
			@Override
			public void stateChanged(ChangeEvent e) {
				pb3.setValue(slider2.getValue());				
			}
		});
		//=============================================
		
		//# 기본속성 설정
		this.setTitle("UICompoents(JSlider and JProgressBar)");
		this.setBounds(100, 100, 500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new EX07_uicomp4_withevent();
	}
}
