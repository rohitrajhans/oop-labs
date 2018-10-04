package lab6;;

public class MovableCircle implements Movable, Comparable<MovableCircle> {

	private MovablePoint center;
	private int radius;
	
	public MovableCircle( int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}
	
	@Override
	public void moveUp() {
		center.y -= center.ySpeed;
	}

	@Override
	public void moveDown() {
		center.y += center.ySpeed;
	}

	@Override
	public void moveRight() {
		center.x += center.xSpeed;
	}

	@Override
	public void moveLeft() {
		center.x -= center.xSpeed;
	}
	
	@Override
	public String toString() {
		return "Center at " + "(" + center.x + "," + center.y + ")" + " and radius: " + this.radius;
	}

	@Override
	public int compareTo(MovableCircle c) {
		int d = this.radius - c.radius;
		if( d == 0)
			return 0;
		if( d>0)
			return 1;
		else
			return -1;
	}

}
