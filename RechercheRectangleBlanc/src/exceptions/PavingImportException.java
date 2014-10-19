package exceptions;

public class PavingImportException extends Exception {
	
	public PavingImportException(String errMsg) {
		super(errMsg);
	}
	
	public PavingImportException(Exception e) {
		super(e);
	}
	
	public PavingImportException(String errMsg, Exception e) {
		super(errMsg, e);
	}
	
	public static class OpeningSourceFileException extends PavingImportException {
		public OpeningSourceFileException(Exception e) {
			super("An error has occured while opening the source file for import", e);
		}
	}
	
	public static class ReadingHeaderSourceFileException extends PavingImportException {
		public ReadingHeaderSourceFileException(Exception e) {
			super("An error has occured while reading the header in the source file for import", e);
		}
	}

	public static class HeaderFormatException extends PavingImportException {
		public HeaderFormatException() {
			super("A format error has occured while reading the header in the source file for import");
		}
		
		public HeaderFormatException(Exception e) {
			super("A format error has occured while reading the header in the source file for import", e);
		}
	}
	
	public static class ReadingContentSourceFileException extends PavingImportException {
		public ReadingContentSourceFileException(Exception e) {
			super("An error has occured while reading the content in the source file for import", e);
		}
	}
	
	public static class ContentFormatException extends PavingImportException {
		public ContentFormatException() {
			super("The content doesn't correspond with the header format");
		}
	}
}
