package es.iesjandula.alejandro_cazalla_perez.transparencia45;

import java.util.Scanner;

public class ACPBuclesHacerHastaQue01 {

	public static void main(String[] args) {
		int x, factorial  = 1;
        
		Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        x = sc.nextInt();
		while(x<0) {
	        System.out.println("No valido. Dime un numero: ");
	        x = sc.nextInt();
	        
		}
        
        for(int i = x; i > 0; i--){
            factorial *= i;
        }

        System.out.println(x + "! = " + factorial);
        sc.close();
	}

}
