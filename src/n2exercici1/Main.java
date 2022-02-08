package n2exercici1;

public class Main {

	public static void main(String[] args) {
		Cycle c1 = new Unicycle(1, "negro", false);
		ride(c1);
		Cycle c2 = new Bicycle(2, "azul", true);
		ride(c2);
		Cycle c3 = new Tricycle(3, "rojo", false);
		ride(c3);
	}

	public static void ride(Cycle c) {
		System.out.println(c.getClass().getSimpleName() + " en movimiento.");
	}
}
