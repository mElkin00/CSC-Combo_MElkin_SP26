import java.util.Random;

public class Responses extends EightBall {

		private String response;
		Random rand = new Random();
		int num = rand.nextInt(3);
	
		String[] negs = { "Don't count on it", "My reply is no", "My sources say no", "Outlook not so good",
				"Very doubtful" };
	
		String[] ok = { "Reply hazy, try again", "Ask again later", "Better not tell you now", "Cannot predict now",
				"Concentrate and ask again" };
	
		String[] pos = {"It is certain", "it is decidedly so",
				"Without a doubt", "Yes definitely", "You may rely on it", "As I see it, yes",
				"Most likely", "Outlook good", "Yes", "Signs point to yes"};
		
}

