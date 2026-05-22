package collezioni;

import java.util.Map;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Mappa {

	public static void main(String[] args) {

		/*
		 * Map -> Interfaccia costituita da una serie di coppie chiave e valore
		 * 
		 * key -> chiave, elemento univoco, non ci sono valori duplicati value -> valore
		 * legato alla chiave
		 * 
		 * Map<Integer, String> -> Integer tipo di dato per la chiave, String per il
		 * valore HasgMap -> clase concreta che implementa Map, non ordinata
		 * 
		 */

		Map<Integer, String> mappa = new HashMap<>();

		// put() -> inserisce elementi oppure aggiorna il valore

		mappa.put(2, "Elia");
		mappa.put(4, "Leone");
		mappa.put(6, "Paola");
		mappa.put(1, "Carmen");
		mappa.put(5, "Giovanna");
		mappa.put(2, "Mario");

		// Stampare solo le chiavi
		for (Integer s : mappa.keySet()) {
			System.out.println(s);
		}
		System.out.println("-----------------");
		// Stampare i valori
		for (String s : mappa.values()) {
			System.out.println(s);
		}
		System.out.println("-----------------");
		System.out.println("-----------------");
		System.out.println("-----------------");
		/*
		 * Stampare chiavi e valori
		 * 
		 * Map.Entry -> scorre le chiavi e i valori
		 * entrySet() -> restituisce un insieme, un set di oggetti Map.Entry
		 * getKey() -> restituisce la chiave corrente
		 * getValue() -> restituisce il valore corrente
		 */
		
		for (Map.Entry<Integer, String> m : mappa.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("-----------------");
		//size() -> estituicse il numero di elementi 
		System.out.println(mappa.size());
		
		System.out.println("-----------------");
		//containsValue() -> controlla se è presente quel valore, restituisce un boolean
		System.out.println(mappa.containsValue("Leone"));
		
		System.out.println("-----------------");
		//containsKey() -> controlla se è presente quella chiave, restituisce un boolean
		System.out.println(mappa.containsKey(3));
		
		/*
		 * SortedMap -> interfaccia
		 * TreMap -> classe concreta
		 */
		SortedMap<String, String> automobili = new TreeMap<>();
		automobili.put("ASD012", "Alfa Romeo");
		automobili.put("VRI882", "Fiat 500");
		automobili.put("S7D332", "Fiat Panda");
		automobili.put("BYT776", "Alfa Romeo");
		automobili.put("MKI999", "Audi TT");
		System.out.println("-----------------");
		System.out.println(automobili);
		
		
		
	}

}
