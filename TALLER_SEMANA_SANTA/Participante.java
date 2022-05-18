import java.util.ArrayList;

public abstract class Participante {
    String nombre;
    static int kmTotales = 50;
    int km = 1;
    ArrayList<String> movimientos;

    public abstract boolean realizarMovimiento(int r);
}
