 import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
import javax.sound.sampled.AudioSystem;
import java.io.IOException;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image; 
import java.awt.event.*;
import java.awt.Font;
import java.awt.PointerInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.MouseInfo;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.util.Scanner;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import java.net.URL;
import java.io.File;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import java.awt.Image; 
import java.awt.event.*;
import java.awt.Font;
import java.awt.PointerInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.MouseInfo;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.io.*;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;
import java.net.URL;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Table extends JFrame implements MouseListener, ActionListener
{
	private BufferedImage buffered;
	private ArrayList<Card> deck;

	int points = 10;
	int card = 2;
	int score = 0; 
	int bet = 0;
	boolean canHit = false;
	boolean canStand = false;
	int playermax;
	int dealermax;
	boolean canLose = false;
	boolean canWin = false;
	boolean canSave = false;
	private int sum;
	private int dealersum;
	Random r = new Random();
	Image image5;
	Image backround;
	Image save;
	Image chip;
	Image cardBack;
	Image money;
	ImageIcon saveFile;
	boolean showcard;


	public Table()
	{
		
		super("BlackJack");
		image5 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/icon.png"));
		backround = Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/aaa.png"));
		chip = Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/chip3.png"));
		save = Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/save.png"));
		cardBack = Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/cardBack.jpg"));
		money = Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/money.png"));
		saveFile = new ImageIcon(save);
		deck = new ArrayList<Card>();
		playermax = 1;
		dealermax = 1;
		score = 100;
		showcard = false;
		


        
       
		deck.add(new Card(2, "two", "clubs"));
		deck.add(new Card(2, "two", "diamonds"));
		deck.add(new Card(2, "two", "hearts"));
		deck.add(new Card(2, "two", "spades"));
		deck.add(new Card(3, "three", "clubs"));
		deck.add(new Card(3, "three", "diamonds"));
		deck.add(new Card(3, "three", "hearts"));
		deck.add(new Card(3, "three", "spades"));
		deck.add(new Card(4, "four", "clubs"));
		deck.add(new Card(4, "four", "diamonds"));
		deck.add(new Card(4, "four", "hearts"));
		deck.add(new Card(4, "four", "spades"));
		deck.add(new Card(5, "five", "clubs"));
		deck.add(new Card(5, "five", "diamonds"));
		deck.add(new Card(5, "five", "hearts"));
		deck.add(new Card(5, "five", "spades"));
		deck.add(new Card(6, "six", "clubs"));
		deck.add(new Card(6, "six", "diamonds"));
		deck.add(new Card(6, "six", "hearts"));
		deck.add(new Card(6, "six", "spades"));
		deck.add(new Card(7, "seven", "clubs"));
		deck.add(new Card(7, "seven", "diamonds"));
		deck.add(new Card(7, "seven", "hearts"));
		deck.add(new Card(7, "seven", "spades"));
		deck.add(new Card(8, "eight", "clubs"));
		deck.add(new Card(8, "eight", "diamonds"));
		deck.add(new Card(8, "eight", "hearts"));
		deck.add(new Card(8, "eight", "spades"));
		deck.add(new Card(9, "nine", "clubs"));
		deck.add(new Card(9, "nine", "diamonds"));
		deck.add(new Card(9, "nine", "hearts"));
		deck.add(new Card(9, "nine", "spades"));
		deck.add(new Card(10, "ten", "clubs"));
		deck.add(new Card(10, "ten", "diamonds"));
		deck.add(new Card(10, "ten", "hearts"));
		deck.add(new Card(10, "ten", "spades"));
		deck.add(new Card(10, "jack", "clubs"));
		deck.add(new Card(10, "jack", "diamonds"));
		deck.add(new Card(10, "jack", "hearts"));
		deck.add(new Card(10, "jack", "spades"));
		deck.add(new Card(10, "queen", "clubs"));
		deck.add(new Card(10, "queen", "diamonds"));
		deck.add(new Card(10, "queen", "hearts"));
		deck.add(new Card(10, "queen", "spades"));
		deck.add(new Card(10, "king", "clubs"));
		deck.add(new Card(10, "king", "diamonds"));
		deck.add(new Card(10, "king", "hearts"));
		deck.add(new Card(10, "king", "spades"));
		deck.add(new Card(11, "ace", "clubs"));
		deck.add(new Card(11, "ace", "diamonds"));
		deck.add(new Card(11, "ace", "hearts"));
		deck.add(new Card(11, "ace", "spades"));
		getRandom();
		getRandom();
		getRandom();
		getRandom();
		setSize(1000,600);
		setVisible(true);
		setIconImage(image5);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
	

	}
	public void paint(Graphics window)
	{

		sum = 0; 
		dealersum = 0;
		//bet=0;
		//Create a buffered Image
		if(buffered==null)
		   buffered = (BufferedImage)(createImage(getWidth(),getHeight()));
		Graphics windowTemp = buffered.createGraphics();



		

        windowTemp.drawImage(backround, 0, 5, this);
   		windowTemp.drawImage(money, 740, 260, this);
        

        windowTemp.drawString(getScore()+"$", 845, 255);
		int x = 100;
		for(int i = 0; i<=playermax; i++)
		{
			deck.get(i).drawMe(windowTemp, x, 375, this);
			x = x +150;
			sum = sum + deck.get(i).getValue();
		}
		windowTemp.drawString(sum+"", 590, 345);
		if(sum>21)
		{
			windowTemp.drawString("BUST", 500, 500);
			canLose = true;
			lose();
			repaint();
			
		}
		if(sum==21)
		{
			showcard = true;
			repaint();
		}

		

		
		int x1 = 100;
		for(int i = 26; i<=26+dealermax; i++)
		{

			deck.get(i+1).drawMe(windowTemp, x1, 60, this);
			x1 = x1 +150;
			dealersum = dealersum + deck.get(i).getValue();
		}

		if(showcard != true||sum>21)
		{
			windowTemp.drawImage(cardBack, 100, 60, this);
			//windowTemp.fillRect(100, 60, 120, 150);
			
		}
		if(dealersum<17&&showcard==true)
		{
			dealermax++;
			repaint();
		}
		
		if((dealersum>=17&&dealersum<=21&&showcard==true)&&(sum>=17&&sum<=21))
		{	
			if(dealersum==sum)
			{
				windowTemp.drawString("TIE", 600, 400);
			}
			if(dealersum>sum)
			{
				windowTemp.drawString("YOU LOSE!!!", 600, 400);
				canLose = true;
				lose();
				repaint();
			}
			else
			{
				
				windowTemp.drawString("YOU WIN!!!", 600, 400);
				canWin = true;
				win();
				repaint();
				
			}
		}
		if(dealersum>21)
		{
			windowTemp.drawString("YOU WIN!!!", 600, 400);
		}
		if(showcard != false)	
			windowTemp.drawString(dealersum+"", 590, 50);
		drawButton(windowTemp);
		windowTemp.drawImage(chip, 465, 280-8, this);
		windowTemp.setColor(Color.WHITE);
		windowTemp.fillRoundRect(50, 500, 200, 75, 20, 20);
		windowTemp.fillRoundRect(275, 500, 200, 75, 20, 20);
		windowTemp.fillRoundRect(500, 500, 200, 75, 20, 20);
		windowTemp.fillRoundRect(910, 505, 80, 40, 20, 20);
		windowTemp.fillRoundRect(910, 555, 80, 40, 20, 20);
		windowTemp.setColor(Color.BLACK);
		windowTemp.drawRoundRect(50, 500, 200, 75, 20, 20);
		windowTemp.drawRoundRect(275, 500, 200, 75, 20, 20);
		windowTemp.drawRoundRect(500, 500, 200, 75, 20, 20);
		windowTemp.drawRoundRect(910, 505, 80, 40, 20, 20);
		windowTemp.drawRoundRect(910, 555, 80, 40, 20, 20);
		windowTemp.drawString("Hit", 75, 550);
		windowTemp.drawString("Stand", 300, 550);
		windowTemp.drawString("RESTART", 525, 550);
		
		if(bet<10)
			windowTemp.drawString(getBet()+"", 482, 315-8);
        if(bet>=10)
        	windowTemp.drawString(getBet()+"", 475, 315-8);		

        windowTemp.drawString("Save", 920, 585);
		windowTemp.drawString("Open", 920, 540);

		

		window.drawImage(buffered, 0, 0, null);

	}
	//@Override
	public void mouseClicked(MouseEvent e) 
    {
    	
  		playSound1();
    	int x = e.getX();
    	int y = e.getY();
    	System.out.println(x+", "+y);
    	if(x>50&&x<250&&y>500&&y<575)
    	{
    		hit();
    		//canSave = true;
    	}
    	if(x>275&&x<475&&y>500&&y<575)
    	{
			showcard = true;
		}
		if(x>500&&x<700&&y>500&&y<575)
    	{
			reStart();
		}
		if(x>910&&x<990&&y>555&&y<595)
		{
			try 
      		{
      	   		save();
      		}
      		catch (IOException ioe)
      		{
        	 throw new RuntimeException(ioe);
      		}
      	}
      	if(x>910&&x<990&&y>505&&y<545)
      	{
      		try 
      		{
      	   		read();
      		}
      		catch (IOException ioe)
      		{
        		throw new RuntimeException(ioe);
      		}
      	}
      	if(x>530&&x<560&&y>270&&y<290)
      	{
      		
      		bet = bet+1;
      		System.out.println(bet);
      		repaint();

      	}
      	if(x>530&&x<560&&y>300&&y<320&&bet>0)
      	{
      		bet = bet-1;
      		System.out.println(bet);
      		repaint();
      	}	
    	repaint();

		
	 	
    	
   
	}
	public int getBet()
	{
		return bet;
	}
 
	public boolean canSave()
	{
		return canSave;
	}
	public void hit()
	{
		if(sum<=21)
			playermax++;
		repaint();
	}
	public void getRandom()
	{
		for(int i = 0; i<1000; i++)
		{
			int a = r.nextInt(52);
			int b = r.nextInt(52);
			Card temp = deck.get(a);
			deck.set(a, deck.get(b));
			deck.set(b, temp);

		}

		repaint();
	}
	public void mouseEntered(MouseEvent e) 
    {
		
	}
	public void mouseExited(MouseEvent e) 
	{
	}
	public void mousePressed(MouseEvent e) 
	{
		
	}
	public void mouseReleased(MouseEvent e) 
	{
		
	}

    public void stand()
    {
     


    }
    public void actionPerformed(ActionEvent e) 
    {
    }
    public void save() throws IOException
    {
    	PrintWriter writer = new PrintWriter(new FileWriter(System.getProperty("user.dir")+"/savedFiles/outputfile.txt")); 
		System.out.println(System.getProperty("user.dir"));
		writer.print(score); 
		writer.close();
		JOptionPane.showMessageDialog(null, "Your file is saved at "+System.getProperty("user.dir")+"/savedFiles/outputfile.txt");
    }
    public void read() throws IOException
    {
    	JFrame frame = new JFrame();
    	File folder = new File(System.getProperty("user.dir")+"/savedFiles");
		String[] listOfFiles = folder.list();
    	
    	Object choice = JOptionPane.showInputDialog(frame, "Pick Your Saved Data", "Files", JOptionPane.INFORMATION_MESSAGE,
        saveFile, listOfFiles, "WAT");
        System.out.println(choice);




    	BufferedReader in = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/savedFiles/"+choice)); 
		String text = in.readLine(); 
		in.close();
		System.out.println(text);
		score = Integer.parseInt(text);
		repaint();
    }
    public void drawButton(Graphics window)
    {
    	window.setColor(Color.WHITE);
    	int [] x1 = {530, 545, 560}; 
    	int [] y1 = {280+10, 260+10, 280+10};
    	int [] x2 = {530, 545, 560};  
    	int [] y2 = {290+10, 310+10, 290+10};

    	window.fillPolygon(x1, y1, 3);
    	window.fillPolygon(x2, y2, 3);
    	window.setColor(Color.BLACK);
    	window.drawPolygon(x1, y1, 3);
    	window.drawPolygon(x2, y2, 3);
    }
    public void reStart()
    {
    	getRandom();
    	playermax = 1;
		dealermax = 1;
		showcard = false;
		repaint();
    }
    public void playSound() 
	{
        
       	try
    	{
	        Clip clip = AudioSystem.getClip();
	        clip.open(AudioSystem.getAudioInputStream(new File("JazzTip.wav")));
	        clip.start();
	        clip.loop(Clip.LOOP_CONTINUOUSLY);
    	}
    	catch (Exception exc)
    	{
        	exc.printStackTrace(System.out);
    	}
    
	}
	public void playSound1() 
	{
        
       	try
    	{
	        Clip clip = AudioSystem.getClip();
	        clip.open(AudioSystem.getAudioInputStream(new File("button-10.wav")));
	        clip.start();
    	}
    	catch (Exception exc)
    	{
        	exc.printStackTrace(System.out);
    	}
    
	}
	public void playSound2() 
	{
        
       	try
    	{
	        Clip clip = AudioSystem.getClip();
	        clip.open(AudioSystem.getAudioInputStream(new File("coin.wav")));
	        clip.start();
	        clip.loop(0);
	        
    	}
    	catch (Exception exc)
    	{
        	exc.printStackTrace(System.out);
    	}
    
	}
	public void lose()
	{
		score = score - bet;
		bet = 0;
	}
	public void win()
	{
			
		score = score + bet;
		bet = 0;
		playSound2();
	}
	public int getScore()
	{
		return score;
	}
   
    

}
