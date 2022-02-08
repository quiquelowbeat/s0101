package n3exercici1;

public class Main {

	public static void main(String[] args) {
		
		Derivada d = new Derivada();
		
		Base b = (Base) d;
		
		Base c = new Base(); // test
		
		b.metode1(); // Imprimeix a consola el mètode2 de la clase Derivada.
		c.metode1(); 
	}

}
