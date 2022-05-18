package punto1;

public class Belleza extends Producto{
    boolean unisex;

    public Belleza(String nombre, double costo, String descripcion, int id, boolean unisex) {
        super(nombre, costo, descripcion, id);
        this.unisex = unisex;
    }
    
}
