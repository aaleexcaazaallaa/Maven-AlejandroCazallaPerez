package es.iesjandula.alejandro_cazalla_perez.transparencia45;

import java.util.Scanner;

public class ACPBuclesHacerHastaQue04 {

	public static void main(String[] args) {
		int x, y, division=0, cont=0;
		
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
        	division-=y;
        	cont --;
        	
        }
        
        System.out.println(x  + "/" + y + "=" + cont);
        
        sc.close();

	}

}
