package es.iesjandula.alejandro_cazalla_perez.transparencia9;
import java.util.Scanner;

public class ACPPrimerosPasosJava09 {

	public static void main(String[] args) {
		double euros, pesetas;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una cantidad de euros para pasar a pesetas: ");
        euros = sc.nextDouble();
        
        pesetas = euros * 166.386;
        System.out.println(euros + " euros serian: " + pesetas + " pesetas");
        
        sc.close();
	}

}
