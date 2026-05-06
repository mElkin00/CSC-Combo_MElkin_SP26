import java.util.Random;

public class EightBall {
	
	// this contains all the possible positive responses
	private String[] pos = { "It is certain", "it is decidedly so",
			"Without a doubt", "Yes definitely",
			"You may rely on it", "As I see it, yes",
			"Most likely", "Outlook good", "Yes", "Signs point to yes" };
	
	// this contains all the possible negative responses
	private String[] negs = { "Don't count on it", "My reply is no",
			"My sources say no", "Outlook not so good",
			"Very doubtful" };

	// this contains all the possible neutral responses
	private String[] ok = { "Reply hazy, try again", "Ask again later",
			"Better not tell you now", "Cannot predict now",
			"Concentrate and ask again" };
	
	
	// this is used to determine what response will be chosen
	public String respond() {
		// this is used to choose a random number to select what kind of response to use
		Random rand = new Random();
		int num = rand.nextInt(3);
		String respond = "";
		
		// if the random number is 0, it will choose a positive response
		if(num == 0) {
			num = rand.nextInt(10);
			respond = pos[num];
		}
		// if the random number is 1, it will choose a negative response
		else if( num == 1) {
			num = rand.nextInt(5);
			respond = negs[num];
		}
		// otherwise it will choose a neutral response
		else {
			num = rand.nextInt(5);
			respond = ok[num];
		}
		return respond;
	}	
}
