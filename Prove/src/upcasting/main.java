package upcasting;

public class main {

	public static void main(String[] args) {
		
		Animale m = new Mucca();  // upacasting implicito (è un riferimento che punta ad un oggetto di tipo animale o una sua sottoclasse (es. mucca)
		m.setName("Carolina");
		System.out.println(m.getName());
		m.mangiaA();  // questo 
		
		
		
		
		
		
		
		
	 //   Animale m1 = (Animale) m;
	//    m1.mangia();
	//     
	//	Mucca mu = new Mucca();
//		
		//Animale m1 = mu;
	//	m1.mangiaA();
//		
//		
		
	    //muc.mangiaA();
	    //muc.mangia();
		
	//	m.mangiaA();
		
	//    ((Animale) m).mangiaA();
	
	}

}
