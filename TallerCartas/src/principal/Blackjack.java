package principal;

import hilos.HiloTokens;
import interfaz.Ventana;

public class Blackjack {
	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		HiloTokens hiloTokens = new HiloTokens();
		hiloTokens.start();
	}
}
