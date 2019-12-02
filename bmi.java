import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class bmi {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bmi window = new bmi();
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
	public bmi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(47, 79, 79));
		frame.setBounds(100, 100, 450, 621);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(50, 205, 50));
		panel.setBounds(0, 0, 434, 79);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBodyMassIndex = new JLabel("Body Mass Index");
		lblBodyMassIndex.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBodyMassIndex.setBounds(122, 11, 181, 57);
		panel.add(lblBodyMassIndex);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(154, 205, 50));
		panel_1.setBounds(10, 90, 414, 336);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHeight = new JLabel("Height(m):");
		lblHeight.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHeight.setBounds(37, 41, 96, 32);
		panel_1.add(lblHeight);
		
		JLabel lblWeightm = new JLabel("Weight(kg):");
		lblWeightm.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWeightm.setBounds(37, 84, 96, 32);
		panel_1.add(lblWeightm);
		
		textField = new JTextField();
		textField.setBounds(153, 37, 190, 32);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(153, 84, 190, 32);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBmi.setBounds(46, 172, 46, 14);
		panel_1.add(lblBmi);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_2.setBackground(new Color(255, 165, 0));
		textField_2.setBounds(112, 159, 96, 32);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(245, 168, 96, 14);
		panel_1.add(lblNewLabel);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=textField.getText();
				float a=Float.parseFloat(str1);
				String str2=textField_1.getText();
				float b=Float.parseFloat(str2);
				float c=(b/(a*a));
				String str=String.valueOf(c);
				textField_2.setText(str);
				if(c<18.5)
				{
					lblNewLabel.setText("Under Weight");
				}
				if(c>18.5&&c<24.9)
				{
					lblNewLabel.setText("Normal Weight");
				}
				if(c>25&&c<29.9)
				{
					lblNewLabel.setText("Over Weight");
				}
				if(c>30)
				{
					lblNewLabel.setText("Obese");
				}
				
				
			}
		});
		btnCalculate.setBounds(108, 253, 89, 23);
		panel_1.add(btnCalculate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
				textField_1.setText(" ");
				textField_2.setText(" ");
				lblNewLabel.setText(" ");
			}
		});
		btnClear.setBounds(214, 253, 71, 23);
		panel_1.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnExit.setBounds(295, 253, 61, 23);
		panel_1.add(btnExit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(107, 142, 35));
		panel_2.setBounds(10, 437, 414, 135);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Under  Weight", "Normal Weight", "Overweight", "Obese"},
				{"<18.5", "18.5-24.9", "25-29.9", ">30"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(83);
		table.getColumnModel().getColumn(3).setPreferredWidth(71);
		table.setBackground(new Color(50, 205, 50));
		table.setBounds(10, 56, 394, 32);
		panel_2.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(414, 123, -26, -19);
		panel_2.add(table_1);
	}
}
