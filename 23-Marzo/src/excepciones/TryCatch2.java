package excepciones;

public class TryCatch2 {
	public static void main(String[] args) {
		double a = 6, b = 0, c = 5;
		int p[] = null;
		
		try {
			double resultado = a / b;
			System.out.println(resultado);
			
			//p[1] = 0;
			
			String cuatro = "Cuatro";
			int numero4 = Integer.parseInt(cuatro);
			
			System.out.println("Terminando programa 2...");
		}catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		System.out.println("Terminando...");
	}
}
