package Conditionals;

import java.util.Scanner;

public class AriaPerimeterGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter length:");
		int l = sc.nextInt();
		System.out.println("Enter breadth:");
		int b = sc.nextInt();
		int area = l*b;
		int perimeter = 2*(l+b);
		
		if (area>perimeter)
		{
			System.out.println("Area is greater than Perimeter");
		}
		else
		{
			System.out.println("Perimeter is greater than Aria ");
		}
		
	}

}
