package upcasting;

public class main {

	public static void main(String[] args) {
		
		Animale m = new Mucca();  // upacasting
	 //   Animale m1 = (Animale) m;
	//    m1.mangia();
	     
		Mucca mu = new Mucca();
		
		Animale m1 = mu;
		m1.mangiaA();
		
		
		
	    //muc.mangiaA();
	    //muc.mangia();
		
	//	m.mangiaA();
		
	//    ((Animale) m).mangiaA();
	
	}

}
