package esempiogenerics;

import java.util.List;

public class WildCardTest {
	
	/*
	 * Metodo test accetta in ingresso una lista facendo uso della
	 * wildcard, il compilatore intende quella wildcard come se fosse
	 * object. Quando va a richiamare il metodo set() sulla lista
	 * il compilatore non ha la sicurezza della correttezza del tipo
	 * di datopassato come parametro della lista in ingresso (?)
	 * 
	 * 
	 */
	
	//? -> tipo è sconosciuto, non ci interessa conoscere il tipo preciso
	//vogliamo flessibilità 
	public void test(List<?> lista) { 
		lista.get(1); //la lettura è concessa
		//Errore -> perchè non sa che tipo di dato è, non è garantita la sicurezza
		//lista.set(0, lista.get(1)); //qui non è sicuro, il tipo è sconosciuto
		testHelper(lista);
	}
	
	/*
	 * Il metodo test riceve in ingresso una lista di T (una lista generica
	 * che per il compilatore ha però un tipo specifico che è proprio T il 
	 * quale verrà poi sostituito con il vero tipo quando si effettua la 
	 * parametrizzazione)
	 */
	
	private <T> void testHelper(List<T> lista) { //tutti gli elementi sono di tipo T
		//il metodo set() di collection rimpiazza il valore passato
		//come secondo parametro che si trova nella posizione specificata
		//come primo parametro del metodo
		//Scrivere lista.get(1) è come scrivere nel caso degli array array1[1]
		lista.set(0, lista.get(1)); //qui è sicuro, il tipo è conosciuto
	}
	
	
	//Invece un limite inferiore -> super Integer (Integer e superclassi di Integer)
	public void aggiungiElemento(List<? super Integer> lista) {
		lista.add(10);
		lista.get(0);
	}
	
	//metogo generico, limite superiore, possiamo passre solo parametri 
	//che sono di tipo number o sottotipi di esso (Integer, Double, Long, eccetera)
	public static <N extends Number> String getValue(N number) {
		return number.toString();
	}

}
