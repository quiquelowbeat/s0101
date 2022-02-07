package n1exercici2;

public class Vehicle {

	private int peso;
	private int puertas;
	private String color;
	private int kmh;
	private static int cO2;
	
	
	
	public Vehicle(int peso, int puertas, String color) {
		this.peso = peso;
		this.puertas = puertas;
		this.color = color;
	}
	// Getter velocidad
	
	public String getCO2() {
		return "El CO2 liberado a la atmósfera es de: " + cO2 + " toneladas.";
	}
	// Mètode iniciar
	
	public String iniciar() {
		return "ha arrancado.";
	}
	
	// Mètode parar static
	
	public static String parar() {
		return "Todos los coches deben parar.";
	
	}
	
	// Métode accelerar
	
	public String accelerar() {
		cO2 += 100;
		this.kmh += 10;
		return "acelerando. Velocidad: " + this.kmh + ". ";
		
	}
	
	

}
