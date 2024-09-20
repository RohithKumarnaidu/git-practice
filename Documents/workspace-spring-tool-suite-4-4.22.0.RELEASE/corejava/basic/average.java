package basic;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
//		int a = 2;
//		int b = 3;
//		int c = 4;
//		int avg = a+b+c/3;
//		System.out.println(avg);
		
		Scanner s = new Scanner(System.in);
		double sum = 0;
		System.out.println("Enter the numbers: ");
		for (int i=0;i<3;i++) {
			int n = s.nextInt();
			sum += n;
		}
double average = sum/3;
System.out.println(average);
	}

}
