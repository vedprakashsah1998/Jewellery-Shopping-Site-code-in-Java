import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Privacy 
{
	JFrame jf;
	JLabel l1,l2;

	public Privacy() 
	{
		jf=new JFrame("Privacy ,-Help and Terms and condition");
		jf.getContentPane().setBackground(Color.WHITE);
		jf.add(l1=new JLabel(new ImageIcon("img\\privacy.jpg")));
		l1.setBounds(-40,20,400,70);
		
		jf.add(l2=new JLabel(new ImageIcon("img\\privacy1.jpg")));
		l2.setBounds(30,-60,1000,1000);
		
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setSize(2000,2000);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		new Privacy();

	}

}
