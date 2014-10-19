package slack;

public class Cell {

	private Object content;
	private Cell nextCell;
	
	public Cell(Object content, Cell nextCell) {
		this.content = content;
		this.nextCell = nextCell;
	}
	
	public Object getContent() {
		return this.content;
	}
	
	public Cell getNextCell() {
		return this.nextCell;
	}
}
