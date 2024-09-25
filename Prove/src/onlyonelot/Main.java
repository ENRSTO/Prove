package onlyonelot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Cnlot> listaLotti = new ArrayList<>();
		List<Cnlot> lottiUnificati = new ArrayList<>();
		listaLotti.add(new Cnlot("A123", 10));
		listaLotti.add(new Cnlot("B456", 5));
		listaLotti.add(new Cnlot("A123", 8));
		listaLotti.add(new Cnlot("C789", 3));
		listaLotti.add(new Cnlot("B456", 2));

		if (contieneDuplicati(listaLotti)){
		    lottiUnificati = unisciLotti(listaLotti);
		}
		for (Cnlot lotto : lottiUnificati) {
			System.out.println(lotto);
		}
	}
	
	public static boolean contieneDuplicati(List<Cnlot> lotti) {
	    Set<String> codiciLotti = new HashSet<>();

	    for (Cnlot lotto : lotti) {
	        if (!codiciLotti.add(lotto.getCodiceLotto())) {
	            return true; // Se il lotto è già presente, c'è un duplicato
	        }
	    }
	    return false; // Nessun duplicato trovato
	}


	public static List<Cnlot> unisciLotti(List<Cnlot> lotti) {
		Map<String, Integer> mappaLotti = new HashMap<>();

		// Raggruppa i lotti sommando le quantità
		for (Cnlot lotto : lotti) {
			mappaLotti.put(lotto.getCodiceLotto(), 
					mappaLotti.getOrDefault(lotto.getCodiceLotto(), 0) + lotto.getQuantita());
		}

		// Crea una nuova lista con i lotti unificati
		List<Cnlot> risultato = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : mappaLotti.entrySet()) {
			risultato.add(new Cnlot(entry.getKey(), entry.getValue()));
		}

		return risultato;
	}


}
