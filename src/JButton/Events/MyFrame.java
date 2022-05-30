package JButton.Events;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	
	Container c;
	JButton btn;
	
	MyFrame(){
		c = this.getContentPane();
		c.setLayout(null);
		
		btn = new JButton("Click me");
		btn.setBounds(100,100,100,50);
		c.add(btn);
		
		btn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		c.setBackground(Color.YELLOW);
	}
}
