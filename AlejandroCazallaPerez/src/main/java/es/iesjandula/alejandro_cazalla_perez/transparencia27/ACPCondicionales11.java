package es.iesjandula.alejandro_cazalla_perez.transparencia27;

import java.util.Scanner;

public class ACPCondicionales11 {

	public static void main(String[] args) {
		int n, cifras = 0, primera, segunda, tercera, cuarta, quinta;

        Scanner sc = new Scanner(System.in);

        System.out.println("INTRODUCE EL NUMERO A COMPROBAR: ");
        n = sc.nextInt();

        if (n > 9999) {
            cifras = 5;
        } else if (n <= 9999 && n > 999) {
            cifras = 4;
        } else if (n <= 999 && n > 99) {
            cifras = 3;
        } else if (n <= 99 && n > 9) {
            cifras = 2;
        } else if (n <= 9) {
            cifras = 1;
        }

        switch (cifras) {
        case 1:
            System.out.println("Capicua");
            break;
        case 2:
            primera = n / 10;
            segunda = n % 10;
            if (primera == segunda)
                System.out.println("Capicua");
            else
                System.out.println("No capicua");
            break;
        case 3:
            primera = n / 100;
            tercera = n % 10;
            if (primera == tercera)
                System.out.println("Capicua");
            else
                System.out.println("No capicua");
            break;
        case 4:
            primera = n / 1000;
            n = n - (primera * 1000);
            segunda = n / 100;
            n = n - (segunda * 100);
            tercera = n / 10;
            n = n - (tercera * 10);
            cuarta = n;

            if (primera == cuarta && segunda == tercera)
                System.out.println("Capicua");
            else
                System.out.println("No capicua");
            break;
        case 5:
            primera = n / 10000;
            n = n - (primera * 10000);
            segunda = n / 1000;
            n = n - (segunda * 1000);
            tercera = n / 100;
            n = n - (tercera * 100);
            cuarta = n / 10;
            n = n - (cuarta * 10);
            quinta = n;

            if (primera == quinta && segunda == cuarta)
                System.out.println("Capicua");
            else
                System.out.println("No capicua");
            break;
        }

        sc.close();
	}

}
