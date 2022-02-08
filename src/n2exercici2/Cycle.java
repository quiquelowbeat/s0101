package n2exercici2;

public class Cycle {
	private int ruedas;
	private boolean frenos;
	private String color;
	
	public Cycle(int ruedas, String color, boolean frenos) {
		this.ruedas = ruedas;
		this.color = color;
		this.frenos = frenos;
	}
	
	public int wheels() {
		return this.ruedas;
	}
	
}
