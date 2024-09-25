package FunzionalInterfacePKG;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceEx {

	public static void main(String[] args) {

		 Consumer<String> c1 = p -> System.out.println(p);
		 List<String> nomi = Arrays.asList("Anna", "Luca", "Marco", "Giulia");
		 nomi.forEach(c1);

	}

}
