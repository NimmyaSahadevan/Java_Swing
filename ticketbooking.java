import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class ticketbooking {

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
	private JTable table;
	private JTable table_1;
	public String name,tax,s;
	public int c=1000;
	public int sd,ac,sl,fir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticketbooking window = new ticketbooking();
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
	public ticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 923, 799);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(250, 25, 344, 55);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("Ticket Booking");
		lblTicketBooking.setBounds(68, 7, 208, 34);
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 28));
		panel_1.add(lblTicketBooking);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(41, 120, 80, 29);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(143, 120, 162, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(21, 181, 356, 2);
		frame.getContentPane().add(separator);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnStandard.setBounds(26, 207, 109, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnSingleTicket.setBounds(134, 209, 132, 23);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnAdult.setBounds(268, 209, 109, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnFirstClass.setBounds(21, 268, 109, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnAc = new JRadioButton("AC");
		rdbtnAc.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnAc.setBounds(132, 270, 52, 23);
		frame.getContentPane().add(rdbtnAc);
		
		JRadioButton rdbtnSleeper = new JRadioButton("Sleeper");
		rdbtnSleeper.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnSleeper.setBounds(185, 270, 94, 23);
		frame.getContentPane().add(rdbtnSleeper);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnChild.setBounds(281, 270, 96, 23);
		frame.getContentPane().add(rdbtnChild);
		
		ButtonGroup G1=new ButtonGroup();
		G1.add(rdbtnStandard);
		G1.add(rdbtnFirstClass);
		//G1.add(rdbtnAc);
		G1.add(rdbtnSleeper);
		
		
		ButtonGroup G2=new ButtonGroup();
		G2.add(rdbtnSingleTicket);
		G2.add(rdbtnAdult);
		G2.add(rdbtnChild);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<SELECT>", "Kollam", "Kochi", "Kottayam", "Trivandram", ""}));
		comboBox.setBounds(21, 310, 114, 29);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<SELECT>", "Kollam", "Kochi", "Kottayam", "Trivandram"}));
		comboBox_1.setBounds(157, 310, 109, 29);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"<SELECT>", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_2.setBounds(289, 310, 80, 29);
		frame.getContentPane().add(comboBox_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(21, 355, 356, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTax.setBounds(21, 371, 46, 19);
		frame.getContentPane().add(lblTax);
		
		textField_1 = new JTextField();
		textField_1.setBounds(114, 368, 121, 29);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSubTotal.setBounds(21, 412, 80, 14);
		frame.getContentPane().add(lblSubTotal);
		
		textField_2 = new JTextField();
		textField_2.setBounds(114, 411, 121, 29);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTotal.setBounds(21, 454, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		textField_3 = new JTextField();
		textField_3.setBounds(114, 453, 121, 29);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(21, 506, 356, 2);
		frame.getContentPane().add(separator_2);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			name=textField.getText();
			tax=textField_1.getText();
			float tx=Float.parseFloat(tax);
			
			String no=(String)comboBox_2.getSelectedItem();
			float n=Float.parseFloat(no);
			String sta=(String)comboBox.getSelectedItem();
			String des=(String)comboBox_1.getSelectedItem();
			
			if(sta.equals("Kollam")&&des.contentEquals("Kochi"))
			{
				sd=60;
				ac=150;
				fir=80;
				sl=90;
				
			}
			
			if(sta.equals("Kollam")&&des.contentEquals("Kottayam"))
			{
				sd=50;
				ac=200;
				fir=70;
				sl=80;
				
			}
			if(sta.equals("Kochi")&&des.contentEquals("Kollam"))
			{
				sd=60;
				ac=150;
				fir=80;
				sl=90;	
				
			}
			if(sta.equals("Kochi")&&des.contentEquals("Kottayam"))
			{
				sd=60;
				ac=110;
				fir=80;
				sl=100;
				
			}
			if(sta.equals("Kottayam")&&des.contentEquals("Kochi"))
			{
				sd=60;
				ac=110;
				fir=80;
				sl=100;
				
			}
			if(sta.equals("Kottayam")&&des.contentEquals("Kollam"))
			{
				sd=50;
				ac=200;
				fir=70;
				sl=80;
				
			}
			
			
			
			
			
			
			
			if(rdbtnStandard.isSelected())
			{
				float stotal=(float)(n*sd);
				String str=String.valueOf(stotal);
				textField_2.setText(str);
				float total=(float)tx+stotal;
				s=String.valueOf(total);
				textField_3.setText(s);
			}
			
			
			if(rdbtnFirstClass.isSelected())
			{
				float stotal=(float)(n*fir);
				String str=String.valueOf(stotal);
				textField_2.setText(str);
				float total=(float)tx+stotal;
				 s=String.valueOf(total);
				textField_3.setText(s);
			}
			
			if(rdbtnAc.isSelected())
			{
				float stotal=(float)(n*ac);
				String str=String.valueOf(stotal);
				textField_2.setText(str);
				float total=(float)tx+stotal;
			   s=String.valueOf(total);
				textField_3.setText(s);
			}
			if(rdbtnSleeper.isSelected())
			{
				float stotal=(float)(n*sl);
				String str=String.valueOf(stotal);
				textField_2.setText(str);
				float total=(float)tx+stotal;
			    s=String.valueOf(total);
				textField_3.setText(s);
			}
			String from=(String)comboBox.getSelectedItem();
			String to=(String)comboBox_1.getSelectedItem();
			String hi=String.valueOf(c);
			textField_4.setText(name);
			textField_5.setText(from);
			textField_6.setText(to);
			//textField_7.setText(name);
			//textField_8.setText(name);
			textField_9.setText(hi);
			textField_10.setText(s);
			textField_11.setText("Any");
			
			LocalDate m=java.time.LocalDate.now();
			String q=String.valueOf(m);
			textField_7.setText(q);
			
			LocalTime k=java.time.LocalTime.now();
			String j=String.valueOf(k);
			textField_8.setText(j);
			c++;
			
			}
		});
		btnTotal.setBackground(new Color(211, 211, 211));
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTotal.setBounds(32, 532, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
				comboBox_2.setSelectedIndex(0);
				
			    G1.clearSelection();
				G2.clearSelection();
				
				rdbtnAc.setSelected(false);
				
			}
		});
		btnReset.setForeground(new Color(0, 0, 0));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(146, 532, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(259, 532, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ticket Detail", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 139)));
		panel.setBounds(396, 142, 489, 400);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName_1.setBounds(32, 41, 93, 22);
		panel.add(lblName_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(134, 41, 171, 36);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFrom.setBounds(32, 118, 93, 22);
		panel.add(lblFrom);
		
		textField_5 = new JTextField();
		textField_5.setBounds(105, 113, 153, 36);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTo.setBounds(49, 187, 64, 14);
		panel.add(lblTo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(105, 175, 153, 36);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDate.setBounds(32, 246, 46, 14);
		panel.add(lblDate);
		
		textField_7 = new JTextField();
		textField_7.setBounds(105, 236, 124, 29);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTime.setBounds(32, 297, 46, 14);
		panel.add(lblTime);
		
		textField_8 = new JTextField();
		textField_8.setBounds(105, 292, 124, 29);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTicketNo.setBounds(341, 95, 98, 22);
		panel.add(lblTicketNo);
		
		textField_9 = new JTextField();
		textField_9.setBounds(337, 128, 142, 32);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPrice.setBounds(341, 171, 69, 26);
		panel.add(lblPrice);
		
		textField_10 = new JTextField();
		textField_10.setBounds(341, 199, 124, 29);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRoute.setBounds(341, 246, 68, 14);
		panel.add(lblRoute);
		
		textField_11 = new JTextField();
		textField_11.setBounds(341, 271, 124, 29);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String s81;	
			String s1=textField_4.getText();	
			String s2=textField_9.getText();
			String s3=textField_5.getText();
			String s4=textField_6.getText();
			String s8=(String)comboBox_2.getSelectedItem();
			String s5=textField_7.getText();
			String s6=textField_8.getText();
			String s7=textField_10.getText();
			
			if(rdbtnAc.isSelected())
			{
				 s81="Ac";
			}
			else
			{
				s81="Non Ac";
			}
		
			String[] row= {s1,s2,s3,s4,s8,s5,s6,s81,s7};
			DefaultTableModel model=(DefaultTableModel) table_1.getModel();
			model.addRow(row);
			
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConfirm.setBounds(200, 353, 105, 23);
		panel.add(btnConfirm);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(new Color(0, 0, 0));
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(379, 181, 2, 387);
		frame.getContentPane().add(separator_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 255));
		panel_2.setBounds(21, 602, 864, 100);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setBounds(432, 5, 0, 0);
		panel_2.add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No of seats", "Time", "Date", "AC/Non AC", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table_1.setBounds(10, 11, 844, 54);
		panel_2.add(table_1);
	}
}
