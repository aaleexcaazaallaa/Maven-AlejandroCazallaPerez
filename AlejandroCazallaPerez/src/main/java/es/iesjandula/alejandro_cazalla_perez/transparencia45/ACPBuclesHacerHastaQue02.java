package es.iesjandula.alejandro_cazalla_perez.transparencia45;

import java.util.Scanner;

public class ACPBuclesHacerHastaQue02 {

	public static void main(String[] args) {
		int x, y, potencia=1;
		
		Scanner sc = new Scanner(System.in);
        do {
			System.out.println("Dime un numero: ");
	        x = sc.nextInt();
		}while(x<0);
        
        do {
	        System.out.println("Dime un exponente: ");
	        y = sc.nextInt();
        }while(y<0);
        
        for(int i=0; i<y;i++) {
        	potencia*=x;
        }
        
        System.out.println(x  + "^" + y + "=" + potencia);
        
        sc.close();
	}

}
