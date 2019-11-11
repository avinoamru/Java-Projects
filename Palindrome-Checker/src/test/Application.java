package test;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;

public class Application {

	private JFrame frame;
	private JTextField input_field;

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
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel main_panel = new JPanel();
		main_panel.setBounds(0, 0, 786, 563);
		main_panel.setBackground(UIManager.getColor("Panel.background"));
		frame.getContentPane().add(main_panel);
		main_panel.setLayout(null);
		
		input_field = new JTextField();
		input_field.setBounds(196, 52, 265, 38);
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
		lblEnterAString.setBounds(39, 52, 143, 38);
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
		btnCheckPalindrome.setBounds(600, 50, 158, 40);
		main_panel.add(btnCheckPalindrome);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input_field.setText("");
				result_area.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnReset.setBounds(651, 486, 107, 52);
		main_panel.add(btnReset);
		
		
	}
}
