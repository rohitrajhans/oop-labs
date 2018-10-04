package lab7;

public class Movie {
	
	interface Bookable {
		public void printTicket();
		public void giveTicket( String movie);
	}
	
	public void bookTicket() {
		class EnglishMovie implements Bookable {
			String name;
			public void printTicket() {
				giveTicket("Blind Date");
			}
			public void giveTicket(String movie) {
				name = movie;
				System.out.println("You have booked for the movie " + name);
			}
		}
			
		Bookable hollywood = new EnglishMovie();
		
		// two objects are created in two different ways
		
		// hollywood is an object of inner class EnglishMovie. EnglishMovie implements
		// Bookable interface
		
		// hindiMovie is an object of an anonymous class that implements Bookable interface
		
		Bookable hindiMovie = new Bookable() {
			public void printTicket() {
				giveTicket("Bachna Ae Haseeno");
			}
			public void giveTicket( String movie) {
				String name = movie;
				System.out.println("You have booked for the movie " + name);
			}
		};
		
		hollywood.printTicket();
		hindiMovie.printTicket();
		
	}
	
	public static void main( String[] args) {
		Movie easyMovie = new Movie();
		easyMovie.bookTicket();
	}
	
}
