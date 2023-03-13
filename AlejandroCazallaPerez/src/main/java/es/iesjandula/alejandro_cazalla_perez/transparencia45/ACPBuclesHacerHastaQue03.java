package es.iesjandula.alejandro_cazalla_perez.transparencia45;

import java.util.Scanner;

public class ACPBuclesHacerHastaQue03 {

	public static void main(String[] args) {
		int x, y, multiplicacion=0;
		
		Scanner sc = new Scanner(System.in);
        do {
			System.out.println("Dime un numero: ");
	        x = sc.nextInt();
		}while(x<0);
        
        do {
	        System.out.println("Dime otro numero: ");
	        y = sc.nextInt();
        }while(y<0);
        
        for(int i=0; i<y;i++) {
        	multiplicacion+=x;
        }
        
        System.out.println(x  + "*" + y + "=" + multiplicacion);
        
        sc.close();

	}

}
