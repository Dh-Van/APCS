package src.com.ch2.dimensions;

public class Point {
	private double xCoord;
	private double yCoord;
	
	// Deafult Constructor
	public Point() {
		xCoord = 0.0;
		yCoord = 0.0;
	}

	public Point(double x, double y) {
		xCoord = x;
		yCoord = y;
	}

	public double getX() {
		return xCoord;
	}

	public double getY() {
		return yCoord;
	}

	
	public String toString() {
		String s = "(" + xCoord + ", " + yCoord + ")";
		return s;
	}

}