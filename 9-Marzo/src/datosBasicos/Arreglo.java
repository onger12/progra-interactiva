package datosBasicos;

import java.util.Scanner;

public class Arreglo {

	public static void main(String[] args) {
		int arreglo[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un valor entero (0 para terminar): ");
		int valor = sc.nextInt();
		
		int contador = 0;
		while(valor != 0 && contador < 10) {
			arreglo[contador] = valor;
			if(contador != 9) {
				System.err.print("Ingrese un valor entero (0 para terminar): ");
				valor = sc.nextInt();
			}
			contador++;
		}
		
		for(int i = 0; i < arreglo.length; i++) {
			System.out.println("arreglo[" + i + "] = " + arreglo[i]);
		}
	}

}
