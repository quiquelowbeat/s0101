package n1exercici8;

public class Frog extends Amphibian {

	public Frog() {
		
	}
	
	public void saltar() {
		System.out.println("Salta.");
	}
	
	public void moure() {
		System.out.println("La rana se mueve.");
	}
	

	public void respirar() {
		System.out.println("La rana respira.");
	}

	public void menjar(boolean comeInsectos) {
		String comida = (comeInsectos) ? "La rana come insectos." : "La rana no come insectos.";
		System.out.println(comida);
	}
}
