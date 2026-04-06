import java.util.ArrayList;
import java.util.Scanner;

public class ArrayReversal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] nums = new int[] {input.nextInt()};
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < 100; j++) {
				if(nums[i] == -1) {
					j = 100;
					System.out.println(nums);
				}
				else {
					nums[i] = input.nextInt();
					System.out.println(nums);
				}
			}
			//System.out.println(ArrayList<Integer>nums());
		}

	}

}
