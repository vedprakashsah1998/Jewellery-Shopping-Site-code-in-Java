import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Facebook implements ActionListener,MouseListener
{
	JFrame jf;
	JLabel l1,l2,l3;
	JButton b1,b2,b3,b4;

	public Facebook() 
	{
		jf=new JFrame("Log in to Facebook-Google Cgrome");
		jf.setContentPane(new JLabel(new ImageIcon("img\\fb11.jpg")));
		jf.add(b1=new JButton(""));
		b1.setBounds(5,5,150,70);
		b1.setOpaque(false);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		jf.add(b2=new JButton(""));
		b2.setBounds(130,5,150,70);
		b2.setOpaque(false);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		jf.add(b3=new JButton(""));
		b3.setBounds(200,320,150,70);
		b3.setOpaque(false);
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(false);
		jf.add(b4=new JButton(""));
		b4.setBounds(200,410,150,70);
		b4.setOpaque(false);
		b4.setContentAreaFilled(false);
		b4.setBorderPainted(false);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		b1.addMouseListener(this);
		b2.addMouseListener(this);
		b3.addMouseListener(this);
		b4.addMouseListener(this);
		
		jf.setVisible(true);
		jf.setSize(590,500);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
		
		
		
	}

	public static void main(String[] args) 
	{
		new Facebook();

	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==b3)
		{
			new Starting();
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) 
	{
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
		
	}

	@Override
	public void mouseExited(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
