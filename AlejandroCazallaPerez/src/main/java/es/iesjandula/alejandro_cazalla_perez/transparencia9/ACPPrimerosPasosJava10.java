package es.iesjandula.alejandro_cazalla_perez.transparencia9;
import java.util.Scanner;

public class ACPPrimerosPasosJava10 {

	public static void main(String[] args) {
		int horas, salario;
		final int precioHora=12;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la cantidad de horas que has trabajado esta semana: ");
        horas = sc.nextInt();
        
        salario = precioHora*horas;
        System.out.println("Su salario semanal es de: " + salario + " euros");
        
        sc.close();
	}

}
