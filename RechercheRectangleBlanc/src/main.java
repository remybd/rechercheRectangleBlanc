import java.io.IOException;

import exceptions.ErrorInFileException;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Dallage d1 = new Dallage("fichiersTest/blancCentre.txt");
			
			System.out.println(d1.toString());
			System.out.println();
			System.out.println(solution3(d1));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ErrorInFileException exc) {}
	}
	
	public static Rectangle solution4 (Dallage dallage){
		
		Rectangle rMax = new Rectangle(0, 0, 0, 0);
		boolean tableauDallage[][] = dallage.getDallage();
		int hauteurs[] = new int[dallage.getNbColonnes()];
		int hauteurMin;
		int largeur;
		Pile pile = new Pile(100000);
		
		//pour chaques cases du dallage
		for (int i = 0; i < dallage.getNbLignes(); i++){
			
			for(int j = 0; j < dallage.getNbColonnes(); j++){
				int k=0;
				while(k<dallage.getNbLignes() && tableauDallage[k][j]) {
					k++;
				}
				hauteurs[j] = k;
			}

			int hauteurPrecedente = -1;
			
			for(int l=0; l < dallage.getNbColonnes(); l++) {
				if(hauteurPrecedente < hauteurs[l]) {
					pile.push(new RectangleOuvert(l, hauteurs[l]));
				}
				else if(hauteurPrecedente > hauteurs[l]) {
					System.out.println("boucle");

					RectangleOuvert lastRect = (RectangleOuvert) pile.pop();
					while(lastRect.getHauteur() > hauteurs[l]) {
						int largeurRectangle = l-lastRect.getColonneDebut()-1;
						System.out.println("Hauteur du dernier rectangle : " + lastRect.getHauteur());
						System.out.println("Largeur du dernier rectangle : " + largeurRectangle);
						if(rMax.getAire() < (hauteurs[l]*largeurRectangle))
							System.out.println("ajout rectangle ouvert");
							rMax = new Rectangle (i,lastRect.getColonneDebut(),hauteurs[l],largeurRectangle);
						lastRect = (RectangleOuvert) pile.pop();
					}
				}
				hauteurPrecedente = hauteurs[l];
			}
			
			while(!pile.estVide()) {
				RectangleOuvert lastRect = (RectangleOuvert) pile.pop();
				int largeurRectangle = dallage.getNbColonnes()-lastRect.getColonneDebut();
				if(rMax.getAire() < (lastRect.getHauteur()*largeurRectangle))
					System.out.println("ajout rectangle ouvert");
					rMax = new Rectangle (i,lastRect.getColonneDebut(),lastRect.getHauteur(),largeurRectangle);
			}
			
		}	
		/*System.out.println("x = " + rMax.getNumLigne() + " et y = " + rMax.getNumColonne() + "\n"
		+ "hauteur = " + rMax.getHauteur() + " et largeur = " + rMax.getLargeur() + "\n"
		+ "aire = " + rMax.getAire());*/
	return rMax;
	}
	
	public static Rectangle solution3 (Dallage dallage){
		
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
				
			hauteurMin = dallage.getNbLignes();
			for (int k = 0; k < dallage.getNbColonnes(); k++){
				for (int l = k; l < dallage.getNbColonnes(); l++){
					
					if(hauteurs[l] < hauteurMin )
						hauteurMin = hauteurs[l];
					
					largeur = l-k +1;
					if(rMax.getAire() < (hauteurMin*largeur))
						rMax = new Rectangle (i-hauteurMin+1,k,hauteurMin,largeur);
				}
				hauteurMin = dallage.getNbLignes();
			}
		}	
			
		/*System.out.println("x = " + rMax.getNumLigne() + " et y = " + rMax.getNumColonne() + "\n"
				+ "hauteur = " + rMax.getHauteur() + " et largeur = " + rMax.getLargeur() + "\n"
				+ "aire = " + rMax.getAire());*/
		return rMax;
	}

	
	
	
	
public static Rectangle solution2 (Dallage dallage){
		
		Rectangle rMax = new Rectangle(0, 0, 0, 0);
		int largeur;
		int hauteur;
		int y ;
		int x;
		int limiteColonne;
		boolean [][] tableau = dallage.getDallage();
		
		//pour chaques cases du dallage
		for (int i = 0; i < dallage.getNbLignes(); i++)
			for(int j = 0; j < dallage.getNbColonnes(); j++){
				
				
				y = j;
				x = i;
				hauteur = 1;
				limiteColonne = dallage.getNbColonnes();
				//parcours de la premi�re colonne gauche du rectangle
				while ( x < dallage.getNbLignes() && tableau[x][y]){
					
					while (y < limiteColonne && tableau[x][y])
						y++;
					
					if(limiteColonne > y){//j'ai rencontr� une case noire
						limiteColonne = y;
					}
					largeur = y-j ;
					
					if(rMax.getAire() < (hauteur*largeur))
							rMax = new Rectangle (i,j,hauteur,largeur);
					
					hauteur ++;
					y = j;
					x++;
				}
				
			}
				
		/*System.out.println("x = " + rMax.getNumLigne() + " et y = " + rMax.getNumColonne() + "\n"
				+ "hauteur = " + rMax.getHauteur() + " et largeur = " + rMax.getLargeur() + "\n"
				+ "aire = " + rMax.getAire());*/
		return rMax;
	}
	
	
	
	
	public static Rectangle solution1 (Dallage dallage){
		
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
				
		/*System.out.println("x = " + rMax.getNumLigne() + " et y = " + rMax.getNumColonne() + "\n"
				+ "hauteur = " + rMax.getHauteur() + " et largeur = " + rMax.getLargeur() + "\n"
				+ "aire = " + rMax.getAire());*/
		return rMax;
	}
	

}
