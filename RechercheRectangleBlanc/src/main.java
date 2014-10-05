import java.io.IOException;

import exceptions.ErrorInFileException;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Dallage d1 = new Dallage("exemple1.txt");
			
			System.out.println(d1.toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ErrorInFileException exc) {}
	}
	
	
	
	
	public String solution1 (Dallage dallage){
		
		for (int i = 0; i < dallage.getNbLignes(); i++)
			for(int j = 0; j < dallage.getNbColonnes(); j++){
				
			}
		
		
		
		return "x et y / hauteur et largeur / aire";
	}

}
