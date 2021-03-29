package sec07.usingwindowbuilder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class EX13_uicomp_usingwb_3 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EX13_uicomp_usingwb_3 frame = new EX13_uicomp_usingwb_3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EX13_uicomp_usingwb_3() {
		setTitle("Swing using Window Builder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setLayout(null);
		panel_1_3_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JFileChooser & JColorChooser", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_3_1.setBounds(12, 342, 566, 59);
		panel.add(panel_1_3_1);
		
				
		JLabel lbl_selectedfile = new JLabel("Selected File");
		lbl_selectedfile.setBounds(142, 26, 138, 15);
		panel_1_3_1.add(lbl_selectedfile);
		
		JButton btn_filechooser = new JButton("FileChooser");
		btn_filechooser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser("C:/temp");
				int result = fileChooser.showOpenDialog(contentPane);				
				if(result == JFileChooser.APPROVE_OPTION)
					lbl_selectedfile.setText(fileChooser.getSelectedFile().getName());
			}
		});
		btn_filechooser.setBounds(12, 22, 111, 23);
		panel_1_3_1.add(btn_filechooser);
				
		
		JLabel lbl_selectedcolor = new JLabel("Selected Color");
		lbl_selectedcolor.setBounds(416, 26, 138, 15);
		panel_1_3_1.add(lbl_selectedcolor);
		
		JButton btn_colorchooser = new JButton("ColorChooser");
		btn_colorchooser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JColorChooser colorChooser = new JColorChooser();
				Color color = colorChooser.showDialog(contentPane, "Select Color" , Color.BLUE);
				lbl_selectedcolor.setText("R:"+color.getRed()+" G:"+color.getGreen()+" B:"+color.getBlue());
			}
		});
		btn_colorchooser.setBounds(285, 22, 111, 23);
		panel_1_3_1.add(btn_colorchooser);
		
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JComboBox & JList", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_2.setBounds(365, 143, 217, 181);
		panel.add(panel_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
					textArea.append((String)e.getItem()+"\n");
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ComboBox Item1", "ComboBox Item2", "ComboBox Item3", "ComboBox Item4", "ComboBox Item5"}));
		comboBox.setBounds(30, 24, 163, 21);
		panel_1_2.add(comboBox);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(30, 55, 163, 106);
		panel_1_2.add(scrollPane_1);
		
		JList list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				int[] indices = list.getSelectedIndices();
				for(int index : indices) {
					textArea.append((String)list.getModel().getElementAt(index)+" ");
				}
				textArea.append("\n");
			}
		});
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"List Item 1", "List Item 2", "List Item 3", "List Item 4", "List Item 5", "List Item 6", "List Item 7"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_1.setViewportView(list);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JOptionPane Dialog", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_3.setBounds(13, 266, 341, 59);
		panel.add(panel_1_3);
		panel_1_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btn_input = new JButton("Input");
		btn_input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(JOptionPane.showInputDialog("텍스트를 입력하세요")+"\n");
			}
		});
		panel_1_3.add(btn_input);
		
		JButton btn_confirm = new JButton("Confirm");
		btn_confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(contentPane, "TextArea를 리셋하시겠습니까?", "Confirm Dialog", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION)
					textArea.setText("");
			}
		});
		panel_1_3.add(btn_confirm);
		
		JButton btn_message = new JButton("Message");
		btn_message.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "GUI using WindowBuilder");
			}
		});
		panel_1_3.add(btn_message);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JTextField & JTextArea", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1.setBounds(157, 143, 196, 108);
		panel.add(panel_1_1);
		
		JTextField textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					textArea.append(textField.getText()+"\n");
					textField.setText("");
				}
			}
		});
		textField.setColumns(10);
		textField.setBounds(12, 22, 172, 21);
		panel_1_1.add(textField);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 52, 172, 45);
		panel_1_1.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JButton & JLabel", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(12, 143, 134, 108);
		panel.add(panel_1);
				
		JLabel lbl_result = new JLabel("Result");
		lbl_result.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_result.setBounds(37, 72, 57, 15);
		panel_1.add(lbl_result);
		
		JButton btn_ok = new JButton("OK");
		btn_ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_result.setText("Clicked!");
			}
		});
		btn_ok.setBounds(18, 32, 97, 23);
		panel_1.add(btn_ok);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JCheckBox", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(12, 10, 134, 119);
		panel.add(panel_2);
		
		JCheckBox cb1 = new JCheckBox("CheckBox1");
		cb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb1.isSelected())
					textArea.append("CheckBox1 is selected!\n");
				else 
					textArea.append("CheckBox1 is deselected!\n");
			}
		});
		panel_2.add(cb1);
		
		JCheckBox cb2 = new JCheckBox("CheckBox2");
		cb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb2.isSelected())
					textArea.append("CheckBox2 is selected!\n");
				else 
					textArea.append("CheckBox2 is deselected!\n");
			}
		});
		panel_2.add(cb2);
		
		JCheckBox cb3 = new JCheckBox("CheckBox3");
		cb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb3.isSelected())
					textArea.append("CheckBox3 is selected!\n");
				else 
					textArea.append("CheckBox3 is deselected!\n");
			}
		});
		panel_2.add(cb3);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JRadioButton", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1.setBounds(158, 10, 134, 119);
		panel.add(panel_2_1);
		
		JRadioButton rb1 = new JRadioButton("RadioButton1");
		rb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("RadioButton1 is selected!\n");
			}
		});
		buttonGroup.add(rb1);
		panel_2_1.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("RadioButton2");
		rb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("RadioButton2 is selected!\n");
			}
		});
		buttonGroup.add(rb2);
		panel_2_1.add(rb2);
		
		JRadioButton rb3 = new JRadioButton("RadioButton3");
		rb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("RadioButton3 is selected!\n");
			}
		});
		buttonGroup.add(rb3);
		panel_2_1.add(rb3);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JSlider and JProgressBar", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1.setBounds(304, 11, 279, 118);
		panel.add(panel_2_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Slider");
		lblNewLabel_1.setBounds(9, 39, 57, 15);
		panel_2_1_1.add(lblNewLabel_1);
				
		JLabel label = new JLabel("");
		label.setBounds(33, 60, 0, 0);
		panel_2_1_1.add(label);
		
		JLabel lblNewLabel = new JLabel("Progress");
		lblNewLabel.setBounds(9, 71, 57, 15);
		panel_2_1_1.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(100, 60, 0, 0);
		panel_2_1_1.add(label_1);
		
		JProgressBar progress = new JProgressBar();
		progress.setValue(50);
		progress.setBounds(81, 72, 190, 14);
		panel_2_1_1.add(progress);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				progress.setValue(slider.getValue());
			}
		});
		slider.setBounds(77, 34, 190, 26);
		panel_2_1_1.add(slider);
		
		
		
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JButton btn_tb1 = new JButton("");
		btn_tb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "The First ToolBar");
			}
		});
		btn_tb1.setIcon(new ImageIcon("Z:\\SharedFolder\\03. \uCD94\uAC00\uC790\uB8CC\uB9CC\uB4E4\uAE30\\JavaSwing\\images\\menuicon1.png"));
		toolBar.add(btn_tb1);
		
		JButton btn_tb2 = new JButton("");
		btn_tb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "The Second ToolBar");
			}
		});
		btn_tb2.setIcon(new ImageIcon("Z:\\SharedFolder\\03. \uCD94\uAC00\uC790\uB8CC\uB9CC\uB4E4\uAE30\\JavaSwing\\images\\menuicon2.png"));
		toolBar.add(btn_tb2);
		
		JButton btn_tb3 = new JButton("");
		btn_tb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "The Third ToolBar");
			}
		});
		btn_tb3.setIcon(new ImageIcon("Z:\\SharedFolder\\03. \uCD94\uAC00\uC790\uB8CC\uB9CC\uB4E4\uAE30\\JavaSwing\\images\\menuicon3.png"));
		toolBar.add(btn_tb3);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btn_reset = new JButton("Reset");
		btn_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		panel_3.add(btn_reset);
		
		JButton btn_close = new JButton("Close");
		btn_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel_3.add(btn_close);
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenu menu_file = new JMenu("File");
		menuBar.add(menu_file);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newFile = JOptionPane.showInputDialog("새로운 파일이름을 입력하세요");
				textArea.append(newFile+"\n");
			}
		});
		menu_file.add(mntmNew);
		
		JMenuItem menuitem_open = new JMenuItem("Open");
		menuitem_open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser("c:/temp");
				int result = fileChooser.showOpenDialog(contentPane);
				if(result == JFileChooser.APPROVE_OPTION)
					textArea.append(fileChooser.getSelectedFile().getName()+"\n");
				
			}
		});
		menuitem_open.setMnemonic(KeyEvent.VK_O);
		menu_file.add(menuitem_open);
		
		JSeparator separator_1 = new JSeparator();
		menu_file.add(separator_1);
		
		JMenuItem menuitem_close = new JMenuItem("Close");
		menuitem_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menu_file.add(menuitem_close);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem menuitem_version = new JMenuItem("Version");
		menuitem_version.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "version 1.0");
			}
		});
		mnHelp.add(menuitem_version);
		
		JMenuItem menuitem_about = new JMenuItem("About");
		menuitem_about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "Java Swing with WindowBuilder");
			}
		});
		mnHelp.add(menuitem_about);
	}
}
