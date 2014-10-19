package paving;

public class UnfinishedRectangle {

	int startColumn;
	int height;
	
	public UnfinishedRectangle(int startColumn, int height) {
		this.startColumn = startColumn;
		this.height = height;
	}
	
	public int getStartColumn() {
		return this.startColumn;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public String toString() {
		return "Start column = " + this.startColumn+" - Height = " + this.height;
	}
}
