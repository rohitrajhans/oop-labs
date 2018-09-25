package lab6;

import java.util.Comparator;

public class MovablePoint implements Movable {

	protected int x, y, xSpeed, ySpeed;
	
	public MovablePoint( int x, int  y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public void moveUp() {
		y -= ySpeed;
	}

	@Override
	public void moveDown() {
		y += ySpeed; 
	}

	@Override
	public void moveRight() {
		x += xSpeed;
	}

	@Override
	public void moveLeft() {
		x -= xSpeed;
	}
	
	@Override
	public String toString() {
		return "Point at (" + x + "," + y + ")" + " xSpeed: " + xSpeed + ", ySpeed: " + ySpeed;
	}
	
	class xSpeedCompare implements Comparator<MovablePoint> {

		@Override
		public int compare(MovablePoint p1, MovablePoint p2) {
			int d = p1.xSpeed - p2.xSpeed;
			if( d == 0)
				return 0;
			if( d>0)
				return 1;
			else
				return -1;
		}
		
	}
	
	class ySpeedCompare implements Comparator<MovablePoint> {

		@Override
		public int compare(MovablePoint p1, MovablePoint p2) {
			int d = p1.ySpeed - p2.ySpeed;
			if( d == 0)
				return 0;
			if( d>0)
				return 1;
			else
				return -1;
		}
		
	}

}
