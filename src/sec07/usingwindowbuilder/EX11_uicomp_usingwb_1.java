package sec07.usingwindowbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToolBar;

public class EX11_uicomp_usingwb_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EX11_uicomp_usingwb_1 frame = new EX11_uicomp_usingwb_1();
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
	public EX11_uicomp_usingwb_1() {
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
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(12, 22, 97, 23);
		panel_1_3_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(121, 26, 159, 15);
		panel_1_3_1.add(lblNewLabel_3);
		
		JButton btnNewButton_2_1 = new JButton("New button");
		btnNewButton_2_1.setBounds(285, 22, 97, 23);
		panel_1_3_1.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setBounds(395, 26, 159, 15);
		panel_1_3_1.add(lblNewLabel_3_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JComboBox & JList", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_2.setBounds(365, 143, 217, 181);
		panel.add(panel_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(30, 24, 163, 21);
		panel_1_2.add(comboBox);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(30, 55, 163, 106);
		panel_1_2.add(scrollPane_1);
		
		JList list = new JList();
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
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_1_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_1_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_1_3.add(btnNewButton_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JTextField & JTextArea", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1.setBounds(157, 143, 196, 108);
		panel.add(panel_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(12, 22, 172, 21);
		panel_1_1.add(textField);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 52, 172, 45);
		panel_1_1.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JButton & JLabel", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(12, 143, 134, 108);
		panel.add(panel_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(18, 32, 97, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(37, 72, 57, 15);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JCheckBox", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(12, 10, 134, 119);
		panel.add(panel_2);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		panel_2.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		panel_2.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		panel_2.add(chckbxNewCheckBox);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JRadioButton", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1.setBounds(158, 10, 134, 119);
		panel.add(panel_2_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		panel_2_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		panel_2_1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		panel_2_1.add(rdbtnNewRadioButton);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JSlider and JProgressBar", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1.setBounds(304, 11, 279, 118);
		panel.add(panel_2_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(9, 39, 57, 15);
		panel_2_1_1.add(lblNewLabel_1);
		
		JSlider slider_1 = new JSlider();
		slider_1.setBounds(77, 34, 190, 26);
		panel_2_1_1.add(slider_1);
		
		JLabel label = new JLabel("");
		label.setBounds(33, 60, 0, 0);
		panel_2_1_1.add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(9, 71, 57, 15);
		panel_2_1_1.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(100, 60, 0, 0);
		panel_2_1_1.add(label_1);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setBounds(81, 72, 190, 14);
		panel_2_1_1.add(progressBar_1);
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JButton btnNewButton_4 = new JButton("New button");
		toolBar.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		toolBar.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		toolBar.add(btnNewButton_6);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnNewButton_7 = new JButton("New button");
		panel_3.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		panel_3.add(btnNewButton_8);
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_3);
	}
}
