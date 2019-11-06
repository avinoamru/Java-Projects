import java.awt.Color;

import javax.swing.JPanel;

public class Card extends JPanel {

	/**
	 * Create the panel.
	 */
	
	
	public Card() {
		this.setBackground(Color.black);
		this.setSize(64, 89);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds( 6, 9, 40, 60);
		panel.setBackground(Color.white);
		add(panel);
		panel.setLayout(null);

	}

}
