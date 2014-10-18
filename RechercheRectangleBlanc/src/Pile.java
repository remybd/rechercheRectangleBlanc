import java.util.ArrayList;


public class Pile {
	
	private int size;
	private int top;
	private int[] list;
	
	public Pile(int size) {
		this.size = size;
		this.top = 0;
		this.list = new int[size];
	}
	
	public boolean estVide() {
		return this.top == 0;
	}
	
	public boolean estPleine() {
		return this.top == this.size-1;
	}
	
	public void push(int intToAdd) {
		if(estPleine()) {
			throw new RuntimeException("Impossible d'ajouter une valeur, la pile est pleine");
		}
		this.top++;
		this.list[this.top] = intToAdd;
	}
	
	public int pop() {
		if(this.estVide()) {
			throw new RuntimeException("Impossible de récupérer une valeur, la pile est vide");
		}
		this.top--;
		return this.list[this.top + 1];
	}
}
