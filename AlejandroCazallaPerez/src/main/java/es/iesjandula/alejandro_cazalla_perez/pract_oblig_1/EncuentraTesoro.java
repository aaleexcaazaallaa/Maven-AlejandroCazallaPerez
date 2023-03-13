package es.iesjandula.alejandro_cazalla_perez.pract_oblig_1;

import java.util.Scanner;

public class EncuentraTesoro {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("a = ");
		a = sc.nextInt();
		System.out.print("b = ");
		b = sc.nextInt();
		System.out.print("c = ");
		c = sc.nextInt();
		
		if(a>0 && a<=150 && a%13==0 && a%11==0) {
			System.out.println("Tesoro 1 encontrado.");
		}else if(a<=100 && (b<=20 || b==c)) {
			System.out.println("Tesoro 2 encontrado.");
		}else if(c>0 && c<=1500 && c%7==0 && c%13==0 && c%17==0) {
			System.out.println("Tesoro 3 encontrado.");
		}
		
		sc.close();
	}

}
