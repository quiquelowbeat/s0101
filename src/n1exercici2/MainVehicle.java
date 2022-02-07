package n1exercici2;

public class MainVehicle {

	public static void main(String[] args) {
		
		Vehicle cotxe1 = new Vehicle(800, 3, "rojo");
		Vehicle cotxe2 = new Vehicle(950, 5, "azul");
		
		System.out.println("Coche 1: " + cotxe1.iniciar()); 
		System.out.println("Coche 2: " + cotxe2.iniciar()); 
		
		System.out.println("Coche 1: " + cotxe1.accelerar() + cotxe1.getCO2()); // Mètode no static
		System.out.println("Coche 1: " + cotxe1.accelerar() + cotxe1.getCO2());
		System.out.println("Coche 2: " + cotxe2.accelerar() + cotxe1.getCO2());

		System.out.println(Vehicle.parar()); // Mètode static
	
	}

}
