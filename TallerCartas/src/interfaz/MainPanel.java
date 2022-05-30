package interfaz;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import graficos.Cartas;

public class MainPanel extends JPanel{
	
	private JLabel jugador = new JLabel("Jugador");
	private JLabel cupier = new JLabel("Cupier");
	
	private JLabel cartaBlind = new JLabel();
	
	private JTextField puntajeJugador = new JTextField("0");
	private JTextField puntajeCupier = new JTextField("0");
	
	private JLabel mensaje = new JLabel("*** Haga su apuesta ***");
	
	private JButton repartir = new JButton("Repartir");
	private JButton otraCarta = new JButton("Otra carta");
	private JButton seguro = new JButton("Seguro");
	private JButton otroJuego = new JButton("Otro juego");
	
	public MainPanel (int x, int y, int width, int hight) {
		this.setBounds(x, y, width, hight);
		this.setLayout(null);
		this.setVisible(true);
		
		setComponents();
	}
	
	private void setComponents() {
		Cartas cartas = new Cartas(110,160);
		int mitad = this.getWidth() / 2;
		
		//Parte izquierda
		jugador.setBounds((mitad / 2) - 40,30,80,20);
		this.add(jugador);
		
		JLabel aCorazones = cartas.imagenes[0][2];
		aCorazones.setLocation((mitad / 2) - 80, 60);
		this.add(aCorazones);
		
		puntajeJugador.setBounds((mitad / 2) - 30, 250, 30, 30);
		this.add(puntajeJugador);
		
		//Parte derecha
		cupier.setBounds((this.getWidth() - (mitad / 2)) - 40,30,80,20);
		this.add(cupier);
		
		JLabel joker = cartas.joker;
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
	
	
}
