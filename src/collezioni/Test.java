package collezioni;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
	
	public static void main(String[] args) {
		
		/*
		 * Collection è la super interfaccia che raggruppa e gestisce più oggetti
		 * List -> è l'interfaccia
		 * ArrayList -> è la classe concreta 
		 */
		
		//Collection<String> collezione = new Collection<>(); //impossibile
		
		//uso del polimorfismo
		Collection<String> collezione = new ArrayList<>();
		List<String> arrayList1 = new ArrayList<>();
		//di solito non si implementa con la classe ma con l'interfaccia
		ArrayList<String> arrayList2 = new ArrayList<>();
		
		
		collezione = new LinkedList<>(); //possibile perchè siamo con Collection
		arrayList1 = new LinkedList<>(); //possibile perchè siamo con List
		//arrayList2 = new LinkedList<>(); //impossibile la classe è ArrayList
		
		/*
		 * Metodo add() serve per aggiungere elementi alla collezione
		 * add(E element) -> tipo generico (può essere String, Integer, ecc)
		 * Restituisce un boolean
		 * TRUE -> se l'elemento è stato aggiunto con successo
		 * FALSE -> se l'elemento non è stato aggiunto 
		 * 
		 */
		collezione.add("Ciao");
		collezione.add("Mondo");
		collezione.add("!");
		collezione.add("Ciao");
		collezione.add("Ciao");
		collezione.add("30");
		
		/*
		 * Iterator it -> permette di scorrere la collezione, elemento per elemento
		 * 
		 * hasNext() -> restitusce TRUE se ci sono ancora elementi
		 * 
		 * next() -> restituisce l'elemento
		 * 
		 * remove() -> rimuove un elemento
		 */
		Iterator<String> it = collezione.iterator();
		while(it.hasNext()) {
			String stringa = it.next();
			System.out.println(stringa);
			
			if (stringa.equals("!")) {
				it.remove();
			}
			
		}
		
		for(String s : collezione) {
			System.out.println(s);
		}
	}

}
