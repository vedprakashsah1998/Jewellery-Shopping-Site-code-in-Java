import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Signup implements ActionListener,MouseListener,FocusListener
{

	JFrame jf;
    JLabel l[]=new JLabel[8];
	JTextField tf1,tf2,tf3,tf4;
	JPasswordField tf5,tf6;
	JButton b1,b2;
	JCheckBox c1;
	public Signup() 
	{
		jf=new JFrame("NJ");
		jf.setLayout(null);
		l[0]=new JLabel();
		jf.add(l[1]=new JLabel(new ImageIcon("img\\Signup.jpg")));
		l[1].setBounds(-55,-5,720,610);
		jf.getContentPane().setBackground(Color.BLACK);
		jf.add(l[2]=new JLabel("First Name"));
		l[2].setBounds(605,0,200,50);
		l[2].setFont(new Font("Times New Roman",Font.PLAIN,30));
		l[2].setForeground(Color.WHITE);
		
		jf.add(l[3]=new JLabel("Last Name"));
		l[3].setBounds(890,0,200,50);
		l[3].setFont(new Font("Times New Roman",Font.PLAIN,30));
		l[3].setForeground(Color.WHITE);
		
		jf.add(tf1=new JTextField());
		tf1.setBounds(605,40,165,35);
		tf1.setForeground(Color.WHITE);
		tf1.setText("First");
		tf1.setOpaque(false);
		tf1.setFont(new Font("Times New Roman",Font.PLAIN,20) );
		
//		tf1.setContentAreaFilled(false);
//		tf1.setBorderPainted(false);
		
		jf.add(tf2=new JTextField());
		tf2.setBounds(890,40,165,35);
		tf2.setForeground(Color.WHITE);
		tf2.setText("Last");
		tf2.setOpaque(false);
		tf2.setFont(new Font("Times New Roman",Font.PLAIN,20) );
		
		jf.add(l[4]=new JLabel("Enter your Email Id"));
		l[4].setBounds(720,80,250,50);
		l[4].setFont(new Font("Times New Roman",Font.PLAIN,30));
		l[4].setForeground(Color.WHITE);
		
		jf.add(tf3=new JTextField());
		tf3.setBounds(610,130,450,35);
		tf3.setForeground(Color.WHITE);
		tf3.setText("Email id");
		tf3.setOpaque(false);
		tf3.setFont(new Font("Times New Roman",Font.PLAIN,20));
		
		jf.add(l[4]=new JLabel("Mobile Nmuber :"));
		l[4].setBounds(608,180,200,50);
		l[4].setFont(new Font("Times New Roman",Font.PLAIN,25));
		l[4].setForeground(Color.WHITE);
		
		jf.add(tf4=new JTextField());
		tf4.setBounds(790,190,200,35);
		tf4.setForeground(Color.WHITE);
		tf4.setText("Mobile No");
		tf4.setOpaque(false);
		tf4.setFont(new Font("Times New Roman",Font.PLAIN,20));
		
		jf.add(l[5]=new JLabel("Enter Your Password :"));
		l[5].setBounds(608,230,199,50);
		l[5].setFont(new Font("Times New Roman",Font.PLAIN,22));
		l[5].setForeground(Color.WHITE);
		jf.add(tf5=new JPasswordField());
		tf5.setBounds(820, 240, 200,30);
		 tf5.setOpaque(false);
		jf.add(tf5=new JPasswordField());
		 // tf5.setText("dfkdjk");
		 tf5.setForeground(Color.white);
		  tf5.setEchoChar('*');
		  tf5.setFont(new Font("Times New Roman",Font.PLAIN,20));
		 
		  jf.add(l[6]=new JLabel("Confirm your Password :"));
			l[6].setBounds(608,280,250,50);
			l[6].setFont(new Font("Times New Roman",Font.PLAIN,22));
			l[6].setForeground(Color.WHITE);
			jf.add(tf6=new JPasswordField());
			tf6.setBounds(840, 290, 200,30);
			 tf6.setOpaque(false);
			jf.add(tf6=new JPasswordField());
			 // tf6.setText("dfkdjk");
			 tf6.setForeground(Color.white);
			  tf6.setEchoChar('*');
			  tf6.setFont(new Font("Times New Roman",Font.PLAIN,20));
			  
			  jf.add(c1=new JCheckBox("I agree the terms and condition"));
			  c1.setBounds(605,330,280,30);
			  c1.setOpaque(false);
			  c1.setFont(new Font("Times New Roman",Font.PLAIN,20));
			  c1.setForeground(Color.WHITE);
			  
			  jf.add(b1=new JButton(new ImageIcon("img\\buuton.jpg")));
			  b1.setBounds(700,370,300,40);
			  b1.setOpaque(false);
			  b1.setContentAreaFilled(false);
			  b1.setBorderPainted(false);
			  jf.add(l[7]=new JLabel("Already have an account ?"));
			  l[7].setBounds(640,420,350,50);
			  l[7].setFont(new Font("Times New Roman",Font.PLAIN,18));
			  l[7].setForeground(Color.WHITE);
			  jf.add(b2=new JButton("Login now"));
			  b2.setFont(new Font("Times New Roman",Font.PLAIN,18));
			  b2.setForeground(Color.WHITE);
			  b2.setBounds(790,420,200,50);
			  b2.setOpaque(false);
			  b2.setContentAreaFilled(false);
			  b2.setBorderPainted(false);
			  
			  
			  
			  b1.addActionListener(this);
			  b1.addMouseListener(this);
			  b2.addActionListener(this);
			  b2.addMouseListener(this);
			  tf1.addFocusListener(this);
			  tf2.addFocusListener(this);
			  tf3.addFocusListener(this);
			  tf4.addFocusListener(this);
			  
		jf.setVisible(true);
		jf.setSize(1100,640);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		new Signup();

	}

	@Override
	public void focusGained(FocusEvent ae)
	{
		if(ae.getSource()==tf1)
		{	
			tf1.setText("");
		}
		if(ae.getSource()==tf2)
		{
			tf2.setText("");
		}
		if(ae.getSource()==tf3)
		{
			tf3.setText("");
		}
		if(ae.getSource()==tf4)
		{	
			tf4.setText("");
		}
	}

	@Override
	public void focusLost(FocusEvent ae)
	{
		if(ae.getSource()==tf1)
		{
			tf1.setText("First");
		}
		if(ae.getSource()==tf2)
		{
			tf2.setText("Last");
		}
		if(ae.getSource()==tf3)
		{	
			tf3.setText("Email id");
		}
		if(ae.getSource()==tf4)
		{
			tf4.setText("Mobile No");
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0)
	{
		 Cursor s=new Cursor(Cursor.HAND_CURSOR);
		 b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		  {
			  //jf.dispose();//invisible
			  new Starting();
		  }
		if(ae.getSource()==b2)
		  {
			  //jf.dispose();//invisible
			  new Account();
		  }
		
	}

}
