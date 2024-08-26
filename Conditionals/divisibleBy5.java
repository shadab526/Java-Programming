package Conditionals;

import java.util.Scanner;

public class divisibleBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a Number:");
		int Number = sc.nextInt();
		if(Number%5 == 0)
		{
			System.out.println("The number is divisible by 5");
		}
		else
		{
			System.out.println("The number is not divisible by 5");
		}

	}

}
