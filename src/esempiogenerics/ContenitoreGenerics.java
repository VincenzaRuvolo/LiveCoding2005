package esempiogenerics;

/*
 * Generics -> tipo parametrizzato
 * Si possono creare classi, interfacce e metodi per i quali il tipo di dato
 * sul quale si lavora può essere specificato come parametro
 * 
 * Il tipo può essere un parametro, la notazione NomeClasse<Tipo> serve a indicare
 * un oggetto di classe NomeClasse e T sta per Type, Tipo serve a indicare la tipologia 
 * di dato 
 * 
 * permettono di riutilizzare il codice in modo sicuro dal punto di vista dei tipi
 */

public class ContenitoreGenerics<T, T1> {

	private T attributoGenerico;
	public T1 attributoGenerico1;

	public ContenitoreGenerics() {

	}

	public ContenitoreGenerics(T attributoGenerico, T1 attributoGenerico1) {
		this.attributoGenerico = attributoGenerico;
		this.attributoGenerico1 = attributoGenerico1;
	}

	public T getAttributoGenerico() {
		return attributoGenerico;
	}

	public void setAttributoGenerico(T attributoGenerico) {
		this.attributoGenerico = attributoGenerico;
	}

	//ritorna un oggetto di tipo T
	//getClass() -> è un metodo di Object che restituisce la tipologia di classe
	public T metodoGenerico(T parametro) {
		System.out.println("Il tipo di oggetto è " + parametro.getClass());
		return parametro;
	}
	
	//Confronto con la classe Aritmetica
	public void calcolaQuadrato() {
		//attributoGenerico non ha accesso ai metodi di Number 
		System.out.println("Il quadrato di elemento è  " + attributoGenerico);
	}
}
