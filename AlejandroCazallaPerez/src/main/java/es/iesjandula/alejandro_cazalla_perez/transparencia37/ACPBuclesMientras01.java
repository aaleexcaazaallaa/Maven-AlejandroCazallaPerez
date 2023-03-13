package es.iesjandula.alejandro_cazalla_perez.transparencia37;
import java.util.Scanner;

public class ACPBuclesMientras01 {

	public static void main(String[] args) {
		int n, i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero para pintar asteriscos: ");
		n = sc.nextInt();
		while(n<=0){
			System.out.println("No se puede pintar esa cantidad. Introduce otra: ");
			n = sc.nextInt();
		}
		
		i=1;
		while(i<=n) {
			System.out.print("*");
			i++;
		}
		
		sc.close();
	}

}
