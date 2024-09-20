package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Uppercase {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>(
				Arrays.asList("Rohith", "Kumar"));
		
		Function <String, String> upperCase = s -> s.toUpperCase();
		Function <String, String> lowerCase = s -> s.toLowerCase();
		
		List<String> upperCaseString = new ArrayList<>();
		for(String s: list) {
			upperCaseString.add(upperCase.apply(s));
		}

	}

}
