import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.*;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;

public class checkbox {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkbox window = new checkbox();
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
	public checkbox() {
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(157, 177, 205, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxC = new JCheckBox("c++");
		chckbxC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxC.setBounds(157, 71, 97, 23);
		frame.getContentPane().add(chckbxC);
		chckbxC.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblNewLabel.setText("C++ "+(e.getStateChange()==1?"checked":"unchecked"));	
				
			}
		});
		
		
		JCheckBox chckbxJava = new JCheckBox("Java");
		chckbxJava.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxJava.setBounds(157, 110, 97, 23);
		frame.getContentPane().add(chckbxJava);
		chckbxJava.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblNewLabel.setText("Java "+(e.getStateChange()==1?"checked":"unchecked"));	
				
			}
		});
		
	}
}
