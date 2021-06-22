import java.util.Scanner;

public class SnakeAndLadder
{
 public static void main(String[] args)
 {
   int playerposition=0;
   int winningposition=100;
   int Diecount=0;
   System.out.println("welcome to snake and ladder");
   while(winningposition>playerposition)
   {  
        int die = (int)Math.floor(Math.random() *10) % 7;
        Diecount++;
        System.out.println("die rolled is :" +die);
        int remainingposition=winningposition-playerposition;
        int option =(int) (Math.floor(Math.random() * 10)%3);
        if(remainingposition>=die)
        {
        switch(option)
        {
        case 0:
        System.out.println("No play " +0);
        playerposition += 0;
        break;
        case 1:
        System.out.println("Ladder" +die);
        playerposition +=die;
        break;
        default: System.out.println("snake" +die);
        playerposition -=die;
        if(playerposition<0)
        playerposition=-0;
    }
 System.out.println("player position is : "+playerposition);
 System.out.println("player position is : "+playerposition);
}
}
}
}
