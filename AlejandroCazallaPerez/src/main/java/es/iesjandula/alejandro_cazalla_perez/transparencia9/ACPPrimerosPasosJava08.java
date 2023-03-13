package es.iesjandula.alejandro_cazalla_perez.transparencia9;
import java.util.Scanner;

public class ACPPrimerosPasosJava08 {

	public static void main(String[] args) {
		int num1, num2, suma, resta, multiplicacion, division, potencia;
		double  raiz1, raiz2;
        
        Scanner sc = new Scanner(System.in);
                
        System.out.print("Numero 1: ");
        num1 = sc.nextInt();
                
        System.out.print("Numero 2: ");
        num2 = sc.nextInt();
        System.out.println("");
                
        suma = num1 + num2;        
        System.out.println(num1 + " + " + num2 + " = " + suma);
               
        resta = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + resta);
                
        multiplicacion = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + multiplicacion);
                
        division = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println("Con resto: " +(num1%num2));
        
        potencia = (int)Math.pow(num1, num2);
        System.out.println(num1 + "^" + num2 + " = " + potencia);
                
        raiz1 = Math.sqrt(num1);
        raiz2 = Math.sqrt(num2);
        System.out.println("La suma de sus raices es: " + (raiz1+raiz2));
        
        sc.close();
                
	
	}

}
