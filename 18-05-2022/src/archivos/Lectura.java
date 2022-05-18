package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class Lectura {
	
	public static void main(String[] args) {

		File archivo = null;
		FileReader fr = null;
		
		BufferedReader br = null;
		String linea = "";
		String resultado = "";
		
		try {
			archivo = new File("src/archivos/miArchivo.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
				resultado += linea + "\n";
			}
			JOptionPane.showMessageDialog(null, resultado);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fr != null) {
				try {
					fr.close();
				}catch(Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}