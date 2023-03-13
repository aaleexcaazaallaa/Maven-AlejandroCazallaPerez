package es.iesjandula.alejandro_cazalla_perez.transparencia37;

public class ACPBuclesMientras04 {

	public static void main(String[] args) {
		int suma=0, i;
		
		i=50;
		while(i<299) {
			suma+=i;
			i++;
			System.out.println(i);
		}
		
		System.out.println("");
		System.out.println("La suma de todos los numeros enteros entre 50 y 300 es " + suma);
	}

}
