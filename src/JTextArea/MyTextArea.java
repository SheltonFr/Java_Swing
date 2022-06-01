package JTextArea;

import java.awt.Container;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextArea;;

public class MyTextArea {
	public static void main(String[] args) {
		JFrame frame = new JFrame("JTextArea");
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(3);
		
		Container c = frame.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.YELLOW);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(100,100,400,200);
		c.add(textArea);
		
		textArea.setText("This is a text Area");
		textArea.setFont(new Font("Arial", Font.BOLD, 17));
		textArea.setLineWrap(true); //Quebra de linha automatica
		//textArea.setEditable(false);
		
		frame.setVisible(true);
	}

}
