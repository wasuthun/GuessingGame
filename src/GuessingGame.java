import java.util.Random;

public class GuessingGame
{
	private int upperBound;
	private int secret;
	private String hint;

	public GuessingGame(int upperBound)
	{
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		this.hint = "I'm thinking of a number between 1 and " + upperBound;
	}

	public boolean guess(int number)
	{
		if (number == this.secret)
		{
			this.hint = "Correct.the secret is " + this.secret;
			return true;

		} else if (number < this.secret)
		{
			this.hint = "Sorry,your guess is too small";
			return false;
		} else
		{
			this.hint = "Sorry,your guess is too large";
			return false;
		}
	}

	public String getHint()
	{
		return this.hint;
	}

	private int getRandomNumber(int limit)
	{
		long seed = System.currentTimeMillis();
		Random random = new Random(seed);
		return random.nextInt(limit) + 1;
	}
}
