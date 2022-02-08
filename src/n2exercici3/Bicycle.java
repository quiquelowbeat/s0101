package n2exercici3;

public class Bicycle extends Cycle {

	public Bicycle(int ruedas, String color, boolean frenos) {
		super(ruedas, color, frenos);
	}
	
	public String balance() {
		return "Si no apoyas los pies te caes, cuidado.";
	}
	
	
	
}
