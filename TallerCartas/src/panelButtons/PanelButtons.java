package panelButtons;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelButtons extends JPanel{
	
	public static boolean betTokenOneActive = false;
	
	private final int PADDING_RIGHT_BUTTONS = 10;
	private final int PADDING_LEFT_BUTTONS = 10;
	private final int PADDING_TOP_BUTTONS = 10;
	private final int PADDING_BOTTOM_BUTTONS = 10;
	private final int PADDING_TOP_BOTTOM_BUTTONS = 10;
	private final int PADDING_RIGHT_LEFT_BUTTONS = 10;
	private final int PADDING_BUTTONS = 10;
	
	private final int BUTTON_WIDTH = 50;
	private final int BUTTON_HIGHT = 50;
	
	private final int WIDTH;
	private final int HIGHT;
	private final int POS_X;
	private final int POS_Y;

	private JButton botonApuesta1;
	private JButton botonApuesta2;
	private JButton botonApuesta3;
	private JButton botonApuesta4;
	private JButton botonApuesta5;
	private JButton botonApuesta6;
	private final ArrayList<JButton> buttons = new ArrayList<JButton>(){
		{
			add(botonApuesta1 = new JButton());
			add(botonApuesta2 = new JButton());
			add(botonApuesta3 = new JButton());
			add(botonApuesta4 = new JButton());
			add(botonApuesta5 = new JButton());
			add(botonApuesta6 = new JButton());
		}
	};
	
	public PanelButtons (final int WIDTH, final int HIGHT, final int POS_X, 
			final int POS_Y) {
		this.WIDTH = WIDTH;
		this.HIGHT = HIGHT;
		this.POS_X = POS_X;
		this.POS_Y = POS_Y;
		
		this.setLayout(null);
		this.setSize(WIDTH, HIGHT);
		this.setLocation(POS_X, POS_Y);
		this.setVisible(true);
		
		positionButtons();
		loadImages();
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(buttons.get(0))) {
					betTokenOneActive = true;
				}
			}
		};
		
		buttons.get(0).addActionListener(listener);
		
	}
	
	private void loadImages() {
		//*** BET TOKENS (1,5,10,25,50,100) ***
		for(int i = 0; i < 6; i++) {
			String url = "image-tokens-" + (i + 1) + ".png";
			System.out.println(url + ",");
			ImageIcon source = new ImageIcon(url);
			ImageIcon img = new ImageIcon(source.getImage().getScaledInstance(buttons.get(i).getWidth(),
					buttons.get(i).getHeight(), Image.SCALE_SMOOTH));
			buttons.get(i).setIcon(img);
		}
	}
	
	private void positionButtons() {
		//*** POSITIONING BET TOKENS ***
		int posX = 0;
		int posY = 0;
		
		for(int i = 0; i < buttons.size() / 2; i++) {
			buttons.get(i).setBounds(posX, posY, BUTTON_WIDTH, BUTTON_HIGHT);
			this.add(buttons.get(i));
			posX += PADDING_RIGHT_BUTTONS + BUTTON_WIDTH;
		}
		posX = 0;
		posY += PADDING_BOTTOM_BUTTONS + BUTTON_HIGHT;
		for(int i = buttons.size() / 2; i < buttons.size(); i++) {
			buttons.get(i).setBounds(posX, posY, BUTTON_WIDTH, BUTTON_HIGHT);
			this.add(buttons.get(i));
			posX += PADDING_RIGHT_BUTTONS + BUTTON_WIDTH;
		}
	}
}
