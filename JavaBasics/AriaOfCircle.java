package JavaBasics;

import java.util.Scanner;

public class AriaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Radiation:");
		double radius = sc.nextDouble();
		double aria = 3.14 * radius * radius;
		System.out.println("Aria of Circle is "+aria);

	}

}
