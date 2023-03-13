package es.iesjandula.alejandro_cazalla_perez.pract_oblig_1;

public class Practica25_11 {
	
	private static String code1 = ":@A=", code2 = ">;?", code3 = "BC:@";
	
	public static void main(String[] args) 
	{
		System.out.println();
	}
	
	public static void decrypter(String code) 
	{
		for(int i=0; i<code.length(); i++) 
		{
			char charDecrypted = (char)(code.charAt(i)-10);
			System.out.print(charDecrypted);
		}
	}

}
