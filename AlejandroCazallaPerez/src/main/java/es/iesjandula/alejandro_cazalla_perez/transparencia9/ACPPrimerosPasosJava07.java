package es.iesjandula.alejandro_cazalla_perez.transparencia9;
import java.util.Scanner;

public class ACPPrimerosPasosJava07 {

	public static void main(String[] args) {
		int x, res;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un valor para x para calcular la siguiente ecuacion: F(X)= X^2 + X + 1");
		x = sc.nextInt();
		
		res = (x*x)+x+1;
		System.out.println("F(X)= " + x + "^2 + " + x + " + 1 = " + res);
		
		sc.close();

	}

}
