package simpleCalculator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	
	private Container c;
	private JLabel label1, label2, result;
	private JTextField t1, t2;
	private JButton add, sub, mul, div;

	public MyFrame() {
		
		setTitle("Simple Calculator");
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(null);
		
		label1 = new JLabel("First number: ");
		label1.setBounds(10, 20,100,20);
		c.add(label1);
		
		t1 = new JTextField();
		t1.setBounds(120,20,100,20);
		c.add(t1);
		
		label2 = new JLabel("Second number: ");
		label2.setBounds(10, 50,100,20);
		c.add(label2);
		
		t2 = new JTextField();
		t2.setBounds(120,50,100,20);
		c.add(t2);
		
		add = new JButton("+");
		add.setBounds(10,80,50,30);
		c.add(add);
		
		sub = new JButton("-");
		sub.setBounds(70,80,50,30);
		c.add(sub);
		
		mul = new JButton("*");
		mul.setBounds(130,80,50,30);
		c.add(mul);
		
		div = new JButton("/");
		div.setBounds(190,80,50,30);
		c.add(div);
		
		result = new JLabel("Result: ");
		result.setBounds(10,120, 190,20);
		c.add(result);
		setVisible(true);
		
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			if(e.getSource() == add) {
				int r = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
				result.setText("Result : " + r);
			}
			
			if(e.getSource() == sub) {
				int r = Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText());
				result.setText("Result : " + r);	
			}
			
			if(e.getSource() == mul) {
				long r = Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText());
				result.setText("Result : " + r);	
			}
			
			if(e.getSource() == div) {
				double r = Double.parseDouble(t1.getText()) /  Double.parseDouble(t2.getText());
				result.setText("Result : " + String.format("%.2f", r));	
			}
			
		} catch(NumberFormatException ex) {
			result.setText("Invalido! Insira apenas numeros");
			
		} catch (ArithmeticException ex2) {
			result.setText("Invalido! Divisao por Zero!");
		}
		
	}
}
