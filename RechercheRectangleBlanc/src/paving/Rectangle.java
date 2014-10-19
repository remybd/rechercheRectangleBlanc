package paving;

public class Rectangle {

	private int numRow = 0;
	private int numColumn = 0;
	private int height = 0;
	private int width = 0;
	
	public Rectangle(int x, int y, int height, int width){
		this.numRow = x;
		this.numColumn = y;
		this.height = height;
		this.width = width;
	}
	
	public int getNumRow() {
		return numRow;
	}
	
	public int getNumColumn() {
		return numColumn;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getArea() {
		return this.height*this.width;
	}
	
	public String toString() {
		return "X = " + this.getNumRow() + " and Y = " + this.getNumColumn() + "\n"
				+ "Height = " + this.getHeight() + " and Width = " + this.getWidth() + "\n"
				+ "Area = " + this.getArea();
	}
}
