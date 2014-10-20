package paving;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.IOUtils;

import service.FileReaderService;
import exceptions.FileReaderException;
import exceptions.PavingImportException;
import exceptions.PavingImportException.ContentFormatException;

public class Paving {

	private boolean paving[][];
	private int nbRow;
	private int nbColumn;
	
	public static Paving newRandomPaving(int nbRow, int nbColumn, int percentage) {
		return new Paving(nbRow, nbColumn, percentage);
	}
	
	public static Paving loadPavingFromFile(String filePath) throws PavingImportException {
		return new Paving(filePath);
	}
	
	public boolean[][] getPaving() {
		return this.paving;
	}
	
	public int getNbRow() {
		return this.nbRow;
	}
	
	public int getNbColumn() {
		return this.nbColumn;
	}
	
	public String toString(){
		StringBuffer result = new StringBuffer("");
		
		for (int i = 0; i < this.nbRow; i++){
			result.append("|");
			for (int j = 0; j < this.nbColumn; j++){
				if(paving[i][j])
					result.append("0");
				else result.append("1");
				
				result.append("|");
			}
			result.append("\n");
		}
		
		return result.toString();
	}

	private Paving(int nbRow, int nbColumn, int percentage) {
		this.nbColumn = nbColumn;
		this.nbRow = nbRow;
		this.paving = new boolean[this.nbRow][this.nbColumn];
		
		assignRandomPaving(percentage);		
	}

	private void assignRandomPaving(int percentage) {
		Random randomGenerator = new Random();
		int randomValue;
		
		for (int i = 0; i < this.nbRow; i++){
			for (int j = 0; j < this.nbColumn; j++){
				randomValue = randomGenerator.nextInt(100);		
				assignCellBoolValue(percentage, randomValue, i, j);
			}
		}
	}

	private void assignCellBoolValue(int percentage, int randomValue, int i, int j) {
		if(randomValue < percentage)
			this.paving[i][j] = true;
		else 
			this.paving[i][j] = false;
	}
	
	
	private void extractHeaderInformationDuringImport(BufferedReader buffer) throws PavingImportException {
		String firstBufferLine;
		try {
			firstBufferLine = buffer.readLine();
		} catch (IOException e) {
			throw new PavingImportException.ReadingHeaderSourceFileException(e);
		}
		
		String[] pavingDimensions;
		if(firstBufferLine != null) {
			pavingDimensions = firstBufferLine.split("\\s");
		}
		else
		{
			throw new PavingImportException.EmptySourceFileException();
		}
		
    	if(pavingDimensions.length == 2){
    		extractPavingDimensionsFromHeader(pavingDimensions);
    	}
    	else
    		throw new PavingImportException.HeaderFormatException();
	}

	private void extractPavingDimensionsFromHeader(String[] pavingDimensions)
			throws  PavingImportException {
		try {
			 this.nbRow = Integer.parseInt(pavingDimensions[0]);
			 this.nbColumn = Integer.parseInt(pavingDimensions[1]);
		}
		catch(NumberFormatException e){
    		throw new PavingImportException.InvalidCharacterException(e);
		}
	}
	
	private void extractContentDuringImport(BufferedReader buffer) throws PavingImportException {
		paving = new boolean[this.nbRow][this.nbColumn]; 
		int i = 0;
		String line;
		
		try {
			line = buffer.readLine();
		} catch (IOException e) {
			throw new PavingImportException.ReadingContentSourceFileException(e);
		}
		
		while (!endOfFile(line, i)){
			if(line.length() != this.nbColumn)
				throw new PavingImportException.ContentFormatException();
			
			for (int j = 0; j < this.nbColumn; j++){
				ReadAndAssignBoolValues(line, i, j);	
			}
			
			try {
				line = buffer.readLine();
			} catch (IOException e) {
				throw new PavingImportException.ReadingContentSourceFileException(e);
			}
			i++;
		} ;
	}
	
	private boolean endOfFile(String line, int i) throws ContentFormatException {
		if(line == null && i < this.nbRow)
			throw new PavingImportException.ContentFormatException();

		return (line == null || i >= this.nbRow);
	}
	
	private void ReadAndAssignBoolValues(String line, int i, int j) throws  PavingImportException{
		if(line.charAt(j) != '0' && line.charAt(j)!= '1')
			throw new PavingImportException.InvalidCharacterException();
		
		if(line.charAt(j) == '1')
			paving[i][j] = false;
		else
			paving[i][j] = true;
	}
	
	private Paving(String pathToFile) throws PavingImportException {
		BufferedReader buffer = null;
		
		try {
			buffer = FileReaderService.getFileBufferedReader(pathToFile);
			
			extractHeaderInformationDuringImport(buffer);
			
			extractContentDuringImport(buffer);
		} catch (FileReaderException e) {
			throw new PavingImportException.OpeningSourceFileException(e);
		}
		finally {
			 IOUtils.closeQuietly(buffer);
		}
	}
}
