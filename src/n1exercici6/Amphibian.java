package n1exercici6;

public class Amphibian {
	
	public Amphibian() {
		
	}
	
	public void moure() {
		System.out.println("El amfibio se mueve.");
	}
	

	public void respirar() {
		System.out.println("El amfibio respira.");
	}

	public void menjar(boolean comeInsectos) {
		String comida = (comeInsectos) ? "El amfibio come insectos." : "El amfibio no come insectos.";
		System.out.println(comida);
	}
}
