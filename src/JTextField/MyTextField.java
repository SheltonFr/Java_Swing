package JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;


public class MyTextField {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("JTextField");
		
		frame.setBounds(100,100,1000,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();
		c.setLayout(null);
		
		JTextField t1 = new JTextField();
		t1.setBounds(100,50,130,30);
		t1.setText("JTextFiled");
		Font font = new Font("Arial",Font.BOLD,25);
		t1.setFont(font);
		t1.setForeground(Color.green);
		t1.setBackground(Color.yellow);
		
		t1.setEditable(false); //permitir edicao do texto
		c.add(t1);
				
		frame.setVisible(true);
		
	}
}
