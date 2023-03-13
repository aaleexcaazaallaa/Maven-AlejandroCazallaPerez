package es.iesjandula.alejandro_cazalla_perez.transparencia10;
import java.util.Scanner;

public class ACPPrimerosPasosJava11 {

	public static void main(String[] args) {
		double notaReal1, examen1, notaTrimestre, notaExamen2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la nota de tu primer examen: ");
        examen1 = sc.nextDouble();
        
        System.out.print("Que nota quieres sacar en el trimestre?: ");
        notaTrimestre = sc.nextDouble();
        
        notaReal1 = (examen1*40)/100;
        notaExamen2 = ((notaTrimestre - notaReal1)*100)/60;
        
        System.out.println("Para sacar un " + notaTrimestre + " en el trimestre, debes sacar un " + notaExamen2 + " en el segundo examen.");
        
        sc.close();

	}

}
