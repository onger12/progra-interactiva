package clases;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ventana2 extends JFrame{

	JLabel label = new JLabel("Ventana2!!");
	
	public Ventana2 () {
		getContentPane().add(label);
		this.setLayout(new FlowLayout());
		this.setVisible(false);
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
	}
	
}
