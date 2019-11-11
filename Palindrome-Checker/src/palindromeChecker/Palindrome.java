package palindromeChecker;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Palindrome {

	private JFrame frame;
	private JTextField input_field;
	private JTextField pal_length;
	private JTextField numOfPal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Palindrome window = new Palindrome();
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
	public Palindrome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel main_panel = new JPanel();
		main_panel.setBounds(0, 0, 786, 563);
		main_panel.setBackground(UIManager.getColor("Panel.background"));
		frame.getContentPane().add(main_panel);
		main_panel.setLayout(null);
		
		input_field = new JTextField();
		input_field.setBounds(163, 13, 232, 38);
		main_panel.add(input_field);
		input_field.setColumns(10);
		
		TextArea result_area = new TextArea();
		result_area.setForeground(Color.BLACK);
		result_area.setBackground(Color.WHITE);
		result_area.setEditable(false);
		result_area.setBounds(39, 147, 538, 374);
		main_panel.add(result_area);
		
		JLabel lblEnterAString = new JLabel("Enter a String:");
		lblEnterAString.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblEnterAString.setBounds(10, 9, 143, 38);
		main_panel.add(lblEnterAString);
		
		JButton btnCheckPalindrome = new JButton("Check \r\nPalindrome");
		btnCheckPalindrome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String input =input_field.getText();
			String reverse ="";
			
			for(int i = input.length() - 1; i >= 0; i--)
	        {
	            reverse = reverse + input.charAt(i);
	            
	        }
			
			if (input.equalsIgnoreCase(reverse)) {
				result_area.setText(" \n The inputed string " + input + " is a palindrome.");
			}
			else {
				result_area.setText(" The inputed string is not a palindrome.\n\n The inputed string is " + input + ", and the reversed string is " + reverse + ".");
			}
				
				
				
			}
		});
		btnCheckPalindrome.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnCheckPalindrome.setBounds(419, 11, 158, 40);
		main_panel.add(btnCheckPalindrome);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pal_length.setText("");
				numOfPal.setText("");
				input_field.setText("");
				result_area.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnReset.setBounds(651, 486, 107, 52);
		main_panel.add(btnReset);
		
		JLabel lbl_length = new JLabel("Wanted Length:");
		lbl_length.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbl_length.setBounds(10, 77, 123, 38);
		main_panel.add(lbl_length);
		
		pal_length = new JTextField();
		pal_length.setColumns(10);
		pal_length.setBounds(143, 79, 86, 38);
		main_panel.add(pal_length);
		
		numOfPal = new JTextField();
		numOfPal.setColumns(10);
		numOfPal.setBounds(432, 79, 91, 38);
		main_panel.add(numOfPal);
		
		JButton gen_pal = new JButton("Generate \r\nPalindrome");
		gen_pal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		gen_pal.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		gen_pal.setBounds(582, 77, 176, 40);
		main_panel.add(gen_pal);
		
		JLabel label = new JLabel("Num of Palindromes:");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label.setBounds(254, 77, 168, 38);
		main_panel.add(label);
		
		
	}
}
