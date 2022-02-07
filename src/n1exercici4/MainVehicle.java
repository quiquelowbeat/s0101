package n1exercici4;

public class MainVehicle {

	public static void main(String[] args) {
		
		Vehicle cotxe1 = new Vehicle(800, 3, "rojo");
		Vehicle cotxe2 = new Vehicle(900, 5, "blanco");
		
		System.out.println(cotxe1.iniciar()); 
		
		System.out.println(Vehicle.parar()); // Mètode static
		
		System.out.println(cotxe1.accelerar()); // Mètode no static
		
		System.out.println(cotxe1.getInfoCoche());
		System.out.println(cotxe2.getInfoCoche());

	}

}
