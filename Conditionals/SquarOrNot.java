package Conditionals;

import java.util.Scanner;

public class SquarOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length:");
		int l = sc.nextInt();
		System.out.println("Emter breadth:");
		int b = sc.nextInt();
		if(l==b)
		{
			System.out.println("It is Squar");
		}
		else
		{
			System.out.println("not Squar");
		}

	}

}
