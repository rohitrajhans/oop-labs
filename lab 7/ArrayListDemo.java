package lab7;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList ar1 = new ArrayList();
		
		System.out.println("Size of ArrayList at creation: " + ar1.size());

		ar1.add("B");
		ar1.add("I");
		ar1.add("T");
		ar1.add("S");
		
		System.out.println("Size of ArrayList after adding elements: " + ar1.size());
		
		System.out.println("List of all elements: " + ar1);
		
		ar1.remove("B");
		System.out.println("Contents after removing one element: " + ar1);
		ar1.remove(2);
		System.out.println("Contents after removing element by index: " + ar1);
		System.out.println("Size of arrayList after removing elements: " + ar1.size());
		System.out.println(ar1.contains("T"));
	}

}
