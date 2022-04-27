package Interfaz;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Flow extends JFrame{

	JButton boton1 = new JButton();
	JButton boton2 = new JButton();
	JButton boton3 = new JButton();
	JButton boton4 = new JButton();
	
	FlowLayout fl = new FlowLayout();
	
	public Flow () {
		getContentPane().setBackground(Color.orange);
		boton1.setFont(new Font("Dialog", 1, 16));
		boton1.setText("1");
		boton2.setFont(new Font("Dialog", 1, 16));
		boton2.setText("2");
		boton3.setFont(new Font("Dialog", 1, 16));
		boton3.setText("3");
		boton4.setFont(new Font("Dialog", 1, 16));
		boton4.setText("4");
		
		fl.setHgap(20);
		
		getContentPane().setLayout(fl);
		getContentPane().add(boton1);
		getContentPane().add(boton2);
		getContentPane().add(boton3);
		getContentPane().add(boton4);
	}
	
	public static void main(String[] args) {
		Flow f = new Flow();
		f.setVisible(true);
		f.setSize(800,800);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
