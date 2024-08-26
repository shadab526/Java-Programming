package Conditionals;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		if(year%4==0)
		{
			System.out.println("Entered year is Leap Year.");
		}
		else
		{
			System.out.println("Entered year is not Leap Year.");
		}

	}

}
