package Interfaz;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid extends JFrame{
	JButton boton0_0 = new JButton("oe");
	JButton boton0_1 = new JButton("jeje");
	JButton boton0_2 = new JButton();
	JButton boton0_3 = new JButton();
	JButton boton1_0 = new JButton();
	JButton boton1_1 = new JButton();
	JButton boton1_2 = new JButton();
	JButton boton1_3 = new JButton("null");
	GridLayout gl = new GridLayout();
	
	public Grid() {
		boton0_0.setFont(new Font("Dialog", 1, 16));
		boton0_1.setFont(new Font("Dialog", 1, 16));
		boton0_2.setFont(new Font("Dialog", 1, 16));
		boton0_3.setFont(new Font("Dialog", 1, 16));
		boton1_0.setFont(new Font("Dialog", 1, 16));
		boton1_1.setFont(new Font("Dialog", 1, 16));
		boton1_2.setFont(new Font("Dialog", 1, 16));
		boton1_3.setFont(new Font("Dialog", 1, 16));
		
		this.add(boton0_0);
		this.add(boton0_1);
		this.add(boton0_2);
		this.add(boton0_3);
		this.add(boton1_0);
		this.add(boton1_1);
		this.add(boton1_2);
		this.add(boton1_3);
		
		gl.setRows(2);
		gl.setHgap(10);
		gl.setVgap(10);
		gl.setColumns(6);
		this.setLayout(gl);
	}
	
	public static void main(String[] args) {
		Grid g = new Grid();
		g.setVisible(true);
		g.setDefaultCloseOperation(EXIT_ON_CLOSE);
		g.setSize(336,253);
		g.setLocationRelativeTo(null);
	}
}
