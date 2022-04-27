package punto1;

public class Main {
	public static void main(String[] args) {
		Interfaz interfaz = new Interfaz();
		Dado dado = new Dado();
		
		while(true) {
			int opc = interfaz.mostrarMenu();
			if(opc == 4){
				interfaz.despedir();
				break;
			}else if(opc == 1){
				dado.lanzarDado();
				dado.pent();
				interfaz.mostrarResultado(dado.getValor());
				interfaz.mostrarPenitencia(dado.getPenitencia(dado.getValor() - 1));
			}else if(opc == 2) {
				int nCara = interfaz.pedirCara();
				String penitencia = interfaz.pedirPenintencia();
				dado.setPenitencia(nCara - 1, penitencia);
			}else if(opc == 3) {
				int nCaras = interfaz.pedirCaras();
				Dado nuevoDado = new Dado(nCaras);
				dado = nuevoDado;
			}
		}
	}
}
