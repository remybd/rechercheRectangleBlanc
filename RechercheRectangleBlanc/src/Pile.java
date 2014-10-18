

public class Pile {
	
	private int size;
	private int top;
	private Object[] list;
	
	public Pile(int size) {
		this.size = size;
		this.top = 0;
		this.list = new Object[size];
	}
	
	public boolean estVide() {
		return this.top == 0;
	}
	
	public boolean estPleine() {
		return this.top == this.size-1;
	}
	
	public void push(Object value) {
		if(estPleine()) {
			throw new RuntimeException("Impossible d'ajouter une valeur, la pile est pleine");
		}
		this.top++;
		this.list[this.top] = value;
	}
	
	public Object pop() {
		if(this.estVide()) {
			throw new RuntimeException("Impossible de récupérer une valeur, la pile est vide");
		}
		this.top--;
		return this.list[this.top + 1];
	}
}
