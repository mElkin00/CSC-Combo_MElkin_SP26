package wk5_class;

import java.util.Scanner;

public class ForFibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which level of the fibonocci do you want to go to?");
		int num1, num2, count;
		
		num1 = 0;
		num2 = 1;
		count = input.nextInt();
		if(count == 1) System.out.println(num1);
		else if(count == 2) System.out.println(num2);
		System.out.println(num1 +"\n" + num2);
		for(int i = 2; i < count; i ++)
		{
			int num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
		System.out.println(/****************/);
		num1 = 0;
		num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		int i = 2;//initializer
		while(i < count) {//condition
			
			int num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
			i ++;//changer
			
		}

		}
	}

