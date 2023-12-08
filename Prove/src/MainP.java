import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainP {
	
	static final List<String> cities = Arrays.asList("Delhi", "Mumbai", "Goa", "Pune");
	
	static private List<String> supplyCities() {

	    Supplier<String[]> citySupplier = () -> {
	        return new String[]{"Mumbai", "Delhi", "Goa", "Pune"};
	    };
		return  Arrays.asList(citySupplier.get());
	}
	
	public static void printCities(List<String> cities) {

		// accepts an argument and returns a boolean
	    Predicate<String> filterCity = city -> city.equals("Mumbai") || city.equals("Pune");
	  
	    Consumer<String> printConsumer = city-> { 
	    	// questa è l'implementazione del metodo accept dell'intefaccua Consumer
	    	String cityf = "->"+city+"<-";
	    	System.out.println(cityf);
	    };
		cities.stream().filter(filterCity).forEach(printConsumer);
	}	
	
	public static void printFirstCharOfCities(List<String> cities) {
		

	    Function<String, Character> getFirstCharFunction = city -> {
	        return city.charAt(0);
	    };
	    cities.stream().map(getFirstCharFunction)
	                   .forEach(System.out::println);
		
	}
	
	public static void predicateEx (Integer num) {
		
		Predicate<Integer> isEven = i -> i % 2 == 0;
		Predicate<Integer> isPos = i -> i > 0;
		
		Predicate<Integer> combinedPredicate = isEven.or(isPos);
		System.out.println(combinedPredicate.test(num));
		
	}
	

	public static void main(String[] args) {
		int i = 0;

//		Consumer<Integer> c1 = (a) -> {
//			System.out.println(i);
//		};
//
//		c1.accept(i);
//
		printCities(cities);
//		printFirstCharOfCities(supplyCities());
		predicateEx(1500);
		
		
	}
		
		

}
