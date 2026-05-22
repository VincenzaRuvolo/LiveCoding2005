package collezioni;

import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.LinkedList;

public class Liste {
	
	public static void main(String[] args) {
		
		/*
		 * List -> interfaccia di elementi ordinati, sono ammessi duplicati
		 * la seguenza in cui aggiungiamo gli elementi definisce l'ordine
		 */
		
		List<String> lista = new ArrayList<>();
		
		
		lista.add("Mario");
		lista.add("Carmen");
		lista.add("Paola");
		lista.add("Giovanna");
		lista.add("Elia");
		lista.add("Leone");
		lista.add("Mario");
		lista.add("Mario");
		lista.add(2,"MarioPosizione");
		//get(index) -> recuperare un elemento specificando l'indice
		System.out.println(lista.get(2));
		System.out.println(lista.get(5));
		
		
		//set(index, valore) -> aggiornare un elemento	
		lista.set(0, "Fabio");
		
		//remove(index) -> rimuove un elemento specificando l'indice
		lista.remove(0);
		System.out.println("-------------");
		//stampa
		for(String s : lista) {
			System.out.println(s);
		}
		System.out.println("-------------");
		
		/*
		 *  forEach() -> permette di iterare sugli elementi
		 *  
		 *  Funziona con le lambda, codice molto compatto
		 *  
		 *  n : lista parametri
		 *  ->
		 *  System.out.println(n) : istruzioni
		 *  
		 *   
		 */
		
		lista.forEach(n -> System.out.println(n));
		
		/*
		 * lambda espression -> funzione anonima, compatta
		 * s : parametro
		 * -> : separa input e codice
		 * System.out.println(s) : azione
		 */
		
		Consumer<String> stampa = s -> System.out.println(s);
		stampa.accept("Ciao Mondo");
		
		System.out.println("-------------");
		System.out.println("-------------");
		System.out.println("-------------");
		
		LinkedList<String> lettere = new LinkedList<>();
		
		lettere.add("A");
		lettere.add("B");
		lettere.add("C");
		lettere.add("D");
		lettere.add("E");
		lettere.add(2,"E");
		
		lettere.addFirst("V"); //aggiunge in testa
		lettere.addLast("R"); //aggiunge in coda
		
		for(String s : lettere) {
			System.out.println(s);
		}
		
	}

}
