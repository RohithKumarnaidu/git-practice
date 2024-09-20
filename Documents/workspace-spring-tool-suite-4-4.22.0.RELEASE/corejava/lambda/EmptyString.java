package lambda;

import java.util.function.Predicate;

public class EmptyString {

	public static void main(String[] args) {
		
		
		Predicate<String> empty = s -> s.isEmpty();

		String s1 = "";
		String s2 = "Rohith";
		
		System.out.println("The given String is: "+empty.test(s1));
		System.out.println("The given String is: "+empty.test(s2));
	}

}
