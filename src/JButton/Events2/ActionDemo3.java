package JButton.Events2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionDemo3 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("ActionDemo 3");
		f.setBounds(100,100,700,500);
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
		
		Container c = f.getContentPane();
		c.setLayout(null);
		
		JButton btn = new JButton("Click me");
		btn.setBounds(100,100,100,50);
		c.add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				c.setBackground(Color.red);
			}
		});
		
		
	}
}
