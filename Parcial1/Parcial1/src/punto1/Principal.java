package punto1;

public class Principal {
	public static void main(String[] args) {
		Tortuga tortuga = new Tortuga("Tortuga");
		Liebre liebre= new Liebre("Liebre");		
		int randomTortuga = 1;
		int randomLiebre = 1;
		int turnosLiebreDurmiendo = 0;

		System.out.println("BANG!!!");
		System.out.println("Y COMIENZA LA CARRERA!!!");
		System.out.println("La tortuga se encuentra en el Kilï¿½metro 1");
		System.out.println("La tortuga se encuentra en el Kilï¿½metro 1");
		
		while(tortuga.distancia <= 40 && liebre.distancia <= 40) {
			
			int probabilidad = (int)(Math.random() * 100);
			
			if(probabilidad <= 35) {
				randomTortuga = 0;
			}else if(probabilidad <= 60) {
				randomTortuga = 1;
			}else {
				randomTortuga = 2; 
			}
			
			if(turnosLiebreDurmiendo == 0) {
				if(probabilidad <= 30) {
					randomLiebre = 0;
					turnosLiebreDurmiendo = 2;
				}else if (probabilidad <= 50){
					randomLiebre = 1;
				}else if(probabilidad <= 63){
					randomLiebre = 2;
				}else if(probabilidad <= 88) {
					randomLiebre = 3;
				}else{
					randomLiebre = 4;
				}
			}
			
			String movimientoTortuga = tortuga.realizarMovimiento(randomTortuga);
			String movimientoLiebre = liebre.realizarMovimiento(randomLiebre);
			
			if(tortuga.distancia >= 40 || liebre.distancia >=40) break;
			
			
			if(tortuga.distancia == liebre.distancia) {
				if(!(tortuga.distancia == 1 || tortuga.distancia == 40 || randomLiebre == 0)) {
					System.out.println("¡¡¡OUCH!!!");
				}
			}
			
			if(randomLiebre == 0) {
				System.out.println("Liebre durmiendo :c");
			}else {
				System.out.println("La liebre se encuentra en el km " + liebre.distancia + " - Realizï¿½ el movimiento "
						+ movimientoLiebre);
			}
			System.out.println("La tortuga se encuentra en el km " + tortuga.distancia + " - Realizï¿½ el movimiento "
					+ movimientoTortuga);
			
			tortuga.modificarDistancia(randomTortuga);
			liebre.modificarDistancia(randomLiebre);
			
			if(turnosLiebreDurmiendo != 0) {
				turnosLiebreDurmiendo -= 1;
			}
		}
		
		if(tortuga.distancia == liebre.distancia) {
			int probabilidad = (int)(Math.random() * 100);
			if(probabilidad <= 60) {
				System.out.println("LA TORTUGA GANï¿½!!! EH!!!");
			}else {
				System.out.println("Es un empate!");	
			}
		}else if(tortuga.distancia == 40) {
			System.out.println("LA TORTUGA GANï¿½!!! EH!!!");
		}else {
			System.out.println("La Liebre ganï¿½! Ugh!");
		}
	}
}
