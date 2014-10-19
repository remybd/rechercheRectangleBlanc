package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import exceptions.FileReaderException;

public class PavingImportService {
	
	
	public static BufferedReader getFileBufferedReaderService(String pathToFile) throws FileReaderException {
    	if(!pathToFile.endsWith(".txt")){
			throw new FileReaderException.UnexpectedFileExtensionException();
    	}
    	    	
    	try {
			return new BufferedReader(new FileReader(pathToFile));
		} catch (FileNotFoundException e) {
			throw new FileReaderException.InvalidPathToFileException(e);
		}
	}
}
