package esempiriferimenti;

import java.util.HashMap;
import java.util.Map;

public class mainPr {

	public static void main(String[] args) {
		
		
		Map<String, String> originalMap = new HashMap<>();
        originalMap.put("chiave1", "valore1");
        originalMap.put("chiave2", "valore2");
        
        Map<String, String> newMap = originalMap;
        Map<String, String> newMapCopy = new HashMap<String, String>(newMap); 
        
     //   newMapCopy = originalMap;
        newMap.put("chiave3", "valore3");
        
        newMapCopy.put("ehh", "si vede?");

        // Modifica della nuova mappa
        
        // Verifica se la modifica ha impattato anche l'originale
        System.out.println("Original Map: " + originalMap);
        System.out.println("New Map: " + newMap);
        System.out.println("NewMapCopy: " + newMapCopy);
		

	}

}
