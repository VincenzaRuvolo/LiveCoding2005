package esempiogenerics;

/*
 * Esempio di Bounded wildcard
 * E exstends Number indica che il tipo generico E sarà sottoclasse di 
 * Number (upper bound)
 * 
 * limite superiore (Number e sottotipi di Number)
 * 
 * 
 */
public class Aritmetica <E extends Number> { //E -> Element
	
	private E elemento;
	
	public Aritmetica(E elemento) {
		this.elemento = elemento;
	}
	
	public E getElemento() {
		return elemento;
	}
	
	public void setElemento(E elemento) {
		this.elemento = elemento;
	}
	
	public void calcolaQuadrato() {
		//doubleValue() -> è un metodo che restituisce il valore del numero specificato
		//come un double ed è un metodo della classe Number
		System.out.println("Il quadrato di elemento è  " +  elemento.doubleValue() * elemento.doubleValue());
	}
}
