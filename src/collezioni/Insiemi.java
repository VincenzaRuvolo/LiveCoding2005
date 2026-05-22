package collezioni;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Insiemi {
	
	public static void main(String[] args) {
		
		/*
		 * SET -> insieme non ordinato di elementi, NON sono ammessi duplicato
		 * 
		 * Set -> l'interfaccia
		 * 
		 * HashSet -> la classe concreta che implementa l'interfaccia
		 */
		
		
		Set<String> nomi = new HashSet<>();
		
		
		nomi.add("Mario");
		nomi.add("Carmen");
		nomi.add("Paola");
		nomi.add("Giovanna");
		nomi.add("Elia");
		nomi.add("Leone");
		nomi.add("Mario");
		nomi.add("Mario");
		//non posso specificare l'indice perchè non è ordinata
		//nomi.add(2,"MarioPosizione");
		
		//get(index) -> non puo recuperare un elemento specificando l'indice
	//	System.out.println(nomi.get(2));
		
		for(String s : nomi) {
			System.out.println(s);
		}
		
		System.out.println("-----------------");
		
		/*
		 * TreeSet -> classe concreta che impleemnta SortedSet
		 * non sono ammessi duplicati ma HA un ordinamento naturale
		 */
		TreeSet<String> nomiOrdinati = new TreeSet<>();
		
		nomiOrdinati.add("Renato");
		nomiOrdinati.add("Dario");
		nomiOrdinati.add("Antonino");
		nomiOrdinati.add("Elia");
		nomiOrdinati.add("Leone");
		
		for(String s : nomiOrdinati) {
			System.out.println(s);
		}
		
		System.out.println("-----------------");
	
		
		/*
		 * Set ordinato anche col metodo addAll()
		 * restituisce un SET ordinati secondo l'ordine alfabetico
		 * aggiungendo tutti gli elementi
		 * 
		 */
		nomiOrdinati.addAll(nomi);
		for(String s : nomiOrdinati) {
			System.out.println(s);
		}
	}
	
	

}
