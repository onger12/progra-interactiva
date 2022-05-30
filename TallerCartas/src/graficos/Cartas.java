package graficos;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Cartas {
	
	private final int WIDTH;
	private final int HIGHT;
	
	public JLabel joker = new JLabel();
	public JLabel imagenes[][] = new JLabel[14][4];
	private String[] nombres = new String[] {
			"A",
			"1",
			"2",
			"3",
			"4",
			"5",
			"6",
			"7",
			"8",
			"9",
			"10",
			"J",
			"Q",
			"K"
	};
	private String[] tipos = new String[] {
		"picas",
		"trboles",
		"corazones",
		"diamantes"
	};
	
	public Cartas(final int width, final int hight) {
		this.WIDTH = width;
		this.HIGHT = hight;
		setImages();
	}
	
	private void setImages() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 14; j++) {
				imagenes[j][i] = new JLabel();
				imagenes[j][i].setSize(WIDTH, HIGHT);
				String url = "cartas/" + nombres[j] + "-" + tipos[i] + ".png";
				ImageIcon source = new ImageIcon(url);
				ImageIcon img = new ImageIcon(source.getImage().getScaledInstance(imagenes[j][i].getWidth(),
						imagenes[j][i].getHeight(), Image.SCALE_SMOOTH));
				imagenes[j][i].setIcon(img);
			}
		}

		String url = "cartas/JOKER.png";
		joker.setSize(WIDTH, HIGHT);
		ImageIcon source = new ImageIcon(url);
		ImageIcon img = new ImageIcon(source.getImage().getScaledInstance(joker.getWidth(),
				joker.getHeight(), Image.SCALE_SMOOTH));
		joker.setIcon(img);
	}
	
	public JLabel pickCard() {
		int col = (int)(Math.random() * 14);
		int fil = (int)(Math.random() * 4);
		
		return imagenes[col][fil];
	}
}
