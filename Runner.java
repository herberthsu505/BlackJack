import java.io.IOException;

public class Runner
{
   public static void main(String args[]) throws IOException
   {
     
      
      Table game = new Table();
      game.playSound();
      while(true)
      {
      	if(game.canSave()==true)
      	{
      		game.save();
      		//game.read();
      	}
      }

       
   }
}
