package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import graficos.Cartas;

public class MainPanel extends JPanel{
	
	public static boolean ready = false;
	
	public static boolean boolRepartir;
	public static boolean boolOtraCarta;
	public static boolean boolSeguro;
	public static boolean boolOtroJuego;
	
	private JLabel jugador = new JLabel("Jugador");
	private JLabel cupier = new JLabel("Cupier");
	
	private JLabel cartaBlind = new JLabel();
	
	private JTextField puntajeJugador = new JTextField("0");
	private JTextField puntajeCupier = new JTextField("0");
	
	private JLabel mensaje = new JLabel("*** Haga su apuesta ***");
	
	public static JButton repartir = new JButton("Repartir");
	public static JButton otraCarta = new JButton("Otra carta");
	public static JButton seguro = new JButton("Seguro");
	public static JButton otroJuego = new JButton("Otro juego");
	
	public MainPanel (int x, int y, int width, int hight) {
		this.setBounds(x, y, width, hight);
		this.setLayout(null);
		this.setVisible(true);
		
		ActionListener oyente = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(repartir)) {
					repartirCartas();
					
				}
			}
		};
		
		repartir.addActionListener(oyente);
		
		setComponents();
	}
	
	private void setComponents() {
		Cartas cartas = new Cartas(110,160);
		Cartas cartas2 = new Cartas(110,160);
		
		int mitad = this.getWidth() / 2;
		
		//Parte izquierda
		jugador.setBounds((mitad / 2) - 40,30,80,20);
		this.add(jugador);
		
		JLabel joker1 = cartas.joker;
		joker1.setLocation((mitad / 2) - 80, 60);
		this.add(joker1);
		
		puntajeJugador.setBounds((mitad / 2) - 30, 250, 30, 30);
		this.add(puntajeJugador);
		
		//Parte derecha
		cupier.setBounds((this.getWidth() - (mitad / 2)) - 40,30,80,20);
		this.add(cupier);
		
		JLabel joker = cartas2.joker;
		joker.setLocation((this.getWidth() - (mitad / 2)) - 80,60);
		this.add(joker);
		
		puntajeCupier.setBounds((this.getWidth() - (mitad / 2)) - 30, 250, 30, 30);
		this.add(puntajeCupier);
		
		//Parte central
		mensaje.setBounds((this.getWidth() / 2) - 75, 300, 150, 25);
		this.add(mensaje);
		
		int padding = 40;
		int paddingAcu = padding;
		int width = 100;
		
		repartir.setBounds(paddingAcu, 340, width, 25);
		repartir.setEnabled(false);
		this.add(repartir);
		
		paddingAcu += padding + 80;
		
		otraCarta.setBounds(paddingAcu, 340, width, 25);
		this.add(otraCarta);
		
		paddingAcu += padding + 80;
		
		seguro.setBounds(paddingAcu, 340, width, 25);
		this.add(seguro);
		
		paddingAcu += padding + 80;
		
		otroJuego.setBounds(paddingAcu, 340, width, 25);
		this.add(otroJuego);
	}
	
	public static void juego() {
		System.out.println(LeftPanel.valorApuesta);
		if(LeftPanel.valorApuesta > 0) {
			System.out.println(LeftPanel.valorApuesta);
			ready = true;
			repartir.setEnabled(true);
		}
		if(boolRepartir) {
			
		}
	}
	
	private void setEnableAllButtons(boolean b) {
		repartir.setEnabled(b);
		otraCarta.setEnabled(b);
		seguro.setEnabled(b);
	}
	
	private void repartirCartas() {
		int mitad = this.getWidth() / 2;
		int padding = 0;
		
		for(int i = 0; i < 3; i++) {
			Cartas cartas = new Cartas(110, 160);
			JLabel carta = cartas.pickCard();
			carta.setLocation((mitad / 2) - 80 - padding, 60);
			this.add(carta);
			padding -= 30;
		}
		

	}
	
}
