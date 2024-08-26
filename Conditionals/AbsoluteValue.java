package Conditionals;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		if(num<0)
		{
			num=num* (-1);
		}
		System.out.println("Absolute value is: "+num);

	}

}
