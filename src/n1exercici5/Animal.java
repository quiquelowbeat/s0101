package n1exercici5;

public class Animal {
	
	public Animal() {
		
	}
	
	// Mètode correr()
	
	public String correr() {
		return "El animal está corriendo.";
	}
	
	public String correr(int kmh) {
		return "El animal está corriendo a " + kmh + " kmh.";
	}
	
	public String correr(int kmh, boolean salta) {
		return "El animal está corriendo a " + kmh + " kmh y además puede saltar.";
	}
	
	public String correr(int kmh, boolean salta, boolean muerde) {
		return "El animal está corriendo a " + kmh + " kmh y además puede saltar y morder.";
	}

	
}
