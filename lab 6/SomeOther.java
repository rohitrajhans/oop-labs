package lab6;

public class SomeOther {

	public static void main(String[] args) {
		
		System.out.println(StaticOuter.StaticInner.s);
		StaticOuter.StaticInner si = new StaticOuter.StaticInner();
		System.out.println(si.nonstatic);
		System.out.println(si.s);
	}

}
