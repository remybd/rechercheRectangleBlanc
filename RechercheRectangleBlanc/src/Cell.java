
public class Cell {

	private Object contenu;
	private Cell nextCell;
	
	public Cell(Object contenu, Cell suivant) {
		this.contenu = contenu;
		this.nextCell = suivant;
	}
	
	public Object getContenu() {
		return this.contenu;
	}
	
	public Cell getNextCell() {
		return this.nextCell;
	}
}
