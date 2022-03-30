package punto1b;

public class Main {
	public static void main(String[] args) {
		Cafetera cafetera = new Cafetera(1000);
		Interfaz interfaz = new Interfaz();
		
		while(true) {
			int opc = Integer.parseInt(interfaz.mostrarMenu());
			if(opc == 1) {
				cafetera.llenarCafetera();
				interfaz.mostrarCantidadCafetera(cafetera.getCantidadActual());
			}else if(opc == 2) {
				int cantidad = interfaz.pedirCantidadCafe();
				cafetera.servirTaza(cantidad);
				interfaz.mostrarCantidadCafetera(cafetera.getCantidadActual());
			}else if(opc == 3) {
				cafetera.vaciarCafetera();
				interfaz.mostrarCantidadCafetera(cafetera.getCantidadActual());
			}else if(opc == 4) {
				int cantidad = interfaz.pedirCantidadCafe();
				cafetera.agregarCafe(cantidad);
				interfaz.mostrarCantidadCafetera(cafetera.getCantidadActual());
			}else if(opc == 5) {
				interfaz.mostrarCantidadCafetera(cafetera.getCantidadActual());
			}else {
				interfaz.error();
			}
		}
	}
}
