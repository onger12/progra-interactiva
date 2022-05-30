package interfaz;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LeftPanel extends JPanel{
	
	public static boolean token1 = true;
	public static boolean token2 = true;
	public static boolean token3 = true;
	public static boolean token4 = true;
	public static boolean token5 = true;
	public static boolean token6 = true;
	
	public static int valorEfectivo;
	public static int valorApuesta;
	
	private final int PADDING_RIGHT_BUTTONS = 7;
	private final int PADDING_BOTTOM_BUTTONS = 7;

	private final int BUTTON_WIDTH = 40;
	private final int BUTTON_HIGHT = 40;
	
	JLabel efectivo = new JLabel("Efectivo");
	JLabel apuesta = new JLabel("Apuesta");
	
	JTextField campoEfectivo = new JTextField("200");
	JTextField campoApuesta = new JTextField("0");
	
	public static JButton botonApuesta1;
	public static JButton botonApuesta2;
	public static JButton botonApuesta3;
	public static JButton botonApuesta4;
	public static JButton botonApuesta5;
	public static JButton botonApuesta6;
	
	private static final ArrayList<Integer> tokenValues = new ArrayList<Integer>() {
		{
			add(1);
			add(5);
			add(10);
			add(25);
			add(50);
			add(100);
		}
	};
	public static final ArrayList<JButton> botones = new ArrayList<JButton>(){
		{
			add(botonApuesta1 = new JButton());
			add(botonApuesta2 = new JButton());
			add(botonApuesta3 = new JButton());
			add(botonApuesta4 = new JButton());
			add(botonApuesta5 = new JButton());
			add(botonApuesta6 = new JButton());
		}
	};
	
	public LeftPanel(int x, int y, int width, int hight) {
		this.setBounds(x, y, width, hight);
		this.setLayout(null);
		this.setVisible(true);
		positionButtons();
		setImagesToButtons();
		setTopComponents();
		
		valorEfectivo = Integer.parseInt(campoEfectivo.getText());
		valorApuesta = Integer.parseInt(campoApuesta.getText());
		
		ActionListener oyente = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				comprobarClicks(e);
			}
		};
		botonApuesta1.addActionListener(oyente);
		botonApuesta2.addActionListener(oyente);
		botonApuesta3.addActionListener(oyente);
		botonApuesta4.addActionListener(oyente);
		botonApuesta5.addActionListener(oyente);
		botonApuesta6.addActionListener(oyente);
	}
	
	private void comprobarClicks(ActionEvent e) {
		for(int i = 0; i < 6; i++) {
			if(e.getSource().equals(botones.get(i))) {
				if(Integer.parseInt(campoEfectivo.getText()) >= tokenValues.get(i)) {
					valorApuesta = Integer.parseInt(campoApuesta.getText());
					valorApuesta += tokenValues.get(i);
					campoApuesta.setText(String.valueOf(valorApuesta));
					valorEfectivo = Integer.parseInt(campoEfectivo.getText());
					valorEfectivo -= tokenValues.get(i);
					campoEfectivo.setText(String.valueOf(valorEfectivo));
				}
			}
		}
		System.out.println(valorEfectivo);
		System.out.println(valorApuesta);
	}
	
	public static void comprobarBotones() {
		for(int i = 0; i < 6; i++) {
			if(valorEfectivo < tokenValues.get(i)) {
				System.out.println("false");
				botones.get(i).setEnabled(false);
			}else {
				System.out.println("true");
				botones.get(i).setEnabled(true);
			}
		}
	}
	
	private void setImagesToButtons() {
		for(int i = 0; i < 6; i++) {
			String url = "image-tokens-" + (i + 1) + ".png";
			ImageIcon source = new ImageIcon(url);
			ImageIcon img = new ImageIcon(source.getImage().getScaledInstance(botones.get(i).getWidth(),
					botones.get(i).getHeight(), Image.SCALE_SMOOTH));
			botones.get(i).setIcon(img);
		}
	}
	
	private void positionButtons() {
		//*** POSITIONING BET TOKENS ***
		int posX = 35;
		int posY = 250;
		
		for(int i = 0; i < botones.size() / 2; i++) {
			this.add(botones.get(i));
			botones.get(i).setBounds(posX, posY, BUTTON_WIDTH, BUTTON_HIGHT);
			posX += PADDING_RIGHT_BUTTONS + BUTTON_WIDTH;
		}
		posX = 35;
		posY += PADDING_BOTTOM_BUTTONS + BUTTON_HIGHT;
		for(int i = botones.size() / 2; i < botones.size(); i++) {
			botones.get(i).setBounds(posX, posY, BUTTON_WIDTH, BUTTON_HIGHT);
			this.add(botones.get(i));
			posX += PADDING_RIGHT_BUTTONS + BUTTON_WIDTH;
		}
	}
	
	private void setTopComponents() {
		efectivo.setBounds(50, 80, 80, 30);
		this.add(efectivo);
		campoEfectivo.setBounds(50, 110, 80, 25);
		this.add(campoEfectivo);
		campoEfectivo.setEditable(false);
		apuesta.setBounds(50, 140, 80, 30);
		this.add(apuesta);
		campoApuesta.setBounds(50, 170, 80, 25);
		this.add(campoApuesta);
		campoApuesta.setEditable(false);
	}
}
