import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField textField_1;
	public String str1,str2;
	public int f=0;
	public int df=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 21, 403, 38);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEdit = new JLabel("edit");
		lblEdit.setBounds(10, 2, 46, 14);
		frame.getContentPane().add(lblEdit);
		
		JLabel lblView = new JLabel("view");
		lblView.setBounds(35, 2, 46, 14);
		frame.getContentPane().add(lblView);
		
		JLabel lblHelp = new JLabel("help");
		lblHelp.setBounds(66, 2, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblScientific = new JLabel("scientific");
		lblScientific.setBounds(20, 68, 61, 14);
		frame.getContentPane().add(lblScientific);
		
		JLabel lblStandard = new JLabel("standard");
		lblStandard.setBounds(209, 68, 70, 14);
		frame.getContentPane().add(lblStandard);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.setBounds(10, 93, 57, 23);
		frame.getContentPane().add(btnSqrt);
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				Double a=Math.sqrt(Double.parseDouble(textField_1.getText()));
				textField_1.setText(" ");
				textField_1.setText(textField_1.getText()+a);
			}
		});
		
		
		JButton btnNewButton = new JButton("1/x");
		btnNewButton.setBounds(71, 93, 61, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				Double a=1/(Double.parseDouble(textField_1.getText()));
				textField_1.setText(" ");
				textField_1.setText(textField_1.getText()+a);	
			}
		});
		
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				Double a=Math.sin(Double.parseDouble(textField_1.getText())*Math.PI/180);
				textField_1.setText(" ");
				textField_1.setText(textField_1.getText()+a);
			}
		});
		btnSin.setBounds(138, 93, 61, 23);
		frame.getContentPane().add(btnSin);
		
		JButton button = new JButton("%");
		button.setBounds(10, 138, 57, 23);
		frame.getContentPane().add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 str1=textField_1.getText();
				 str2=button.getText();
				textField_1.setText(" ");
			}
		});
		
		
		JButton btnExp = new JButton("Exp");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				Double a=Math.exp(Double.parseDouble(textField_1.getText()));
				textField_1.setText(" ");
				textField_1.setText(textField_1.getText()+a);
			}
			
			
		});
		btnExp.setBounds(71, 138, 61, 23);
		frame.getContentPane().add(btnExp);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				Double a=Math.cos(Double.parseDouble(textField_1.getText())*Math.PI/180);
				//Double b=Math.toDegrees(a);
				textField_1.setText(" ");
				textField_1.setText(textField_1.getText()+a);
			}
		});
		btnCos.setBounds(138, 138, 61, 23);
		frame.getContentPane().add(btnCos);
		
		JButton btnNewButton_1 = new JButton("x^y");
		btnNewButton_1.setBounds(10, 182, 57, 23);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				str1=textField_1.getText();
				 str2=btnNewButton_1.getText();
				textField_1.setText(" ");
			}
		});
		
		
		JButton btnNewButton_2 = new JButton("ln");
		btnNewButton_2.setBounds(71, 182, 61, 23);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				Double l=Math.log(Double.parseDouble(textField_1.getText()));
				textField_1.setText(" ");
				textField_1.setText(textField_1.getText()+l);
			}
		});
		
		
		JButton button_1 = new JButton("tan");
		button_1.setBounds(138, 182, 61, 23);
		frame.getContentPane().add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				f++;
				Double a=Math.tan(Double.parseDouble(textField_1.getText())*Math.PI/180);
				//Double b=Math.toDegrees(a);
				textField_1.setText(" ");
				textField_1.setText(textField_1.getText()+a);
			}
		});
		
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				Double a=Math.pow(Double.parseDouble(textField_1.getText()),2);
				textField_1.setText(" ");
				textField_1.setText(textField_1.getText()+a);
			}
		});
		btnX.setBounds(10, 216, 57, 23);
		frame.getContentPane().add(btnX);
		
		
		
		JButton btnNewButton_3 = new JButton("n!");
		btnNewButton_3.setBounds(71, 216, 61, 23);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f=1;
			  str1=textField_1.getText();
			  str2=btnNewButton_3.getText();
				float n=Float.parseFloat(str1);
				int fact=1;
				while(n>0)
				{
					fact=(int) (fact*n);
					n--;
				}
				String r6=String.valueOf(fact);
				//textField_1.setText(" ");
				textField_1.setText(r6);
			}
		});
		
		
		JButton btnSec = new JButton("sec");
		btnSec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				Double a=1/(Math.cos(Double.parseDouble(textField_1.getText())*Math.PI/180));
				textField_1.setText(" ");
				textField_1.setText(textField_1.getText()+a);
			}
		});
		btnSec.setBounds(138, 216, 61, 23);
		frame.getContentPane().add(btnSec);
		
		JButton button_2 = new JButton("7");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_1.setText(" ");	
					f=0;
				}
				textField_1.setText(textField_1.getText().concat(button_2.getText()));
			}
		});
		button_2.setBounds(209, 93, 52, 23);
		frame.getContentPane().add(button_2);
		
		
		JButton button_3 = new JButton("8");
		button_3.setBounds(271, 93, 51, 23);
		frame.getContentPane().add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_1.setText(" ");	
					f=0;
				}
				textField_1.setText(textField_1.getText().concat(button_3.getText()));
			}
		});
		
		
		
		JButton button_4 = new JButton("9");
		button_4.setBounds(330, 93, 46, 23);
		frame.getContentPane().add(button_4);
        button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_1.setText(" ");	
					f=0;
				}
				textField_1.setText(textField_1.getText().concat(button_4.getText()));
			}
		});
				
		
		
		JButton button_5 = new JButton("/");
		button_5.setBounds(385, 93, 49, 23);
		frame.getContentPane().add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 str1=textField_1.getText();
				 str2=button_5.getText();
				textField_1.setText(" ");
			}
		});
		
		
		
		JButton button_6 = new JButton("4");
		button_6.setBounds(209, 138, 52, 23);
		frame.getContentPane().add(button_6);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_1.setText(" ");	
					f=0;
				}
				textField_1.setText(textField_1.getText().concat(button_6.getText()));
			}
		});
		
		
		
		
		JButton button_7 = new JButton("5");
		button_7.setBounds(271, 138, 51, 23);
		frame.getContentPane().add(button_7);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_1.setText(" ");	
					f=0;
				}
				textField_1.setText(textField_1.getText().concat(button_7.getText()));
			}
		});
		
		
		
		
		JButton button_8 = new JButton("6");
		button_8.setBounds(330, 138, 46, 23);
		frame.getContentPane().add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_1.setText(" ");	
					f=0;
				}
				textField_1.setText(textField_1.getText().concat(button_8.getText()));

			}
		});
		
		
				
		JButton button_9 = new JButton("*");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 str1=textField_1.getText();
				 str2=button_9.getText();
				textField_1.setText(" ");
			}
		});
		button_9.setBounds(385, 138, 49, 23);
		frame.getContentPane().add(button_9);
		
		
		JButton button_10 = new JButton("1");
		button_10.setBounds(209, 182, 52, 23);
		frame.getContentPane().add(button_10);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_1.setText(" ");	
					f=0;
				}
				textField_1.setText(textField_1.getText().concat(button_10.getText()));
			}
		});
		
		
		JButton button_11 = new JButton("2");
		button_11.setBounds(271, 182, 51, 23);
		frame.getContentPane().add(button_11);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_1.setText(" ");	
					f=0;
				}
				textField_1.setText(textField_1.getText().concat(button_11.getText()));
			}
		});
		
		
		
		
		JButton button_12 = new JButton("3");
		button_12.setBounds(330, 182, 46, 23);
		frame.getContentPane().add(button_12);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_1.setText(" ");	
					f=0;
				}
				textField_1.setText(textField_1.getText().concat(button_12.getText()));
			}
			
		});
		
		
		JButton button_13 = new JButton("-");
		button_13.setBounds(385, 182, 49, 23);
		frame.getContentPane().add(button_13);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 str1=textField_1.getText();
				 str2=button_13.getText();
				//textField_1.setText(" ");
				
			}
		});
		
		
		JButton button_14 = new JButton("0");
		button_14.setBounds(209, 216, 52, 23);
		frame.getContentPane().add(button_14);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_1.setText(" ");	
					f=0;
				}
				
				textField_1.setText(textField_1.getText().concat(button_14.getText()));
			}
		});
		
		
		
		
		JButton button_15 = new JButton(".");
		button_15.setBounds(271, 216, 51, 23);
		frame.getContentPane().add(button_15);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_1.setText(" ");	
					f=0;
				}
				if(df==0)
				{
				textField_1.setText(textField_1.getText().concat(button_15.getText()));
                df=1;;
				}
				
			}
		});
		
		
		
		
		JButton button_16 = new JButton("=");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				String str3=textField_1.getText();
				textField_1.setText(" ");;
				float a=Float.parseFloat(str1);
				float b=Float.parseFloat(str3);
				if(str2.equals("+"))
				{
					float r1=a+b;
					String r2=String.valueOf(r1);
					textField_1.setText(r2);
				}
				if(str2.equals("-"))
				{
					float r3=a-b;
					String r4=String.valueOf(r3);
					textField_1.setText(r4);
				}
				if(str2.equals("*"))
				{
					float r5=a*b;
					String r6=String.valueOf(r5);
					textField_1.setText(r6);
				}
				if(str2.equals("/"))
				{
					float r7=a/b;
					String r8=String.valueOf(r7);
					textField_1.setText(r8);
				}
				if(str2.equals("%"))
				{
					float r9=a%b;
					String r10=String.valueOf(r9);
					textField_1.setText(r10);
				}
				if(str2.equals("x^y"))
				{
					//Double x=Double.parseDouble(str1);
					//Double y=Double.parseDouble(str3);
					double f=Math.pow(a,b);
					String r10=String.valueOf(f);
					textField_1.setText(r10);
				}
				
					
			}
		});
		button_16.setBounds(330, 216, 46, 23);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("+");
		button_17.setBounds(385, 216, 49, 23);
		frame.getContentPane().add(button_17);
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     str1=textField_1.getText();
				 str2=button_17.getText();
				textField_1.setText(" ");
			}
		});
		
	}

}
