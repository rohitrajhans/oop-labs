package lab7;
import java.util.*;

public class ReservationCounter {
	
	LinkedList ReservationQueue;
	
	private ReservationCounter() {
		ReservationQueue = new LinkedList();
	}
	
	public void standInLine( String customer) {
		ReservationQueue.add( (String)customer);
	}
	
	public void leaveTheLine() {
		ReservationQueue.remove();
	}
	
	public String giveTicket() {
		return (String)ReservationQueue.getFirst();
	}
	
	public String checkTheCustomerAt( int position) {
		return (String)ReservationQueue.get(position);
	}
	
	public static ReservationCounter InitializeCounter() {
		return new ReservationCounter();
	}
	
	public int customersInLine() {
		return ReservationQueue.size();
	}
}
