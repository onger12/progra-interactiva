package pelotas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame{
	JLabel label = new JLabel();
	JButton bola1 = new JButton ("Pelota 1");
	JButton bola2 = new JButton ("Pelota 2");
	JButton stop = new JButton("Parar");
	
	public Ventana() {
		super("Jejejejejejejejejejejejej^2");
		getContentPane().setLayout(null);
		this.add(label);
		this.add(bola1);
		this.add(bola2);
		this.add(stop);

		label.setSize(400,300);
		label.setBorder(BorderFactory.createLineBorder(Color.black)); //******************
		bola1.setBounds(50, 310, 100, 20);
		bola2.setBounds(160, 310, 100, 20);
		stop.setBounds(280, 310, 100, 20);
		
		ActionListener oyente = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Pelota p1 = new Pelota(label, Color.green, 8);
				Pelota p2 = new Pelota(label, Color.blue, 5);
				if(e.getSource().equals(bola1)) {
					p1.setPriority(1);
					p1.start();
					p2.setPriority(2);
				}
				if(e.getSource().equals(bola2)) {
					p2.setPriority(1);
					p2.start();
					p1.setPriority(2);
				}
				if(e.getSource().equals(stop)) {
//					try {
//						p1.bandera = false;
//						p1.join();
//						System.out.println("PARAR1");
//					} catch (InterruptedException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//					try {
//						p2.bandera = false;
//						p2.join();
//						System.out.println("PARAR2");
//					} catch (InterruptedException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
					p1.bandera = false;
					p2.bandera = false;
				}
			}
		};
		bola1.addActionListener(oyente);
		bola2.addActionListener(oyente);
		stop.addActionListener(oyente);
	}
	
	public static void main(String[] args) {
		
	}
}
