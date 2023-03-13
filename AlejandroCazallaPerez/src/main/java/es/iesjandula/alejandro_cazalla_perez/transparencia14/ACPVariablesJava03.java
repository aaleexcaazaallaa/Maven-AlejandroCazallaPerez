package es.iesjandula.alejandro_cazalla_perez.transparencia14;
import java.util.Scanner;

	public class ACPVariablesJava03 {
	
		public static void main(String[] args) {
		double total, descuento, precio, iva;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el precio: ");
		precio = sc.nextDouble();
		
		System.out.println("Introduce el IVA: ");
		iva = sc.nextDouble();
		
		descuento = (iva/100)*precio;
		total = precio - descuento;
		
		System.out.println("El total seria: " + total);
		
		sc.close();
	

	}

}
