package wk5_class;

import java.util.Scanner;

public class ForFibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, num3;
		
		num1 = 0;
		num2 = 1;
		int count = input.nextInt();
		if(count == 1) System.out.println(num1);
		else if(count == 2) System.out.println(num2);
		
		System.out.println(num1 +"\n" + num2);
		for(int i = 0; i < count; i ++)
		{
			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}

		}
	}

