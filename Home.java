import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
public class Home
{
	static JFrame jf;
	static JProgressBar jp;	
	 Home() 
	 {	 
	  jf=new JFrame("NJ");
	  jf.setUndecorated(true);
	  jf.setLayout(null);
	  jf.setContentPane(new JLabel(new ImageIcon("img\\Home.jpg")));
      jf.add(jp=new JProgressBar());
      jp.setForeground(Color.WHITE);
	  jp.setBounds(5, 570, 270, 10);     
      jp.setStringPainted(true);	
      jp.setOpaque(false);
      //jp.setContentAreaFilled(false);
      jp.setBorderPainted(false);   
      jf.setResizable(false);
	  jf.setSize(645,600);
      jf.setVisible(true);
	  jf.setDefaultCloseOperation(3);
	  jf.setLocationRelativeTo(null);		 
 	 }	
	
	public static void main(String[] args)
	{			new Home();
			      for(int i=0;i<=100;i++)
			      {  try 
			    	  {
			    		   jp.setValue(i);
			    	       Thread.sleep(50);
			    	      
			    	  }catch(Exception ex){}
			      }
			       jf.dispose();
	    	       new Starting();
	}

}
