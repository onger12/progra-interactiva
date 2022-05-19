package main;

import javax.swing.JFrame;

import graficos.Ventana;
import threads.ButtonListenerThread;

public class Main {

	public static void main(String[] args) {
		Ventana v = new Ventana();
		v.setSize(800,600);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setVisible(true);
		ButtonListenerThread btnLT = new ButtonListenerThread();
		while(true) {
			btnLT.run();
		}
	}
}
