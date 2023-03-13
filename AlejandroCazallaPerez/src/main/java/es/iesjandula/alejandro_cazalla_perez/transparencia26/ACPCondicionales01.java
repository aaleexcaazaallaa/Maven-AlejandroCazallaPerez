package es.iesjandula.alejandro_cazalla_perez.transparencia26;
import java.util.Scanner;

public class ACPCondicionales01 {

	public static void main(String[] args) {
		int dia, lunes=1, martes=2, miercoles=3, jueves=4, viernes=5;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un dia de la semana: ");
		System.out.println("\n1- Lunes\n2- Martes\n3- Miercoles\n4- Jueves\n5- Viernes" );
        dia = sc.nextInt();
        
        if(dia==lunes) {
        	System.out.println("El Lunes hay Base de datos a primera hora.");
        }else if(dia==martes) {
        	System.out.println("El Martes hay Programacion a primera hora.");
        }else if(dia==miercoles) {
        	System.out.println("El Miercoles hay Sistemas informaticos a primera hora.");
        }else if(dia==jueves) {
        	System.out.println("El Jueves hay Fol a primera hora.");
        }else if(dia==viernes) {
        	System.out.println("El Viernes hay Programacion a primera hora.");
        }else {
        	System.out.println("Ese dia no esta en las opciones");
        }
        
        sc.close();
	}

}
