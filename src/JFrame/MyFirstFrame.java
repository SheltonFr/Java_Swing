package JFrame;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFirstFrame {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("MyFirstFrame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(700,500);
		//frame.setLocation(100,50);
		frame.setBounds(500, 100, 700, 500);
		frame.setResizable(false);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\Pictures\\Saved Pictures\\scale.jfif");
		frame.setIconImage(icon.getImage());
		
		Container c = frame.getContentPane();
		//Color color = new Color(255,0,0);
		c.setBackground(Color.RED);
		
		
		
		
		frame.setVisible(true);
		
		
		
	}
}
