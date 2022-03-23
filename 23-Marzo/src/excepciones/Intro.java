package excepciones;

public class Intro {

	public static void unMetodo(int n) throws Exception{
		try {
			switch(n) {
				case 1:
					System.out.println("Caso 1");
					throw new RuntimeException("Mensaje - 1");
				case 2:
					System.out.println("Caso 2");
					throw new RuntimeException("Mensaje - 2");
				case 3:
					System.out.println("Caso 3");
					throw new Exception("Mensaje - 3!");
				case 4:
					System.out.println("Caso 4");
			}
		}catch(RuntimeException e){
			System.out.println("Catch - runtimeException " + e.getMessage());
		}finally {
			System.out.println("Try-Catch finally: Siempre se muestra");
		}
	}
	
	public static void main(String[] args) {
		try {
			unMetodo(3);
		}catch(Exception e){
			System.out.println("Exception. " + e.getMessage());
		}
		
		System.out.println("Terminando...");
		
		//*** PRUEBAS ***//
		
		prueba p = new prueba();
		try {
			int a = p.arreglo(5);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Numero no válido en el arreglo!");
		}
	}
	

}
