package vn.smartdev.cleancode;

public class Circle {

	private int x;
	private int y;
	private int r;

	/**
	 * 
	 * @param x
	 * @param y
	 * @param r radian 
	 */
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public void printThem() {
		// Draw Circle
		System.out.println("Shape of Circle:");
		System.out.println(String.format("Point[x,y]=[%d,%d]", x, y));
		// Print area
		double a = 2 * 3.14 * r;
		System.out.println("Area: " + a);
	}
}
