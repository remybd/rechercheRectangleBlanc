package exceptions;

public class FileReaderException extends Exception {

	public FileReaderException(String errMsg) {
		super(errMsg);
	}
	
	public FileReaderException(Exception e) {
		super(e);
	}
	
	public FileReaderException(String errMsg, Exception e) {
		super(errMsg, e);
	}
	
	public static class UnexpectedFileExtensionException extends FileReaderException {
		public UnexpectedFileExtensionException() {
			super("The input File has an unexpected File Extension");
		}
	}
	
	public static class InvalidPathToFileException extends FileReaderException {
		public InvalidPathToFileException(Exception e) {
			super("The path to the input File is not valid", e);
		}
	}
}
