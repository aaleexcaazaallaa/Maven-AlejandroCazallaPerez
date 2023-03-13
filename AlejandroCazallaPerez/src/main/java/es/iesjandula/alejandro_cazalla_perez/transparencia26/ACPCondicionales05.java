package es.iesjandula.alejandro_cazalla_perez.transparencia26;
import java.util.Scanner;

public class ACPCondicionales05 {

	public static void main(String[] args) {
		int horas, mins, segs;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la hora: " );
        horas = sc.nextInt();
        
        System.out.print("Introduce los minutos: " );
        mins = sc.nextInt();
        
        if(horas==24 && mins==0) {
        	System.out.println("Ya es medianoche.");
        }else {
        	segs=86400-(horas*3600+mins*60);
        	System.out.println("Quedan " + segs + " segundos para medianoche.");
        }
        
        sc.close();
	}

}
