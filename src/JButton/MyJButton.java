package JButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyJButton {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("My JButton");
		frame.setBounds(100,100,1000,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();
		c.setLayout(null);
		
		JButton btn = new JButton("Click Me");
		btn.setSize(120,30);
		btn.setLocation(100,100);
		
		btn.setFont(new Font("Arial",Font.PLAIN, 20));
		btn.setText("mybutton");
		btn.setForeground(Color.RED);
		btn.setBackground(Color.yellow);
		
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		btn.setEnabled(true); //habilitar ou desabilitar botao
		c.add(btn);
		
		
		
		
		frame.setVisible(true);
		
	}
}
