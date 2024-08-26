package Conditionals;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter first number: ");
		int number = sc.nextInt();
		
		if (number%2 == 0 )
		{
			System.out.println("The Number you entered is Even.");
		}
		else
		{
			System.out.println("The Number you entered is Odd.");
		}

	}

}
