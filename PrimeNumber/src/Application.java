import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class Application {

	private JFrame frame;
	private JTextField InputNumber;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
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
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 150, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		InputNumber = new JTextField();
		InputNumber.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		InputNumber.setBounds(165, 27, 223, 39);
		panel.add(InputNumber);
		InputNumber.setColumns(10);
		
		JLabel lblEnterNumber = new JLabel("Enter Number:");
		lblEnterNumber.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblEnterNumber.setBounds(10, 25, 159, 43);
		panel.add(lblEnterNumber);
		
		JTextArea resultArea = new JTextArea();
		resultArea.setEditable(false);
		resultArea.setBounds(31, 86, 538, 451);
		panel.add(resultArea);
		
		JButton btnCheckPrime = new JButton("Check Prime");
		btnCheckPrime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = InputNumber.getText();
				int num = Integer.parseInt(inputNum);
				
				boolean flag = false;
				
				for (int i = 2; i < num; i++) {
					
					if (num % i == 0) {
						flag=true;
						resultArea.setText(resultArea.getText() + "\n" + num + " is divisable by " + i);
					}
				}
				
				if (flag == false) {
					resultArea.setText("\n" + num + " is a prime number");
				}
				
				else {
					resultArea.setText(resultArea.getText() + "\n\n So, " + num + " is not a prime number");
				}
		
				
			}
		});
		btnCheckPrime.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnCheckPrime.setBounds(615, 23, 140, 50);
		panel.add(btnCheckPrime);
		
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputNumber.setText("");
				resultArea.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnReset.setBounds(615, 487, 140, 50);
		panel.add(btnReset);
		
		JButton btnPrimeRange = new JButton("Newbutton");
		btnPrimeRange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPrimeRange.setBounds(615, 88, 140, 59);
		panel.add(btnPrimeRange);
	}
}
