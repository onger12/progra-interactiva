package Interfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	JLabel etiqueta = new JLabel("Nombre: ");
	JTextField campoTexto = new JTextField();
	JButton boton = new JButton("OK");
	int y = 400;
	int x = 200;
	
	public Ventana() {
		getContentPane().setLayout(null);
		etiqueta.setBounds(50, 50, 100, 30);
		campoTexto.setBounds(150, 50, 150, 30);
		boton.setBounds(350, 50, 100, 30);
		getContentPane().add(etiqueta);
		getContentPane().add(campoTexto);
		getContentPane().add(boton);
		
		
		ActionListener oyente = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(campoTexto)) {
					JLabel label = new JLabel();
					label.setText(e.getActionCommand());
					getContentPane().add(label);
					y+=10;
					if(y >= 450) {
						y = 410;
						x += 50;
					}
					label.setBounds(x, y, 100, 35);
					campoTexto.setText("");
				}
				if(e.getSource().equals(boton)) {
					JOptionPane.showMessageDialog(null,campoTexto.getText());
				}
			}
		};
		boton.addActionListener(oyente);
		campoTexto.addActionListener(oyente);
	}
	
	public static void main(String[] args) {
		Ventana v = new Ventana();
		
		WindowAdapter wa = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(v, "Chao pete");
				System.exit(0);
			}
		};
		v.addWindowListener(wa);
		v.setVisible(true);
		v.setSize(800,800);
		v.setLocationRelativeTo(null);
	}
}
