package n1exercici5;

public class Gato extends Animal{
	
	public Gato() {
		
	}
	
	public String correr(int kmh, boolean salta, boolean muerde, String miau) {
		return "El animal está corriendo a " + kmh + " kmh y además puede saltar, morder y hacer " + miau + ".";
	}
}
