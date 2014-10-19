package slack;

public class Slack {
	
	private Cell top;
	
	public Slack() {
		this.top = null;
	}
	
	public boolean isEmpty() {
		return this.top == null;
	}
	
	public void push(Object value) {
		this.top = new Cell(value, this.top);
	}
	
	public Object pop() {
		if(this.isEmpty())
			throw new RuntimeException("Cannot get last element with an empty slack");
		Object objectToReturn = this.top.getContent();
		this.top = this.top.getNextCell();
		return objectToReturn;
	}
	
	public String toString() {
		String res = "BEGIN of Slack\n";
		Cell temp = this.top;
		while(temp != null) {
			res += temp.getContent().toString() + " - ";
			temp = temp.getNextCell();
		}
		return res + "\n" + "END of Slack";
	}
}
