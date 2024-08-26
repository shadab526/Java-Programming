package Conditionals;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Cost Price:");
		int cp = sc.nextInt();
		System.out.print("Enter Selling Price:");
		int sp = sc.nextInt();
		if(sp>cp)
		{
			System.out.print("You eanred profit is Rs:");
			System.out.println(sp-cp);
		}
		else
		{
			System.out.print("Your loss is Rs:");
			System.out.println(cp-sp);
		}

	}

}
