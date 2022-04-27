package clases;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ventana extends JFrame{

	JButton boton = new JButton();
	JButton boton2 = new JButton();
	JLabel label = new JLabel("LABEL PARA HOVER");
	Hover hover = new Hover("Dujardin Pizarro");
	
	public Ventana () {
		boton.setText("clickeame");
		boton2.setText("JOption");
		
		getContentPane().add(boton);
		getContentPane().add(boton2);
		getContentPane().add(label);
		this.setLayout(new FlowLayout());
		ActionListener oyente = new ActionListener() {
			
			Ventana2 v = new Ventana2();
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(boton)) {
					v.setVisible(true);
				}
				if(e.getSource().equals(boton2)) {
					JOptionPane.showMessageDialog(v, "Jejejeje");
				}
				if(e.getSource().equals(label)) {
					JOptionPane.showMessageDialog(null, "DUJARDIN");
				}
			}
		};
		boton.addActionListener(oyente);
		boton2.addActionListener(oyente);
		label.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setToolTipText("Dujardin");
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public static void main(String[] args) {
		Ventana v = new Ventana();
		v.setVisible(true);
		v.setSize(600,600);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setLocationRelativeTo(null);
	}
	
}
