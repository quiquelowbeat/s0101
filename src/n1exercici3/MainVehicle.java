package n1exercici3;

public class MainVehicle {

	public static void main(String[] args) {
		
		Vehicle cotxe1 = new Vehicle(800, 3, "rojo");
		Vehicle cotxe2 = new Vehicle(1000, 5, "verde");
		
		System.out.println(cotxe1.iniciar()); 
		System.out.println(cotxe1.getPoliza());
		
		System.out.println(cotxe2.iniciar()); 
		System.out.println(cotxe2.getPoliza());
		
	}

}
