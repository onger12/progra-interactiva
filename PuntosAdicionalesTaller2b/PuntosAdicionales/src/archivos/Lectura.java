package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class Lectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivo= null;
		FileReader fr= null;
		BufferedReader br = null;
		
		try {
			archivo = new File("src/archivos/miArchivo.txt");
			fr= new FileReader(archivo);
			br= new BufferedReader(fr);
			
			String linea = "";
			String resultado = "";
			while((linea=br.readLine()) != null) {
				resultado += linea + "\n";
			}
			JOptionPane.showMessageDialog(null, resultado);
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
