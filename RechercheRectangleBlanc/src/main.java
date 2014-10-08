import java.io.IOException;

import exceptions.ErrorInFileException;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Dallage d1 = new Dallage("fichiersTest/fullNoir.txt");
			
			System.out.println(d1.toString());
			System.out.println();
			System.out.println(solution3(d1));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ErrorInFileException exc) {}
	}
	
	
	
	
	public static String solution3 (Dallage dallage){
		
		Rectangle rMax = new Rectangle(0, 0, 0, 0);
		boolean tableauDallage[][] = dallage.getDallage();
		int hauteurs[] = new int[dallage.getNbColonnes()];
		int hauteurMin;
		int largeur;
		
		//initialisation du tableau des hauteurs
		for(int j = 0; j < dallage.getNbColonnes(); j++){
			hauteurs[j] = 0;
		}
		
		//pour chaques cases du dallage
		for (int i = 0; i < dallage.getNbLignes(); i++){
			
			for(int j = 0; j < dallage.getNbColonnes(); j++){
				if(tableauDallage[i][j])
					hauteurs[j] ++;
				else
					hauteurs[j] = 0;
			}	
				
			hauteurMin = hauteurs[0];
			for (int k = 0; k < dallage.getNbColonnes(); k++){
				for (int l = k; l < dallage.getNbColonnes(); l++){
					
					if(hauteurs[l] < hauteurMin )
						hauteurMin = hauteurs[l];
					
					largeur = l-k +1;
					if(rMax.getAire() < (hauteurMin*largeur))
						rMax = new Rectangle (i-hauteurMin+1,k,hauteurMin,largeur);
				}
				hauteurMin = hauteurs[0];
			}
		}	
			
		return "x = " + rMax.getNumLigne() + " et y = " + rMax.getNumColonne() + "\n"
				+ "hauteur = " + rMax.getHauteur() + " et largeur = " + rMax.getLargeur() + "\n"
				+ "aire = " + rMax.getAire();
	}

	
	
	
	
	public static String solution2 (Dallage dallage){
		
		Rectangle rMax = new Rectangle(0, 0, 0, 0);
		int largeur;
		int hauteur;
		int y ;
		int limiteColonne;
		boolean [][] tableau = dallage.getDallage();
		
		//pour chaques cases du dallage
		for (int i = 0; i < dallage.getNbLignes(); i++)
			for(int j = 0; j < dallage.getNbColonnes(); j++){
				
				
				y = j;
				hauteur = 1;
				limiteColonne = dallage.getNbColonnes();
				//parcours de toutes les cases gauches du rectangle
				for (int x = i; x < dallage.getNbLignes(); x++){
					while (y < limiteColonne && tableau[x][y])
						y++;
					
					if(limiteColonne > y){//j'ai rencontré une case noire
						limiteColonne = y;
					}
					largeur = y-j ;
					
					if(rMax.getAire() < (hauteur*largeur))
							rMax = new Rectangle (i,j,hauteur,largeur);
					
					hauteur ++;
					y = j;
				}

			}
				
		return "x = " + rMax.getNumLigne() + " et y = " + rMax.getNumColonne() + "\n"
				+ "hauteur = " + rMax.getHauteur() + " et largeur = " + rMax.getLargeur() + "\n"
				+ "aire = " + rMax.getAire();
	}
	
	
	
	
	public static String solution1 (Dallage dallage){
		
		Rectangle rMax = new Rectangle(0, 0, 0, 0);
		
		//pour chaques cases du dallage
		for (int i = 0; i < dallage.getNbLignes(); i++)
			for(int j = 0; j < dallage.getNbColonnes(); j++){
				
				//creation de tous les rectangles possibles
				int hMax = dallage.getNbLignes() - i;
				int lMax = dallage.getNbColonnes() - j;
				for(int h = 1; h <= hMax; h++ ){
					for (int l = 1; l <= lMax; l++){
						Rectangle r = new Rectangle(i,j,h,l);
						
						if(r.fullWhite(dallage.getDallage()) && rMax.getAire() < r.getAire())
							rMax = r;
					}
				}
			}
				
		return "x = " + rMax.getNumLigne() + " et y = " + rMax.getNumColonne() + "\n"
				+ "hauteur = " + rMax.getHauteur() + " et largeur = " + rMax.getLargeur() + "\n"
				+ "aire = " + rMax.getAire();
	}
	

}
