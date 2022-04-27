package punto3;

import java.util.StringTokenizer;

public class Principal {
	
	public static void main(String[] args) {
		Interfaz i = new Interfaz();
		
		String cadena1 = i.pedirDato("Ingrese la primer cadena de texto: ");
		String cadena2 = i.pedirDato("Ingrese la segunda cadena de texto con comas: ");
		String [] letras = cadena1.split("");
		StringTokenizer st = new StringTokenizer(cadena2, ",");
		String [] validaciones = new String[st.countTokens()];
		String mensaje = "";
		int count = st.countTokens();
		
		
		for(int j = 0; j < count; j++) {
			boolean aprobado = false;
			String letrasToken[] = st.nextToken().split("");
			for(int k = 0; k < letrasToken.length; k++) {
				if(!(letrasToken[k].equals(letras[k]))) {
					aprobado = false;
					break;
				}
				aprobado = true;
			}
			if(aprobado) {
				validaciones[j] = "Sí";
			}else {
				validaciones[j] = "No";
			}
		}
		StringTokenizer st2 = new StringTokenizer(cadena2, ",");

		for(int j = 0; j < count; j++) {
			mensaje += st2.nextToken() + ": " + validaciones[j]+"\n";
		}
		
		i.mostrarMensaje(mensaje);
	}
}
