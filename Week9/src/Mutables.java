import java.awt.Point;
import java.awt.Rectangle;
import java.util.Scanner;
public class Mutables {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Point blank;
		blank = new Point(3, 4);
		Point carBrake = new Point(12, 7);
		int x = blank.x;
		blank.x = 6;
		
		printPoint(blank);
		double distance = findDistance(carBrake, blank);
		System.out.println(distance);
		
		Rectangle box = new Rectangle(10, 20, 100, 200);
		System.out.println(box);
		
		printPoint(findCenter(box));
		
		box.translate(-10, -20);
		printPoint(findCenter(box));
		
		System.out.println("Please enter in 5 words");
		StringBuilder text = new StringBuilder();
		for(int i = 0; i < 5; i++)
		{
			String line = input.next();
			text.append(line);
			text.append('\n');
		}
		System.out.println("you entered:\n" + text);

	}
/*************************Methods******************************/
	
	private static Point findCenter(Rectangle box) {
			int x = box.x + box.width / 2;
			int y = box.y + box.height / 2;
			return new Point(x, y);
	}
	
	
	private static double findDistance(Point carBrake, Point blank) {
			int dx = carBrake.x - blank.x;
			int dy = carBrake.y - blank.y;
			return Math.sqrt(dx * dx + dy * dy);
	}

	private static void printPoint(Point blank) {
			System.out.println(blank.x + ", " + blank.y);
			
	}
	
}
