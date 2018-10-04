package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMovable {

	public static void main(String[] args) {
		Movable m1 = new MovablePoint(5, 6, 10, 5);
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		
		Movable m2 = new MovableCircle(2, 1, 2, 4, 20);
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);
		
		List<MovableCircle> list = new ArrayList<MovableCircle>();
		list.add(new MovableCircle(2, 3, 1 ,2, 5));
		list.add(new MovableCircle(2, 3, 1 ,2, 2));
		list.add(new MovableCircle(2, 3, 1 ,2, 4));
		list.add(new MovableCircle(2, 3, 1 ,2, 1));
		list.add(new MovableCircle(2, 3, 1 ,2, 7));
		
		Collections.sort(list);
		
		for( MovableCircle m: list)
			System.out.println( m );
		
		List<MovablePoint> list2 = new ArrayList<MovablePoint>();
		list2.add(new MovablePoint(2, 3, 23 ,13));
		list2.add(new MovablePoint(2, 3, 12 ,12));
		list2.add(new MovablePoint(2, 3, 1, 9));
		list2.add(new MovablePoint(2, 3, 7, 5));
		list2.add(new MovablePoint(2, 3, 3, 6));
		
		Collections.sort( list2, new MovablePoint(0,0,0,0).new xSpeedCompare());
		for( MovablePoint m: list2)
			System.out.println(m);
		
		Collections.sort( list2, new MovablePoint(0,0,0,0).new ySpeedCompare());
		for( MovablePoint m: list2)
			System.out.println(m);
		
	}

}
