import java.util.ArrayList;

public class Tortuga extends Participante{
    public Tortuga(String nombre) {
        this.nombre = nombre;
        movimientos = new ArrayList<String>();
        movimientos.add("Paso Rápido");
        movimientos.add("Resbalón");
        movimientos.add("Paso Lento");
    }

    @Override
    public boolean realizarMovimiento(int r) {
        if(r == 0){
            if(this.km + 3 >= kmTotales){
                return true;
            }else{
                this.km += 3;
            }
        }else if(r == 1){
            if(this.km - 6 <= 10){
                this.km = 1;
            }else {
                this.km -= 6;
            }
        }else if(r == 2){
            if(this.km + 1 >= kmTotales){
                return true;
            }else {
                this.km += 1;
            }
        }
        return false;
    }
}
