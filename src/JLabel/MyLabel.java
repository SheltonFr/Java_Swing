package JLabel;

import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyLabel {

	public static void main(String[] args) {

		JFrame frame = new JFrame("MyLabel");
		frame.setBounds(500, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		Container c = frame.getContentPane();
		c.setLayout(null);

		JLabel label = new JLabel("Username");
		label.setBounds(50,50,200,30);
		//label.setText("Password"); caso nao se use no construtor
		
		Font font = new Font("Arial", Font.PLAIN, 30);
		c.add(label);
		label.setFont(font);
		
		
	}

}
