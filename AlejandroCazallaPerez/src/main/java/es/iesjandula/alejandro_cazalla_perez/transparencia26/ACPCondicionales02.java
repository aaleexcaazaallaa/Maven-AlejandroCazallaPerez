package es.iesjandula.alejandro_cazalla_perez.transparencia26;
import java.util.Scanner;

public class ACPCondicionales02 {

	public static void main(String[] args) {
		int hora;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que hora es?" );
        hora = sc.nextInt();
        
        if(hora>=6 && hora<=12) {
        	System.out.println("Buenos dias!!");
        }else if(hora>=13 && hora<=20) {
        	System.out.println("Buenas tardes!!");
        }else if(hora==5 || hora==4 || hora==3 || hora==2 || hora==1 || hora==24 || hora==23 || hora==22 || hora==21) {
        	System.out.println("Buenas noches!!");
        }
        
        sc.close();
	}

}
