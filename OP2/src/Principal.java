import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        double numero = 0;
        Peso peso = new Peso();
        Longitud longi = new Longitud();
        while(true){
        	try {

                String cadena1 = JOptionPane.showInputDialog("Ingrese los datos: ");
                String split[] = cadena1.split(" ");
                for(int i = 0; i < split.length; i++){
                    try {
                        numero = Double.parseDouble(split[i]);
                        break;
                    } catch (Exception e) {
                    }
                }
                if(numero == 0) {
                	JOptionPane.showMessageDialog(null, "No ingresaste ningún numero");                	
                }
                System.out.println(numero);
                try {
                	for(int i = 0; i < split.length; i++){
                        try {
                            if(split[i].toLowerCase().equals("kilos")){
                                for (String item : split) {
                                    if(item.toLowerCase().equals("gramos")){
                                        JOptionPane.showMessageDialog(null, peso.kilosAGramos(numero));
                                        split = null;
                                        break;
                                    }else if(item.toLowerCase().equals("libras")){
                                        JOptionPane.showMessageDialog(null, peso.kilosALibras(numero));
                                        split = null;
                                        break;
                                    }else {
                                    }
                                }
                            }else if(split[i].toLowerCase().equals("libras")){
                                for (String item : split) {
                                    if(item.toLowerCase().equals("kilos")){
                                        JOptionPane.showMessageDialog(null, peso.LibrasAKilos(numero) + "kilos!");
                                        split = null;
                                        break;
                                    }else if(item.toLowerCase().equals("gramos")){
                                        JOptionPane.showMessageDialog(null, peso.LibrasAGramos(numero));
                                        split = null;
                                        break;
                                    }else {
                                    }
                                }
                            }else if(split[i].toLowerCase().equals("gramos")){
                                for (String item : split) {
                                    if(item.toLowerCase().equals("kilos")){
                                        JOptionPane.showMessageDialog(null, peso.gramosAKilos(numero));
                                        split = null;
                                        break;
                                    }else if(item.toLowerCase().equals("libras")){
                                        JOptionPane.showMessageDialog(null, peso.gramosALibras(numero));
                                        split = null;
                                        break;
                                    }else{
                                    }
                                }
                            }else if(split[i].toLowerCase().equals("cm")){
                                for (String item : split) {
                                    if(item.toLowerCase().equals("metros")){
                                        JOptionPane.showMessageDialog(null, longi.cmAMetros(numero) + " metros");
                                        split = null;
                                        break;
                                    }
                                }
                            }else if(split[i].toLowerCase().equals("metros")){
                                for (String item : split) {
                                    if(item.toLowerCase().equals("cm")){
                                        JOptionPane.showMessageDialog(null, longi.metroACm(numero) + " cm");
                                        split = null;
                                        break;
                                    }
                                }
                            }else {
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Error, datos mal ingresados1");
                        }
                    }
    			} catch (Exception e) {
    				
    			}
            
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Adios! :)");
				break;
			}
        }
    }
}
