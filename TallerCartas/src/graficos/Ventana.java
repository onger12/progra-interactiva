package graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import panelButtons.PanelButtons;

public class Ventana extends JFrame{
	
	JButton repartir = new JButton("Repartir");
	JButton otraCarta = new JButton("Otra carta");
	JButton seguro= new JButton("Seguro");
	JButton otroJuego = new JButton("Otro juego");
	
	JTextField campoEfectivo = new JTextField();
	JTextField campoApuesta = new JTextField();
	JTextField campoJugador= new JTextField();
	JTextField campoCupier = new JTextField();
	
	JLabel labelEfectivo = new JLabel("Efectivo");
	JLabel labelApuesta = new JLabel("Apuesta");
	JLabel labelJugador= new JLabel("Jugador");
	JLabel labelCupier = new JLabel("Cupier");
	JLabel labelHagaSuApuesta= new JLabel("*** Haga su apuesta ***");
	
	PanelButtons panelButtons;
	
	public Ventana() {
		panelButtons = new PanelButtons(200, 200, 50, 50);
		getContentPane().setLayout(null);
		this.add(panelButtons);
	}
}
