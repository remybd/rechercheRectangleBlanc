import java.io.IOException;

import exceptions.ErrorInFileException;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Dallage d1 = new Dallage("fichiersTest/doubleDiagonale.txt");
			
			System.out.println(d1.toString());
			System.out.println();
			System.out.println(solution1(d1));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ErrorInFileException exc) {}
	}
	
	
	
	
	public static String solution1 (Dallage dallage){
		
		Rectangle rMax = new Rectangle(0, 0, 0, 0);
		Rectangle r;
		
		//pour chaques cases du dallage
		for (int i = 0; i < dallage.getNbLignes(); i++)
			for(int j = 0; j < dallage.getNbColonnes(); j++){
				
				//creation de tous les rectangles possibles
				int hMax = dallage.getNbLignes() - i;
				int lMax = dallage.getNbColonnes() - j;
				for(int h = 1; h <= hMax; h++ ){
					for (int l = 1; l <= lMax; l++){
						
						if(rMax.getAire() < h*l){
							r = new Rectangle(i,j,h,l);
							
							if(r.fullWhite(dallage.getDallage()))
								rMax = r;
						}
					}
				}
			}
				
		return "x = " + rMax.getNumLigne() + " et y = " + rMax.getNumColonne() + "\n"
				+ "hauteur = " + rMax.getHauteur() + " et largeur = " + rMax.getLargeur() + "\n"
				+ "aire = " + rMax.getAire();
	}

}
