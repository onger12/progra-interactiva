package Herencia;

public class FechaDetallada extends Fecha{
	private String meses[];
	
	public FechaDetallada (int dia, int mes, int anio) {
		super(dia, mes, anio);
		inicializarMeses();
	}
	
	public FechaDetallada(String dato) {
		super(dato);
		inicializarMeses();
	}
	
	public FechaDetallada() {
		super();
		inicializarMeses();
	}
	
	private void inicializarMeses() {
		String mesesAuxiliar[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
				"Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		meses = mesesAuxiliar;
		
	}
	
	public String getFechaDetallada() {
		String resultado = this.getDia() + " de " + meses[this.getMes() - 1] + " de " + this.getAnio();
		return resultado; 
	}
}
