package upcasting;

public class Mucca extends Animale{
	
	void mangia() {
			System.out.println("Sono Mucca mangio ERBAA!");
	}
	
	@Override
	void mangiaA() {
		System.out.println("sono animale Mucca quindi MANGIO ERBA!");
	}
	
	void verso () {
		System.out.println("MUUUUUUU");
	}

}
