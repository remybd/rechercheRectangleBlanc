package exceptions;

public class HeaderFormatException extends Exception {

	public HeaderFormatException(){
		System.out.println("Erreur dans la premi�re ligne du fichier");
	}
}
