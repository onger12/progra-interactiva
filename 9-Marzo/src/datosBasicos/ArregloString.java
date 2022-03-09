package datosBasicos;

public class ArregloString {
	public static void main(String[] args) {
		
		String dias[] = {"Lunes", "Martes, ", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		for (int i = 0; i < dias.length; i++) {
			System.out.println("dias[" + i + "] = " + dias[i]);
		}
	}
}
