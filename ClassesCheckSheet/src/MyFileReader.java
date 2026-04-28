import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyFileReader {
	File file;
	ArrayList<Course> crsList = new ArrayList<>();

	public MyFileReader(String fileName) {
		file = new File(fileName);
		try (Scanner myReader = new Scanner(file)) {
			
			
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}

	}	
}
