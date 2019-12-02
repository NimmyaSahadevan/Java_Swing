import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class celtofar {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					celtofar window = new celtofar();
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
	public celtofar() {
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
		
		JLabel lblDegrees = new JLabel("Degrees");
		lblDegrees.setBounds(57, 33, 57, 28);
		frame.getContentPane().add(lblDegrees);
		
		textField = new JTextField();
		textField.setBounds(145, 33, 105, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(98, 116, 200, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnToCelsius = new JButton("To Celsius");
		btnToCelsius.setBounds(57, 199, 105, 35);
		frame.getContentPane().add(btnToCelsius);
		btnToCelsius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String c1=textField.getText();
				float c2=Float.parseFloat(c1);
				float f=(float)((c2+273.15));
				String str=String.valueOf(f);
				lblNewLabel.setText("Result = "+str);
			}
		});
		
		JButton btnToFahrenheit = new JButton("To Fahrenheit");
		btnToFahrenheit.setBounds(224, 199, 111, 29);
		frame.getContentPane().add(btnToFahrenheit);
		btnToFahrenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String c1=textField.getText();
				float c2=Float.parseFloat(c1);
				float f=(float)((1.8)*c2+32);
				String str=String.valueOf(f);
				lblNewLabel.setText("Result = "+str);	
			}
		});
		
	}

}
