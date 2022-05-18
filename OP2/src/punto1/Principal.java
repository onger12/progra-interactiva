package punto1;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        BaseDatos bd = new BaseDatos();
        while(true){
        	int opc = 0;
            opc = Integer.parseInt(JOptionPane.showInputDialog("--- BIENVENIDO A LA FARMACIA REMEDIOS ---\nSelecciona una opci�n:\n"
            + " 1. Crear productos.\n"
            + " 2. Consultar productos.\n"
            + " 3. Promoci�n.\n"));
            if(opc == 1){
                while(true){
                	opc = Integer.parseInt(JOptionPane.showInputDialog(
                      " 1. Crear un producto de farmacia.\n"
                    + " 2. Crear un producto de belleza.\n"
                    + " 3. Crear un producto de dulcer�a.\n"
                    + " 4. Men� principal\n"));
                    if(opc != 4){
                        double precio = 0;
                        int id = 0;
                        String descripcion = "";
                        String nombre = (JOptionPane.showInputDialog("Ingrese el nombre del producto: "));
                        
                        try {
                        	precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del producto: "));
                        } catch (Exception e) {
                            System.out.println("--- VALOR INGRESADO NO V�LIDO ---");
                        }
                        try {
                        	descripcion = (JOptionPane.showInputDialog("Ingrese la descripcion del producto: "));
                        } catch (Exception e) {
                            System.out.println("--- VALOR INGRESADO NO V�LIDO ---");
                        }
                        if(opc == 1){
                            String fechaExpiracion = (JOptionPane.showInputDialog("Ingrese la fecha de expiraci�n: "));
                            Farmaco farmaco = new Farmaco(nombre, precio, descripcion, id, fechaExpiracion);
                            bd.addFarmaco(farmaco);
                            break;
                        }else if(opc == 2){
                            boolean unisex = false;
                            while(true){
                                String unix = JOptionPane.showInputDialog("El producto es unisex? (INGRESE UN 'SI' O UN 'NO' SIN COMILLAS): ");
                                if(!unix.toLowerCase().equals("si") || unix.toLowerCase().equals("no")){
                                    System.out.println("--- VALOR NO V�LIDO, INTENTELO DE NUEVO ---");
                                }else{
                                    if(unix.toLowerCase().equals("si")){
                                        unisex = true;
                                    }else{
                                        unisex = false;
                                    }
                                    break;
                                }
                            }
                            Belleza belleza = new Belleza(nombre, precio, descripcion, id, unisex);
                            bd.addBelleza(belleza);
                            break;
                        }else if(opc == 3){
                            String fechaExpiracion = (JOptionPane.showInputDialog("Ingrese la fecha de expiraci�n: "));
                            Dulce dulce = new Dulce(nombre, precio, descripcion, id, fechaExpiracion);
                            bd.addDulce(dulce);
                            break;
                        }else {
                            System.out.println("--- OPCI�N NO V�LIDA, INTENTE DE NUEVO ---");
                        }
                    }else if(opc == 4){
                        System.out.println("--- VOLVIENDO AL MEN� PRINCIPAL ---");
                        break;
                    }else{
                        System.out.println("--- OPCI�N NO V�LIDA, INTENTA DE NUEVO ---");
                    }
                }
            }else if(opc == 2){
                while(true){
                	opc = Integer.parseInt(JOptionPane.showInputDialog(
                          " 1. Consultar todos los productos farmacos.\n"
                        + " 2. Consultar todos los productos de belleza.\n"
                        + " 3. Consultar todos los productos de dulcer�a.\n"
                        + " 4. Men� principal\n"));
                        if(opc != 4){
                            if(opc == 1){
                                ArrayList<Farmaco> farmacos = bd.getFarmacos();
                                if(farmacos.size() != 0){
                                    System.out.println("Farmacos: ");
                                    for(int i = 0; i < farmacos.size(); i++){
                                        System.out.println("Nombre: " + farmacos.get(i).nombre);
                                        System.out.println("Id: " + farmacos.get(i).id);
                                        System.out.println("Costo: " + farmacos.get(i).costo);
                                        System.out.println("Descripci�n: " + farmacos.get(i).descripcion);
                                        System.out.println("Fecha de expiraci�n: " + farmacos.get(i).getFechaExpiracion());
                                        System.out.println("--- ---");
                                    }
                                }else{
                                    System.out.println("--- No hay productos ---");
                                }
                                System.out.println("");
                                break;
                            }else if(opc == 2){
                                    ArrayList<Belleza> belleza = bd.getBelleza();
                                    if(belleza.size() != 0){
                                        System.out.println("Productos de belleza");
                                        for(int i = 0; i < belleza.size(); i++){
                                            System.out.println("Nombre: " + belleza.get(i).nombre);
                                            System.out.println("Id: " + belleza.get(i).id);
                                            System.out.println("Costo: " + belleza.get(i).costo);
                                            System.out.println("Descripci�n: " + belleza.get(i).descripcion);
                                            System.out.println("Unisex: " + belleza.get(i).unisex);
                                            System.out.println("--- ---");
                                        }
                                    }else{
                                        System.out.println("--- No hay productos ---");
                                    }
                                    System.out.println("");
                                    break;                                 
                            }else if(opc == 3){
                                ArrayList<Dulce> dulces = bd.getDulces();
                                if(dulces.size() != 0){
                                    System.out.println("Productos de dulcer�a: ");
                                    for(int i = 0; i < dulces.size(); i++){
                                        System.out.println("Nombre: " + dulces.get(i).nombre);
                                        System.out.println("Id: " + dulces.get(i).id);
                                        System.out.println("Costo: " + dulces.get(i).costo);
                                        System.out.println("Descripci�n: " + dulces.get(i).descripcion);
                                        System.out.println("Fecha de expiraci�n: " + dulces.get(i).getFechaExpiracion());
                                        System.out.println("--- ---");
                                    }
                                }else{
                                    System.out.println("--- No hay productos ---");
                                }
                                System.out.println("");
                                break;
                            }else{
                                System.out.println("--- OPCI�N NO V�LIDA, INTENTA DE NUEVO ---");
                            }
                        }else if(opc == 4){
                            System.out.println("--- VOLVIENDO AL MEN� PRINCIPAL ---");
                            break;
                        }else{
                            System.out.println("--- OPCI�N NO V�LIDA, INTENTA DE NUEVO ---");
                        }
                }
            }else if(opc == 3){
                while(true){
                	opc = Integer.parseInt(JOptionPane.showInputDialog(
                          " 1. Consultar promoci�n.\n"
                        + " 2. Crear promoci�n.\n"));
                    if(opc == 1){
                        System.out.println(
                              " 1. Consultar promoci�n.\n"
                            + " 2. Crear promoci�n.\n");
                    }else if(opc == 2){
                    	opc = Integer.parseInt(JOptionPane.showInputDialog(
                              " 1. Agregar producto de tipo farmaco.\n"
                            + " 2. Agregar producto de tipo belleza.\n"
                        	+ " 3. Agregar producto de tipo dulcer�a.\n"));
                        if(opc == 1) {
                        	int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del producto a agregar: "));
                        	String nombre = bd.getNombreProducto(id);
                        	System.out.println(nombre);
                        }else if(opc == 2) {
                        	
                        }else if(opc == 3) {
                        	
                        }else {
                            System.out.println("--- OPCI�N NO V�LIDA, INTENTA DE NUEVO ---");                        	
                        }
                        
                    }else {
                        System.out.println("--- OPCI�N NO V�LIDA, INTENTA DE NUEVO ---");
                    }
                }
            }else {
                System.out.println("--- OPCI�N NO V�LIDA, INTENTA DE NUEVO ---");
            }
        }
    }
}