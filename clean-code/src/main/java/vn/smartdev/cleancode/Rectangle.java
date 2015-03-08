package vn.smartdev.cleancode;

public class Rectangle {

	private int x1;
	private int y1;
	private int x2;
	private int y2;

	/**
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	
	public void printThem() {
		// Draw rectangle
		System.out.println("Shape of Rectangle:");
		System.out.println(String.format("Point 1[x,y]=[%d,%d]", x1, y1));
		System.out.println(String.format("Point 2[x,y]=[%d,%d]", x2, y2));
		// Print area
		double a = ((x2 - x1) * (y2 - y1));
		System.out.println("Area: " + a);
	}
}
