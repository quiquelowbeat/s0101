package n1exercici1;

public class Vehicle {

	private int peso;
	private int puertas;
	private String color;
	private int velocidad;
	
	public Vehicle(int peso, int puertas, String color) {
		this.peso = peso;
		this.puertas = puertas;
		this.color = color;
		
	}
	
	// Mètode iniciar
	
	public String iniciar() {
		return "El coche ha arrancado.";
	}
	
	
	

}
