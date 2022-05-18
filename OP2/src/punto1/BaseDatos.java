package punto1;

import java.util.ArrayList;

public class BaseDatos {
    static ArrayList<Farmaco> farmacos;
    static ArrayList<Dulce> dulces;
    static ArrayList<Belleza> bellezas;

    public BaseDatos() {
        farmacos = new ArrayList<>();
        dulces = new ArrayList<>();
        bellezas = new ArrayList<>();
    }

    public void addFarmaco(Farmaco farmaco){
        farmacos.add(farmaco);
    }
    public ArrayList<Farmaco> getFarmacos(){
        return farmacos;
    }
    public void addDulce(Dulce dulce){
        dulces.add(dulce);
    }
    public ArrayList<Dulce> getDulces(){
        return dulces;
    }
    public void addBelleza(Belleza belleza){
        bellezas.add(belleza);
    }
    public ArrayList<Belleza> getBelleza(){
        return bellezas;
    }
    public String getNombreProducto(int id){
        for(int i = 0; i < farmacos.size(); i++){
            if(farmacos.get(i).id == id){
                return farmacos.get(i).nombre;
            }
        }
        for(int i = 0; i < dulces.size(); i++){
            if(dulces.get(i).id == id){
                return dulces.get(i).nombre;
            }
        }
        for(int i = 0; i < bellezas.size(); i++){
            if(bellezas.get(i).id == id){
                return bellezas.get(i).nombre;
            }
        }
        return "No existen productos en promoción";
    }
}
