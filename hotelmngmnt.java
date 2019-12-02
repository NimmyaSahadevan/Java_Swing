import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTree;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class hotelmngmnt {

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
	public String s1,s2,s3,s4,s5,s99,s88,s77;
	public float b,m,cb,tea,coff,ju;
	 public float total,x,del;
	 public int f=0,df=0;
	 public String s11,s12;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotelmngmnt window = new hotelmngmnt();
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
	public hotelmngmnt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1198, 749);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHotelManagementSystems = new JLabel("Hotel Management  Systems");
		lblHotelManagementSystems.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblHotelManagementSystems.setBounds(129, 11, 561, 52);
		frame.getContentPane().add(lblHotelManagementSystems);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(24, 118, 507, 292);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setBounds(38, 31, 118, 23);
		lblChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblChickenBurger);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setBounds(38, 77, 154, 23);
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblChickenBurgerMeal);
		
		JLabel lblCheese = new JLabel("Cheese  Burger");
		lblCheese.setBounds(38, 126, 134, 23);
		lblCheese.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblCheese);
		
		textField = new JTextField();
		textField.setBounds(257, 29, 154, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(257, 75, 154, 30);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(26, 181, 1, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(38, 160, 373, 11);
		panel.add(separator_1);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDrink.setBounds(48, 181, 46, 14);
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblQty.setBounds(232, 177, 46, 23);
		panel.add(lblQty);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<SELECT>", "TEA", "COFFEE", "JUICE"}));
		comboBox.setBounds(38, 214, 106, 23);
		panel.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setBounds(232, 211, 106, 26);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JRadioButton rdbtnHomeDelivery = new JRadioButton("Home Delivery");
		rdbtnHomeDelivery.setBounds(38, 251, 109, 23);
		panel.add(rdbtnHomeDelivery);
		
		JRadioButton rdbtnTax = new JRadioButton("Tax");
		rdbtnTax.setBounds(229, 251, 109, 23);
		panel.add(rdbtnTax);
		
		textField_11 = new JTextField();
		textField_11.setBounds(257, 116, 154, 30);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(541, 118, 309, 293);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCurrencyConverter.setBounds(49, 24, 239, 27);
		panel_1.add(lblCurrencyConverter);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<SELECT>", "INR[Indian Rupee]", "EUR[Euro]"}));
		comboBox_1.setBounds(60, 77, 202, 33);
		panel_1.add(comboBox_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(60, 138, 202, 33);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			s88=(String)comboBox_1.getSelectedItem();
				s77=textField_9.getText();
				
				
				if(s88.equals("INR[Indian Rupee]"))
				{
					double a=Double.parseDouble(s77);
					double b=(a*71.76);
					s99=String.valueOf(b);
					textField_3.setText(s99);
				}
				if(s88.equals("EUR[Euro]"))
				{
					double a=Double.parseDouble(s77);
					double b=(a*0.90);
					s99=String.valueOf(b);
					textField_3.setText(s99);
				}
			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConvert.setBounds(49, 222, 89, 27);
		panel_1.add(btnConvert);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				comboBox_1.setSelectedIndex(0);
				textField_3.setText(null);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClose.setBounds(199, 222, 89, 27);
		panel_1.add(btnClose);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(24, 421, 507, 156);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost Of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCostOfDrinks.setBounds(34, 25, 103, 14);
		panel_2.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeal = new JLabel("Cost Of Meal");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCostOfMeal.setBounds(34, 62, 113, 28);
		panel_2.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost Of Delivery");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCostOfDelivery.setBounds(34, 104, 123, 24);
		panel_2.add(lblCostOfDelivery);
		
		textField_4 = new JTextField();
		textField_4.setBounds(237, 20, 132, 28);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(237, 64, 132, 28);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(237, 104, 132, 28);
		panel_2.add(textField_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBounds(541, 422, 309, 155);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTax.setBounds(28, 22, 46, 14);
		panel_3.add(lblTax);
		
		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubtotal.setBounds(28, 57, 98, 24);
		panel_3.add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotal.setBounds(28, 103, 98, 24);
		panel_3.add(lblTotal);
		
		textField_7 = new JTextField();
		textField_7.setBounds(163, 11, 114, 30);
		panel_3.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(163, 52, 114, 30);
		panel_3.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(163, 93, 114, 30);
		panel_3.add(textField_9);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_4.setBounds(24, 601, 1133, 79);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 
				s1=textField.getText();
				s2=textField_1.getText();
				s3=textField_11.getText();
				s5=(String)comboBox.getSelectedItem();
	             String s6=textField_2.getText();
				b=100;
				m=200;
				cb=150;
				
				
				float a=Float.parseFloat(s1);
				float f=Float.parseFloat(s2);
				float c=Float.parseFloat(s3);
				float v=Float.parseFloat(s6);
				if(s5.equals("TEA"))
				
				{
					
					 x=10*v;
				  String tp=String.valueOf(x);
					textField_4.setText(tp);
					
					
				}
				
				if(s5.equals("COFFEE"))
					
				{
					
				 x=10*v;
				  String tp=String.valueOf(x);
					textField_4.setText(tp);
					
					
				}
				
                if(s5.equals("JUICE"))
					
				{
					
					 x=20*v;
				 String  tp=String.valueOf(x);
					textField_4.setText(tp);
					
					
				}
				
                float k=a*b;
				float g=f*m;
				float o=c*cb;
				
				total=k+g+o;
				String str=String.valueOf(total);
				textField_5.setText(str);
				
				
				
				
				if(rdbtnHomeDelivery.isSelected())
				{
				
					 del=90;
					String deli=String.valueOf(del);
				    textField_6.setText(deli);
				}
				
			if(rdbtnTax.isSelected())
			{
				//String nb=textField_7.getText();
				float nx=100;
				String nb=String.valueOf(nx);
				textField_7.setText(nb);
	      	    float sub=total+del+x;
	      	    String subb=String.valueOf(sub);
	      	    textField_8.setText(subb);
				float tt=sub+nx;
				 String to=String.valueOf(tt);
				 textField_9.setText(to);
			}
			else
			{
				
			//	float nx=Float.parseFloat(nb);
				textField_7.setText("0.0");
	      	    float sub=total+del+x;
	      	     String subb=String.valueOf(sub);
	      	   textField_8.setText(subb);
			//	float tt=sub;
	      	 textField_9.setText(subb);
				
			}
			if((rdbtnHomeDelivery.isSelected())&&(rdbtnTax.isSelected()))
			{
				del=90;
				String deli=String.valueOf(del);
			    textField_6.setText(deli);
				
			    String nb=textField_7.getText();
				float nx=Float.parseFloat(nb);
	      	    float sub=total+del+x;
	      	    String subb=String.valueOf(sub);
	      	    textField_8.setText(subb);
				float tt=sub+nx;
				 String to=String.valueOf(tt);
				 textField_9.setText(to);
				
			}
			
			}
	});
	
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(97, 24, 117, 34);
		panel_4.add(btnNewButton);
		
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_5.setBounds(860, 118, 312, 444);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 292, 422);
		panel_5.add(tabbedPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane.addTab("Calculator", null, layeredPane, null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 0, 276, 394);
		layeredPane.add(panel_6);
		panel_6.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_6.setForeground(Color.LIGHT_GRAY);
		panel_6.setLayout(null);
		
		
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		tabbedPane.addTab("Receipt", null, layeredPane_1, null);
		layeredPane_1.setLayout(null);
		
		
			JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 287, 394);
		layeredPane_1.add(textArea);
		
		
		
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s23=(String)comboBox.getSelectedItem();
				String s24=(String)comboBox_1.getSelectedItem();
			
				 textArea.append("\tRECEIPT"+"\n"+ "========================================\n"+ "Chicken Burger:\t"+textField.getText()+"\n"+"Chicken Burger Meal\t"
		         + textField_1.getText()+ "\n"+"Cheese Burger:\t\t"+textField_11.getText()+ "\n"+s23+"\t\t"+textField_2.getText()+"\nCost Of Drinks:\t\t" + textField_4.getText()+ "\n"+"Cost Of Meal:\t\t" + textField_5.getText()+ "\n"+"Cost Of Delivery:\t"
		         + textField_6.getText()+ "\n========================================\n"
					+ "\nTax:\t\t" + textField_7.getText()+ "\nSub total:\t\t" + textField_8.getText()+ "\nTotal:\t\t" + textField_9.getText()+"\n\n"+s24+"\t\t"+textField_3.getText()
					+"\n========================================\n"+"\n\tTHANK YOU...\t");
	
				
				
				
				
			}
		});
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReceipt.setBounds(312, 24, 117, 34);
		panel_4.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_11.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				comboBox.setSelectedIndex(0);
				rdbtnHomeDelivery.setSelected(false);
				rdbtnTax.setSelected(false);
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReset.setBounds(529, 24, 117, 34);
		panel_4.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setBounds(729, 24, 117, 34);
		panel_4.add(btnExit);
		
		
		
		textField_10 = new JTextField();
		textField_10.setBounds(21, 23, 215, 50);
		panel_6.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("B");
		btnNewButton_1.setBounds(10, 94, 56, 44);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(btnNewButton_1);
		
		JButton button_1 = new JButton("7");
		button_1.setBounds(10, 138, 56, 44);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(f==1)
				{
					textField_10.setText(" ");	
					f=0;
				}
				textField_10.setText(textField_10.getText().concat(button_1.getText()));
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.setBounds(10, 182, 56, 44);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(f==1)
				{
					textField_10.setText(" ");	
					f=0;
				}
				textField_10.setText(textField_10.getText().concat(button_2.getText()));
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(button_2);
		
		JButton button_3 = new JButton("1");
		button_3.setBounds(10, 226, 56, 44);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(f==1)
				{
					textField_10.setText(" ");	
					f=0;
				}
				textField_10.setText(textField_10.getText().concat(button_3.getText()));
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(button_3);
		
		JButton button_4 = new JButton("0");
		button_4.setBounds(10, 270, 56, 44);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_10.setText(" ");	
					f=0;
				}
				textField_10.setText(textField_10.getText().concat(button_4.getText()));
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(button_4);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(67, 94, 56, 44);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_10.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(btnC);
		
		JButton button_6 = new JButton("8");
		button_6.setBounds(67, 138, 56, 44);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(f==1)
				{
					textField_10.setText(" ");	
					f=0;
				}
				textField_10.setText(textField_10.getText().concat(button_6.getText()));
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(button_6);
		
		JButton button_7 = new JButton("5");
		button_7.setBounds(67, 182, 56, 44);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(f==1)
				{
					textField_10.setText(" ");	
					f=0;
				}
				textField_10.setText(textField_10.getText().concat(button_7.getText()));
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(button_7);
		
		JButton button_8 = new JButton("2");
		button_8.setBounds(67, 226, 56, 44);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(f==1)
				{
					textField_10.setText(" ");	
					f=0;
				}
				textField_10.setText(textField_10.getText().concat(button_8.getText()));
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(button_8);
		
		JButton button_9 = new JButton(".");
		button_9.setBounds(67, 270, 56, 44);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					textField_10.setText(" ");	
					f=0;
				}
				if(df==0)
				{
				textField_10.setText(textField_10.getText().concat(button_9.getText()));
				df=1;
				}
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_6.add(button_9);
		
		JButton button_10 = new JButton("...");
		button_10.setBounds(125, 94, 56, 44);
		button_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(button_10);
		
		JButton button_11 = new JButton("9");
		button_11.setBounds(125, 138, 56, 44);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(f==1)
				{
					textField_10.setText(" ");	
					f=0;
				}
				textField_10.setText(textField_10.getText().concat(button_11.getText()));
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(button_11);
		
		JButton button_12 = new JButton("6");
		button_12.setBounds(125, 182, 56, 44);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(f==1)
				{
					textField_10.setText(" ");	
					f=0;
				}
				textField_10.setText(textField_10.getText().concat(button_12.getText()));
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.setBounds(125, 226, 56, 44);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(f==1)
				{
					textField_10.setText(" ");	
					f=0;
				}
				textField_10.setText(textField_10.getText().concat(button_13.getText()));
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(button_13);
		
		JButton button_14 = new JButton("...");
		button_14.setBounds(125, 270, 56, 44);
		button_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(button_14);
		
		JButton button_15 = new JButton("-");
		button_15.setBounds(180, 138, 56, 44);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				 s11=textField_10.getText();
				 s12=button_15.getText();
				 textField_10.setText(" ");
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(button_15);
		
		JButton button_16 = new JButton("*");
		button_16.setBounds(180, 182, 56, 44);
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 s11=textField_10.getText();
				 s12=button_16.getText();
				textField_10.setText(" ");
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(button_16);
		
		JButton button_17 = new JButton("/");
		button_17.setBounds(179, 226, 56, 44);
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 s11=textField_10.getText();
				 s12=button_17.getText();
				textField_10.setText(" ");
			}
		});
		button_17.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(button_17);
		
		JButton button_18 = new JButton("=");
		button_18.setBounds(179, 270, 56, 44);
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				f++;
				String str3=textField_10.getText();
				textField_10.setText(" ");;
				float a=Float.parseFloat(s11);
				float b=Float.parseFloat(str3);
				if(s12.equals("+"))
				{
					float r1=a+b;
					String r2=String.valueOf(r1);
					textField_10.setText(r2);
				}
				if(s12.equals("-"))
				{
					float r3=a-b;
					String r4=String.valueOf(r3);
					textField_10.setText(r4);
				}
				if(s12.equals("*"))
				{
					float r5=a*b;
					String r6=String.valueOf(r5);
					textField_10.setText(r6);
				}
				if(s12.equals("/"))
				{
					float r7=a/b;
					String r8=String.valueOf(r7);
					textField_10.setText(r8);
				}
				
				
				
				
				
				
			}
		});
		button_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(button_18);
		
		JButton button_19 = new JButton("+");
		button_19.setBounds(179, 94, 56, 44);
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				 s11=textField_10.getText();
				 s12=button_19.getText();
				textField_10.setText(" ");
				
				
			}
		});
		button_19.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(button_19);
		
		
		
		
	}
		}