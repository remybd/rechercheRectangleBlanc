public class Pile {
	
	private Cell top;
	
	public Pile() {
		this.top = null;
	}
	
	public boolean estVide() {
		return this.top == null;
	}
	
	public void push(Object value) {
		this.top = new Cell(value, this.top);
	}
	
	public Object pop() {
		if(this.estVide())
			throw new RuntimeException("Récupération du dernière élément sur une pile vide");
		Object objectToReturn = this.top.getContenu();
		this.top = this.top.getNextCell();
		return objectToReturn;
	}
}
