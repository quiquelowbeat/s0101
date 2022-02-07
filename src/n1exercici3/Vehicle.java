package n1exercici3;

public class Vehicle {

	private int peso;
	private int puertas;
	private String color;
	private static int nextPoliza;
	private final int numPoliza;
	
	// Bloque static creado al final del código para testear el orden de ejecución.
	
	
	public Vehicle(int peso, int puertas, String color) {
		this.peso = peso;
		this.puertas = puertas;
		this.color = color;
		System.out.println("Test bloque constructor.");
		
	}
	
	// Bloque iniciador creado después del constructor para probar el orden de ejecución.
	{
		this.numPoliza = nextPoliza;
		nextPoliza++;
		System.out.println("Test bloque inicializador.");
	}
	
	// Mètode iniciar
	
	public String iniciar() {
		return "El coche ha arrancado.";
	}
	
	// Mètode parar static
	
	public static String parar() {
		return "El coche ha parado.";
		
	}
	
	// Métode accelerar
	
	public String accelerar() {
		return "El coche acelera.";
		
	}
	
	public int getPoliza() {
		return this.numPoliza;
	}
	static {
		nextPoliza = 1;
		System.out.println("Test bloque static.");
	}

}
