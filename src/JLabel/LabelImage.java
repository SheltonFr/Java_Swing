package JLabel;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelImage {

	
	public static void main(String[] args) {

		JFrame frame = new JFrame("MyLabel");
		frame.setBounds(500, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();
		c.setLayout(null);

		ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\Pictures\\Tecno\\MyAlbums\\Mom\\Mom.CR2");
		JLabel label = new JLabel("text", icon, JLabel.LEFT);
		label.setBounds(0,100,500,100);

		
		c.add(label);
		
		
		frame.setVisible(true);
	}
}
