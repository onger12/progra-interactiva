package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCartas extends JPanel {
	private final int WIDTH;
	private final int HIGHT;
	private final int POS_X;
	private final int POS_Y;
	private JLabel labelJugador;
	private JLabel labelCupier;
	private final ArrayList<JLabel> labels = new ArrayList<JLabel>() {
		{
			add(labelJugador = new JLabel("Jugador"));
			add(labelCupier = new JLabel("Cupier"));
		}
	};
	private JLabel imagenJugador;
	private JLabel imagenCupier;
	private ArrayList<JLabel> images = new ArrayList<JLabel>() {
		{

			add(imagenJugador = new JLabel());
			add(imagenCupier = new JLabel());
		}
	};
	
	private final int IMAGE_PADDING = 180;
	private final int LABEL_PADDING = 180;
	
	private final int LABEL_WIDTH = 50;
	private final int LABEL_HIGHT = 30;
	private final int LABEL_POS_X = 30;
	private final int LABEL_POS_Y = 0;
	
	private final int IMAGE_WIDTH = 70;
	private final int IMAGE_HIGHT = 120;
	private final int IMAGE_POS_X = 0;
	private final int IMAGE_POS_Y = 5 + LABEL_HIGHT;
	
	public PanelCartas (final int WIDTH, final int HIGHT, final int POS_X, final int POS_Y) {
		this.POS_X = POS_X;
		this.POS_Y = POS_Y;
		this.HIGHT = HIGHT;
		this.WIDTH = WIDTH;
		
		this.setLayout(null);
		this.setSize(WIDTH, HIGHT);
		this.setLocation(POS_X, POS_Y);
		this.setVisible(true);
		
		this.setBounds(POS_X, POS_Y, WIDTH, HIGHT);
		positionLabels();
		loadImages();
	}
	
	private void positionLabels() {
		labels.get(0).setBounds(LABEL_POS_X, LABEL_POS_Y, LABEL_WIDTH, LABEL_HIGHT);
		labels.get(1).setBounds(LABEL_POS_X + LABEL_WIDTH + LABEL_PADDING, LABEL_POS_Y, LABEL_WIDTH, LABEL_HIGHT);
		images.get(0).setBounds(IMAGE_POS_X, IMAGE_POS_Y, IMAGE_WIDTH, IMAGE_HIGHT);
		images.get(1).setBounds(IMAGE_POS_X + IMAGE_WIDTH + IMAGE_PADDING, IMAGE_POS_Y, IMAGE_WIDTH, IMAGE_HIGHT);
		this.add(labels.get(0));
		this.add(labels.get(1));
		this.add(images.get(0));
		this.add(images.get(1));
	}
	
	private void loadImages() {
		String URL = "back.png";
		for (JLabel imagen : images) {
			System.out.println(imagen.getWidth() + " " + imagen.getHeight());
			ImageIcon source = new ImageIcon(URL);
			ImageIcon img = new ImageIcon(source.getImage().getScaledInstance(imagen.getWidth(),
					imagen.getHeight(), Image.SCALE_SMOOTH));
			imagen.setIcon(img);
		}
	}
	
//	@Override
//	protected void paintComponent(Graphics g) {
//		super.paintComponent(g);
//		g.setColor(Color.black);
//		g.drawRect(0, 0, 600, 600);
//		g.setColor(Color.red);
//		g.fillRect(0, 0, 600, 600);
//	}
}
