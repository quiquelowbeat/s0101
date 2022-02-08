package n2exercici3;

public class Main {

	public static void main(String[] args) {
		
		Cycle[] arrayCycle = new Cycle[3];
		arrayCycle[0] = new Unicycle(1, "negro", false);
		arrayCycle[1] = new Bicycle(2, "azul", true);
		arrayCycle[2] = new Tricycle(3, "rojo", false);
		
		/*
		arrayCycle[0].balance(); // Error. El mètode balance() no està definit a Cycle.
		arrayCycle[1].balance(); // 
		arrayCycle[2].balance(); // 
		
		*/
		
		for(Cycle c : arrayCycle) {
			if (c instanceof Unicycle) {
				Unicycle uni = (Unicycle) c;
				uni.balance();
			} else if(c instanceof Bicycle) {
				Bicycle bic = (Bicycle) c;
				System.out.println(bic.balance());
			} else if (c instanceof Tricycle ) {
				Tricycle tri = (Tricycle) c;
				// tri.balance(); // Error. El mètode balance() no està definit a Tricycle
			}
		}
		
		
	}
	
	public static void ride(Cycle c) {
		String rueda = (c.wheels()== 1) ? " rueda" : " ruedas";
		System.out.println(c.getClass().getSimpleName() + " tiene " + c.wheels() + rueda + ".");
	}
}
