package es.iesjandula.alejandro_cazalla_perez.transparencia27;

import java.util.Scanner;

public class ACPCondicionales09 {

	public static void main(String[] args) {
		int num, mod;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		if(num>=10000) {
			mod = num/10000;
			System.out.println("El primer numero es " + mod);
		}else if(num>=1000) {
			mod = num/1000;
			System.out.println("El primer numero es " + mod);
		}else if(num>=100) {
			mod = num/100;
			System.out.println("El primer numero es " + mod);
		}else if(num>=10) {
			mod = num/10;
			System.out.println("El primer numero es " + mod);
		}
		
		sc.close();

	}

}
