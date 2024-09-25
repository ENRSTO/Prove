package FunzionalInterfacePKG;

import java.util.function.Consumer;
import java.util.function.Function;

public class FuncInterface {

	@FunctionalInterface
	interface Operatores {
		int calcola(int a, int b);
	}

	@FunctionalInterface
	interface MyFunction {
		int apply(int x);
	}

	static Function<String, String> toUppercase = String::toUpperCase;

	public static void main(String[] args) {


		MyFunction square = x -> x*x;



		Operatores somma = (a,b) -> a + b;
		Operatores mult = (a,b) -> a * b;

		System.out.println(somma.calcola(5, 3));
		System.out.println(mult.calcola(5, 3));
		Consumer<String> greet = name -> System.out.println("Hello, " + name + "!");
		greet.accept("World");

		System.out.println(square.apply(5));

		String result = toUppercase.apply("ciao");
		System.out.println(result); // Output: CIAO


	} // prova


}


