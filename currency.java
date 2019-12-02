import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class currency {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
    public String str1,str2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currency window = new currency();
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
	public currency() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 538);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCurrencyConverter.setBounds(138, 27, 187, 29);
		frame.getContentPane().add(lblCurrencyConverter);
		
		JLabel lblInputCurrency = new JLabel("Input Currency");
		lblInputCurrency.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInputCurrency.setBounds(55, 95, 115, 22);
		frame.getContentPane().add(lblInputCurrency);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"< select >", "USD[United State Dollar]", "INR[Indian Rupee]", "EUR[Euro]", "CAD[Canadian Dollar]"}));
		comboBox.setBounds(218, 88, 167, 29);
		frame.getContentPane().add(comboBox);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAmount.setBounds(98, 252, 67, 29);
		frame.getContentPane().add(lblAmount);
		
		textField = new JTextField();
		textField.setBounds(218, 249, 141, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblOutputCurrency = new JLabel("Output Currency");
		lblOutputCurrency.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblOutputCurrency.setBounds(38, 160, 132, 22);
		frame.getContentPane().add(lblOutputCurrency);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"< select >", "USD[United State Dollar]", "INR[Indian Rupee]", "EUR[Euro]", "CAD[Canadian Dollar]"}));
		comboBox_1.setBounds(218, 159, 167, 29);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblConvertedAmount = new JLabel("Converted Amount");
		lblConvertedAmount.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConvertedAmount.setBounds(36, 322, 153, 39);
		frame.getContentPane().add(lblConvertedAmount);
		
		textField_1 = new JTextField();
		textField_1.setBounds(218, 324, 142, 39);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 str1=(String)comboBox.getSelectedItem();
				 str2=(String)comboBox_1.getSelectedItem(); 
				 String s=textField.getText();
				if(str1.equals("USD[United State Dollar]")&&(str2.equals("USD[United State Dollar]")))
				{
					textField_1.setText(s);
				}
				if(str1.equals("INR[Indian Rupee]")&&(str2.equals("INR[Indian Rupee]")))
				{
					textField_1.setText(s);
				}
				if(str1.equals("CAD[Canadian Dollar]")&&(str2.equals("CAD[Canadian Dollar]")))
				{
					textField_1.setText(s);
				}
				if(str1.equals("EUR[Euro]")&&(str2.equals("EUR[Euro]")))
				{
					textField_1.setText(s);
			    }
				if(str1.equals("EUR[Euro]")&&(str2.equals("INR[Indian Rupee]")))
				{
					double a=Double.parseDouble(s);
					double b=(a*79.55);
					String s1=String.valueOf(b);
					textField_1.setText(s1);
				}
				if(str1.equals("EUR[Euro]")&&(str2.equals("USD[United State Dollar]")))
				{
					double a=Double.parseDouble(s);
					double b=(a*1.11);
					String s1=String.valueOf(b);
					textField_1.setText(s1);
				}
				if(str1.equals("EUR[Euro]")&&(str2.equals("CAD[Canadian Dollar]")))
				{
					double a=Double.parseDouble(s);
					double b=(a*1.48);
					String s1=String.valueOf(b);
					textField_1.setText(s1);
				}
				if(str1.equals("USD[United State Dollar]")&&(str2.equals("INR[Indian Rupee]")))
				{
					double a=Double.parseDouble(s);
					double b=(a*71.76);
					String s1=String.valueOf(b);
					textField_1.setText(s1);
				}
				if(str1.equals("USD[United State Dollar]")&&(str2.equals("EUR[Euro]")))
				{
					double a=Double.parseDouble(s);
					double b=(a*0.90);
					String s1=String.valueOf(b);
					textField_1.setText(s1);
				}
				if(str1.equals("INR[Indian Rupee]")&&(str2.equals("USD[United State Dollar]")))
				{
					double a=Double.parseDouble(s);
					double b=(a*0.014);
					String s1=String.valueOf(b);
					textField_1.setText(s1);
				}if(str1.equals("INR[Indian Rupee]")&&(str2.equals("EUR[Euro]")))
				{
					double a=Double.parseDouble(s);
					double b=(a*0.013);
					String s1=String.valueOf(b);
					textField_1.setText(s1);
				}
				if(str1.equals("USD[United State Dollar]")&&(str2.equals("CAD[Canadian Dollar]")))
				{
					double a=Double.parseDouble(s);
					double b=(a*1.33);
					String s1=String.valueOf(b);
					textField_1.setText(s1);
				}
				if(str1.equals("CAD[Canadian Dollar]")&&(str2.equals("USD[United State Dollar]")))
				{
					double a=Double.parseDouble(s);
					double b=(a*0.75);
					String s1=String.valueOf(b);
					textField_1.setText(s1);
				}
				if(str1.equals("CAD[Canadian Dollar]")&&(str2.equals("INR[Indian Rupee]")))
				{
					double a=Double.parseDouble(s);
					double b=(a*53.90);
					String s1=String.valueOf(b);
					textField_1.setText(s1);
				}
				if(str1.equals("CAD[Canadian Dollar]")&&(str2.equals("EUR[Euro]")))
				{
					double a=Double.parseDouble(s);
					double b=(a*0.68);
					String s1=String.valueOf(b);
					textField_1.setText(s1);
				}
				if(str1.equals("INR[Indian Rupee]")&&(str2.equals("CAD[Canadian Dollar]")))
				{
					double a=Double.parseDouble(s);
					double b=(a*0.019);
					String s1=String.valueOf(b);
					textField_1.setText(s1);
				}
			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConvert.setBounds(166, 424, 89, 39);
		frame.getContentPane().add(btnConvert);
		
		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(" ");
				textField_1.setText(" ");
			}
		});
		btnClear.setBounds(307, 434, 89, 23);
		frame.getContentPane().add(btnClear);
	}
}
