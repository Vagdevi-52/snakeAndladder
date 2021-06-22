import java.util.Scanner;
public class SnakeAndLadder
{
public static void main(String[] args)
{
int playerposition=1;
System.out.println("welcome to snake and ladder");
System.out.println("player position is : "+playerposition);
int die = (int)Math.floor(Math.random() *10) % 7;
System.out.println("die rolled is :" +die);
int option =(int) (Math.floor(Math.random() * 10)%3);
switch(option)
{
case 0:
System.out.println("No play ");
playerposition += 0;
break;
case 1:
System.out.println("Ladder");
playerposition +=die;
break;
default: System.out.println("snake");
playerposition -=die;
if(playerposition<0)
playerposition=0;
}

System.out.println("player position is : "+playerposition);
}
}

