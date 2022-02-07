package n1exercici7;

public class MainAmphibian {

	public static void main(String[] args) {
		
		Amphibian frog1 = new Frog();
		
		frog1.respirar();
		frog1.moure();
		frog1.menjar(false);
		
		// frog1.saltar(); 
		// Error en la generarización. el método saltar solo funciona si declaramos Frog como clase frog.
	}

}
