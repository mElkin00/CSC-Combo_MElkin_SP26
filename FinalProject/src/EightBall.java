import java.util.Random;

public class EightBall {

	private String[] pos = { "It is certain", "it is decidedly so",
			"Without a doubt", "Yes definitely",
			"You may rely on it", "As I see it, yes",
			"Most likely", "Outlook good", "Yes", "Signs point to yes" };

	private String[] negs = { "Don't count on it", "My reply is no",
			"My sources say no", "Outlook not so good",
			"Very doubtful" };

	private String[] ok = { "Reply hazy, try again", "Ask again later",
			"Better not tell you now", "Cannot predict now",
			"Concentrate and ask again" };
	
	
	
	public String respond() {
		Random rand = new Random();
		int num = rand.nextInt(3);
		String respond = "";
		
		if(num == 0) {
			num = rand.nextInt(10);
			respond = pos[num];
		}
		else if( num == 1) {
			num = rand.nextInt(5);
			respond = negs[num];
		}
		else {
			num = rand.nextInt(5);
			respond = ok[num];
		}
		return respond;
	}	
}
