package archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escritura{
	public static void main(String[] args) {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("src/archivos/miArchivo.txt");
			pw = new PrintWriter(fichero);
			pw.println("Hola");
			pw.println("Este es");
			pw.println("... mi primer archivo.\nSalté de linea.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fichero != null) {
				try {
					fichero.close();
				}catch(IOException e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
