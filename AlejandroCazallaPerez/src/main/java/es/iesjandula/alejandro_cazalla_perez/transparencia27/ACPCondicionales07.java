package es.iesjandula.alejandro_cazalla_perez.transparencia27;

import java.util.Scanner;

public class ACPCondicionales07 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		if(num%2==0 && num%5==0) {
			System.out.println("Es par y divisible entre 5.");
		}else if(num%5==0) {
			System.out.println("Es divisible entre 5.");
		}else if(num%2==0){
			System.out.println("Es par.");
		}else {
			System.out.println("No es ni par ni divisible entre 5.");
		}
		
		sc.close();

	}

}
