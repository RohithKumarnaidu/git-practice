package basic;

import java.util.Scanner;

public class productoftwonumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input first number: ");
		int a = s.nextInt();
		System.out.println("Input second number: ");
		int b = s.nextInt();
		int product = a*b;
		System.out.println(product);
	}

}
