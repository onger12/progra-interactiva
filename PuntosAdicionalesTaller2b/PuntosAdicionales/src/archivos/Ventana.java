package archivos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	JButton guardar = new JButton();
	JButton cargar = new JButton();
	JTextArea textArea = new JTextArea();
	JTextField nombre = new JTextField();
	JTextField apellido = new JTextField();
	JTextField edad = new JTextField();
	JLabel labelNombre = new JLabel("Nombre: ");
	JLabel labelApellido= new JLabel("Apellido: ");
	JLabel labelEdad = new JLabel("Edad: ");
	
	public Ventana() {
		getContentPane().setLayout(null);
		this.add(nombre);
		this.add(apellido);
		this.add(edad);
		this.add(guardar);
		this.add(cargar);
		
		labelNombre.setBounds(32, 15, 100, 10);
		labelApellido.setBounds(32, 135, 100, 10);
		labelEdad.setBounds(32, 255, 100, 10);
		
		this.add(labelApellido);
		this.add(labelNombre);
		this.add(labelEdad);
		
		nombre.setBounds(30, 30, 100, 30);
		apellido.setBounds(30, 150, 100, 30);
		edad.setBounds(30, 270, 100, 30);
		
		guardar.setBounds(250, 50, 100,30);
		cargar.setBounds(250, 100, 100,30);
		
		guardar.setText("Guardar");
		cargar.setText("Cargar");
		
		ActionListener oyente = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(guardar)) {
					FileWriter fichero= null;
					PrintWriter pw = null;
					
					try {
						fichero = new FileWriter("src/archivos/miArchivo.txt");
						pw = new PrintWriter(fichero);
						if(nombre.getText().equals("") || nombre.getText().equals(null) || apellido.getText().equals("") || apellido.getText().equals(null)
								|| edad.getText().equals("") || edad.getText().equals(null)) {
							JOptionPane.showMessageDialog(null, "Debes ingresar toda la información");
						}else {
							pw.println(nombre.getText() + ",");
							pw.println(apellido.getText() + ",");
							pw.println(edad.getText() + ",");
							JOptionPane.showMessageDialog(null, "Guardado con éxito!");
						}
					}catch (Exception ex) {
						ex.printStackTrace();

						JOptionPane.showMessageDialog(null, "Hubo un problema en el guardado!");
					}finally {
						try {
							if(fichero != null)
							{
								fichero.close();
							}
						}catch(Exception ex2) {
							ex2.printStackTrace();
						}
						
					}
				}
				if(e.getSource().equals(cargar)) {
					File archivo= null;
					FileReader fr= null;
					BufferedReader br = null;
					
					try {
						archivo = new File("src/archivos/miArchivo.txt");
						fr= new FileReader(archivo);
						br= new BufferedReader(fr);
						
						String linea = "";
						String resultado = "";
						while((linea=br.readLine()) != null) {
							resultado += linea + "\n";
						}
						textArea.setText(resultado);
						getContentPane().add(textArea);
						textArea.setBounds(170, 150, 150,150);
						
					}catch(Exception ex) {
						ex.printStackTrace();
					} finally {
						try {
							if(fr != null) {
								fr.close();
							}
						}catch(Exception ex2) {
							ex2.printStackTrace();
						}
					}
				}
				
			}
		};
		cargar.addActionListener(oyente);
		guardar.addActionListener(oyente);
	}
	public static void main(String[] args) {
		Ventana v = new Ventana();
//		v.setSize(400,400);
//		v.setLocationRelativeTo(null);
		v.setBounds(50,50,400,400);
		v.setVisible(true);
	}
}
