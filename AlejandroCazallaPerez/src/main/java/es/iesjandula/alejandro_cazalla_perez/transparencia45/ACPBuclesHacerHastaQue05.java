package es.iesjandula.alejandro_cazalla_perez.transparencia45;

import java.util.Scanner;

public class ACPBuclesHacerHastaQue05 {

	public static void main(String[] args) {
		int altura;
        
        Scanner sc = new Scanner(System.in);
        
        do {
	        System.out.println("Dime la altura del triangulo: ");
	        altura = sc.nextInt();
        }while(altura<1);
        
        for(int i=altura; i>0 ; i--){
        	System.out.println(" ");
            for(int j=i; j>0; j--){
                System.out.print("*");
            }
        }

        sc.close();
	}

}
