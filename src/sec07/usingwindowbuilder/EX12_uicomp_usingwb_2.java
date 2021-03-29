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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;

public class EX12_uicomp_usingwb_2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EX12_uicomp_usingwb_2 frame = new EX12_uicomp_usingwb_2();
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
	public EX12_uicomp_usingwb_2() {
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
		
		JButton btn_filechooser = new JButton("FileChooser");
		btn_filechooser.setBounds(12, 22, 111, 23);
		panel_1_3_1.add(btn_filechooser);
		
		JLabel lbl_selectedfile = new JLabel("Selected File");
		lbl_selectedfile.setBounds(142, 26, 138, 15);
		panel_1_3_1.add(lbl_selectedfile);
		
		JButton btn_colorchooser = new JButton("ColorChooser");
		btn_colorchooser.setBounds(285, 22, 111, 23);
		panel_1_3_1.add(btn_colorchooser);
		
		JLabel lbl_selectedcolor = new JLabel("Selected Color");
		lbl_selectedcolor.setBounds(416, 26, 138, 15);
		panel_1_3_1.add(lbl_selectedcolor);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JComboBox & JList", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_2.setBounds(365, 143, 217, 181);
		panel.add(panel_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ComboBox Item1", "ComboBox Item2", "ComboBox Item3", "ComboBox Item4", "ComboBox Item5"}));
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
		
		JButton btn_input = new JButton("Input");
		panel_1_3.add(btn_input);
		
		JButton btn_confirm = new JButton("Confirm");
		panel_1_3.add(btn_confirm);
		
		JButton btn_message = new JButton("Message");
		panel_1_3.add(btn_message);
		
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
		
		JButton btn_ok = new JButton("OK");
		btn_ok.setBounds(18, 32, 97, 23);
		panel_1.add(btn_ok);
		
		JLabel lbl_result = new JLabel("Result");
		lbl_result.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_result.setBounds(37, 72, 57, 15);
		panel_1.add(lbl_result);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JCheckBox", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(12, 10, 134, 119);
		panel.add(panel_2);
		
		JCheckBox cb1 = new JCheckBox("CheckBox1");
		panel_2.add(cb1);
		
		JCheckBox cb2 = new JCheckBox("CheckBox2");
		panel_2.add(cb2);
		
		JCheckBox cb3 = new JCheckBox("CheckBox3");
		panel_2.add(cb3);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JRadioButton", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1.setBounds(158, 10, 134, 119);
		panel.add(panel_2_1);
		
		JRadioButton rb1 = new JRadioButton("RadioButton1");
		panel_2_1.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("RadioButton2");
		panel_2_1.add(rb2);
		
		JRadioButton rb3 = new JRadioButton("RadioButton3");
		panel_2_1.add(rb3);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JSlider and JProgressBar", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1.setBounds(304, 11, 279, 118);
		panel.add(panel_2_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Slider");
		lblNewLabel_1.setBounds(9, 39, 57, 15);
		panel_2_1_1.add(lblNewLabel_1);
		
		JSlider slider = new JSlider();
		slider.setBounds(77, 34, 190, 26);
		panel_2_1_1.add(slider);
		
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
		progress.setBounds(81, 72, 190, 14);
		panel_2_1_1.add(progress);
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JButton btn_tb1 = new JButton("");
		btn_tb1.setIcon(new ImageIcon("Z:\\SharedFolder\\03. \uCD94\uAC00\uC790\uB8CC\uB9CC\uB4E4\uAE30\\JavaSwing\\images\\menuicon1.png"));
		toolBar.add(btn_tb1);
		
		JButton btn_tb2 = new JButton("");
		btn_tb2.setIcon(new ImageIcon("Z:\\SharedFolder\\03. \uCD94\uAC00\uC790\uB8CC\uB9CC\uB4E4\uAE30\\JavaSwing\\images\\menuicon2.png"));
		toolBar.add(btn_tb2);
		
		JButton btn_tb3 = new JButton("");
		btn_tb3.setIcon(new ImageIcon("Z:\\SharedFolder\\03. \uCD94\uAC00\uC790\uB8CC\uB9CC\uB4E4\uAE30\\JavaSwing\\images\\menuicon3.png"));
		toolBar.add(btn_tb3);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btn_reset = new JButton("Reset");
		panel_3.add(btn_reset);
		
		JButton btn_close = new JButton("Close");
		panel_3.add(btn_close);
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenu menu_file = new JMenu("File");
		menuBar.add(menu_file);
		
		JMenuItem mntmNew = new JMenuItem("New");
		menu_file.add(mntmNew);
		
		JMenuItem menuitem_open = new JMenuItem("Open");
		menuitem_open.setMnemonic(KeyEvent.VK_O);
		menu_file.add(menuitem_open);
		
		JSeparator separator_1 = new JSeparator();
		menu_file.add(separator_1);
		
		JMenuItem menuitem_close = new JMenuItem("Close");
		menu_file.add(menuitem_close);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem menuitem_version = new JMenuItem("Version");
		mnHelp.add(menuitem_version);
		
		JMenuItem menuitem_about = new JMenuItem("About");
		mnHelp.add(menuitem_about);
	}
}
