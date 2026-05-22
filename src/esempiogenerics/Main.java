package esempiogenerics;

public class Main {

	
	public static void main(String[] args) {
		
		// T -> String
		ContenitoreGenerics<String, Double> cg = new ContenitoreGenerics<>("Ciao", 25.5);
		System.out.println(cg.getAttributoGenerico());
		
		String[] arrayS = new String[5];
		String[] arrayStringhe = {"Ciao", "Mondo", "!"};
		
		// T -> String[]
		ContenitoreGenerics<String[], String> cg1 = new ContenitoreGenerics<>(arrayStringhe, "Mondo");
		System.out.println(cg1.getAttributoGenerico());
		
		String[] array = cg1.getAttributoGenerico();
		System.out.println(array[1]);
		
		// T -> Integer
		ContenitoreGenerics<Integer, String> cg2 = new ContenitoreGenerics<>(5, "Ciao");
		System.out.println(cg2.getAttributoGenerico());
		
		String stringa = "Prova";
		cg.metodoGenerico("Prova di Stampa");
		cg.metodoGenerico(stringa); //String
		
		WildCardTest.getValue(25);
		WildCardTest.getValue(25.5);
		WildCardTest.getValue(25.3f);
		//WildCardTest.getValue("Ciao"); impossibile solo Number e sue sottoclassi
		
		
		cg1.metodoGenerico(array); //String[]
		
		cg2.metodoGenerico(5);
		int numero = 10;		
		cg2.metodoGenerico(numero); //int -> Integer
		
		System.out.println("-------------");
		System.out.println("-------------");
		System.out.println("-------------");
		System.out.println("-------------");
		System.out.println("-------------");
		
		Aritmetica<Double> a1 = new Aritmetica<>(10.25);
		Aritmetica<Integer> a2 = new Aritmetica<>(1000000);
		a1.calcolaQuadrato();
		a2.calcolaQuadrato();
		//Errore -> String non è sottoclasse di Number
		//Aritmetica<String> a3 = new Aritmetica<>("Ciao");
	}
}
