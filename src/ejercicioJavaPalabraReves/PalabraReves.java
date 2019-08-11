package ejercicioJavaPalabraReves;

import java.util.Arrays;
/**
 *
 * @Elba
 */

public class PalabraReves {
	public static char[] letraReves(String palab1){
		int letras = palab1.length();
		char [] let1 = new char [letras];   
		for (int i=letras-1; i>-1; i--){
			let1[letras-1-i]=palab1.charAt(i);

		}
		return let1;
	}	    

	public static void main(String[] args) {        
		//Escribe la palabra al reves.
		String palabra1="Elba";
		char [] reves=letraReves(palabra1);
		System.out.println("La palabra al reves es: "+Arrays.toString(reves).toUpperCase());	        
	}
}