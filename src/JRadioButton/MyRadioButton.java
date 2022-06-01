package JRadioButton;

import java.awt.Container;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class MyRadioButton {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setBounds(100,100,700,500);
		f.setDefaultCloseOperation(3);
		
		Container c = f.getContentPane();
		c.setLayout(null);
		
		JRadioButton radio1 = new JRadioButton("Male");
		radio1.setBounds(100,50,100,20);
		c.add(radio1);
		
		JRadioButton radio2 = new JRadioButton("Female");
		radio2.setBounds(200,50,100,20);
		c.add(radio2);
		
		ButtonGroup gender = new ButtonGroup();
		gender.add(radio1);
		gender.add(radio2);
		
		radio1.setSelected(true);
		
		Font font = new Font("Arial", Font.BOLD,16);
		radio1.setFont(font);
		radio2.setFont(font);
		
		JRadioButton gen = new JRadioButton("General");
		JRadioButton obc = new JRadioButton("obc");
		JRadioButton sc = new JRadioButton("sc");
		JRadioButton st = new JRadioButton("st");
		
		gen.setBounds(100,100,100,20);
		obc.setBounds(200,100,100,20);
		sc.setBounds(300,100,100,20);
		st.setBounds(400,100,100,20);
		
		ButtonGroup caste = new ButtonGroup();
		caste.add(obc);
		caste.add(gen);
		caste.add(st);
		caste.add(sc);
		
		c.add(gen);
		c.add(obc);
		c.add(sc);
		c.add(st);
		
		gen.setSelected(true);
		
		obc.setEnabled(false);
		
		
		
		f.setVisible(true);
	}
}
