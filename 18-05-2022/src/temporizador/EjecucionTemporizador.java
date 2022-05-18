package temporizador;

import java.util.Timer;
import java.util.TimerTask;

public class EjecucionTemporizador {
	public static int num = 0;
	public static void main(String[] args) {
		timmer();
	}
	
	
	public static void timmer () {
		Timer timer = new Timer();
		
		TimerTask tareaIndividual = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("Esta es mi tarea numero " + num);
				num++;
			}
		};
		timer.schedule(tareaIndividual, 3000, 1000);
	}
}
