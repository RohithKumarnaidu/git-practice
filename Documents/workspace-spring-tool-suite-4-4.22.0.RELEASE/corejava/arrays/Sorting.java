package arrays;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
	  int numArray[] = {1,2,3,5,8,0,90,23,45};
	  System.out.println("Array: " +Arrays.toString(numArray));
	  Arrays.sort(numArray);
	  System.out.println("Sorted Array: " +Arrays.toString(numArray));

	  String textArray[] = { "Rohith", "kumar", "tiruveedhi", "Phone"};
	  System.out.println("String Array: " +Arrays.toString(textArray));
	  Arrays.sort(textArray);
	  System.out.println("Sorted String Array: " +Arrays.toString(textArray));
	}

}
