package JLabel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;

public class MyLabel {

	public static void main(String[] args) {

		JFrame frame = new JFrame("MyLabel");
		frame.setBounds(500, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		Container c = frame.getContentPane();

		JLabel label = new JLabel("Usarname");
		c.add(label);
	}

}
