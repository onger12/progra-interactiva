package punto2;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		
		while(true) {
			try {
				String cadena = JOptionPane.showInputDialog("Introduzca la cadena");
				StringTokenizer st = new StringTokenizer(cadena, ",");
				double resultado = 0;
				
				if(st.countTokens() == 3) {
					int num1 = Integer.parseInt(st.nextToken());
					int num2 = Integer.parseInt(st.nextToken());
					String op = st.nextToken();
					
					if(op.equals("suma")) {
						resultado = num1 + num2;
						JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado);
					}else if(op.equals("resta")) {
						resultado = num1 - num2;
						JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resultado);
					}else if(op.equals("div")) {
						resultado = num1 / num2; 
						JOptionPane.showMessageDialog(null, "El resultado de la division es: " + resultado);
					}else if(op.equals("mult")) {
						resultado = num1 * num2;
						JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + resultado);
					}else {
						System.out.println("Error, formato invalido");
					}
				}else if(st.countTokens() == 2) {
					int num = Integer.parseInt(st.nextToken());
					String op = st.nextToken();
					if(op.equals("raiz")) {
						resultado = Math.sqrt(num);
						JOptionPane.showMessageDialog(null, "El resultado de la raiz es: " + resultado);
					}else if(op.equals("rand")) {
						resultado = (Math.random()* num * 100);
						JOptionPane.showMessageDialog(null, "El resultado del random es: " + resultado);
					}else {
						System.out.println("Error, formato invalido");
					}
				}else if(st.countTokens() == 1) {
					if(st.nextToken().equals("salir")){
						break;
					}else {
						System.out.println("Error, formato invalido");
					}
				}else {
					System.out.println("Error, formato invalido");
				}
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Adios! :)");
				break;
			}
		}
	}
}
