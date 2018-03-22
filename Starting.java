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

public class Starting implements ActionListener,MouseListener,FocusListener
{
	JFrame jf;
	JMenuBar jmb;
	JMenu RINGS,EARRINGS,PENDANTS,BANGLES,SOLITAIRES,ALLJEWLLRY,GIFTS,FASTDELIVERY,COIN,OURSTORE;
	JMenuItem Engagement,Couplebands,Officewear,Cocktail,Multifinger,Platinumbands,Navratna,Pearl,Studs,Drops,Suidhaga,Jhumkas,Chandbali,Hoops,Earcuffs,Nawratnaearring,Mismatchearring,Alphabet,Religious,Fashion,Heartshaped,Locket,Officewear1,Zodiac,Navratna1,Dailywear,Diamonds,Kadas,OfficeWear,EternityBangles,Fashion1,SolitaireRing,SolitairePendants,SolitaireEaring,Bracelets,DiamondJewllery,NosePins,GoldJewllery,Necklaces,GemstoneJewllery,ValentinesDay,Anniversary,BirthDay,Engagement1,Wedding,NextDayDelivery,gram2,gram5,gram10,gram20,gram50,nomakingcharge,Offers;
	
	
	JTextField tf;
	JButton b[]=new JButton[9];
	JLabel l1,l2,l3,l4;
	
	

	public Starting() 
	{
		jf=new JFrame("NJ");
		//jf.setContentPane(new JLabel(new ImageIcon("img\\jewelry-background.jpg")));

		jf.getContentPane().setBackground(Color.WHITE);
		jf.setLayout(null);
		JScrollPane jsp=new JScrollPane(tf=new JTextField());
		
		jf.add(tf= new JTextField());
		tf.setBounds(450,60,400,50);
		tf.setForeground(Color.BLACK);
		tf.setText("Search Here");
		tf.setOpaque(false);
		tf.setFont(new Font("Times New Roman",Font.PLAIN,20) );
		
		b[0]=new JButton();
		jf.add(b[1]=new JButton(new ImageIcon("img\\search$.jpg")));
		b[1].setBounds(850,40,80,80);
		b[1].setOpaque(false);
		b[1].setContentAreaFilled(false);
		b[1].setBorderPainted(false);
		
		jf.add(b[2]=new JButton(new ImageIcon("img\\diamond1.jpg")));
		b[2].setBounds(60,480,1150,250);
		b[2].setOpaque(false);
		b[2].setContentAreaFilled(false);
		b[2].setBorderPainted(false);
		
		jf.add(b[3]=new JButton(new ImageIcon("img\\Mod1.jpg")));
		b[3].setBounds(240,190,800,280);
		b[3].setOpaque(false);
		b[3].setContentAreaFilled(false);
		b[3].setBorderPainted(false);
		
		jf.add(b[4]=new JButton("NJ"));
		b[4].setBounds(-40,50,150,55);
		b[4].setFont(new Font("Imprint MT Shadow",Font.BOLD,50));
		b[4].setForeground(Color.BLACK);
		b[4].setToolTipText("NJ");
		b[4].setOpaque(false);
		b[4].setContentAreaFilled(false);
		b[4].setBorderPainted(false);
		
		jf.add(b[5]=new JButton("Try @ Home For Free ?"));
		b[5].setBounds(-75,10,310,50);
		b[5].setFont(new Font("Arial",Font.PLAIN,15));
		b[5].setForeground(Color.blue);
		b[5].setOpaque(false);
		b[5].setContentAreaFilled(false);
		b[5].setBorderPainted(false);

		jf.add(l1=new JLabel("|"));
		l1.setBounds(165,10,5,50);
		l1.setFont(new Font("Times New Roman",Font.PLAIN,20));
		l1.setForeground(Color.LIGHT_GRAY);
				
		jf.add(b[6]=new JButton("call-9352450920"));
		b[6].setBounds(140,10,200,50);
		b[6].setFont(new Font("Times New Roman",Font.PLAIN,20));
		b[6].setForeground(Color.BLACK);
		b[6].setOpaque(false);
		b[6].setContentAreaFilled(false);
		b[6].setBorderPainted(false);
		
		jf.add(l2=new JLabel("____________________________________________"));
		l2.setBounds(5,30,500,20);
		l2.setForeground(Color.LIGHT_GRAY);
		
		jf.add(b[7]=new JButton("My Account"));
		b[7].setBounds(1135,10,150,50);
		b[7].setFont(new Font("Times New Roman",Font.PLAIN,20));
		b[7].setForeground(Color.BLACK);
		b[7].setOpaque(false);
		b[7].setContentAreaFilled(false);
		b[7].setBorderPainted(false);
		
		jf.add(l3=new JLabel("|"));
		l3.setBounds(1265,10,5,50);
		l3.setFont(new Font("Times New Roman",Font.PLAIN,20));
		l3.setForeground(Color.LIGHT_GRAY);
	
		jf.add(b[8]=new JButton("WishList"));
		b[8].setBounds(1230,10,150,50);
		b[8].setFont(new Font("Times New Roman",Font.PLAIN,20));
		b[8].setForeground(Color.BLACK);
		b[8].setOpaque(false);
		b[8].setContentAreaFilled(false);
		b[8].setBorderPainted(false);
		
		jf.add(l4=new JLabel("___________________________"));
		l4.setBounds(1160,30,280,20);
		l4.setForeground(Color.GRAY);

//		jf.add(b[9]=new JButton("NJ Exclusive offer:-"));
//		b[9].setBounds(-20,220,250,50);
//		b[9].setFont(new Font("Imprint MT Shadow",Font.PLAIN,20));
//		b[9].setForeground(Color.blue);
//		b[9].setOpaque(false);
//		b[9].setContentAreaFilled(false);
//		b[9].setBorderPainted(false);

		jf.add(BorderLayout.CENTER,jsp);
		jf.add(jmb=new JMenuBar());
		jmb.setBounds(150,120,1095,60);
		jmb.setBackground(Color.WHITE);
		
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
		Engagement.setForeground(Color.GRAY);
	
		
		RINGS.add(Couplebands=new JMenuItem("Couple Bands"));
		Couplebands.setFont(new Font("Times New Roman",Font.BOLD,15));
		Couplebands.setOpaque(true);
		Couplebands.setContentAreaFilled(false);
		Couplebands.setBorderPainted(false);
		Couplebands.setForeground(Color.GRAY);
		
		
		RINGS.add(Officewear=new JMenuItem("Office Wear"));
		Officewear.setFont(new Font("Times New Roman",Font.BOLD,15));
		Officewear.setOpaque(true);
		Officewear.setContentAreaFilled(false);
		Officewear.setBorderPainted(false);
		Officewear.setForeground(Color.GRAY);
		
		
		RINGS.add(Cocktail=new JMenuItem("Cocktail"));
		Cocktail.setFont(new Font("Times New Roman",Font.BOLD,15));
		Cocktail.setOpaque(true);
		Cocktail.setContentAreaFilled(false);
		Cocktail.setBorderPainted(false);
		Cocktail.setForeground(Color.GRAY);
		
		RINGS.add(Multifinger=new JMenuItem("Multi-finger"));
		Multifinger.setFont(new Font("Times New Roman",Font.BOLD,15));
		Multifinger.setOpaque(true);
		Multifinger.setContentAreaFilled(false);
		Multifinger.setBorderPainted(false);
		Multifinger.setForeground(Color.GRAY);
		
		RINGS.add(Platinumbands=new JMenuItem("Platinum Bands"));
		Platinumbands.setFont(new Font("Times New Roman",Font.BOLD,15));
		Platinumbands.setOpaque(true);
		Platinumbands.setContentAreaFilled(false);
		Platinumbands.setBorderPainted(false);
		Platinumbands.setForeground(Color.GRAY);
		
		RINGS.add(Navratna=new JMenuItem("Navratna"));
		Navratna.setFont(new Font("Times New Roman",Font.BOLD,15));
		Navratna.setOpaque(true);
		Navratna.setContentAreaFilled(false);
		Navratna.setBorderPainted(false);
		Navratna.setForeground(Color.GRAY);

		RINGS.add(Pearl=new JMenuItem("Pearl"));
		Pearl.setFont(new Font("Times New Roman",Font.BOLD,15));
		Pearl.setOpaque(true);
		Pearl.setContentAreaFilled(false);
		Pearl.setBorderPainted(false);
		Pearl.setForeground(Color.GRAY);
		
		
		RINGS.setFont(new Font("Times New Roman",Font.BOLD,20));
		RINGS.setForeground(Color.BLACK);
		
		
		EARRINGS.add(Studs=new JMenuItem("Studs"));
		Studs.setFont(new Font("Times New Roman",Font.BOLD,15));
		Studs.setOpaque(true);
		Studs.setContentAreaFilled(false);
		Studs.setBorderPainted(false);
		Studs.setForeground(Color.GRAY);
		
		
		EARRINGS.add(Drops=new JMenuItem("Drops"));
		Drops.setFont(new Font("Times New Roman",Font.BOLD,15));
		Drops.setOpaque(true);
		Drops.setContentAreaFilled(false);
		Drops.setBorderPainted(false);
		Drops.setForeground(Color.GRAY);

		EARRINGS.add(Suidhaga=new JMenuItem("Suidhaga"));
		Suidhaga.setFont(new Font("Times New Roman",Font.BOLD,15));
		Suidhaga.setOpaque(true);
		Suidhaga.setContentAreaFilled(false);
		Suidhaga.setBorderPainted(false);
		Suidhaga.setForeground(Color.GRAY);
		
		EARRINGS.add(Jhumkas=new JMenuItem("Jhumkas"));
		Jhumkas.setFont(new Font("Times New Roman",Font.BOLD,15));
		Jhumkas.setOpaque(true);
		Jhumkas.setContentAreaFilled(false);
		Jhumkas.setBorderPainted(false);
		Jhumkas.setForeground(Color.GRAY);
		
		EARRINGS.add(Chandbali=new JMenuItem("Chandbali"));
		Chandbali.setFont(new Font("Times New Roman",Font.BOLD,15));
		Chandbali.setOpaque(true);
		Chandbali.setContentAreaFilled(false);
		Chandbali.setBorderPainted(false);
		Chandbali.setForeground(Color.GRAY);
		
		EARRINGS.add(Hoops=new JMenuItem("Hoops"));
		Hoops.setFont(new Font("Times New Roman",Font.BOLD,15));
		Hoops.setOpaque(true);
		Hoops.setContentAreaFilled(false);
		Hoops.setBorderPainted(false);
		Hoops.setForeground(Color.GRAY);
		
		EARRINGS.add(Earcuffs=new JMenuItem("Earcuffs"));
		Earcuffs.setFont(new Font("Times New Roman",Font.BOLD,15));
		Earcuffs.setOpaque(true);
		Earcuffs.setContentAreaFilled(false);
		Earcuffs.setBorderPainted(false);
		Earcuffs.setForeground(Color.GRAY);
		
		EARRINGS.add(Nawratnaearring=new JMenuItem("Nawratna Earrings"));
		Nawratnaearring.setFont(new Font("Times New Roman",Font.BOLD,15));
		Nawratnaearring.setOpaque(true);
		Nawratnaearring.setContentAreaFilled(false);
		Nawratnaearring.setBorderPainted(false);
		Nawratnaearring.setForeground(Color.GRAY);
		
		EARRINGS.add(Mismatchearring=new JMenuItem("Mismatch Earring"));
		Mismatchearring.setFont(new Font("Times New Roman",Font.BOLD,15));
		Mismatchearring.setOpaque(true);
		Mismatchearring.setContentAreaFilled(false);
		Mismatchearring.setBorderPainted(false);
		Mismatchearring.setForeground(Color.GRAY);
		
		EARRINGS.setFont(new Font("Times New Roman",Font.BOLD,20));
		EARRINGS.setForeground(Color.BLACK);
		
		PENDANTS.add(Alphabet=new JMenuItem("Alphabet"));
		Alphabet.setFont(new Font("Times New Roman",Font.BOLD,15));
		Alphabet.setOpaque(true);
		Alphabet.setContentAreaFilled(false);
		Alphabet.setBorderPainted(false);
		Alphabet.setForeground(Color.GRAY);
		PENDANTS.add(Religious=new JMenuItem("Religious"));
		Religious.setFont(new Font("Times New Roman",Font.BOLD,15));
		Religious.setOpaque(true);
		Religious.setContentAreaFilled(false);
		Religious.setBorderPainted(false);
		Religious.setForeground(Color.GRAY);
		PENDANTS.add(Fashion=new JMenuItem("Fashion"));
		Fashion.setFont(new Font("Times New Roman",Font.BOLD,15));
		Fashion.setOpaque(true);
		Fashion.setContentAreaFilled(false);
		Fashion.setBorderPainted(false);
		Fashion.setForeground(Color.GRAY);
		PENDANTS.add(Heartshaped=new JMenuItem("Heart Shaped"));
		Heartshaped.setFont(new Font("Times New Roman",Font.BOLD,15));
		Heartshaped.setOpaque(true);
		Heartshaped.setContentAreaFilled(false);
		Heartshaped.setBorderPainted(false);
		Heartshaped.setForeground(Color.GRAY);
		PENDANTS.add(Locket=new JMenuItem("Locket"));
		Locket.setFont(new Font("Times New Roman",Font.BOLD,15));
		Locket.setOpaque(true);
		Locket.setContentAreaFilled(false);
		Locket.setBorderPainted(false);
		Locket.setForeground(Color.GRAY);
		PENDANTS.add(Officewear1=new JMenuItem("Office Wear"));
		Officewear1.setFont(new Font("Times New Roman", Font.BOLD,15));
		Officewear1.setOpaque(false);
		Officewear1.setContentAreaFilled(false);
		Officewear1.setBorderPainted(false);
		Officewear1.setForeground(Color.GRAY);
		PENDANTS.add(Zodiac=new JMenuItem("Zodiac"));
		Zodiac.setFont(new Font("Times New Roman", Font.BOLD,15));
		Zodiac.setOpaque(false);
		Zodiac.setContentAreaFilled(false);
		Zodiac.setBorderPainted(false);
		Zodiac.setForeground(Color.GRAY);
		PENDANTS.add(Navratna1=new JMenuItem("Navratna"));
		Navratna1.setFont(new Font("Times New Roman", Font.BOLD,15));
		Navratna1.setOpaque(false);
		Navratna1.setContentAreaFilled(false);
		Navratna1.setBorderPainted(false);
		Navratna1.setForeground(Color.GRAY);
		PENDANTS.setFont(new Font("Times New Roman",Font.BOLD,20));
		PENDANTS.setForeground(Color.BLACK);
		
		BANGLES.add(Dailywear=new JMenuItem("Dailywear"));
		Dailywear.setFont(new Font("Times New Roman", Font.BOLD,15));
		Dailywear.setOpaque(false);
		Dailywear.setContentAreaFilled(false);
		Dailywear.setBorderPainted(false);
		Dailywear.setForeground(Color.GRAY);
		BANGLES.add(Diamonds=new JMenuItem("Diamonds"));
		Diamonds.setFont(new Font("Times New Roman", Font.BOLD,15));
		Diamonds.setOpaque(false);
		Diamonds.setContentAreaFilled(false);
		Diamonds.setBorderPainted(false);
		Diamonds.setForeground(Color.GRAY);
		BANGLES.add(Kadas=new JMenuItem("Kadas"));
		Kadas.setFont(new Font("Times New Roman", Font.BOLD,15));
		Kadas.setOpaque(false);
		Kadas.setContentAreaFilled(false);
		Kadas.setBorderPainted(false);
		Kadas.setForeground(Color.GRAY);
		BANGLES.add(OfficeWear=new JMenuItem("Officewear"));
		OfficeWear.setFont(new Font("Times New Roman", Font.BOLD,15));
		OfficeWear.setOpaque(false);
		OfficeWear.setContentAreaFilled(false);
		OfficeWear.setBorderPainted(false);
		OfficeWear.setForeground(Color.GRAY);
		BANGLES.add(EternityBangles=new JMenuItem("Eternity Bangles"));
		EternityBangles.setFont(new Font("Times New Roman", Font.BOLD,15));
		EternityBangles.setOpaque(false);
		EternityBangles.setContentAreaFilled(false);
		EternityBangles.setBorderPainted(false);
		EternityBangles.setForeground(Color.GRAY);
		BANGLES.add(Fashion1=new JMenuItem("Fashion"));
		Fashion1.setFont(new Font("Times New Roman", Font.BOLD,15));
		Fashion1.setOpaque(false);
		Fashion1.setContentAreaFilled(false);
		Fashion1.setBorderPainted(false);
		Fashion1.setForeground(Color.GRAY);
		BANGLES.setFont(new Font("Times New Roman",Font.BOLD,20));
		BANGLES.setForeground(Color.BLACK);
		
		SOLITAIRES.add(SolitaireRing=new JMenuItem("Solitaire Ring"));
		SolitaireRing.setFont(new Font("Times New Roman", Font.BOLD,15));
		SolitaireRing.setOpaque(false);
		SolitaireRing.setContentAreaFilled(false);
		SolitaireRing.setBorderPainted(false);
		SolitaireRing.setForeground(Color.GRAY);
		SOLITAIRES.add(SolitairePendants=new JMenuItem("Solitaire Pendants"));
		SolitairePendants.setFont(new Font("Times New Roman", Font.BOLD,15));
		SolitairePendants.setOpaque(false);
		SolitairePendants.setContentAreaFilled(false);
		SolitairePendants.setBorderPainted(false);
		SolitairePendants.setForeground(Color.GRAY);
		SOLITAIRES.add(Engagement=new JMenuItem("Solitaire Earring"));
		Engagement.setFont(new Font("Times New Roman", Font.BOLD,15));
		Engagement.setOpaque(false);
		Engagement.setContentAreaFilled(false);
		Engagement.setBorderPainted(false);
		Engagement.setForeground(Color.GRAY);
		
		SOLITAIRES.setFont(new Font("Times New Roman",Font.BOLD,20));
		SOLITAIRES.setForeground(Color.BLACK);
		
		ALLJEWLLRY.add(Bracelets=new JMenuItem("Bracelets"));
		Bracelets.setFont(new Font("Times New Roman", Font.BOLD,15));
		Bracelets.setOpaque(false);
		Bracelets.setContentAreaFilled(false);
		Bracelets.setBorderPainted(false);
		Bracelets.setForeground(Color.GRAY);
		
		ALLJEWLLRY.add(DiamondJewllery=new JMenuItem("Diamond Jewllery"));
		DiamondJewllery.setFont(new Font("Times New Roman", Font.BOLD,15));
		DiamondJewllery.setOpaque(false);
		DiamondJewllery.setContentAreaFilled(false);
		DiamondJewllery.setBorderPainted(false);
		DiamondJewllery.setForeground(Color.GRAY);
		ALLJEWLLRY.add(NosePins=new JMenuItem("NOSE PINS"));
		NosePins.setFont(new Font("Times New Roman", Font.BOLD,15));
		NosePins.setOpaque(false);
		NosePins.setContentAreaFilled(false);
		NosePins.setBorderPainted(false);
		NosePins.setForeground(Color.GRAY);
		ALLJEWLLRY.add(GoldJewllery=new JMenuItem("Gold Jewllery"));
		GoldJewllery.setFont(new Font("Times New Roman", Font.BOLD,15));
		GoldJewllery.setOpaque(false);
		GoldJewllery.setContentAreaFilled(false);
		GoldJewllery.setBorderPainted(false);
		GoldJewllery.setForeground(Color.GRAY);
		ALLJEWLLRY.add(Necklaces=new JMenuItem("Neck Laces"));
		Necklaces.setFont(new Font("Times New Roman", Font.BOLD,15));
		Necklaces.setOpaque(false);
		Necklaces.setContentAreaFilled(false);
		Necklaces.setBorderPainted(false);
		Necklaces.setForeground(Color.GRAY);
		
		ALLJEWLLRY.add(GemstoneJewllery=new JMenuItem("Gemstone Jewllery"));
		GemstoneJewllery.setFont(new Font("Times New Roman", Font.BOLD,15));
		GemstoneJewllery.setOpaque(false);
		GemstoneJewllery.setContentAreaFilled(false);
		GemstoneJewllery.setBorderPainted(false);
		GemstoneJewllery.setForeground(Color.GRAY);
		
		ALLJEWLLRY.setFont(new Font("Times New Roman",Font.BOLD,20));
		ALLJEWLLRY.setForeground(Color.BLACK);
		
		GIFTS.add(ValentinesDay=new JMenuItem("Valetines Day"));
		ValentinesDay.setFont(new Font("Times New Roman", Font.BOLD,15));
		ValentinesDay.setOpaque(false);
		ValentinesDay.setContentAreaFilled(false);
		ValentinesDay.setBorderPainted(false);
		ValentinesDay.setForeground(Color.GRAY);
		GIFTS.add(Anniversary=new JMenuItem("Anniversary"));
		Anniversary.setFont(new Font("Times New Roman", Font.BOLD,15));
		Anniversary.setOpaque(false);
		Anniversary.setContentAreaFilled(false);
		Anniversary.setBorderPainted(false);
		Anniversary.setForeground(Color.GRAY);
		GIFTS.add(BirthDay=new JMenuItem("BirthDay"));
		BirthDay.setFont(new Font("Times New Roman", Font.BOLD,15));
		BirthDay.setOpaque(false);
		BirthDay.setContentAreaFilled(false);
		BirthDay.setBorderPainted(false);
		BirthDay.setForeground(Color.GRAY);
		GIFTS.add(Engagement1=new JMenuItem("Engagement"));
		Engagement1.setFont(new Font("Times New Roman",Font.BOLD,15));
		Engagement1.setOpaque(true);
		Engagement1.setContentAreaFilled(false);
		Engagement1.setBorderPainted(false);
		Engagement1.setForeground(Color.GRAY);
		
		GIFTS.add(Wedding=new JMenuItem("Wedding"));
		Wedding.setFont(new Font("Times New Roman",Font.BOLD,15));
		Wedding.setOpaque(true);
		Wedding.setContentAreaFilled(false);
		Wedding.setBorderPainted(false);
		Wedding.setForeground(Color.GRAY);
		
		GIFTS.setFont(new Font("Times New Roman",Font.BOLD,20));
		GIFTS.setForeground(Color.BLACK);
		
		FASTDELIVERY.add(NextDayDelivery=new JMenuItem("Next Day Delivery"));
		NextDayDelivery.setFont(new Font("Times New Roman",Font.BOLD,15));
		NextDayDelivery.setOpaque(true);
		NextDayDelivery.setContentAreaFilled(false);
		NextDayDelivery.setBorderPainted(false);
		NextDayDelivery.setForeground(Color.GRAY);
		
		FASTDELIVERY.setFont(new Font("Times New Roman",Font.BOLD,20));
		FASTDELIVERY.setForeground(Color.BLACK);
		
		COIN.add(gram2=new JMenuItem("2 Gram"));
		gram2.setFont(new Font("Times New Roman",Font.BOLD,15));
		gram2.setOpaque(true);
		gram2.setContentAreaFilled(false);
		gram2.setBorderPainted(false);
		gram2.setForeground(Color.GRAY);
		COIN.add(gram5=new JMenuItem("5 Gram"));
		gram5.setFont(new Font("Times New Roman",Font.BOLD,15));
		gram5.setOpaque(true);
		gram5.setContentAreaFilled(false);
		gram5.setBorderPainted(false);
		gram5.setForeground(Color.GRAY);
		COIN.add(gram10=new JMenuItem("10 Gram"));
		gram10.setFont(new Font("Times New Roman",Font.BOLD,15));
		gram10.setOpaque(true);
		gram10.setContentAreaFilled(false);
		gram10.setBorderPainted(false);
		gram10.setForeground(Color.GRAY);
		COIN.add(gram20=new JMenuItem("20 Gram"));
		gram20.setFont(new Font("Times New Roman",Font.BOLD,15));
		gram20.setOpaque(true);
		gram20.setContentAreaFilled(false);
		gram20.setBorderPainted(false);
		gram20.setForeground(Color.GRAY);
		COIN.add(gram50=new JMenuItem("50 Gram"));
		gram50.setFont(new Font("Times New Roman",Font.BOLD,15));
		gram50.setOpaque(true);
		gram50.setContentAreaFilled(false);
		gram50.setBorderPainted(false);
		gram50.setForeground(Color.GRAY);
		
		COIN.setFont(new Font("Times New Roman",Font.BOLD,20));
		COIN.setForeground(Color.BLACK);
		
		
		OURSTORE.add(nomakingcharge=new JMenuItem("No Making Charge"));
		nomakingcharge.setFont(new Font("Times New Roman",Font.BOLD,15));
		nomakingcharge.setOpaque(true);
		nomakingcharge.setContentAreaFilled(false);
		nomakingcharge.setBorderPainted(false);
		nomakingcharge.setForeground(Color.GRAY);
		
		OURSTORE.add(Offers=new JMenuItem("Offers"));
		Offers.setFont(new Font("Times New Roman",Font.BOLD,15));
		Offers.setOpaque(true);
		Offers.setContentAreaFilled(false);
		Offers.setBorderPainted(false);
		Offers.setForeground(Color.GRAY);
		
		OURSTORE.setFont(new Font("Times New Roman",Font.BOLD,20));
		OURSTORE.setForeground(Color.BLACK);
		for(int i=0;i<b.length;i++)
		{
			b[i].addActionListener(this);
		}
		b[7].addActionListener(this);
		for(int i=0;i<b.length;i++)
		{
			b[i].addMouseListener(this);
		}
		b[7].addMouseListener(this);
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
		//l1.addMouseListener(this);
		//l2.addMouseListener(this);
		jmb.addMouseListener(this);
		
		tf.addFocusListener(this);
		
		
		
		jf.setVisible(true);
		jf.setSize(2000,2000);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
		
		
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==b[7])
		  {
			 
			 new Account();//move to login page
			// jf.dispose();
			 
		  }
		if(ae.getSource()==b[3])
		  {
			 
			 new Gold();//move to login page
			 //jf.dispose();
			 
		  }
		  if(ae.getSource()==b[4])
		  {
			new Starting();//move to signup page
			//jf.dispose();
		  }
		  if(ae.getSource()==b[2])
		  {
			  new Rg();
		  }
		
	}

	public static void main(String[] args)
	{
		new Starting();

	}

	
	@Override
	public void mouseClicked(MouseEvent ae) 
	{
		
//		 Cursor s=new Cursor(Cursor.WAIT_CURSOR);
//		 b[7].setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
	}

	@Override
	public void mouseEntered(MouseEvent ae) {
		// TODO Auto-generated method stub
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
		// b[9].setCursor(new Cursor(Cursor.HAND_CURSOR));
//		 Cursor v=new Cursor(Cursor.WAIT_CURSOR);
//		 b[7].setCursor(new Cursor(Cursor.WAIT_CURSOR));
		 
	}

	@Override
	public void mouseExited(MouseEvent ae) 
	{
		 
		
	}

	@Override
	public void mousePressed(MouseEvent arg0)
	{
		
		 Cursor s=new Cursor(Cursor.HAND_CURSOR);
		 b[7].setCursor(new Cursor(Cursor.HAND_CURSOR));
	}

	@Override
	public void mouseReleased(MouseEvent arg0)
	{
		
		
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
