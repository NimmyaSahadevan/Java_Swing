import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
//import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.JButton;

public class kelvin {

	private JFrame frame;
	private JTextField textField;
	 public int f=0;
	public String str;
	public int df=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kelvin window = new kelvin();
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
	public kelvin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInput.setBounds(114, 28, 60, 27);
		frame.getContentPane().add(lblInput);
		
		textField = new JTextField();
		textField.setBounds(171, 24, 158, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblInputScale = new JLabel("Input Scale");
		lblInputScale.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInputScale.setBounds(57, 94, 117, 27);
		frame.getContentPane().add(lblInputScale);
		
		JLabel lblOutputScale = new JLabel("Output Scale");
		lblOutputScale.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblOutputScale.setBounds(270, 100, 122, 14);
		frame.getContentPane().add(lblOutputScale);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblOutput.setBounds(95, 291, 66, 26);
		frame.getContentPane().add(lblOutput);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(171, 291, 110, 26);
		frame.getContentPane().add(lblNewLabel);
		
		
		JRadioButton rdbtnCelsius = new JRadioButton("Celsius");
		rdbtnCelsius.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnCelsius.setBounds(45, 151, 109, 27);
		frame.getContentPane().add(rdbtnCelsius);
		rdbtnCelsius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(f==0)
			{
			f++;
			}
			}
		});
		
		JRadioButton rdbtnFahrenheit = new JRadioButton("Fahrenheit");
		rdbtnFahrenheit.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnFahrenheit.setBounds(45, 191, 109, 23);
		frame.getContentPane().add(rdbtnFahrenheit);
		rdbtnFahrenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(f==0)
			{
				f++;
			}
				
			}
		});
		JRadioButton rdbtnKelvin = new JRadioButton("Kelvin");
		rdbtnKelvin.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnKelvin.setBounds(45, 224, 109, 23);
		frame.getContentPane().add(rdbtnKelvin);
		rdbtnKelvin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==0)
				{
					f++;
				}	
			}
		});
		
		ButtonGroup G1=new ButtonGroup();
		G1.add(rdbtnCelsius);
		G1.add(rdbtnFahrenheit);
		G1.add(rdbtnKelvin);
		
		JRadioButton radioButton = new JRadioButton("Celsius");
		radioButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		radioButton.setBounds(270, 151, 109, 27);
		frame.getContentPane().add(radioButton);
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str=textField.getText();
			if(df==0) {
				
			
				if(rdbtnCelsius.isSelected())
				{
				
					lblNewLabel.setText(str);
				}
				if(rdbtnFahrenheit.isSelected())
				{
					float c2=Float.parseFloat(str);
					float f=(float)((c2-32)*(.55));
					String str2=String.valueOf(f);
					lblNewLabel.setText(str2);	
					
				}
				if(rdbtnKelvin.isSelected())
				{
					float c2=Float.parseFloat(str);
					float f=(float)((c2-273.15));
					String str1=String.valueOf(f);
					lblNewLabel.setText(str1);	
				}
				
			}}
		});
		
		JRadioButton radioButton_1 = new JRadioButton("Fahrenheit");
		radioButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		radioButton_1.setBounds(270, 191, 109, 23);
		frame.getContentPane().add(radioButton_1);
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				str=textField.getText();
			if(df==0)
			{
				if(rdbtnFahrenheit.isSelected())
				{
				
					lblNewLabel.setText(str);
				}
				if(rdbtnCelsius.isSelected())
				{
					float c2=Float.parseFloat(str);
					float f=(float)((1.8)*c2+32);
					String str2=String.valueOf(f);
					lblNewLabel.setText(str2);	
					
				}
				if(rdbtnKelvin.isSelected())
				{
					float c2=Float.parseFloat(str);
					float f=(float)((c2-273)*(1.8)+32);
					String str1=String.valueOf(f);
					lblNewLabel.setText(str1);	
				}
			}}
		});
		
		JRadioButton radioButton_2 = new JRadioButton("Kelvin");
		radioButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		radioButton_2.setBounds(270, 224, 109, 23);
		frame.getContentPane().add(radioButton_2);
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str=textField.getText();
				if(df==0)
				{
				if(rdbtnKelvin.isSelected())
				{
				
					lblNewLabel.setText(str);
				}
				if(rdbtnCelsius.isSelected())
				{
					float c2=Float.parseFloat(str);
					float f=(float)((c2+273));
					String str2=String.valueOf(f);
					lblNewLabel.setText(str2);	
					
				}
				if(rdbtnFahrenheit.isSelected())
				{
					float c2=Float.parseFloat(str);
					float f=(float)((c2-32)*(.55)+273);
					String str1=String.valueOf(f);
					lblNewLabel.setText(str1);	
				}	
			}}
		});
		ButtonGroup G2=new ButtonGroup();
		G2.add(radioButton);
		G2.add(radioButton_1);
		G2.add(radioButton_2);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				
			}
		});
		btnC.setBounds(314, 291, 66, 27);
		frame.getContentPane().add(btnC);
		
		
	}
}
