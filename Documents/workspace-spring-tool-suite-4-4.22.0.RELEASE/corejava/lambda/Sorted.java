package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		
		List<String> wordsList = Arrays.asList("Rohith","Kumar","Tiruveedhi");        //step 1
//		List<String> sortedWords = wordsList.stream().sorted(String :: compareTo).collect(Collectors.toList()); 
		List<String> sortedWords = wordsList.stream().sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList());//step 2
		System.out.println(sortedWords);       //step 3

	}

}
