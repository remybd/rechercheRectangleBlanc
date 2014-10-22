import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import exceptions.*;



public class Dallage {

	private boolean dallage[][];
	private int nbLignes;
	private int nbColonnes;
	
	private int nbreAcces = 0;
	private int nbreAccesTab = 0;
	
	public Dallage(int lignes, int colonnes, int pourcentage) {
		Random randomGenerator = new Random();
		
		this.nbColonnes = colonnes;
		this.nbLignes = lignes;
		dallage = new boolean[this.nbLignes][this.nbColonnes];
		
		int rand = 0;
		
		for (int i = 0; i < this.nbLignes; i++){
			for (int j = 0; j < this.nbColonnes; j++){
				rand = randomGenerator.nextInt(100);
				
				if(rand < pourcentage)
					this.dallage[i][j] = true;
				else this.dallage[i][j] = false;
			}
		}		
	}
	
	
	
	public Dallage(String pathFile) throws IOException, ErrorInFileException{
		
		BufferedReader lecteurAvecBuffer = null;
	    String line;
	    
	    try {
	    	//verification de l'extension.txt
	    	if( !pathFile.endsWith(".txt")){
				throw new BadFileExtensionException();
	    	}
	    	
	    	//ouverture et lecture du fichier
	    	lecteurAvecBuffer = new BufferedReader(new FileReader(pathFile));
	    	
	    	line = lecteurAvecBuffer.readLine();
		    
		    if(line != null){
		    	String[] header = line.split("\\s+");
		    	
		    	if(header.length == 2){
		    		try{
			    		 this.nbLignes = Integer.parseInt(header[0]);
			    		 this.nbColonnes = Integer.parseInt(header[1]);
		    		}
		    		catch(NumberFormatException exc){
		    			throw new HeaderFormatException();
		    	    }
		    		
		    		 dallage = new boolean[this.nbLignes][this.nbColonnes];
		    		 
		    		 //récupération du dallage
		    		 int i = 0;
		    		 line = lecteurAvecBuffer.readLine();
		    		 while ( line != null && i < this.nbLignes){
		    			 
		    			 for (int j = 0; j < this.nbColonnes; j++){
		    				 
		    				 if(line.charAt(j) == '1')
		    					 dallage[i][j] = false;
		    				 else dallage[i][j] = true;
		    			 }
		    			 
		    			 line = lecteurAvecBuffer.readLine();
		    			 i++;
		    		 }		    		 
		    		 
		    	} else throw new HeaderFormatException();
		    	
		    } else throw new EmptyFileException();
			   
		    lecteurAvecBuffer.close();
	    	
		//récupération de toutes les exceptions   
		} catch (BadFileExtensionException exc) { throw new ErrorInFileException();	}
	    catch (EmptyFileException exc) { throw new ErrorInFileException();	}
	    catch (HeaderFormatException exc) {	throw new ErrorInFileException(); }
	    catch(FileNotFoundException exc){
	    	System.out.println("Erreur d'ouverture du fichier");
	    	throw new ErrorInFileException();
	    }
	    catch(NumberFormatException exc){
	    	System.out.println("Erreur dans le dallage contenu par le fichier");
	    	throw new ErrorInFileException();
	    }
	    
	}
	
	
	
	public String toString(){
		
		StringBuffer result = new StringBuffer("");
		
		for (int i = 0; i < this.nbLignes; i++){
			result.append("|");
			for (int j = 0; j < this.nbColonnes; j++){
				if(dallage[i][j])
					result.append("0");
				else result.append("1");
				
				result.append("|");
			}
			result.append("\n");
		}
		
		return result.toString();
	}



	public boolean[][] getDallage() {
		return dallage;
	}



	public int getNbLignes() {
		return nbLignes;
	}



	public int getNbColonnes() {
		return nbColonnes;
	}
	
	public boolean getValue(int i, int j){
		this.nbreAcces ++;
		return this.dallage[i][j];
	}



	public int getNbreAcces() {
		return nbreAcces;
	}



	public void setNbreAcces(int nbreAcces) {
		this.nbreAcces = nbreAcces;
	}



	public int getNbreAccesTab() {
		return nbreAccesTab;
	}



	public void setNbreAccesTab(int nbreAccesTab) {
		this.nbreAccesTab = nbreAccesTab;
	}
	
	
	
}
