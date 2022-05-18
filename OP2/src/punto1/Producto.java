package punto1;

public class Producto {
    protected int id;
    protected String nombre;
    protected double costo;
    protected String descripcion;
    public Producto(String nombre, double costo, String descripcion, int id) {
        this.nombre = nombre;
        this.costo = costo;
        this.descripcion = descripcion;
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getCosto(){
        return costo;
    }
    public void setCosto(double costo){
        this.costo = costo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
}
