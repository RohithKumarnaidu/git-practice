package lambda;

import java.util.function.BiFunction;

public class Sum {


	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> sum = (a,b) -> a+b;
		int c = sum.apply(10, 20);
		System.out.println("Sum of two numbers: "+c);

	}

}
