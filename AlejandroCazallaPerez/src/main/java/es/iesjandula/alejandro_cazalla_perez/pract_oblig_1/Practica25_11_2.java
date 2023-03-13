package es.iesjandula.alejandro_cazalla_perez.pract_oblig_1;

public class Practica25_11_2 {

	private static String code1 = ":@A=", code2 = ">;?", code3 = "BC:@";
	
	public static void main(String[] args) 
	{
		System.out.println();
	}
	
	public static void crackingCode(String decryptedCode) 
	{
		for(int i=0; i<code1.length(); i++) 
		{
			char charDecrypted = (char)(code1.charAt(i)-10);
			System.out.print(charDecrypted);
		}
	}

}
