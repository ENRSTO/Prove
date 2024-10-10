package upcasting;

public class Animale {
	
	protected String name;  // protected accessibile da una classe che estende questa (animale) collocata in altro package 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void mangiaA() {
		System.out.println("sono animale quindi MANGIO!");
	}
	
}
