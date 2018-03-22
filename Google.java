import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Google implements ActionListener,MouseListener
{
	JFrame jf;
	JLabel l1,l2,l3;
	JButton b1,b2,b3,b4,b5,b6,b7;
	public Google() 
	{
		jf=new JFrame("Sign in-Google Accounts-Google Chrome");
		jf.getContentPane().setBackground(Color.WHITE);
		jf.add(l1=new JLabel(new ImageIcon("img\\google1.jpg")));
		l1.setBounds(25,30,200,70);
		
		jf.add(l2=new JLabel("Choose an account"));
		l2.setBounds(25,100,250,70);
		l2.setFont(new Font("Times New Roman",Font.PLAIN,30));
		l2.setForeground(Color.black);
		
		jf.add(l3=new JLabel("to continue to"));
		l3.setBounds(25,130,250,70);
		l3.setFont(new Font("Times New Roman",Font.PLAIN,20));
		l3.setForeground(Color.black);
		
		jf.add(b1=new JButton("nsj.com"));
		b1.setBounds(120,130,100,70);
		b1.setFont(new Font("Times New Roman",Font.PLAIN,20));
		b1.setForeground(Color.blue);
		b1.setOpaque(false);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		
		jf.add(b2=new JButton("VP  Ved Prakash"));
		b2.setBounds(-100,100,400,250);
		b2.setFont(new Font("Times New Roman",Font.PLAIN,20));
		b2.setForeground(Color.black);
		b2.setOpaque(false);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		
		jf.add(b3=new JButton("AS Abhimanyu Shah"));
		b3.setBounds(-100,130,400,250);
		b3.setFont(new Font("Times New Roman",Font.PLAIN,20));
		b3.setForeground(Color.black);
		b3.setOpaque(false);
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(false);
		
		jf.add(b4=new JButton("Use another account"));
		b4.setBounds(-100,180,400,250);
		b4.setFont(new Font("Times New Roman",Font.PLAIN,20));
		b4.setForeground(Color.gray);
		b4.setOpaque(false);
		b4.setContentAreaFilled(false);
		b4.setBorderPainted(false);
		
		String[] languages={"English(United States)","English(India)","Hindi","Russian","Chinese","Tamil","Kannad","French","English(United Kingdem)"};   
		
	    JComboBox cb=new JComboBox(languages); 
	    cb.setSelectedIndex(0);
	   
	    
	    //JScrollPane jsp=new JScrollPane(cb=new JComboBox());
	    cb.setBounds(5, 425,150,30); 
	    cb.setOpaque(false);
		//cb.setContentAreaFilled(false);
		//cb.setBorderPainted(false);

	   // jf.add(jsp);
	    jf.add(cb);
	    
	    jf.add(b5=new JButton("Help"));
		b5.setBounds(250,425,100,30);
		b5.setFont(new Font("Times New Roman",Font.PLAIN,18));
		b5.setForeground(Color.gray);
		b5.setOpaque(false);
		b5.setContentAreaFilled(false);
		b5.setBorderPainted(false);
		
		jf.add(b6=new JButton("Privacy"));
		b6.setBounds(310,425,100,30);
		b6.setFont(new Font("Times New Roman",Font.PLAIN,18));
		b6.setForeground(Color.gray);
		b6.setOpaque(false);
		b6.setContentAreaFilled(false);
		b6.setBorderPainted(false);
		
		jf.add(b7=new JButton("Terms"));
		b7.setBounds(380,425,100,30);
		b7.setFont(new Font("Times New Roman",Font.PLAIN,18));
		b7.setForeground(Color.gray);
		b7.setOpaque(false);
		b7.setContentAreaFilled(false);
		b7.setBorderPainted(false);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		
		b1.addMouseListener(this);
		b2.addMouseListener(this);
		b3.addMouseListener(this);
		b4.addMouseListener(this);
		b5.addMouseListener(this);
		b6.addMouseListener(this);
		b7.addMouseListener(this);
		cb.addActionListener(this);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setSize(500,500);
		jf.setLocationRelativeTo(null);
		jf.setIconImage(Toolkit.getDefaultToolkit().getImage("img\\googl.jpg"));
		jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
		
	}

	public static void main(String[] args) 
	{
		new Google();

	}

	@Override
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		  {
			  jf.dispose();//invisible
			  new  Starting();
		  }
		if(ae.getSource()==b2)
		  {
			  jf.dispose();//invisible
			  new  Starting();
		  }
		if(ae.getSource()==b3)
		  {
			  jf.dispose();//invisible
			  new  Privacy();
		  }
		if(ae.getSource()==b5)
		  {
			  jf.dispose();//invisible
			  new  Privacy();
		  }
		if(ae.getSource()==b6)
		  {
			  jf.dispose();//invisible
			  new  Privacy();
		  }
		if(ae.getSource()==b7)
		  {
			  jf.dispose();//invisible
			  new  Privacy();
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
		 b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 b7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
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

}
