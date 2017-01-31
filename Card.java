import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
 
public class Card 
{
    private int value;
    private String suit;
    private String name;
     
    private Image suitImage;
    private int height;
    private int width;
     
    public Card(int value, String name, String suit)
    {
        this.value = value;
        this.name = name;
        this.suit = suit;
         
        this.width = 120;
        this.height = 150;
         
        if( suit.equals("hearts") )
        {
            suitImage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/heart.png"));
        }
        if( suit.equals("clubs") )
        {
            suitImage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/club.png"));
        }
        if( suit.equals("diamonds") )
        {
            suitImage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/diamond.png"));
        }
        if( suit.equals("spades") )
        {
            suitImage = Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/spade.png"));
        }
    }
     
    public void drawMe(Graphics window, int x, int y, JFrame table)
    {
        window.setColor(Color.white);
        window.fillRoundRect(x,y,this.width,this.height, 10, 10);
        window.setColor(Color.black);
        window.drawRoundRect(x,y,this.width,this.height, 10, 10);
         
        Font font = new Font("Arial", Font.PLAIN, 25);
        window.setFont(font);
         
        if( this.suit.equals("hearts")||this.suit.equals("diamonds") )
        {
            window.setColor( Color.red );
        }
        
        if( name.equals("jack") )
        {
            window.drawString("J", x+80, y+25);
        }
        else if( name.equals("queen") )
        {
            window.drawString("Q", x+80, y+25);
        }
        else if( name.equals("king") )
        {
            window.drawString("K", x+80, y+25);
        }
        else if( name.equals("ace") )
        {
            window.drawString("A", x+80, y+25);
        }
        else
        {
            //if(!name.equals("ace")||!name.equals("king")|| !name.equals("queen")||!name.equals("jack"))
        
            window.drawString(this.value+"", x+80, y+25);
        
        }
        window.drawImage(suitImage, x+5, y+10, table);
    }
    public int getValue()
    {
    	return value;
    }
}