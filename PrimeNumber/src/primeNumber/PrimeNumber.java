package primeNumber;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PrimeNumber {

	private JFrame frame;
	private JTextField firstNum;
	private JTextField secondNum;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeNumber window = new PrimeNumber();
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
	public PrimeNumber() {
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
		
		firstNum = new JTextField();
		firstNum.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		firstNum.setBounds(165, 27, 98, 39);
		panel.add(firstNum);
		firstNum.setColumns(10);
		
		JLabel lblFirstNum = new JLabel("Enter 1st Number:");
		lblFirstNum.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblFirstNum.setBounds(10, 25, 159, 43);
		panel.add(lblFirstNum);
		
		JTextArea resultArea = new JTextArea();
		resultArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		resultArea.setEditable(false);
		resultArea.setBounds(31, 86, 538, 451);
		panel.add(resultArea);
		
		JButton btnCheckPrimes = new JButton("Check Primes");
		btnCheckPrimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input_firstNum = firstNum.getText();
				String input_secondNum = secondNum.getText();
				
				int fNum = Integer.parseInt(input_firstNum);
				int sNum = Integer.parseInt(input_secondNum);
				
				resultArea.setText("\n The prime numbers between " + fNum + " and " + sNum + "are: ");
				
				while (fNum < sNum) {
					boolean flag = false;
					
					for (int i = 2; i <= fNum/2; i++) {
						
						if (fNum % i == 0) {
							
							flag = true;
							break;
						}
					}
					if (!flag) {
						
						System.out.print(fNum + " ");
						resultArea.setText(resultArea.getText() + fNum + " ");
						
						++fNum;
					}
				}
				
				
		
				
			}
		});
		btnCheckPrimes.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnCheckPrimes.setBounds(615, 341, 140, 50);
		panel.add(btnCheckPrimes);
		
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum.setText("");
				secondNum.setText("");
				resultArea.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnReset.setBounds(615, 487, 140, 50);
		panel.add(btnReset);
		
		secondNum = new JTextField();
		secondNum.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		secondNum.setColumns(10);
		secondNum.setBounds(462, 27, 98, 39);
		panel.add(secondNum);
		
		JLabel lblSecondNum = new JLabel("Enter 2nd Number:");
		lblSecondNum.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSecondNum.setBounds(293, 27, 159, 43);
		panel.add(lblSecondNum);
	}
}