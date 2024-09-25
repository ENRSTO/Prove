package Functiones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	static Integer sum(final List<Integer> numbers) {
	    return numbers.stream().collect(Collectors.summingInt(Integer::intValue));
	} // sum 
	
	static void singleStream () {
		
		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
		listOfNumbers.stream().forEach(number ->
		    System.out.println(number + " " + Thread.currentThread().getName())
		);
		
	}
	
	static void paralStream () {
		
		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
		listOfNumbers.parallelStream().forEach(number ->
		    System.out.println(number + " " + Thread.currentThread().getName())
		);
		
	}

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(8);
		numbers.add(1);

		Collections.sort(numbers, (n1, n2) -> n1.compareTo(n2));

		System.out.println(numbers);
		System.out.println("---------------");
		System.out.println(sum(numbers));
		
		System.out.println("---------------");
		singleStream();
		System.out.println("---------------");
		paralStream();
		
	}

}
