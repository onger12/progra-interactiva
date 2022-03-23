package excepciones;

public class TryCatch1 {
	
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
		}catch(NumberFormatException e) {
			System.out.println("Conversión de tipos errada");
		}catch (ArithmeticException e){
			System.out.println("Error aritmetico");
		}catch(NullPointerException e) {
			System.out.println("Error, index no válido en el arreglo");
		}
	}
}
