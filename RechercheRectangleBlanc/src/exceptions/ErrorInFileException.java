package exceptions;

public class ErrorInFileException extends Exception {

	public ErrorInFileException(){
		System.out.println("La lecture du fichier a rencontrée un problème ");
	}
}
