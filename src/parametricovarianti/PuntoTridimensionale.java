package parametricovarianti;

public class PuntoTridimensionale extends Punto {
	
	//Sovrascrive il metodo della classe Punto
//	@Override
//	public double distanza(Punto punto) {
//		return 10.5;
//	}
	
	/*
	 * Senza @Override crea un altro metodo
	 * Con @Override -> mi segnale che il metodo distanza prende un oggetto Punto
	 * e non un oggetto PuntoTridimensionale
	 */
	//@Override
	public double distanza (PuntoTridimensionale puntoTridimensionale) {
		return 10.5;
	}

}
