package test;

import org.junit.Test;

import paving.Paving;
import service.FileReaderService;
import exceptions.FileReaderException;
import exceptions.FileReaderException.InvalidPathToFileException;
import exceptions.FileReaderException.UnexpectedFileExtensionException;
import exceptions.PavingImportException;
import exceptions.PavingImportException.ContentFormatException;
import exceptions.PavingImportException.EmptySourceFileException;
import exceptions.PavingImportException.InvalidCharacterException;

public class SourceFileReadingTest {

	@Test(expected=UnexpectedFileExtensionException.class)
	public void givenBadSourceFileExtensionThenUnexpectedFileExtensionExceptionThrown() throws FileReaderException {
		FileReaderService.getFileBufferedReader("testFiles/badExtension.ext");
	}
	
	@Test(expected=InvalidPathToFileException.class)
	public void givenUnexistingSourceFileThenInvalidPathToFileExceptionThrown() throws FileReaderException {
		FileReaderService.getFileBufferedReader("testFiles/unexistingfile.txt");
	}
	
	@Test(expected=EmptySourceFileException.class)
	public void givenEmptySourceFileThenEmptySourceFileExceptionThrown() throws PavingImportException {
		Paving.loadPavingFromFile("testFiles/emptyFile.txt");
	}
	
	@Test(expected=ContentFormatException.class)
	public void givenSourceFileWithMissingLinesThenContentFormatExceptionThrown() throws PavingImportException {
		Paving.loadPavingFromFile("testFiles/lineMissing.txt");
	}
	
	@Test(expected=ContentFormatException.class)
	public void givenSourceFileWithMissingColumnsThenContentFormatExceptionThrown() throws PavingImportException {
		Paving.loadPavingFromFile("testFiles/columnsMissing.txt");
	}
	
	@Test(expected=InvalidCharacterException.class)
	public void givenSourceFileWithInvalidCharacterInHeaderThenInvalidCharacterExceptionThrown() throws PavingImportException {
		Paving.loadPavingFromFile("testFiles/invalidCharHeader.txt");
	}
	
	@Test(expected=InvalidCharacterException.class)
	public void givenSourceFileWithInvalidCharacterInContentThenInvalidCharacterExceptionThrown() throws PavingImportException {
		Paving.loadPavingFromFile("testFiles/invalidCharContent.txt");
	}

}
