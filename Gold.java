import java.awt.BorderLayout;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Gold implements ActionListener,MouseListener,FocusListener
{
	JFrame jf;
	JMenuBar jmb;
	JMenu RINGS,EARRINGS,PENDANTS,BANGLES,SOLITAIRES,ALLJEWLLRY,GIFTS,FASTDELIVERY,COIN,OURSTORE;
	JMenuItem Engagement,Couplebands,Officewear,Cocktail,Multifinger,Platinumbands,Navratna,Pearl,Studs,Drops,Suidhaga,Jhumkas,Chandbali,Hoops,Earcuffs,Nawratnaearring,Mismatchearring,Alphabet,Religious,Fashion,Heartshaped,Locket,Officewear1,Zodiac,Navratna1,Dailywear,Diamonds,Kadas,OfficeWear,EternityBangles,Fashion1,SolitaireRing,SolitairePendants,SolitaireEaring,Bracelets,DiamondJewllery,NosePins,GoldJewllery,Necklaces,GemstoneJewllery,ValentinesDay,Anniversary,BirthDay,Engagement1,Wedding,NextDayDelivery,gram2,gram5,gram10,gram20,gram50,nomakingcharge,Offers;
	
	
	JTextField tf;
	JButton b[]=new JButton[11];
	JLabel l1,l2,l3,l4;

	public Gold()
	{
		jf=new JFrame("NJ");

		jf.getContentPane().setBackground(Color.black);
		jf.setLayout(null);
		JScrollPane jsp=new JScrollPane(tf=new JTextField());
		
		jf.add(tf= new JTextField());
		tf.setBounds(450,60,400,50);
		tf.setForeground(Color.WHITE);
		tf.setText("Search Here");
		tf.setOpaque(false);
		tf.setFont(new Font("Times New Roman",Font.PLAIN,20));
		
		b[0]=new JButton();
		jf.add(b[1]=new JButton(new ImageIcon("img\\search1.jpg")));
		b[1].setBounds(850,60,50,48);
		b[1].setOpaque(false);
		b[1].setContentAreaFilled(false);
		b[1].setBorderPainted(false);
		jf.add(b[2]=new JButton(new ImageIcon("img\\jewellery3.jpg")));
		b[2].setBounds(-400,440,1160,250);
		b[2].setOpaque(false);
		b[2].setContentAreaFilled(false);
		b[2].setBorderPainted(false);
		
		jf.add(b[3]=new JButton(new ImageIcon("img\\gold.jpg")));
		b[3].setBounds(240,185,900,250);
		b[3].setOpaque(false);
		b[3].setContentAreaFilled(false);
		b[3].setBorderPainted(false);
		
		jf.add(b[4]=new JButton(new ImageIcon("img\\Pendants1.jpg")));
		b[4].setBounds(580,410,1160,350);
		b[4].setOpaque(false);
		b[4].setContentAreaFilled(false);
		b[4].setBorderPainted(false);
		
		jf.add(b[5]=new JButton(new ImageIcon("img\\diamond2.jpg")));
		b[5].setBounds(100,380,1160,350);
		b[5].setOpaque(false);
		b[5].setContentAreaFilled(false);
		b[5].setBorderPainted(false);
		
		
		
		jf.add(b[6]=new JButton("NJ"));
		b[6].setBounds(-40,50,150,55);
		b[6].setFont(new Font("Imprint MT Shadow",Font.BOLD,50));
		b[6].setForeground(Color.yellow);
		b[6].setToolTipText("NJ");
		b[6].setOpaque(false);
		b[6].setContentAreaFilled(false);
		b[6].setBorderPainted(false);
		
		jf.add(b[7]=new JButton("Try @ Home For Free ?"));
		b[7].setBounds(-75,10,310,50);
		b[7].setFont(new Font("Arial",Font.PLAIN,15));
		b[7].setForeground(Color.blue);
		b[7].setOpaque(false);
		b[7].setContentAreaFilled(false);
		b[7].setBorderPainted(false);

		
		jf.add(l1=new JLabel("|"));
		l1.setBounds(165,10,5,50);
		l1.setFont(new Font("Times New Roman",Font.PLAIN,20));
		l1.setForeground(Color.WHITE);
		

		
		jf.add(b[8]=new JButton("call-9352450920"));
		b[8].setBounds(140,10,200,50);
		b[8].setFont(new Font("Times New Roman",Font.PLAIN,20));
		b[8].setForeground(Color.WHITE);
		b[8].setOpaque(false);
		b[8].setContentAreaFilled(false);
		b[8].setBorderPainted(false);
		
		jf.add(l2=new JLabel("____________________________________________"));
		l2.setBounds(5,30,500,20);
		l2.setForeground(Color.WHITE);
		

		
		jf.add(b[9]=new JButton("My Account"));
		b[9].setBounds(1135,10,150,50);
		b[9].setFont(new Font("Times New Roman",Font.PLAIN,20));
		b[9].setForeground(Color.WHITE);
		b[9].setOpaque(false);
		b[9].setContentAreaFilled(false);
		b[9].setBorderPainted(false);
		
		jf.add(l3=new JLabel("|"));
		l3.setBounds(1265,10,5,50);
		l3.setFont(new Font("Times New Roman",Font.PLAIN,20));
		l3.setForeground(Color.WHITE);
			
		jf.add(b[10]=new JButton("WishList"));
		b[10].setBounds(1230,10,150,50);
		b[10].setFont(new Font("Times New Roman",Font.PLAIN,20));
		b[10].setForeground(Color.WHITE);
		b[10].setOpaque(false);
		b[10].setContentAreaFilled(false);
		b[10].setBorderPainted(false);
		
		jf.add(l4=new JLabel("___________________________"));
		l4.setBounds(1160,30,280,20);
		l4.setForeground(Color.WHITE);
		jf.add(BorderLayout.CENTER,jsp);
		jf.add(jmb=new JMenuBar());
		jmb.setBounds(150,120,1095,60);
		jmb.setBackground(Color.YELLOW);
		
		RINGS=new JMenu("RINGS");
		
		EARRINGS=new JMenu("EARRINGS");
		PENDANTS=new JMenu("PENDANTS");
		BANGLES=new JMenu("BANGLES");
		SOLITAIRES=new JMenu("SOLITAIRES");
		ALLJEWLLRY=new JMenu("ALLJEWLLRY");
		GIFTS=new JMenu("GIFTS");
		FASTDELIVERY=new JMenu("FAST DELIVERY");
		COIN=new JMenu("SALE");
		OURSTORE=new JMenu("OUR STORE");
		jmb.add(RINGS);
		jmb.add(EARRINGS);
		jmb.add(PENDANTS);
		jmb.add(BANGLES);
		jmb.add(SOLITAIRES);
		jmb.add(ALLJEWLLRY);
		jmb.add(GIFTS);
		jmb.add(FASTDELIVERY);
		jmb.add(COIN);
		jmb.add(OURSTORE);
		RINGS.add(Engagement=new JMenuItem("ENGAGEMENT"));
		Engagement.setFont(new Font("Times New Roman",Font.BOLD,15));
		Engagement.setOpaque(true);
		Engagement.setContentAreaFilled(false);
		Engagement.setBorderPainted(false);
		Engagement.setForeground(Color.yellow);
		Engagement.setBackground(Color.BLACK);
		
		RINGS.add(Couplebands=new JMenuItem("Couple Bands"));
		Couplebands.setFont(new Font("Times New Roman",Font.BOLD,15));
		Couplebands.setOpaque(true);
		Couplebands.setContentAreaFilled(false);
		Couplebands.setBorderPainted(false);
		Couplebands.setForeground(Color.yellow);
		Couplebands.setBackground(Color.BLACK);
		
		RINGS.add(Officewear=new JMenuItem("Office Wear"));
		Officewear.setFont(new Font("Times New Roman",Font.BOLD,15));
		Officewear.setOpaque(true);
		Officewear.setContentAreaFilled(false);
		Officewear.setBorderPainted(false);
		Officewear.setForeground(Color.yellow);
		Officewear.setBackground(Color.BLACK);
		
		RINGS.add(Cocktail=new JMenuItem("Cocktail"));
		Cocktail.setFont(new Font("Times New Roman",Font.BOLD,15));
		Cocktail.setOpaque(true);
		Cocktail.setContentAreaFilled(false);
		Cocktail.setBorderPainted(false);
		Cocktail.setForeground(Color.yellow);
		Cocktail.setBackground(Color.BLACK);
		RINGS.add(Multifinger=new JMenuItem("Multi-finger"));
		Multifinger.setFont(new Font("Times New Roman",Font.BOLD,15));
		Multifinger.setOpaque(true);
		Multifinger.setContentAreaFilled(false);
		Multifinger.setBorderPainted(false);
		Multifinger.setForeground(Color.yellow);
		Multifinger.setBackground(Color.BLACK);
		RINGS.add(Platinumbands=new JMenuItem("Platinum Bands"));
		Platinumbands.setFont(new Font("Times New Roman",Font.BOLD,15));
		Platinumbands.setOpaque(true);
		Platinumbands.setContentAreaFilled(false);
		Platinumbands.setBorderPainted(false);
		Platinumbands.setForeground(Color.yellow);
		Platinumbands.setBackground(Color.BLACK);
		RINGS.add(Navratna=new JMenuItem("Navratna"));
		Navratna.setFont(new Font("Times New Roman",Font.BOLD,15));
		Navratna.setOpaque(true);
		Navratna.setContentAreaFilled(false);
		Navratna.setBorderPainted(false);
		Navratna.setForeground(Color.yellow);
		Navratna.setBackground(Color.BLACK);
		RINGS.add(Pearl=new JMenuItem("Pearl"));
		Pearl.setFont(new Font("Times New Roman",Font.BOLD,15));
		Pearl.setOpaque(true);
		Pearl.setContentAreaFilled(false);
		Pearl.setBorderPainted(false);
		Pearl.setForeground(Color.yellow);
		Pearl.setBackground(Color.BLACK);
		
		RINGS.setFont(new Font("Times New Roman",Font.BOLD,20));
		RINGS.setForeground(Color.BLACK);
			
		EARRINGS.add(Studs=new JMenuItem("Studs"));
		Studs.setFont(new Font("Times New Roman",Font.BOLD,15));
		Studs.setOpaque(true);
		Studs.setContentAreaFilled(false);
		Studs.setBorderPainted(false);
		Studs.setForeground(Color.yellow);
		Studs.setBackground(Color.BLACK);
		
		EARRINGS.add(Drops=new JMenuItem("Drops"));
		Drops.setFont(new Font("Times New Roman",Font.BOLD,15));
		Drops.setOpaque(true);
		Drops.setContentAreaFilled(false);
		Drops.setBorderPainted(false);
		Drops.setForeground(Color.yellow);
		Drops.setBackground(Color.BLACK);
		EARRINGS.add(Suidhaga=new JMenuItem("Suidhaga"));
		Suidhaga.setFont(new Font("Times New Roman",Font.BOLD,15));
		Suidhaga.setOpaque(true);
		Suidhaga.setContentAreaFilled(false);
		Suidhaga.setBorderPainted(false);
		Suidhaga.setForeground(Color.yellow);
		Suidhaga.setBackground(Color.BLACK);
		EARRINGS.add(Jhumkas=new JMenuItem("Jhumkas"));
		Jhumkas.setFont(new Font("Times New Roman",Font.BOLD,15));
		Jhumkas.setOpaque(true);
		Jhumkas.setContentAreaFilled(false);
		Jhumkas.setBorderPainted(false);
		Jhumkas.setForeground(Color.yellow);
		Jhumkas.setBackground(Color.BLACK);
		EARRINGS.add(Chandbali=new JMenuItem("Chandbali"));
		Chandbali.setFont(new Font("Times New Roman",Font.BOLD,15));
		Chandbali.setOpaque(true);
		Chandbali.setContentAreaFilled(false);
		Chandbali.setBorderPainted(false);
		Chandbali.setForeground(Color.yellow);
		Chandbali.setBackground(Color.BLACK);
		EARRINGS.add(Hoops=new JMenuItem("Hoops"));
		Hoops.setFont(new Font("Times New Roman",Font.BOLD,15));
		Hoops.setOpaque(true);
		Hoops.setContentAreaFilled(false);
		Hoops.setBorderPainted(false);
		Hoops.setForeground(Color.yellow);
		Hoops.setBackground(Color.BLACK);
		EARRINGS.add(Earcuffs=new JMenuItem("Earcuffs"));
		Earcuffs.setFont(new Font("Times New Roman",Font.BOLD,15));
		Earcuffs.setOpaque(true);
		Earcuffs.setContentAreaFilled(false);
		Earcuffs.setBorderPainted(false);
		Earcuffs.setForeground(Color.yellow);
		Earcuffs.setBackground(Color.BLACK);
		EARRINGS.add(Nawratnaearring=new JMenuItem("Nawratna Earrings"));
		Nawratnaearring.setFont(new Font("Times New Roman",Font.BOLD,15));
		Nawratnaearring.setOpaque(true);
		Nawratnaearring.setContentAreaFilled(false);
		Nawratnaearring.setBorderPainted(false);
		Nawratnaearring.setForeground(Color.yellow);
		Nawratnaearring.setBackground(Color.BLACK);
		EARRINGS.add(Mismatchearring=new JMenuItem("Mismatch Earring"));
		Mismatchearring.setFont(new Font("Times New Roman",Font.BOLD,15));
		Mismatchearring.setOpaque(true);
		Mismatchearring.setContentAreaFilled(false);
		Mismatchearring.setBorderPainted(false);
		Mismatchearring.setForeground(Color.yellow);
		Mismatchearring.setBackground(Color.BLACK);
		EARRINGS.setFont(new Font("Times New Roman",Font.BOLD,20));
		EARRINGS.setForeground(Color.BLACK);
		
		PENDANTS.add(Alphabet=new JMenuItem("Alphabet"));
		Alphabet.setFont(new Font("Times New Roman",Font.BOLD,15));
		Alphabet.setOpaque(true);
		Alphabet.setContentAreaFilled(false);
		Alphabet.setBorderPainted(false);
		Alphabet.setForeground(Color.yellow);
		Alphabet.setBackground(Color.BLACK);
		PENDANTS.add(Religious=new JMenuItem("Religious"));
		Religious.setFont(new Font("Times New Roman",Font.BOLD,15));
		Religious.setOpaque(true);
		Religious.setContentAreaFilled(false);
		Religious.setBorderPainted(false);
		Religious.setForeground(Color.yellow);
		Religious.setBackground(Color.BLACK);
		PENDANTS.add(Fashion=new JMenuItem("Fashion"));
		Fashion.setFont(new Font("Times New Roman",Font.BOLD,15));
		Fashion.setOpaque(true);
		Fashion.setContentAreaFilled(false);
		Fashion.setBorderPainted(false);
		Fashion.setForeground(Color.yellow);
		Fashion.setBackground(Color.BLACK);
		PENDANTS.add(Heartshaped=new JMenuItem("Heart Shaped"));
		Heartshaped.setFont(new Font("Times New Roman",Font.BOLD,15));
		Heartshaped.setOpaque(true);
		Heartshaped.setContentAreaFilled(false);
		Heartshaped.setBorderPainted(false);
		Heartshaped.setForeground(Color.yellow);
		Heartshaped.setBackground(Color.BLACK);
		PENDANTS.add(Locket=new JMenuItem("Locket"));
		Locket.setFont(new Font("Times New Roman",Font.BOLD,15));
		Locket.setOpaque(true);
		Locket.setContentAreaFilled(false);
		Locket.setBorderPainted(false);
		Locket.setForeground(Color.yellow);
		Locket.setBackground(Color.BLACK);
		PENDANTS.add(Officewear1=new JMenuItem("Office Wear"));
		Officewear1.setFont(new Font("Times New Roman", Font.BOLD,15));
		Officewear1.setContentAreaFilled(false);
		Officewear1.setBorderPainted(false);
		Officewear1.setBackground(Color.BLACK);
		Officewear1.setForeground(Color.yellow);
		
		PENDANTS.add(Zodiac=new JMenuItem("Zodiac"));
		Zodiac.setFont(new Font("Times New Roman", Font.BOLD,15));
		Zodiac.setContentAreaFilled(false);
		Zodiac.setBorderPainted(false);
		Zodiac.setBackground(Color.BLACK);
		Zodiac.setForeground(Color.yellow);
		
		PENDANTS.add(Navratna1=new JMenuItem("Navratna"));
		Navratna1.setFont(new Font("Times New Roman", Font.BOLD,15));
		Navratna1.setContentAreaFilled(false);
		Navratna1.setBorderPainted(false);
		Navratna1.setForeground(Color.yellow);
		Navratna1.setBackground(Color.BLACK);
		PENDANTS.setFont(new Font("Times New Roman",Font.BOLD,20));
		PENDANTS.setForeground(Color.BLACK);
		
		BANGLES.add(Dailywear=new JMenuItem("Dailywear"));
		Dailywear.setFont(new Font("Times New Roman", Font.BOLD,15));
		Dailywear.setContentAreaFilled(false);
		Dailywear.setBorderPainted(false);
		Dailywear.setForeground(Color.yellow);
		Dailywear.setBackground(Color.BLACK);
		BANGLES.add(Diamonds=new JMenuItem("Diamonds"));
		Diamonds.setFont(new Font("Times New Roman", Font.BOLD,15));
		Diamonds.setContentAreaFilled(false);
		Diamonds.setBorderPainted(false);
		Diamonds.setForeground(Color.yellow);
		Diamonds.setBackground(Color.BLACK);
		BANGLES.add(Kadas=new JMenuItem("Kadas"));
		Kadas.setFont(new Font("Times New Roman", Font.BOLD,15));
		Kadas.setContentAreaFilled(false);
		Kadas.setBorderPainted(false);
		Kadas.setForeground(Color.yellow);
		Kadas.setBackground(Color.BLACK);
		BANGLES.add(OfficeWear=new JMenuItem("Officewear"));
		OfficeWear.setFont(new Font("Times New Roman", Font.BOLD,15));
		OfficeWear.setContentAreaFilled(false);
		OfficeWear.setBorderPainted(false);
		OfficeWear.setForeground(Color.yellow);
		OfficeWear.setBackground(Color.BLACK);
		BANGLES.add(EternityBangles=new JMenuItem("Eternity Bangles"));
		EternityBangles.setFont(new Font("Times New Roman", Font.BOLD,15));
		EternityBangles.setContentAreaFilled(false);
		EternityBangles.setBorderPainted(false);
		EternityBangles.setForeground(Color.yellow);
		EternityBangles.setBackground(Color.BLACK);
		BANGLES.add(Fashion1=new JMenuItem("Fashion"));
		Fashion1.setFont(new Font("Times New Roman", Font.BOLD,15));
		Fashion1.setContentAreaFilled(false);
		Fashion1.setBorderPainted(false);
		Fashion1.setForeground(Color.yellow);
		Fashion1.setBackground(Color.BLACK);
		BANGLES.setFont(new Font("Times New Roman",Font.BOLD,20));
		BANGLES.setForeground(Color.BLACK);
		
		SOLITAIRES.add(SolitaireRing=new JMenuItem("Solitaire Ring"));
		SolitaireRing.setFont(new Font("Times New Roman", Font.BOLD,15));
		SolitaireRing.setContentAreaFilled(false);
		SolitaireRing.setBorderPainted(false);
		SolitaireRing.setForeground(Color.yellow);
		SolitaireRing.setBackground(Color.BLACK);
		SOLITAIRES.add(SolitairePendants=new JMenuItem("Solitaire Pendants"));
		SolitairePendants.setFont(new Font("Times New Roman", Font.BOLD,15));
		SolitairePendants.setContentAreaFilled(false);
		SolitairePendants.setBorderPainted(false);
		SolitairePendants.setForeground(Color.yellow);
		SolitairePendants.setBackground(Color.BLACK);
		SOLITAIRES.add(Engagement=new JMenuItem("Solitaire Earring"));
		Engagement.setFont(new Font("Times New Roman", Font.BOLD,15));
		Engagement.setContentAreaFilled(false);
		Engagement.setBorderPainted(false);
		Engagement.setForeground(Color.yellow);
		Engagement.setBackground(Color.BLACK);
		
		SOLITAIRES.setFont(new Font("Times New Roman",Font.BOLD,20));
		SOLITAIRES.setForeground(Color.BLACK);
		
		ALLJEWLLRY.add(Bracelets=new JMenuItem("Bracelets"));
		Bracelets.setFont(new Font("Times New Roman", Font.BOLD,15));
		Bracelets.setContentAreaFilled(false);
		Bracelets.setBorderPainted(false);
		Bracelets.setForeground(Color.yellow);
		Bracelets.setBackground(Color.BLACK);
		
		ALLJEWLLRY.add(DiamondJewllery=new JMenuItem("Diamond Jewllery"));
		DiamondJewllery.setFont(new Font("Times New Roman", Font.BOLD,15));
		DiamondJewllery.setContentAreaFilled(false);
		DiamondJewllery.setBorderPainted(false);
		DiamondJewllery.setForeground(Color.yellow);
		DiamondJewllery.setBackground(Color.BLACK);
		ALLJEWLLRY.add(NosePins=new JMenuItem("NOSE PINS"));
		NosePins.setFont(new Font("Times New Roman", Font.BOLD,15));
		NosePins.setContentAreaFilled(false);
		NosePins.setBorderPainted(false);
		NosePins.setForeground(Color.yellow);
		NosePins.setBackground(Color.BLACK);
		ALLJEWLLRY.add(GoldJewllery=new JMenuItem("Gold Jewllery"));
		GoldJewllery.setFont(new Font("Times New Roman", Font.BOLD,15));
		GoldJewllery.setContentAreaFilled(false);
		GoldJewllery.setBorderPainted(false);
		GoldJewllery.setForeground(Color.yellow);
		GoldJewllery.setBackground(Color.BLACK);
		ALLJEWLLRY.add(Necklaces=new JMenuItem("Neck Laces"));
		Necklaces.setFont(new Font("Times New Roman", Font.BOLD,15));
		Necklaces.setContentAreaFilled(false);
		Necklaces.setBorderPainted(false);
		Necklaces.setForeground(Color.yellow);
		Necklaces.setBackground(Color.BLACK);
		
		ALLJEWLLRY.add(GemstoneJewllery=new JMenuItem("Gemstone Jewllery"));
		GemstoneJewllery.setFont(new Font("Times New Roman", Font.BOLD,15));
		GemstoneJewllery.setContentAreaFilled(false);
		GemstoneJewllery.setBorderPainted(false);
		GemstoneJewllery.setForeground(Color.yellow);
		GemstoneJewllery.setBackground(Color.BLACK);
		
		ALLJEWLLRY.setFont(new Font("Times New Roman",Font.BOLD,20));
		ALLJEWLLRY.setForeground(Color.BLACK);
		
		GIFTS.add(ValentinesDay=new JMenuItem("Valetines Day"));
		ValentinesDay.setFont(new Font("Times New Roman", Font.BOLD,15));
		ValentinesDay.setContentAreaFilled(false);
		ValentinesDay.setBorderPainted(false);
		ValentinesDay.setForeground(Color.yellow);
		ValentinesDay.setBackground(Color.BLACK);
		GIFTS.add(Anniversary=new JMenuItem("Anniversary"));
		Anniversary.setFont(new Font("Times New Roman", Font.BOLD,15));
		Anniversary.setContentAreaFilled(false);
		Anniversary.setBorderPainted(false);
		Anniversary.setForeground(Color.yellow);
		Anniversary.setBackground(Color.BLACK);
		GIFTS.add(BirthDay=new JMenuItem("BirthDay"));
		BirthDay.setFont(new Font("Times New Roman", Font.BOLD,15));
		BirthDay.setContentAreaFilled(false);
		BirthDay.setBorderPainted(false);
		BirthDay.setForeground(Color.YELLOW);
		BirthDay.setBackground(Color.BLACK);
		GIFTS.add(Engagement1=new JMenuItem("Engagement"));
		Engagement1.setFont(new Font("Times New Roman",Font.BOLD,15));
		Engagement1.setOpaque(true);
		Engagement1.setContentAreaFilled(false);
		Engagement1.setBorderPainted(false);
		Engagement1.setForeground(Color.yellow);
		Engagement1.setBackground(Color.BLACK);
		
		GIFTS.add(Wedding=new JMenuItem("Wedding"));
		Wedding.setFont(new Font("Times New Roman",Font.BOLD,15));
		Wedding.setOpaque(true);
		Wedding.setContentAreaFilled(false);
		Wedding.setBorderPainted(false);
		Wedding.setForeground(Color.YELLOW);
		Wedding.setBackground(Color.BLACK);
		
		GIFTS.setFont(new Font("Times New Roman",Font.BOLD,20));
		GIFTS.setForeground(Color.BLACK);
		
		FASTDELIVERY.add(NextDayDelivery=new JMenuItem("Next Day Delivery"));
		NextDayDelivery.setFont(new Font("Times New Roman",Font.BOLD,15));
		NextDayDelivery.setOpaque(true);
		NextDayDelivery.setContentAreaFilled(false);
		NextDayDelivery.setBorderPainted(false);
		NextDayDelivery.setForeground(Color.yellow);
		NextDayDelivery.setBackground(Color.BLACK);
		
		FASTDELIVERY.setFont(new Font("Times New Roman",Font.BOLD,20));
		FASTDELIVERY.setForeground(Color.BLACK);
		
		COIN.add(gram2=new JMenuItem("2 Gram"));
		gram2.setFont(new Font("Times New Roman",Font.BOLD,15));
		gram2.setOpaque(true);
		gram2.setContentAreaFilled(false);
		gram2.setBorderPainted(false);
		gram2.setForeground(Color.yellow);
		gram2.setBackground(Color.black);
		COIN.add(gram5=new JMenuItem("5 Gram"));
		gram5.setFont(new Font("Times New Roman",Font.BOLD,15));
		gram5.setOpaque(true);
		gram5.setContentAreaFilled(false);
		gram5.setBorderPainted(false);
		gram5.setForeground(Color.YELLOW);
		gram5.setBackground(Color.BLACK);
		COIN.add(gram10=new JMenuItem("10 Gram"));
		gram10.setFont(new Font("Times New Roman",Font.BOLD,15));
		gram10.setOpaque(true);
		gram10.setContentAreaFilled(false);
		gram10.setBorderPainted(false);
		gram10.setForeground(Color.YELLOW);
		gram10.setBackground(Color.BLACK);
		COIN.add(gram20=new JMenuItem("20 Gram"));
		gram20.setFont(new Font("Times New Roman",Font.BOLD,15));
		gram20.setOpaque(true);
		gram20.setContentAreaFilled(false);
		gram20.setBorderPainted(false);
		gram20.setForeground(Color.yellow);
		gram20.setBackground(Color.black);
		COIN.add(gram50=new JMenuItem("50 Gram"));
		gram50.setFont(new Font("Times New Roman",Font.BOLD,15));
		gram50.setOpaque(true);
		gram50.setContentAreaFilled(false);
		gram50.setBorderPainted(false);
		gram50.setForeground(Color.yellow);
		gram50.setBackground(Color.black);
		
		COIN.setFont(new Font("Times New Roman",Font.BOLD,20));
		COIN.setForeground(Color.BLACK);
		
		
		OURSTORE.add(nomakingcharge=new JMenuItem("No Making Charge"));
		nomakingcharge.setFont(new Font("Times New Roman",Font.BOLD,15));
		nomakingcharge.setOpaque(true);
		nomakingcharge.setContentAreaFilled(false);
		nomakingcharge.setBorderPainted(false);
		nomakingcharge.setForeground(Color.YELLOW);
		nomakingcharge.setBackground(Color.BLACK);
		
		OURSTORE.add(Offers=new JMenuItem("Offers"));
		Offers.setFont(new Font("Times New Roman",Font.BOLD,15));
		Offers.setOpaque(true);
		Offers.setContentAreaFilled(false);
		Offers.setBorderPainted(false);
		Offers.setForeground(Color.YELLOW);
		Offers.setBackground(Color.black);
		
		OURSTORE.setFont(new Font("Times New Roman",Font.BOLD,20));
		OURSTORE.setForeground(Color.BLACK);

		
		for(int i=0;i<b.length;i++)
		{
			b[i].addActionListener(this);
		}
		b[9].addActionListener(this);
		for(int i=0;i<b.length;i++)
		{
			b[i].addMouseListener(this);
		}
		b[9].addMouseListener(this);
		Engagement.addActionListener(this);
	    Couplebands.addActionListener(this);
	    Officewear.addActionListener(this);
	    Cocktail.addActionListener(this);
	    Multifinger.addActionListener(this);
	    Platinumbands.addActionListener(this);
	    Navratna.addActionListener(this);
	    Pearl.addActionListener(this);
	    Studs.addActionListener(this);
	    Drops.addActionListener(this);
	    Suidhaga.addActionListener(this);
	    Jhumkas.addActionListener(this);
	    Chandbali.addActionListener(this);
	    Hoops.addActionListener(this);
	    Earcuffs.addActionListener(this);
	    Nawratnaearring.addActionListener(this);
	    Mismatchearring.addActionListener(this);
	    Alphabet.addActionListener(this);
	    Religious.addActionListener(this);
	    Fashion.addActionListener(this);
	    Heartshaped.addActionListener(this);
	    Locket.addActionListener(this);
	    Officewear1.addActionListener(this);
	    Zodiac.addActionListener(this);
	    Navratna1.addActionListener(this);
	    Dailywear.addActionListener(this);
	    Diamonds.addActionListener(this);
	    Kadas.addActionListener(this);
	    OfficeWear.addActionListener(this);
	    EternityBangles.addActionListener(this);
	    Fashion1.addActionListener(this);
	    SolitaireRing.addActionListener(this);
	    SolitairePendants.addActionListener(this);
	    Bracelets.addActionListener(this);
	    DiamondJewllery.addActionListener(this);
	    NosePins.addActionListener(this);
	    GoldJewllery.addActionListener(this);
	    Necklaces.addActionListener(this);
	    GemstoneJewllery.addActionListener(this);
	    ValentinesDay.addActionListener(this);
	    Anniversary.addActionListener(this);
	    BirthDay.addActionListener(this);
	    Engagement1.addActionListener(this);
	    Wedding.addActionListener(this);
	    NextDayDelivery.addActionListener(this);
	    gram2.addActionListener(this);
	    gram5.addActionListener(this);
	    gram10.addActionListener(this);
	    gram20.addActionListener(this);
	    gram50.addActionListener(this);
	    nomakingcharge.addActionListener(this);
	    Offers.addActionListener(this);
		
		
		tf.addFocusListener(this);
		
		
		
		jf.setVisible(true);
		jf.setSize(2000,2000);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		new Gold();

	}

	@Override
	public void mouseClicked(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent ae)
	{
		Cursor s=new Cursor(Cursor.HAND_CURSOR);
		jmb.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 b[1].setCursor(new Cursor(Cursor.HAND_CURSOR));
		 b[2].setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		 b[3].setCursor(new Cursor(Cursor.HAND_CURSOR));
		 
		 b[4].setCursor(new Cursor(Cursor.HAND_CURSOR));
		 b[5].setCursor(new Cursor(Cursor.HAND_CURSOR));
		 b[6].setCursor(new Cursor(Cursor.HAND_CURSOR));
		 b[7].setCursor(new Cursor(Cursor.HAND_CURSOR));
		 b[8].setCursor(new Cursor(Cursor.HAND_CURSOR));
		 b[9].setCursor(new Cursor(Cursor.HAND_CURSOR));
		 b[10].setCursor(new Cursor(Cursor.HAND_CURSOR));
		 if(ae.getSource()==b[2])
			{
				b[2].setIcon(new ImageIcon("img\\neck.jpg"));
			}
			if(ae.getSource()==b[4])
			{
				b[4].setIcon(new ImageIcon("img\\PendantsMd.jpg"));
			}
				b[5].setIcon(new ImageIcon("img\\hand.jpg"));
			
		 
		
	}

	@Override
	public void mouseExited(MouseEvent ae) 
	{
		 if(ae.getSource()==b[2])
		 {
			 b[2].setIcon(new ImageIcon("img\\jewellery3.jpg"));
		 }
		
		 if(ae.getSource()==b[4])
		 {
			 b[4].setIcon(new ImageIcon("img\\Pendants1.jpg"));
		 }
		 
			 b[5].setIcon(new ImageIcon("img\\diamond2.jpg"));
		 
				
	}

	@Override
	public void mousePressed(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent ae) 
	{
		
	}

	@Override
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b[9])
		  {
			 
			 new Account();//move to login page
			 //jf.dispose();
			 
		  }
		if(ae.getSource()==b[6])
		  {
			new Starting();//move to signup page
			//jf.dispose();
		  }
		
	}

	@Override
	public void focusGained(FocusEvent ae) 
	{
		if(ae.getSource()==tf)
		{	
			tf.setText("");
		}
		
	}

	@Override
	public void focusLost(FocusEvent ae)
	{
		if(ae.getSource()==tf)
		{	
			tf.setText("Search Here");
		}
		
	}

}
