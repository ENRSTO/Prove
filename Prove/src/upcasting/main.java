package upcasting;

public class main {

	public static void main(String[] args) {
		
		Animale m = new Mucca();  // upacasting implicito (è un riferimento che punta ad un oggetto di tipo animale o una sua sottoclasse (es. mucca)
		m.setName("Carolina");
		System.out.println(m.getName());
		m.mangiaA();  // questo 
	
		Mucca m1 = new Mucca();
		m1.superMangia();
	
        ((Animale) m).metodoAnimale(); 
	
	}

}
