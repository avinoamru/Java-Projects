package paint;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Canvas;

public class Application {

	private JFrame frame;

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
		
		JPanel header_panel = new JPanel();
		header_panel.setBounds(0, 0, 784, 75);
		
		frame.getContentPane().add(header_panel);
		
		JPanel draw_panel = new JPanel();
		draw_panel.setBackground(Color.WHITE);
		draw_panel.setBounds(10, 76, 764, 474);
		frame.getContentPane().add(draw_panel);
		draw_panel.setLayout(null);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(0, 0, draw_panel.getWidth(), draw_panel.getHeight());
		draw_panel.add(canvas);
	}
}
