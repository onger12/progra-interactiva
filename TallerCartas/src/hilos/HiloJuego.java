package hilos;

import interfaz.MainPanel;

public class HiloJuego extends Thread{

	public void run() {
		System.out.println("HiloJuego");
		while(true) {
			MainPanel.juego();
		}
	}
}
