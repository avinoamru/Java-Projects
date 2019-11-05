import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Application {

	private JFrame frame;
	private JTextField textField;

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
		int desktopWidth = 1920;
		int desktopHeight = 1080;
		
		frame = new JFrame();
		frame.setBounds(100, 100, 454, 714);
		frame.setBounds((desktopWidth / 2) - (frame.getWidth() / 2), (desktopHeight / 2) - frame.getHeight() / 2, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0,(frame.getHeight() / 100) * 20, frame.getWidth(), (frame.getHeight() / 100) * 80);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(4, 3, 0, 0));
		
		JButton button = new JButton("7");
		button.setSize(60, 60);
		panel.add(button);
		
		
		JButton button_1 = new JButton("8");
		button_1.setSize(button.getSize());
		panel.add(button_1);
		
		
		JButton button_2 = new JButton("9");
		panel.add(button_2);
		
		JButton button_14 = new JButton("/");
		panel.add(button_14);
		
		
		JButton button_3 = new JButton("4");
		panel.add(button_3);
		
		
		JButton button_4 = new JButton("5");
		panel.add(button_4);
		
		
		JButton button_5 = new JButton("6");
		panel.add(button_5);
		
		JButton button_12 = new JButton("*");
		panel.add(button_12);
		
		
		JButton button_6 = new JButton("1");
		panel.add(button_6);
		
		
		JButton button_7 = new JButton("2");
		panel.add(button_7);
		
		
		JButton button_8 = new JButton("3");
		panel.add(button_8);
		
		JButton button_13 = new JButton("-");
		panel.add(button_13);
		
		
		JButton button_9 = new JButton("=");
		panel.add(button_9);
		
		
		JButton button_10 = new JButton("0");
		panel.add(button_10);
		
		
		JButton button_11 = new JButton(".");
		panel.add(button_11);
		
		JButton button_15 = new JButton("+");
		panel.add(button_15);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 384, 93);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 384, 93);
		panel_1.add(textField);
		textField.setColumns(10);
		
		
		
	
		
		
		
		
	}
}
