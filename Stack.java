package lab7;
import java.util.*;

public class Stack {

	private LinkedList<Integer> list;
	
	Stack() {
		list = new LinkedList<Integer>();
	}
	
	void push(int n) {
		list.add(n);
	}
	
	int pop() {
		return list.remove(0);
	}
	
	void printStack() {
		Iterator<Integer> itr = list.iterator();
		while( itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
	}
	
	public static void main( String[] args) {
		Stack testObj = new Stack();
		testObj.push(4);
		testObj.push(2);
		testObj.push(5);
		testObj.push(6);
		
		testObj.pop();
		testObj.printStack();
	}
}
