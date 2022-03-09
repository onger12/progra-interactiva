package datosBasicos;

import javax.swing.JOptionPane;

public class Matrices {
	public static void main(String[] args) {
		String filas = JOptionPane.showInputDialog(null, "Ingrese las filas: ");
		String columnas = JOptionPane.showInputDialog(null, "Ingrese las columnas: ");
		int n = 0;
		int m = 0;
		while(true) {
			n = Integer.parseInt(filas);
			m = Integer.parseInt(columnas);
			if(n != 0 && m != 0) {
				break;
			}else {
				JOptionPane.showMessageDialog(null, "No se aceptan 0 como entrada");
			}
		}
		int matriz [][] = new int[n][m];
		String mostrar = "";
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				int numero = (int)(Math.random()*1000);
				matriz[i][j] = numero;
				System.out.print("[" + i + "][" + j + "] = " + matriz[i][j] + ", ");
			}
			System.out.println();
		}
	}
		
}
