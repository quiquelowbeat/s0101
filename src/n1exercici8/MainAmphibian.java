package n1exercici8;

public class MainAmphibian {

	public static void main(String[] args) {
		
		// Amphibian frog1 = new Frog();
		/*
		 * Utilizando la generarización Amphibian los métodos respirar(), moure() y menjar() retornan los valores
		 * definidos en la clase Amphibian. El método saltar() no funciona.
		 */
		Frog frog1 = new Frog();
		/*
		 * Utilizando la clase Frog los métodos respirar(), moure() y menjar() retornan los valores
		 * definidos en la clase Frog. El método saltar() funciona.
		 */
		
		frog1.respirar();
		frog1.moure();
		frog1.menjar(false);
		
		frog1.saltar(); 
		
	}

}
