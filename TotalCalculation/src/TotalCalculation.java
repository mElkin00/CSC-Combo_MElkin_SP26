import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TotalCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total = myFileReader("items.txt");
		double sub = total;
		double tax = 0.053;
		total = sub + (sub * tax);
		
		File myFile = myFileWriter("totals.txt");
		writeToFile(myFile, total, sub, tax);
		
	}

	private static File myFileWriter(String fileName) {
		File file = null;
		try {
			file = new File(fileName);
			if(file.createNewFile()) {
				System.out.println("File creater "+ file.getName());
			}
			else {
				System.out.println("File already exists.");
			}
		}
		catch (Exception e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		return file;
	}

	private static void writeToFile(File file, double total, double sub, double tax) {
		try(FileWriter myWriter = new FileWriter(file)) {
			String temp = String.format("The subtotal is $ %.2f\n", sub);
			myWriter.write(temp);
			temp = String.format("The tax is $%.2f\n", tax);
			myWriter.write(temp);
			temp = String.format("The total is $ %.2f\n", total);
			myWriter.write(temp);
			System.out.println("Success, data written to the file.");
		} catch (Exception e) {
			System.out.println("Write failed.");
			e.printStackTrace();
		}
		
	}
	
	

	private static double myFileReader(String fileName) {
		File file = new File(fileName);
		double total = 0;
		try(Scanner myReader = new Scanner(file)) {
			while(myReader.hasNextDouble()) {
				total += myReader.nextFloat();
			}
		} catch (Exception e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		return total;
	}
	

}
