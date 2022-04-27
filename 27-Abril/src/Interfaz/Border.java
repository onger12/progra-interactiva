package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Border extends JFrame{
	JButton botonOeste = new JButton();
	JButton botonEste = new JButton();
	JButton botonNorte = new JButton();
	JButton botonCentro = new JButton();
	JButton botonSur = new JButton();
	BorderLayout bl = new BorderLayout();
	
	public Border() {
		this.setLayout(bl);
		getContentPane().setBackground(Color.black);
		botonOeste.setFont(new Font("Dialog", 1, 16));
		botonOeste.setText("Oeste");
		botonNorte.setFont(new Font("Dialog", 1, 16));
		botonNorte.setText("Norte");
		botonEste.setFont(new Font("Dialog", 1, 16));
		botonEste.setText("Este");
		botonSur.setFont(new Font("Dialog", 1, 16));
		botonSur.setText("Sur");
		botonCentro.setFont(new Font("Dialog", 1, 16));
		botonCentro.setText("Centro");
		
		bl.setVgap(20);
		bl.setHgap(20);
		
		this.add(botonOeste, BorderLayout.WEST);
		this.add(botonEste, BorderLayout.EAST);
		this.add(botonSur, BorderLayout.SOUTH);
		this.add(botonNorte, BorderLayout.NORTH);
		this.add(botonCentro, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		Border b = new Border();
		b.setVisible(true);
		b.setDefaultCloseOperation(EXIT_ON_CLOSE);
		b.setSize(336,253);
		b.setLocationRelativeTo(null);
	}
}
