import java.util.Random;
/** 
 * Game of guessing a secret number.
 * @author Wasuthun               
 */

public class GuessingGame
{/* properties of a guessing game */
	   //TODO Declare variables for attributes of the game

	private int secert;
	private String hint;
private int upperBound;
/**
 * Initialize a new game.
 * @param upperbound is the max value for the secret number (>1).
 */

public GuessingGame(int upperbound)
{// this is a constructor
	this.upperBound=upperbound;
	this.secert=getRandomNumber(upperbound);
	
	
	}
/** 
 * Create a random number between 1 and limit.
 * @param limit is the upper limit for random number
 * @return a random number between 1 and limit (inclusive)
 */

private int getRandomNumber(int limit){
	long seed=System.currentTimeMillis();
	Random rand=new Random(seed);
	return rand.nextInt(limit)+1;
}/**
*Checked that the number is equal secret number or not
*@param number
*@return true if the number is equal secret number,false 
*/
public boolean guess (int number){
	if(number<this.secert){
		this.hint="Sorry,your guess is too small";
		return false;
	}
	else if(number>this.secert){
		this.hint="Sorry,your guess is too large";
		return false;
	}else{
		this.hint="Correct.The secret is";
		return true;
	}
	
}
/**
 * this method use set value hint
 * @param hint
 */
public void setHint(String hint){
	this.hint=hint;
	
}
/**
 * this method use return value
 * @return hint
 */
public String getHint(){
	//TODO complete this.  Its easy!
	return this.hint;
}
}