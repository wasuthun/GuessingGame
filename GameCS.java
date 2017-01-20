import java.util.Scanner;

public class GameCS
{/**
	  *The play method plays a game using input from a user
	  *@param game is new object of GussingGame class
	  *@return num is number which user input
	  **/
public int play(GuessingGame game){
	Scanner s=new Scanner(System.in);
	System.out.println("Gussing Game");
	System.out.println("your guess?");
	int num=s.nextInt();
while(!game.guess(num)){
	System.out.println(game.getHint());
	num=s.nextInt();
}
System.out.println("Correct.The secret is "+num);
return num;
}

/** create objects and start the game */

	public static void main(String[] args)
	{
		GuessingGame game =new GuessingGame(20);
		GameCS ui=new GameCS();
		ui.play(game);

	}

}