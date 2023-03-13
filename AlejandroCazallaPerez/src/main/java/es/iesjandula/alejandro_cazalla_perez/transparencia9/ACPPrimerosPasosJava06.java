package es.iesjandula.alejandro_cazalla_perez.transparencia9;
import java.util.Scanner;

public class ACPPrimerosPasosJava06 {

	public static void main(String[] args) {
		int num1, num2, num3, res;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tres numeros para multiplicarlos--> ");
		
		System.out.print("numero 1: ");
		num1 = sc.nextInt();
		
		System.out.print("numero 2: ");
		num2 = sc.nextInt();
		
		System.out.print("numero 3: ");
		num3 = sc.nextInt();
		
		System.out.println("");
		
		res = (num1*num2*num3);
		System.out.println("MULTIPLICACION --> " + num1 + " x " + num2 + " x " + num3 + " = " + res);
		
		sc.close();

	}

}
