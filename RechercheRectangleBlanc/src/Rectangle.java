
public class Rectangle {

	private int numLigne = 0;
	private int numColonne = 0;
	private int hauteur = 0;
	private int largeur = 0;
	private int aire = 0;
	
	public Rectangle(int x, int y, int h, int l){
		this.numLigne = x;
		this.numColonne = y;
		this.hauteur = h;
		this.largeur = l;
		this.aire = h*l;
	}
	
	
	
	public boolean fullWhite(boolean dallage[][]){
		
		int i = this.numLigne;
		int j ;
		boolean fullWhite = true;
		int limiteHauteur = this.numLigne + this.hauteur;
		int limiteLargeur = this.numColonne + this.largeur;
		
		while ( fullWhite && i < limiteHauteur){
			j = this.numColonne;
			
			while ( fullWhite && j < limiteLargeur ){
				fullWhite = dallage[i][j];
				j++;
			}
			i++;
		}
		
		return fullWhite;
	}



	public int getNumLigne() {
		return numLigne;
	}



	public int getNumColonne() {
		return numColonne;
	}



	public int getHauteur() {
		return hauteur;
	}



	public int getLargeur() {
		return largeur;
	}



	public int getAire() {
		return aire;
	}
	
	public String toString() {
		return "x = " + this.getNumLigne() + " et y = " + this.getNumColonne() + "\n"
				+ "hauteur = " + this.getHauteur() + " et largeur = " + this.getLargeur() + "\n"
				+ "aire = " + this.getAire();
	}
	
}
