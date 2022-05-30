package hilos;

import interfaz.LeftPanel;

public class HiloTokens extends Thread{

	public void run() {
		System.out.println("HiloTokens");
		while(true) {
			LeftPanel.comprobarBotones();
		}
	}
}
