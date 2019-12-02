import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class progressreport {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progressreport window = new progressreport();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progressreport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 51, 153));
		frame.setBounds(100, 100, 1136, 796);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(169, 169, 169));
		panel.setBounds(10, 29, 525, 425);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStudentid.setBounds(32, 61, 98, 26);
		panel.add(lblStudentid);
		
		textField = new JTextField();
		textField.setBounds(140, 60, 122, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFirstName.setBounds(32, 122, 82, 26);
		panel.add(lblFirstName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 114, 122, 33);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSur = new JLabel("Surname");
		lblSur.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSur.setBounds(32, 170, 82, 26);
		panel.add(lblSur);
		
		textField_2 = new JTextField();
		textField_2.setBounds(140, 169, 122, 26);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCourseCode = new JLabel("Course code");
		lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCourseCode.setBounds(21, 222, 98, 19);
		panel.add(lblCourseCode);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"< SELECT >", "111032B", "111032E", "111032A"}));
		comboBox.setBounds(140, 217, 122, 26);
		panel.add(comboBox);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMaths.setBounds(299, 60, 59, 21);
		panel.add(lblMaths);
		
		textField_3 = new JTextField();
		textField_3.setBounds(375, 55, 86, 26);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEnglish.setBounds(299, 103, 66, 19);
		panel.add(lblEnglish);
		
		textField_4 = new JTextField();
		textField_4.setBounds(375, 98, 86, 26);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBiology.setBounds(299, 149, 66, 19);
		panel.add(lblBiology);
		
		textField_5 = new JTextField();
		textField_5.setBounds(375, 142, 86, 26);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblComputer.setBounds(283, 195, 82, 19);
		panel.add(lblComputer);
		
		textField_6 = new JTextField();
		textField_6.setBounds(375, 193, 86, 26);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblChemistry.setBounds(283, 234, 82, 26);
		panel.add(lblChemistry);
		
		textField_7 = new JTextField();
		textField_7.setBounds(375, 237, 86, 25);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPhysics.setBounds(299, 287, 75, 19);
		panel.add(lblPhysics);
		
		textField_8 = new JTextField();
		textField_8.setBounds(375, 285, 86, 26);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTamil.setBounds(306, 341, 59, 14);
		panel.add(lblTamil);
		
		textField_9 = new JTextField();
		textField_9.setBounds(375, 337, 86, 26);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMalayalam.setBounds(283, 376, 86, 26);
		panel.add(lblMalayalam);
		
		textField_10 = new JTextField();
		textField_10.setBounds(375, 378, 86, 26);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(21, 280, 241, 2);
		panel.add(separator);
		
		JLabel lblNewLabel = new JLabel("Total Score");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(21, 302, 93, 26);
		panel.add(lblNewLabel);
		
		textField_11 = new JTextField();
		textField_11.setBounds(141, 300, 98, 28);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblAverege = new JLabel("Averege");
		lblAverege.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAverege.setBounds(37, 335, 93, 26);
		panel.add(lblAverege);
		
		textField_12 = new JTextField();
		textField_12.setBounds(140, 340, 99, 26);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRanking.setBounds(37, 376, 77, 26);
		panel.add(lblRanking);
		
		textField_13 = new JTextField();
		textField_13.setBounds(140, 377, 99, 24);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(new Color(148, 0, 211));
		panel_1.setBounds(545, 29, 565, 464);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 26, 545, 373);
		panel_1.add(textArea);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID", "Coursename", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 562, 1022, 110);
		frame.getContentPane().add(table);
		
		JButton btnAddReport = new JButton("Add Report");
		btnAddReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1=textField.getText();
				String str1=(String)comboBox.getSelectedItem();
				String s2=textField_1.getText();
				String s3=textField_2.getText();
				String s4=textField_3.getText();
				String s5=textField_4.getText();
				String s6=textField_5.getText();
				String s7=textField_6.getText();
				String s8=textField_7.getText();
				String s9=textField_8.getText();
				String s10=textField_9.getText();
				String s11=textField_10.getText();
				
				float a=Float.parseFloat(s4);
				float b=Float.parseFloat(s5);
				float c=Float.parseFloat(s6);
				float d=Float.parseFloat(s7);
				float g=Float.parseFloat(s8);
				float f=Float.parseFloat(s9);
				float h=Float.parseFloat(s10);
				float i=Float.parseFloat(s11);
				
				float total=(float)(a+b+c+d+g+f+h+i);
				float ave=(float)(total/8);
				
				String str2=String.valueOf(total);
				String str3=String.valueOf(ave);
			
				
				
				
				textField_11.setText(str2);
				textField_12.setText(str3);
				
				if(total>=700)
				{
					textField_13.setText("1");
				}
				if(total>=600)
				{
					textField_13.setText("2");
				}
				if(total>=500)
				{
					textField_13.setText("3");
				}
				if(total>=400)
				{
					textField_13.setText("4");
				}
				if(total>=300)
				{
					textField_13.setText("5");
				}
				else
				{
					textField_13.setText("Fail");
				}
				String rank=textField_13.getText();
				
				
				
				String[] row= {s1,str1,s4,s5,s6,s7,s8,s9,s10,s11,str2,str3,rank};
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(row);
			}
		});
		btnAddReport.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddReport.setForeground(new Color(0, 128, 0));
		btnAddReport.setBackground(new Color(255, 255, 255));
		btnAddReport.setBounds(224, 683, 125, 36);
		frame.getContentPane().add(btnAddReport);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.removeRow(table.getSelectedRow());
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDelete.setForeground(new Color(255, 0, 0));
		btnDelete.setBounds(376, 683, 89, 36);
		frame.getContentPane().add(btnDelete);
		
		JButton btnShowReport = new JButton("Show Report");
		//textArea.setText("Student Details");
		btnShowReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		    textArea.append("Student Record\n"+ "Student Name :\t\t\t"+textField_1.getText()+" "+textField_2.getText()+"\n"+ "========================================\n"+ "Maths:\t\t" + textField_3.getText()+ "\nEnglish:\t\t" + textField_4.getText()+ "\nBiology:\t\t" + textField_5.getText()+ "\nComputer:\t\t" + textField_6.getText()
			+ "\nChemistry:\t\t" + textField_7.getText()+ "\nPhysics:\t\t" + textField_8.getText()+ "\nTamil:\t\t" + textField_9.getText()+ "\nMalayalam:\t\t" + textField_10.getText()
			+"\n========================================"+ "\nTotal Score:\t\t" + textField_11.getText()+ "\nAverage:\t\t" + textField_12.getText()+ "\nRanking:\t\t" + textField_13.getText() + "\n");
			}
			});
						
		
		btnShowReport.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnShowReport.setForeground(new Color(0, 0, 205));
		btnShowReport.setBounds(501, 683, 107, 36);
		frame.getContentPane().add(btnShowReport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setForeground(new Color(255, 0, 0));
		btnExit.setBounds(636, 683, 89, 36);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				comboBox.setSelectedIndex(0);
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReset.setForeground(new Color(139, 0, 139));
		btnReset.setBounds(756, 683, 89, 36);
		frame.getContentPane().add(btnReset);
		
		
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(null);
			}
		});
		btnClear.setBackground(new Color(240, 255, 240));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnClear.setForeground(new Color(0, 0, 139));
		btnClear.setBounds(244, 421, 89, 32);
		panel_1.add(btnClear);
	}
}
