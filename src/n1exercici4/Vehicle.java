package n1exercici4;

public class Vehicle {

	private int peso;
	private int puertas;
	private String color;
	private static int nextMatricula = 1; // No se puede iniciar en el constructor por ser static. Será un valor común para todos los objetos de esta clase Vehicle. 
	private final int matricula; // 
	private static final boolean ruedaRecambio = true; // Este campo va a ser común a todos los objetos de la clase Vehicle y nos obliga a que tenga un valor por ser static final. No se puede iniciar en el constructor.
	
	public Vehicle(int peso, int puertas, String color) {
		this.peso = peso;
		this.puertas = puertas;
		this.color = color;
		this.matricula = nextMatricula; // Se puede iniciar en el constructor (final).
		nextMatricula++; // 
	}
	
	/*
	 * No podemos manipular la variable matricula porque es final. Solo podemos iniciarla en el constructor.
	
	public void setMatricula(int matricula) {
		this.matricula = matricula; // Aquí da error.
	}
	*/
	
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
	
	
	// Mètode genèric 
	
	public String getInfoCoche() {
		return "El coche pesa " + this.peso + " kg, tiene " + this.puertas + " puertas y es de color "
				+ this.color + ". Su matrícula es: " + this.matricula + ". Tiene rueda de recambio revisada: " + this.ruedaRecambio + ".";
	}

}
