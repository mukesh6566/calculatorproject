package pack1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
class Calculator implements ActionListener
{
	JFrame frame;
	JButton b1,b2,b3,b4;
	JTextField t1;
	String temp;
	public Calculator()
	{
		frame=new JFrame("Calculator");///frame is our container class
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("+");
		b4=new JButton("=");
		t1=new JTextField();
		t1.setBounds(1,1,399,50);
		b1.setBounds(5,60,50,40);
		b3.setBounds(70,60,50,40);
		b2.setBounds(130,60,50,40);
		b4.setBounds(65,120,50,40);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		frame.add(t1);
		frame.add(b1);
		frame.add(b3);
		frame.add(b2);
		frame.add(b4);
		
		
		frame.setBounds(50,50,400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		////String temp = null;
		if(e.getSource()==b1)
		{
		
			t1.setText(t1.getText().concat("1"));
		  
		}
		else if(e.getSource()==b2)
		{
		  t1.setText(t1.getText().concat("2"));
		}
		else if(e.getSource()==b3)
		{
			temp=t1.getText();
			t1.setText("");
		}
		else if(e.getSource()==b4)
		{
			int sum=Integer.parseInt(temp)+Integer.parseInt(t1.getText());
			t1.setText(""+sum);
		}
		
	}
}

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();

	}

}
