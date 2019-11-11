package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.UIManager;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Application {

	private JFrame frame;
	private JTextField result_field;

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

	
	
	    
	double firstNum;
	double secondNum;
	double result;
	
	String operation;
    String answer;
    /**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Basic Calculator");
		
		JPanel main_panel = new JPanel();
		main_panel.setBounds(0, 0, 386, 563);
		frame.getContentPane().add(main_panel);
		main_panel.setLayout(null);
		
		JPanel buttons_panel = new JPanel();
		buttons_panel.setBackground(UIManager.getColor("Panel.background"));
		buttons_panel.setBounds(0, 239, 386, 326);
		main_panel.add(buttons_panel);
		buttons_panel.setLayout(new GridLayout(4, 4, 5, 5));
		
		
		result_field = new JTextField();
		result_field.setBackground(Color.WHITE);
		result_field.setEditable(false);
		result_field.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		result_field.setBounds(0, 22, 386, 80);
		main_panel.add(result_field);
		result_field.setColumns(10);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result_field.setText(result_field.getText() + ("7"));
			}
		});
		button_7.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		buttons_panel.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setFont(button_7.getFont());
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result_field.setText(result_field.getText() + ("8"));
			}
		});
		buttons_panel.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setFont(button_7.getFont());
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				result_field.setText(result_field.getText() + ("9"));
			}
		});
		buttons_panel.add(button_9);
		
		JButton button_div = new JButton("/");
		button_div.setFont(button_7.getFont());
		button_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 firstNum = Double.parseDouble(result_field.getText());
		          result_field.setText("");  
		            operation = "/";
			}
		});
		buttons_panel.add(button_div);
		
		JButton button_4 = new JButton("4");
		button_4.setFont(button_7.getFont());
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result_field.setText(result_field.getText() + ("4"));
			}
		});
		buttons_panel.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.setFont(button_7.getFont());
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			result_field.setText(result_field.getText() + ("5"));
			}
		});
		buttons_panel.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.setFont(button_7.getFont());
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result_field.setText(result_field.getText() + ("6"));
			}
		});
		buttons_panel.add(button_6);
		
		JButton button_multiply = new JButton("*");
		button_multiply.setFont(button_7.getFont());
		button_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(result_field.getText());
				result_field.setText("");
	            operation = "*";
			}
		});
		buttons_panel.add(button_multiply);
		
		JButton button_1 = new JButton("1");
		button_1.setFont(button_7.getFont());
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result_field.setText(result_field.getText() + ("1"));
			}
		});
		buttons_panel.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setFont(button_7.getFont());
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result_field.setText(result_field.getText() + ("2"));
			}
		});
		buttons_panel.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.setFont(button_7.getFont());
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result_field.setText(result_field.getText() + ("3"));
			}
		});
		buttons_panel.add(button_3);
		
		JButton button_sub = new JButton("-");
		button_sub.setFont(button_7.getFont());
		button_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				firstNum = Double.parseDouble(result_field.getText());
				result_field.setText("");
	            operation = "-";
			}
		});
		buttons_panel.add(button_sub);
		
		JButton button_clear = new JButton("C");
		button_clear.setFont(button_7.getFont());
		button_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result_field.setText("");
			}
		});
		buttons_panel.add(button_clear);
		
		JButton button_0 = new JButton("0");
		button_0.setFont(button_7.getFont());
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result_field.setText(result_field.getText() + ("0"));
			}
		});
		buttons_panel.add(button_0);
		
	    JButton button_equal = new JButton("=");
		button_equal.setFont(button_7.getFont());
		button_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNum = Double.parseDouble(result_field.getText());
				
	            if (operation == "+") {
	               result  = firstNum + secondNum;
	            	answer = ("" + result);
	            	result_field.setText(answer);
	            }
	            
	            else if ( operation == "-") {
	                result = firstNum - secondNum;
	                answer = ("" + result);
	                result_field.setText(answer);
	            }
	            else if ( operation == "*") {
	                result = firstNum * secondNum;
	                answer = ("" + result);
	                result_field.setText(answer);
	            }
	            else if ( operation == "/") {
	                result = firstNum / secondNum;
	            	answer = ("" + result);
	            	result_field.setText(answer);
	            }
	            
	            
	           
				
			}
		});
		buttons_panel.add(button_equal);
		
		JButton button_add = new JButton("+");
		button_add.setFont(button_7.getFont());
		button_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(result_field.getText());
	            result_field.setText("");
	            operation = "+";
			}
		});
		buttons_panel.add(button_add);
		
		
		
		
	}
}
