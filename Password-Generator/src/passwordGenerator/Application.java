
  package passwordGenerator;
  
  import java.awt.EventQueue;
  import javax.swing.JFrame; 
  import javax.swing.JPanel; 
  import java.awt.Color;
  import javax.swing.JLabel; 
  import java.awt.Font; 
  import javax.swing.JCheckBox;
  import javax.swing.JTextField;
  import java.awt.TextArea; 
  import javax.swing.JButton;
 
  
  public class Application {
  
  private JFrame frame; private JTextField textField; private JTextField
  textField_1; private JTextField textField_2;
  
 	  
	 

  
  
  
  public static void main(String[] args) {
	  EventQueue.invokeLater(new
  Runnable() { public void run() { try { Application window = new
  Application(); window.frame.setVisible(true); } catch (Exception e) {
  e.printStackTrace(); } } }); }
  
 
//	  Create the application.


  
  
  
  public Application() { 
	  initialize(); 
	  }
 
 
//	  Initialize the contents of the frame.
	 
		  private void initialize() {
		  
		  
		  
		  
		  frame = new JFrame(); frame.setBounds(200, 200, 800, 600);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.getContentPane().setLayout(null);
		  
		  JPanel panel = new JPanel(); panel.setBackground(Color.WHITE);
		  panel.setBounds(10, 115, 584, 438); frame.getContentPane().add(panel);
		  panel.setLayout(null);
		  
		  TextArea textArea = new TextArea(); textArea.setBackground(Color.WHITE);
		  textArea.setForeground(Color.GRAY); textArea.setFont(new
		  Font("Times New Roman", Font.PLAIN, 16)); textArea.setEditable(false);
		  textArea.setBounds(0, 0, panel.getWidth(), panel.getHeight());
		  panel.add(textArea);
		  
		  JLabel lblSelectComponents = new JLabel("Select components:");
		  lblSelectComponents.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		  lblSelectComponents.setBounds(26, 10, 164, 52);
		  frame.getContentPane().add(lblSelectComponents);
		  
		  JCheckBox chckbxUppercaseLetters = new JCheckBox("Uppercase Letters");
		  chckbxUppercaseLetters.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		  chckbxUppercaseLetters.setBounds(204, lblSelectComponents.getY() + 15, 138, 21);
		  frame.getContentPane().add(chckbxUppercaseLetters);
		  
		  
		  JCheckBox checkBox = new JCheckBox("Lowercase Letters");
		  checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		  checkBox.setBounds(344, chckbxUppercaseLetters.getY(), 138, 21); frame.getContentPane().add(checkBox);
		  
		  JCheckBox checkBox_1 = new JCheckBox("Numbers");
		  checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		  checkBox_1.setBounds(483, chckbxUppercaseLetters.getY(), 107, 21); frame.getContentPane().add(checkBox_1);
		  
		  JButton btnGenerate = new JButton("Generate");
		   btnGenerate.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		   btnGenerate.setBackground(Color.LIGHT_GRAY);
		   btnGenerate.setForeground(Color.BLACK); btnGenerate.setBounds(617, 27, 138, 80);
		  
		  
		  frame.getContentPane().add(btnGenerate);
		  
		  JLabel lblLength = new JLabel("Min Length:"); lblLength.setFont(new
		  Font("Times New Roman", Font.PLAIN, 16)); lblLength.setBounds(10, 72, 81,
		  21); frame.getContentPane().add(lblLength);
		  
		  textField = new JTextField(); textField.setBounds(94, 72, 57, 19);
		  frame.getContentPane().add(textField); textField.setColumns(10);
		  
		  JLabel lblMaxLength = new JLabel("Max Length:"); lblMaxLength.setFont(new
		  Font("Times New Roman", Font.PLAIN, 16)); lblMaxLength.setBounds(185, 72, 90,
		  21); frame.getContentPane().add(lblMaxLength);
		  
		  textField_1 = new JTextField(); textField_1.setColumns(10);
		  textField_1.setBounds(285, 74, 57, 19);
		  frame.getContentPane().add(textField_1);
		  
		  JLabel label = new JLabel("Num of Passwords:"); label.setFont(new
		  Font("Times New Roman", Font.PLAIN, 16)); label.setBounds(353, 69, 129, 26);
		  frame.getContentPane().add(label);
		  
		  textField_2 = new JTextField(); textField_2.setColumns(10);
		  textField_2.setBounds(492, 74, 57, 19);
		  frame.getContentPane().add(textField_2); } }
		 