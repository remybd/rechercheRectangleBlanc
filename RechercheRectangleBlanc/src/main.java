import java.io.IOException;

import exceptions.ErrorInFileException;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Dallage d1 = new Dallage("fichiersTest/blancCentre.txt");
			
			////System.out.println(d1.toString());
			////System.out.println();
			////System.out.println(solution3(d1));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ErrorInFileException exc) {}
	}
	
	public static Rectangle solution4 (Dallage dallage){
		
		Rectangle rMax = new Rectangle(0, 0, 0, 0);
		int hauteurs[] = new int[dallage.getNbColonnes()];
		int hauteurMin;
		int largeur;
		Pile pile = new Pile();
		
		//initialisation du tableau des hauteurs
		for(int j = 0; j < dallage.getNbColonnes(); j++){
			hauteurs[j] = 0;
			dallage.setNbreAccesTab(dallage.getNbreAccesTab()+ 1);
		}
		
		//pour chaque ligne du dallage
		for (int i = 0; i < dallage.getNbLignes(); i++){
			
			int hauteurPrecedente = 0;
			
			//pour chaque colonne
			for(int j = 0; j < dallage.getNbColonnes(); j++){
				
				//traitement du tableau des hauteurs
				if(dallage.getValue(i, j)){
					hauteurs[j] ++;
					dallage.setNbreAccesTab(dallage.getNbreAccesTab()+ 1);
				}
				else{
					hauteurs[j] = 0;
					dallage.setNbreAccesTab(dallage.getNbreAccesTab()+ 1);
				}
				
				int h = hauteurs[j];
				dallage.setNbreAccesTab(dallage.getNbreAccesTab()+ 1);
				//traitement des rectangles ouverts
				if(hauteurPrecedente < h) {
					pile.push(new RectangleOuvert(j, h));
					dallage.setNbreAccesTab(dallage.getNbreAccesTab()+ 1);
				}
				else if(hauteurPrecedente > h) {
					////System.out.println("boucle");

					RectangleOuvert lastRect = null;
					RectangleOuvert lastRectSoBig = null;
					if(!pile.estVide()){
						lastRect = (RectangleOuvert) pile.pop();
						dallage.setNbreAccesTab(dallage.getNbreAccesTab()+ 1);
						
						boolean emptyList = false;
					
						//fermeture de tous les rectangles ouvert avec une hauteur trop grande
						while( !emptyList && lastRect.getHauteur() > h) {
							int largeurRectangle = j-lastRect.getColonneDebut();
							////System.out.println("Hauteur du dernier rectangle : " + lastRect.getHauteur());
							////System.out.println("Largeur du dernier rectangle : " + largeurRectangle);
							
							//test si le rectangle fermé est le plus grand
							if(rMax.getAire() < (lastRect.getHauteur()*largeurRectangle)){
							//	//System.out.println("ajout rectangle ouvert");
								rMax = new Rectangle (i-lastRect.getHauteur()+1,lastRect.getColonneDebut(),lastRect.getHauteur(),largeurRectangle);
							}
							lastRectSoBig = lastRect;
														
							if(!pile.estVide()){
								lastRect = (RectangleOuvert) pile.pop();
								dallage.setNbreAccesTab(dallage.getNbreAccesTab()+ 1);
							}
							else emptyList = true;
						}
						if(!emptyList){
							pile.push(lastRect);
							dallage.setNbreAccesTab(dallage.getNbreAccesTab()+ 1);
							if(h > 0 && lastRect.getHauteur() < h){
								pile.push(new RectangleOuvert(lastRectSoBig.getColonneDebut(), h));
								dallage.setNbreAccesTab(dallage.getNbreAccesTab()+ 1);
							}
						}
						else if(h > 0){
							pile.push(new RectangleOuvert(lastRectSoBig.getColonneDebut(), h));
							dallage.setNbreAccesTab(dallage.getNbreAccesTab()+ 1);
						}
						
					}
				}
				hauteurPrecedente = h;
			}

			
			while(!pile.estVide()) {
				RectangleOuvert lastRect = (RectangleOuvert) pile.pop();
				dallage.setNbreAccesTab(dallage.getNbreAccesTab()+ 1);
				int largeurRectangle = dallage.getNbColonnes()-lastRect.getColonneDebut();
				
				////System.out.println("test" + lastRect.getHauteur() + "    " + largeurRectangle);
				
				//test si le rectangle fermé est le plus grand
				if(rMax.getAire() < (lastRect.getHauteur()*largeurRectangle)){
					////System.out.println("ajout rectangle ouvert");
					rMax = new Rectangle (i-lastRect.getHauteur()+1,lastRect.getColonneDebut(),lastRect.getHauteur(),largeurRectangle);
				}
			}
			
		}	
		/*//System.out.println("x = " + rMax.getNumLigne() + " et y = " + rMax.getNumColonne() + "\n"
		+ "hauteur = " + rMax.getHauteur() + " et largeur = " + rMax.getLargeur() + "\n"
		+ "aire = " + rMax.getAire());*/
	return rMax;
	}
	
	public static Rectangle solution3 (Dallage dallage){
		
		Rectangle rMax = new Rectangle(0, 0, 0, 0);
		int hauteurs[] = new int[dallage.getNbColonnes()];
		int hauteurMin;
		int largeur;
		
		//initialisation du tableau des hauteurs
		for(int j = 0; j < dallage.getNbColonnes(); j++){
			hauteurs[j] = 0;
			dallage.setNbreAccesTab(dallage.getNbreAccesTab()+ 1);
		}
		
		//pour chaques cases du dallage
		for (int i = 0; i < dallage.getNbLignes(); i++){
			
			for(int j = 0; j < dallage.getNbColonnes(); j++){
				if(dallage.getValue(i, j)){
					hauteurs[j] ++;
					dallage.setNbreAccesTab(dallage.getNbreAccesTab()+ 1);
				}
				else{
					hauteurs[j] = 0;
					dallage.setNbreAccesTab(dallage.getNbreAccesTab()+ 1);
				}
			}	
				
			hauteurMin = dallage.getNbLignes();
			for (int k = 0; k < dallage.getNbColonnes(); k++){
				for (int l = k; l < dallage.getNbColonnes(); l++){
					
					dallage.setNbreAccesTab(dallage.getNbreAccesTab()+ 1);
					if(hauteurs[l] < hauteurMin )
						hauteurMin = hauteurs[l];
					
					largeur = l-k +1;
					if(rMax.getAire() < (hauteurMin*largeur))
						rMax = new Rectangle (i-hauteurMin+1,k,hauteurMin,largeur);
				}
				hauteurMin = dallage.getNbLignes();
			}
		}	
			
		/*//System.out.println("x = " + rMax.getNumLigne() + " et y = " + rMax.getNumColonne() + "\n"
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
		
		
		//pour chaques cases du dallage
		for (int i = 0; i < dallage.getNbLignes(); i++)
			for(int j = 0; j < dallage.getNbColonnes(); j++){
				
				
				y = j;
				x = i;
				hauteur = 1;
				limiteColonne = dallage.getNbColonnes();
				//parcours de la première colonne gauche du rectangle
				while ( x < dallage.getNbLignes() && dallage.getValue(x, y)){
					
					while (y < limiteColonne && dallage.getValue(x, y))
						y++;
					
					if(limiteColonne > y){//j'ai rencontré une case noire
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
				
		/*//System.out.println("x = " + rMax.getNumLigne() + " et y = " + rMax.getNumColonne() + "\n"
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
						
							r = new Rectangle(i,j,h,l);
							
							if(r.fullWhite(dallage)&& rMax.getAire() < h*l)
								rMax = r;
					}
				}
			}
				
		/*//System.out.println("x = " + rMax.getNumLigne() + " et y = " + rMax.getNumColonne() + "\n"
				+ "hauteur = " + rMax.getHauteur() + " et largeur = " + rMax.getLargeur() + "\n"
				+ "aire = " + rMax.getAire());*/
		return rMax;
	}
	

}
