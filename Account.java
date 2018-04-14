import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class Account implements ActionListener,MouseListener,FocusListener,HyperlinkListener
{
    JFrame jf;
    JLabel l[]=new JLabel[7];
	JTextField tf1;
	JPasswordField tf2;
	JButton b[]=new JButton[6];
	public Account() throws IOException, URISyntaxException 
	{
		jf=new JFrame("NJ");
		//jf.setContentPane(new JLabel(new ImageIcon("img\\Aq1.jpg")));
		jf.getContentPane().setBackground(Color.WHITE);
		jf.setLayout(null);
		l[0]=new JLabel();
		jf.add(l[1]=new JLabel("Welcome Back, Login Here"));
		l[1].setBounds(5,10,500,30);
		l[1].setFont(new Font("Times New Roman",Font.BOLD,30));
		l[1].setForeground(Color.BLACK);
		
		jf.add(l[2]=new JLabel("___________________________________________________"));
		l[2].setBounds(5,30,360,20);
		l[2].setForeground(Color.BLACK);
		b[0]=new JButton();
		jf.add(b[1]=new JButton(new ImageIcon("img\\login2.jpg")));
		b[1].setBounds(5,55,350,45);
		b[1].setOpaque(false);
		b[1].setContentAreaFilled(false);
		b[1].setBorderPainted(false);
		//b[1].setFont(new Font("Times New Roman",Font.BOLD,30));
//		b[1].setForeground(Color.white);
//		b[1].setBackground(Color.BLUE);
		jf.add(tf1=new JTextField());
		tf1.setBounds(120,130,200,30);
		tf1.setForeground(Color.BLACK);
		tf1.setText("Enter your Email id");
		tf1.setOpaque(false);
		jf.add(tf2=new JPasswordField());
		tf2.setBounds(120, 180, 200,30);
		tf2.setOpaque(false);
		 // tf2.setText("dfkdjk");
		  tf2.setEchoChar('*');
		  
		jf.add(l[3]=new JLabel("Email id:"));
		l[3].setBounds(5,130,150,30);
		l[3].setFont(new Font("Times New Roman",Font.BOLD,25));
		l[3].setForeground(Color.BLACK);
		jf.add(l[4]=new JLabel("Password:"));
		l[4].setBounds(5,180,150,30);
		l[4].setFont(new Font("Times New Roman",Font.BOLD,25));
		l[4].setForeground(Color.BLACK);
		jf.add(b[2]= new JButton("Login with us"));
		b[2].setFont(new Font("Times New Roman",Font.PLAIN,30));
		b[2].setForeground(Color.BLACK);
		b[2].setBackground(Color.RED);
		b[2].setBounds(45,210,350,40);
		b[2].setOpaque(false);
		b[2].setContentAreaFilled(false);
		b[2].setBorderPainted(false);
		
		jf.add(b[3]=new JButton(new ImageIcon("img\\glogin.png")));
		b[3].setBounds(5,250,350,40);
		b[3].setOpaque(false);
		b[3].setContentAreaFilled(false);
		b[3].setBorderPainted(false);
		
		jf.add(b[4]=new JButton("Forget Password"));
		b[4].setFont(new Font("Times New Roman",Font.BOLD,20));
		b[4].setForeground(Color.red);
		b[4].setBounds(-20,290,180,30);
		b[4].setOpaque(false);
		b[4].setContentAreaFilled(false);
		b[4].setBorderPainted(false);
		jf.add(l[5]=new JLabel("_______________________________"));
		l[5].setBounds(-20,300,280,20);
		l[5].setForeground(Color.BLACK);
		
		jf.add(l[6]=new JLabel("Don't have Account with us?"));
		l[6].setBounds(0,330,240,30);
		l[6].setFont(new Font("Times New Roman",Font.BOLD,20));
		l[6].setForeground(Color.BLACK);
		
		jf.add(b[5]=new JButton("Sign Up"));
		b[5].setFont(new Font("Times New Roman",Font.BOLD,20));
		b[5].setForeground(Color.red);
		b[5].setBounds(-20,360,100,30);
		b[5].setOpaque(false);
		b[5].setContentAreaFilled(false);
		b[5].setBorderPainted(false);
//		Desktop d=Desktop.getDesktop();
//		d.browse(new URI("https://www.facebook.com"));
		for(int i=0;i<b.length;i++)
		{
			b[i].addActionListener(this);
		}
		b[4].addActionListener(this);
		
	
		for(int i=0;i<b.length;i++)
		{
			b[i].addMouseListener(this);
		}
		b[4].addMouseListener(this);
		for(int i=0;i<b.length;i++)
		{
			l[i].addMouseListener(this);
		}
		l[5].addMouseListener(this);
		tf1.addFocusListener(this);
		
		jf.setResizable(false);
		jf.setVisible(true);
		jf.setSize(500,430);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
		
	}

	public static void main(String[] args) throws IOException, URISyntaxException 
	{
		new Account();

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0)
	{
		 Cursor s=new Cursor(Cursor.HAND_CURSOR);
		 b[1].setCursor(new Cursor(Cursor.HAND_CURSOR));
		 b[2].setCursor(new Cursor(Cursor.HAND_CURSOR));
		 b[3].setCursor(new Cursor(Cursor.HAND_CURSOR));
		 b[4].setCursor(new Cursor(Cursor.HAND_CURSOR));
		 b[5].setCursor(new Cursor(Cursor.HAND_CURSOR));
		 l[1].setCursor(new Cursor(Cursor.HAND_CURSOR));
		
	}

	@Override
	public void mouseExited(MouseEvent arg0)
	{
		// Cursor s=new Cursor(Cursor.WAIT_CURSOR);
		// l[1].setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
	}

	@Override
	public void mousePressed(MouseEvent arg0)
	{
		 Cursor s=new Cursor(Cursor.WAIT_CURSOR);
		 l[1].setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==b[1])
		  {
			  //jf.dispose();//invisible
			  //new Facebook();
			try {
				java.awt.Desktop.getDesktop().browse(new URI("https://www.facebook.com"));
			} catch (IOException | URISyntaxException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		if(ae.getSource()==b[2])
		  {
			  //jf.dispose();//invisible
			  new Starting();
		  }
		if(ae.getSource()==b[3])
		  {
			  //jf.dispose();//invisible
			 // new  Google();
			try {
				java.awt.Desktop.getDesktop().browse(new URI("https://mail.google.com"));
			} catch (IOException | URISyntaxException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		if(ae.getSource()==b[5])
		{
			//jf.dispose();
			new Signup();
		}
		
		
	}

	@Override
	public void focusGained(FocusEvent arg0) 
	{
		tf1.setText("");
		
	}

	@Override
	public void focusLost(FocusEvent arg0)
	{
		tf1.setText("Enter your Email id");
		
	}

	@Override
	public void hyperlinkUpdate(HyperlinkEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

}
