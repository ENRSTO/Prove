import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainP {
	
	// sono branch 15 
	
	public static void printCities() {
	    
	    List<String> cities = new ArrayList<>();
	    cities.add("Delhi");
	    cities.add("Mumbai");
	    cities.add("Goa");
	    cities.add("Pune");
	    
	    Consumer<String> printConsumer = city-> {
	    	String cityf = "->"+city+"<-";
	    	System.out.println(cityf);
	    };
	    
	    // qui il corpo della lambda defisce l'implementazione del metodo accept del consumer 
	    
	    cities.forEach(printConsumer);
	    
	    // 
	}	

	public static void main(String[] args) {
		int i = 0;

		Consumer<Integer> c1 = (a) -> {
		    System.out.println(i);
		};
		
		c1.accept(i);
//
		printCities();
		
		
		
	}
		
		

}
