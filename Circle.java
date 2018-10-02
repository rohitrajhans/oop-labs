package lab7;

public class Circle {
	private int rad;
	
	public Circle( int radius) {
		rad = radius;
	}
	
	public double area() {
		return rad*rad;
	}
}