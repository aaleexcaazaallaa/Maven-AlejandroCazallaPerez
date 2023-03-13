package es.iesjandula.alejandro_cazalla_perez.transparencia27;

import java.util.Scanner;

public class ACPCondicionales08 {

	public static void main(String[] args) {
		int num, mod;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		mod = num%10;
		System.out.println("El ultimo numero es " + mod);
		
		sc.close();
	}

}
