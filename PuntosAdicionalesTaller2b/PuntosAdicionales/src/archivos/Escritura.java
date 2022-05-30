package archivos;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter fichero= null;
		PrintWriter pw = null;
		
		try {
			fichero = new FileWriter("src/archivos/miArchivo.txt");
			pw = new PrintWriter(fichero);
			 pw.println("¡Hola!");
			 pw.println("Este es");
			 pw.println("... mi primer archivo\nSalté de línea.");
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}finally {
			try {
				if(fichero != null)
				{
					fichero.close();
				}
			}catch(Exception e2) {
				e2.printStackTrace();
			}
			
		}

	}

}
