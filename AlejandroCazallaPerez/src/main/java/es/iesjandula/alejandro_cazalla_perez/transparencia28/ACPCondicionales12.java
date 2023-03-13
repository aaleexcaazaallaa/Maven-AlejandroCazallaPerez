package es.iesjandula.alejandro_cazalla_perez.transparencia28;

import java.util.Scanner;

public class ACPCondicionales12 {

	public static void main(String[] args) {
		double nota1, nota2, media;
		String rec;
		
		Scanner sc = new Scanner(System.in);

        System.out.println("INTRODUCE TU PRIMERA NOTA: ");
        nota1 = sc.nextDouble();
        
        System.out.println("INTRODUCE TU SEGUNDA NOTA: ");
        nota2 = sc.nextDouble();
        
        media = (nota1+nota2)/2;
        if(media>=5) {
        	System.out.println("Tu nota media es: " + media);
        }else if(media<5) {
        	System.out.print("Cual ha sido el resultado de la recuperacion? (apto/no apto): ");
        	rec = sc.next();
        	
        	if(rec.equals("apto")) {
        		System.out.println("Tu nota media es: 5" );
        	}else {
        		System.out.println("Tu nota media es: " + media);
        	}		
        }
        
        
        sc.close();		
	}

}
