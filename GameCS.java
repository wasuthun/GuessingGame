import java.util.Scanner;

public class GameCS
{/**
	  *The play method plays a game using input from a user and count times
	  *@param game is new object of GussingGame class
	  *@return num is number which user input
	  **/
	private int count;
public int play(GuessingGame game){
	Scanner s=new Scanner(System.in);
	System.out.println("Gussing Game");
	System.out.println("your guess?");
	int num=s.nextInt();
	count=1;
while(!game.guess(num)){
	System.out.println(game.getHint());
	num=s.nextInt();
	count++;
}
System.out.println("Correct.The secret is "+num);
System.out.println("Count"+count);
return num;
}
/**
 * this method use return value of count
 * @return count
 */
public int getCount(){
	return count;
}

/** create objects and start the game */

	public static void main(String[] args)
	{
		GuessingGame game =new GuessingGame(20);
		GameCS ui=new GameCS();
		ui.play(game);

	}

}