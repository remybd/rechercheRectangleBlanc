package exceptions;

public class BadFileExtensionException extends Exception {

	public BadFileExtensionException(){
		System.out.println("Erreur dans le nom de fichier : il doit posséder une extension .txt");
	}
}
