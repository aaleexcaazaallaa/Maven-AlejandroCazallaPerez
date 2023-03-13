package es.iesjandula.alejandro_cazalla_perez.transparencia26;
import java.util.Scanner;

public class ACPCondicionales04 {

	public static void main(String[] args) {
		int a, b; 
		double x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ECUACION ===> ax+b=0");
		
		System.out.print("Introduce un valor para a: " );
        a = sc.nextInt();
        
		System.out.print("Introduce un valor para b: " );
        b = sc.nextInt();
        if(a==0) {
        	System.out.println("x= No existe");
		}
        
        if(b<0) {
        	x=(double)-b/a;
        	System.out.printf("x= %.2f" , x);
        }else if (b>0){
        	x=(double)-b/a;
        	System.out.printf("x= %.2f" , x);
        }

        sc.close();
	}

}
