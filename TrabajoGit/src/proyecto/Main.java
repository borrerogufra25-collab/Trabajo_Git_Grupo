package proyecto;

public class Main {

	public static void main(String[] args) {

		Documento d1 = new Documento("Salesianos", "Triana");
        TarjetaDeVisita t1 = new TarjetaDeVisita("Salesianos", "Triana");
        Carta c1 = new Carta("Salesianos", "Triana", "09/01/2026", "Entorno");
        
        
        
        d1.imprimirEncabezado();
        t1.imprimirEncabezado();
        c1.imprimirEncabezado();
		
		
		
	}

}
