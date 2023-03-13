package es.iesjandula.alejandro_cazalla_perez.transparencia26;
import java.util.Scanner;

public class ACPCondicionales03 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero del 1 al 7: " );
        num = sc.nextInt();
        
        switch(num) {
        	case 1:{
        		System.out.println("Es Lunes.");
        		break;
        	}case 2:{
        		System.out.println("Es Martes.");
        		break;
        	}case 3:{
        		System.out.println("Es Miercoles.");
        		break;
        	}case 4:{
        		System.out.println("Es Jueves.");
        		break;
        	}case 5:{
        		System.out.println("Es Viernes.");
        		break;
        	}case 6:{
        		System.out.println("Es Sabado.");
        		break;
        	}case 7:{
        		System.out.println("Es Domingo.");
        		break;
        	}default:{
        		System.out.println("Ese numero no se corresponde a ningun dia de la semana.");
        		break;
        	}
        	
        }

        sc.close();
	}

}
