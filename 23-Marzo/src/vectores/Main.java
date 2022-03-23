package vectores;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<Integer> miPrimerVector = new Vector<Integer>(1, 1);
		
		for(int i = 10; i < 50; i++) {
			miPrimerVector.add(i+1);
		}

		System.out.println(miPrimerVector.toString());
		
		Vector<String> equiposDelMundo = new Vector<String>(1,1);
		Vector<String> ciudadesDelMundo = new Vector<String>(1,1);
		
		equiposDelMundo.add("Barcelona");
		equiposDelMundo.add("Milán");
		equiposDelMundo.add("Ajax");
		equiposDelMundo.add("Manchester United");
		equiposDelMundo.add("Monpellie");
		
		ciudadesDelMundo.add("Una");
		ciudadesDelMundo.add("Dos");
		ciudadesDelMundo.add("Tres");
		ciudadesDelMundo.add("Cuatro");
		ciudadesDelMundo.add("Cinco");
		
		for(int i = 0; i < equiposDelMundo.size(); i++) {
			System.out.println("El " + equiposDelMundo.get(i) + " entrena en " + ciudadesDelMundo.get(i));
		}
	}

}
