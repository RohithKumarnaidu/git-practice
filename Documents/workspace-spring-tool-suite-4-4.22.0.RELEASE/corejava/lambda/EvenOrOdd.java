package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOrOdd {

	public static void main(String[] args) {
		List<Integer> list  = Arrays.asList(5,3,5,2,78,45,25);            //step 1
		List<Integer> evenNumbers = list.stream().filter(n -> n%2==0).collect(Collectors.toList());
		List<Integer> oddNumbers = list.stream().filter(n -> n%2!=0).collect(Collectors.toList());    //step 2
		System.out.println("Even numbers: " +evenNumbers);
		System.out.println("Odd numbers: " +oddNumbers);          //step 3

	}

}
