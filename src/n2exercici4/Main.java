package n2exercici4;

public class Main {

	public static void main(String[] args) {
		
		Rossegador[] arrayRossegadors = new Rossegador[3];
		
		arrayRossegadors[0] = new Ratoli();
		arrayRossegadors[1] = new Jerbu();
		arrayRossegadors[2] = new Hamster();
		
		for(Rossegador r : arrayRossegadors) {
			r.ensumar();
			r.rossegar();
			r.correr();
			
			// Els mètodes funcionen correctament perque pertanyen a totes les classes. 
			
			
		}
	}

}
