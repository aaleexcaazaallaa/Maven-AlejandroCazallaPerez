package es.iesjandula.alejandro_cazalla_perez.transparencia26;
import java.util.Scanner;

public class ACPCondicionales06 {

	public static void main(String[] args) {
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un valor para a: " );
        a = sc.nextInt();
        
        System.out.print("Introduce un valor para b: " );
        b = sc.nextInt();
        
        System.out.print("Introduce un valor para c: " );
        c = sc.nextInt();
        
        if(a>b && b>c) {
        	System.out.println(c + ","  + b + "," + a);
        }else if(b>a && a>c){
        	System.out.println(c + ","  + a + "," + b);
        }else if(c>b && b>a) {
        	System.out.println(a + ","  + b + "," + c);
        }else if(b>c && c>a) {
        	System.out.println(a + ","  + c + "," + b);
        }else if(c>a && a>b) {
        	System.out.println(b + ","  + a + "," + c);
        }else if(a>c && c>b) {
        	System.out.println(b + ","  + c + "," + a);
        }
        
        sc.close();
	}

}
