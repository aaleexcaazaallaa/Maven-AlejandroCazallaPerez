package es.iesjandula.alejandro_cazalla_perez.transparencia37;
import java.util.Scanner;
import java.lang.Math;

public class ACPBuclesMientras02 {

	public static void main(String[] args) {
		int n, random=(int)(Math.random()*10+1); 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Acierta el numero escondido entre 1 y 10 : ");
		n = sc.nextInt();
		do {
			System.out.println("El numero esta entre 1 y 10. Introduce de nuevo: ");
			n = sc.nextInt();
		}while(n<=0 ||n >10);

		while(n<random||n>random) {
			System.out.println("INCORRECTO, VUELVE A INTENTARLO.");
			n = sc.nextInt();
		}
		
		System.out.println("ACERTASTEEE!!!.");
		
		sc.close();
	}

}
