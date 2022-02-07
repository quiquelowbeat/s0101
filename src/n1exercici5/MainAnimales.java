package n1exercici5;

public class MainAnimales {

	public static void main(String[] args) {
		Gato gato1 = new Gato();
		
		System.out.println(gato1.correr());
		System.out.println(gato1.correr(45));
		System.out.println(gato1.correr(120, true));
		System.out.println(gato1.correr(150, true, true));
		System.out.println(gato1.correr(150, true, true, "¡miau, miau, miauuuuu!"));
		
		
		
	}

}
