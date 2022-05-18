package punto1;

public class Farmaco extends Producto{
    private String fechaExpiracion;

    public Farmaco(String nombre, double costo, String descripcion, int id, String fechaExpiracion) {
        super(nombre, costo, descripcion, id);
        this.setFechaExpiracion(fechaExpiracion);
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    
}
