public class Principal {
    
    public static void main(String[] args) {
        Liebre liebre = new Liebre("Liebre");
        Tortuga tortuga = new Tortuga("Tortuga");
        System.out.println("BANG!!!\n" +
        "Y COMIENZA LA CARRERA!!! ");

        int turnosRestantesLiebreDurmiendo = 0;
        boolean tortugaGanador = false;
        boolean liebreGanador = false;

        while(!tortugaGanador && !liebreGanador){
            System.out.println("La Liebre se encuentra en el km " + liebre.km
            + "\nLa tortuga se encuentra en el km " + tortuga.km);

            //GENERAR MOVIMIENTO
            int random = (int)((Math.random() * 100) + 1);
            if(random <= 40){
                tortugaGanador = tortuga.realizarMovimiento(0);
                System.out.println("Tortuga: " + tortuga.movimientos.get(0));
            }else if(random <= 70){
                tortugaGanador = tortuga.realizarMovimiento(1);
                System.out.println("Tortuga: " + tortuga.movimientos.get(1));
            }else{
                tortugaGanador = tortuga.realizarMovimiento(2);
                System.out.println("Tortuga: " + tortuga.movimientos.get(2));
            }

            if(turnosRestantesLiebreDurmiendo == 0){
                if(random <= 25){
                    turnosRestantesLiebreDurmiendo = 2;
                    System.out.println("LIEBRE DURMIENDO! SHH");
                }else if(random <= 45){
                    liebreGanador = liebre.realizarMovimiento(1);
                    System.out.println("Liebre: " + liebre.movimientos.get(1));
                }else if(random <= 55){
                    liebreGanador = liebre.realizarMovimiento(2);
                    System.out.println("Liebre: " + liebre.movimientos.get(2));
                }else if(random <= 85){
                    liebreGanador = liebre.realizarMovimiento(3);
                    System.out.println("Liebre: " + liebre.movimientos.get(3));
                }else {
                    liebreGanador = liebre.realizarMovimiento(4);
                    System.out.println("Liebre: " + liebre.movimientos.get(4));
                }
            }else{
                turnosRestantesLiebreDurmiendo--;
                System.out.println("LIEBRE DURMIENDO! SHH");
            }
        }

        if(tortugaGanador){
            System.out.println("La tortuga ha ganado, wiii");
        }else{
            System.out.println("La liebre ganó :c Jum");
        }
    }
}