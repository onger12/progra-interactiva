import java.util.ArrayList;

public class Liebre extends Participante{

    public Liebre(String nombre) {
        this.nombre = nombre;
        movimientos = new ArrayList<String>();
        movimientos.add("Dormir");
        movimientos.add("Salto Largo");
        movimientos.add("Resbalón Grande");
        movimientos.add("Salto Pequeño");
        movimientos.add("Resbalón Pequeño");
    }
    @Override
    public boolean realizarMovimiento(int r) {
        if(r == 1){
            if(this.km + 9 >= kmTotales){
                return true;
            }else{
                this.km += 9;
            }
        }else if(r == 2){
            if(this.km - 12 <= 10){
                this.km = 1;
            }else {
                this.km -= 12;
            }
        }else if(r == 3){
            if(this.km + 1 >= kmTotales){
                return true;
            }else {
                this.km += 1;
            }
        }else if(r == 4){
            if(this.km - 2 <= 10){
                this.km = 1;
            }else {
                this.km -= 2;
            }
        }
        return false;
    }
    
}
