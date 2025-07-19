import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form2 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3; 
		JPanel p1,p2;
		
	public Form2()
	{
		super(" Page-2 ");
		this.setSize(450,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(450,280));
		p1.setBackground(Color.black);
		p1.setLayout(null);
		
		l1 = new JLabel("Addition");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.BLUE);
		l1.setBounds(180,30,150,30);
		p1.add(l1);
		
		l2 = new JLabel("First Number");
		l2.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		l2.setForeground(Color.red);
		l2.setBounds(100,100,150,20);
		p1.add(l2);
		
		l3 = new JLabel("Second Number");
		l3.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		l3.setForeground(Color.red);
		l3.setBounds(100,150,150,20);
		p1.add(l3);
		
		t1 = new JTextField();
		t1.setBounds(220,100,100,25);
		p1.add(t1);

		t2 = new JTextField();
		t2.setBounds(220,150,100,25);
		p1.add(t2);
		
		b1 = new JButton("Add");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.green);
		b1.setBounds(180,220,100,25);
		b1.addActionListener(this);
		p1.add(b1);

		
		p2 = new JPanel();
		p2.setSize(new Dimension(450,100));
		p2.setBackground(Color.gray);
		p2.setLayout(null);
	    
		l4 = new JLabel();
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l4.setForeground(Color.white);
		l4.setBounds(180,300,150,20);
		p2.add(l4);
		
		b2 = new JButton("Exit");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.white);
		b2.setBackground(Color.green);
		b2.setBounds(330,320,80,30);
		b2.addActionListener(this);
		p2.add(b2);
		
		b3 = new JButton("Back");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.white);
		b3.setBackground(Color.green);
		b3.setBounds(80,320,80,30);
		b3.addActionListener(this);
		p2.add(b3);
		
		
        this.add(p1);		
        this.add(p2);
	}


		public void actionPerformed(ActionEvent ae)
		{
		   if(ae.getSource()==b1)
			{
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			int s= a+b;
			l4.setText("Result is : "+String.valueOf(s));
			}
			
			else if(ae.getSource()==b3)
			{
				Form1 f = new Form1();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				System.exit(0);
			}
		}


}














