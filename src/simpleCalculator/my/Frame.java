package simpleCalculator.my;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame implements ActionListener {
	
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9, b0;
	private Container c;
	
	Frame(){
		setTitle("Minha calculadora");
		setSize(340,650);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		c = this.getContentPane();
		c.setLayout(null);
		
		b1 = new JButton("1"); 	b1.setBounds(20,200,50,30);
		
		b2 = new JButton("2");	b2.setBounds(80,200,50,30);
		
		b3 = new JButton("3");	b3.setBounds(140,200,50,30);
		
		b4 = new JButton("4");	b4.setBounds(200,200,50,30);
		
		b5 = new JButton("5");	b5.setBounds(260,200,50,30);
		
		b6 = new JButton("6");	b6.setBounds(20, 240,50,30);
		
		b7 = new JButton("7");	b7.setBounds(80, 240,50,30);
		
		b8 = new JButton("8");	b8.setBounds(140, 240,50,30);
		
		b9 = new JButton("9");	b9.setBounds(200, 240,50,30);
		
		b0 = new JButton("0");	b0.setBounds(260, 240,50,30);
		c.add(b1); c.add(b2); c.add(b3);
		c.add(b4); c.add(b5); c.add(b6);
		c.add(b7); c.add(b8); c.add(b9);
		c.add(b0);
		
		
		
		
		setVisible(true);
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
