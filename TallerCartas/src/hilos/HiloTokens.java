package hilos;

import interfaz.LeftPanel;

public class HiloTokens extends Thread{

	public void run() {
		while(true) {
			if(!LeftPanel.token1) {
				LeftPanel.botones.get(0).setEnabled(false);
			}
			if(!LeftPanel.token2) {
				LeftPanel.botones.get(1).setEnabled(false);
			}
			if(!LeftPanel.token3) {
				LeftPanel.botones.get(2).setEnabled(false);
			}
			if(!LeftPanel.token4) {
				LeftPanel.botones.get(3).setEnabled(false);
			}
			if(!LeftPanel.token5) {
				LeftPanel.botones.get(4).setEnabled(false);
			}
			if(!LeftPanel.token6) {
				LeftPanel.botones.get(5).setEnabled(false);
				System.out.println("!!");
			}
		}
	}
}
