package onlyonelot;

public class Cnlot {
	
	    private String codiceLotto;
	    private int quantita;

	    public Cnlot(String codiceLotto, int quantita) {
	        this.codiceLotto = codiceLotto;
	        this.quantita = quantita;
	    }

	    public String getCodiceLotto() {
	        return codiceLotto;
	    }

	    public int getQuantita() {
	        return quantita;
	    }

	    public void setQuantita(int quantita) {
	        this.quantita = quantita;
	    }

	    @Override
	    public String toString() {
	        return "Lotto: " + codiceLotto + ", Quantità: " + quantita;
	    }
	

}
