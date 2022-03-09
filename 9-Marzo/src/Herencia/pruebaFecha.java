package Herencia;

public class pruebaFecha {
	public static void main(String[] args) {
		Fecha f1 = new Fecha();
		System.out.println("Dia: " + f1.getDia());
		System.out.println("Mes: " + f1.getMes());
		System.out.println("Anio: " + f1.getAnio());
		System.out.println("----------------------------");
		

		Fecha f2 = new Fecha(11,12,13);
		System.out.println("Dia: " + f2.getDia());
		System.out.println("Mes: " + f2.getMes());
		System.out.println("Anio: " + f2.getAnio());
		System.out.println("----------------------------");
		
		Fecha f3 = new Fecha("7/7/2000");
		System.out.println("Dia: " + f3.getDia());
		System.out.println("Mes: " + f3.getMes());
		System.out.println("Anio: " + f3.getAnio());
		System.out.println("----------------------------");
		
		FechaDetallada f4 = new FechaDetallada("2/09/1995");
		System.out.println("Dia: " + f4.getDia());
		System.out.println("Mes: " + f4.getMes());
		System.out.println("Anio: " + f4.getAnio());
		System.out.println("----------------------------");
		System.out.println(f4.getFechaDetallada());
	}
}
