package threads;

import panelButtons.PanelButtons;

public class ButtonListenerThread extends Thread {
	
	public void run() {
		System.out.println("Thread running");
		if(PanelButtons.betTokenOneActive) {
			System.out.println("click!");
			PanelButtons.betTokenOneActive = false;
		}
		try {
			this.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
