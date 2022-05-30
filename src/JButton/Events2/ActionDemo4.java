package JButton.Events2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionDemo4 {
	
	public static Container c;
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("ActionDemo4");
		f.setBounds(100,100,700,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(3);
		
		c = f.getContentPane();
		c.setLayout(null);
		
		JButton red = new JButton("RED");
		JButton yellow = new JButton("YELLOW");
		JButton green = new JButton("GREEN");
		
		red.setBounds(100,100,100,50);
		yellow.setBounds(250,100,100,50);
		green.setBounds(400,100,100,50);
		
		c.add(red);
		c.add(yellow);
		c.add(green);
		
		red.addActionListener(new RedClass());
		yellow.addActionListener(new YellowClass());
		green.addActionListener(new GreenClass());
		
	}
}


class RedClass implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ActionDemo4.c.setBackground(Color.red);
		System.out.println("Apertou o botao vermelho");
	}
}

class YellowClass implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ActionDemo4.c.setBackground(Color.YELLOW);
		System.out.println("Apertou o botao Amarelo");
	}
}

class GreenClass implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ActionDemo4.c.setBackground(Color.GREEN);
		System.out.println("Apertou o botao Verde");
	}
}