package JPasswordFiled;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class MyJPasswordField {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("My JPasswordField");
		frame.setBounds(100, 100, 400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();
		c.setLayout(null);
		
		JPasswordField pass = new JPasswordField();
		pass.setBounds(60,60,120,30);
		pass.setFont(new Font("Arial",Font.PLAIN, 25));
		pass.setEchoChar('*');
		c.add(pass);
		
		
		frame.setVisible(true);
		
	}

}