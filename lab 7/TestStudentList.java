package lab7;
import java.util.*;

public class TestStudentList {

	public static void main(String[] args) {
		
		ArrayList<Student> studList = new ArrayList<Student>();
		studList.add( new Student("Ramesh", "Male", 18));
		studList.add( new Student("Reeta", "Female", 19));
		studList.add( new Student("Seema", "Female", 18));
		studList.add( new Student("Suresh", "Male", 20));
		
		System.out.println("Original contents of studentList: ");
		Iterator<Student> itr = studList.iterator();
		while( itr.hasNext() ) {
			Object element = itr.next();
			System.out.println(element);
		}
		
		System.out.println();
		
		ListIterator<Student> litr = studList.listIterator();
		while( litr.hasNext()) {
			Student el = (Student) litr.next();
			if( el.getGender().equals("Male")) {
				el.setName("Mr. " + el.getName());
			}
			else {
				el.setName("Miss. " + el.getName());
			}
			litr.set(el);
		}
		System.out.println("Modified contents of StudentList: ");
		itr = studList.iterator();
		while( itr.hasNext() ) {
			Student el = (Student) itr.next();
			System.out.println(el);
		}
		
		System.out.println();
		
		System.out.println("Modified list backwards: ");
		while(litr.hasPrevious()) {
			Object el = litr.previous();
			System.out.println(el);
		}
		
		System.out.println();
	}

}
