
public class Rectangle {

	private int numLigne = 0;
	private int numColonne = 0;
	private int hauteur = 0;
	private int largeur = 0;
	
	public Rectangle(int x, int y, int h, int l){
		this.numLigne = x;
		this.numColonne = y;
		this.hauteur = h;
		this.largeur = l;
	}
	
	
	
	public boolean fullWhite(boolean dallage[][]){
		
		int i = this.numLigne;
		int j ;
		boolean fullWhite = false;
		
		while ( fullWhite && i < this.hauteur){
			j = this.numColonne;
			
			while ( fullWhite && j < this.largeur ){
				fullWhite = dallage[i][j];
				j++;
			}
			i++;
		}
		
		return fullWhite;
	}
}
