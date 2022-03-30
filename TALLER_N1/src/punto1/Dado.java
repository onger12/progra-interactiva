package punto1;

public class Dado {
	
	private int valor = 0;
	private int nCaras = 6;
	private String penitencias[];
	
	public Dado() {
		lanzarDado();
		penitencias =  new String[nCaras];
	}
	
	public Dado(int nCaras) {
		this.nCaras = nCaras;
		penitencias =  new String[nCaras];
	}
	
	public void lanzarDado() {
		int n = (int) ( 1 +(Math.random() * nCaras));
		valor = n;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setPenitencia(int nCara, String penitencia) {
		penitencias[nCara] = penitencia;
	}
	
	public String getPenitencia(int nCara) {
		return penitencias[nCara];
	}
	
	public void pent () {
		for (String pen : penitencias) {
			System.out.println(pen);
		}
		System.out.println("");
	}
}
