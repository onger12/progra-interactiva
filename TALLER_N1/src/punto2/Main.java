package punto2;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Interfaz interfaz = new Interfaz();
		Secretario secretario1 = new Secretario("Manuel", "Corredor", "Calle 21 # 52 - 27"
				, 2378866, 1009876587, 1000, 001, 2378866);
		Secretario secretario2 = new Secretario("Andrea maria", "Contador", "Carrera 2 sur # 22E - 27 APTO 202"
				, 2358622, 9984942, 1000, 002, 2378866);
		Secretario secretario3 = new Secretario("Daniela", "Loaiza", "Avenida Ciudad de Cali # 180 - 27 bis"
				, 2378866, 111293810, 1000, 002, 2378866);		
		Vendedor vendedor1 = new Vendedor("Mariana", "Lasso", "Carrera 22 # 19N - 19"
				, 2399988, 199824512, 1300, "AUDI", "123ABC", "2022", 317856734
				, 001, 5);
		Vendedor vendedor2 = new Vendedor("Laura", "Ceron", "Transversal 40 # 96EN - 85"
				, 2765234, 1100287465, 1300, "FERRARI", "321CBA", "2021", 317481237
				, 002, 6);
		Vendedor vendedor3 = new Vendedor("Dahiana", "Blandon", "Avenida sur # 59 - 19"
				, 2856754, 1007523456, 1300, "VOLKSVAGEN", "987YUG", "2022", 315872122
				, 003, 7);

		JefeOficina jefe1 = new JefeOficina("Dujardin", "Pizarro", "Carrera 10 # 10 - 18"
				, 2378765, 1006490889, 2500, 9, secretario1, "AGV873", "2022", "AUDI");
		JefeOficina jefe2 = new JefeOficina("Daniela", "Alzate", "Carrera 20 # 34 - 26"
				, 2323465, 1116569389, 2400, 8, secretario2, "AAS432", "2020", "RENAULT");
		JefeOficina jefe3 = new JefeOficina("Alondra", "Mirador", "Carrera 25 # 12 - 35"
				, 2343234, 1398187441, 2600, 7, secretario3, "ASD245", "2021", "FERRARI");
		
		
		int annios = interfaz.pedirAnnios();
		
		int annio = 2022;
		while(annios > 0) {
			JOptionPane.showInternalMessageDialog(null, "Año " + annio);
			secretario1.imprimir();
			secretario1.reCalcularSalarios();
			
			secretario2.imprimir();
			secretario2.reCalcularSalarios();
			
			secretario3.imprimir();
			secretario3.reCalcularSalarios();
			
			vendedor1.imprimir();
			vendedor1.reCalcularSalarios();
			
			vendedor2.imprimir();
			vendedor2.reCalcularSalarios();
			
			vendedor3.imprimir();
			vendedor3.reCalcularSalarios();
			
			jefe1.imprimir();
			jefe1.reCalcularSalarios();
			
			jefe2.imprimir();
			jefe2.reCalcularSalarios();
			
			jefe3.imprimir();
			jefe3.reCalcularSalarios();
			
			annios--;
			annio += annios;
		}
	}
}
