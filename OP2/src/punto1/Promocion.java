package punto1;

public class Promocion {
    private String nombre;
    static int ids[];
    public Promocion() {
        ids = new int[2];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProductos(int id1, int id2){
        ids[0] = id1;
        ids[1] = id2;
    }

    public int[] getProductos(){
        return ids;
    }
}

