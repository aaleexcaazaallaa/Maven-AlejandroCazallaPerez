package es.iesjandula.alejandro_cazalla_perez.transparencia37;

import java.util.Scanner;

public class ACPBuclesMientras03 {

	public static void main(String[] args) {
        int opcion, num1, num2, suma, resta, multiplicacion, division;
 
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("0. Salir");
        
        Scanner sc = new Scanner(System.in);
        
        do {
        	System.out.println("Elija una opcion: ");
        	opcion = sc.nextInt();
        	while (opcion<0||opcion>4) {
        		System.out.println("No valido. Elija una opcion: ");
            	opcion = sc.nextInt();
        	}
        
	        switch(opcion){
	            case 1:{
	                System.out.println("Has elegido la opcion Suma, Introduzca 2 numeros para sumar: ");
	                
	                System.out.print("Numero 1: ");
	                num1 = sc.nextInt();
	                
	                System.out.print("Numero 2: ");
	                num2 = sc.nextInt();
	                
	                suma = num1 + num2;
	                
	                System.out.println(num1 + " + " + num2 + " = " + suma);
	                System.out.println("Hasta la proxima.");
	                break;
	            }case 2:{
	                System.out.println("Has elegido la opcion Resta, Introduzca 2 numeros para restar: ");
	                
	                System.out.print("Numero 1: ");
	                num1 = sc.nextInt();
	                
	                System.out.print("Numero 2: ");
	                num2 = sc.nextInt();
	                
	                resta = num1 - num2;
	                
	                System.out.println(num1 + " - " + num2 + " = " + resta);
	                System.out.println("Hasta la proxima.");
	                break;
	            }case 3:{
	                System.out.println("Has elegido la opcion Multiplicacion, Introduzca 2 numeros para multiplicar: ");
	                
	                System.out.print("Numero 1: ");
	                num1 = sc.nextInt();
	                
	                System.out.print("Numero 2: ");
	                num2 = sc.nextInt();
	                
	                multiplicacion = num1 * num2;
	               
	                System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
	                System.out.println("Hasta la proxima.");
	                break;
	            }case 4:{
	                System.out.println("Has elegido la opcion Division, Introduzca 2 numeros para dividir: ");
	                
	                System.out.print("Numero 1: ");
	                num1 = sc.nextInt();
	                
	                System.out.print("Numero 2: ");
	                num2 = sc.nextInt();
	                
	                division = num1 / num2;
	                
	                System.out.println(num1 + " / " + num2 + " = " + division);
	                System.out.println("Hasta la proxima.");
	                break;
	            }case 0:{
	                System.out.println("Hasta la proxima");
	                break;
	            }
	        
    		}
        }while(opcion!=0);
        
        
        
        sc.close();
	}

}
