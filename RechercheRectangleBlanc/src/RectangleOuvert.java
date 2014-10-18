
public class RectangleOuvert {

	int colonneDebut;
	int hauteur;
	
	public RectangleOuvert(int colonneDebut, int hauteur) {
		this.colonneDebut = colonneDebut;
		this.hauteur = hauteur;
	}
	
	public int getColonneDebut() {
		return this.colonneDebut;
	}
	
	public int getHauteur() {
		return this.hauteur;
	}
	
	public String toString() {
		return "Colonne debut = "+this.colonneDebut+" - hauteur = "+this.hauteur;
	}
}
