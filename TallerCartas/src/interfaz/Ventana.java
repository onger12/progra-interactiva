package interfaz;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import hilos.HiloJuego;
import hilos.HiloTokens;

public class Ventana extends JFrame{
	LeftPanel leftPanel;
	MainPanel mainPanel;
	
	public Ventana() {
		this.setLayout(null);
		this.setSize(800,450);
		this.setLocationRelativeTo(null);
		this.setTitle("BlackJack");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout();
		
		
		this.setVisible(true);
	}
	
	private void setLayout() {
		leftPanel = new LeftPanel(0, 0, 200, this.getHeight());
		leftPanel.setBackground(Color.darkGray);
		this.add(leftPanel);
		
		mainPanel = new MainPanel(200, 0, 600, this.getHeight());
		mainPanel.setBackground(Color.pink);
		this.add(mainPanel);
		
		HiloTokens hiloTokens = new HiloTokens();
		hiloTokens.start();
		
		HiloJuego hiloJuego = new HiloJuego();
		hiloJuego.start();
	}
	
	private void setLeftPanel() {
		
	}
}
