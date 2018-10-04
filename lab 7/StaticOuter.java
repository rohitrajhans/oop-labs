package lab6;

public class StaticOuter {

	String a = "Static outer class, non-static string";
	static String b = "Static Outer class, static string";
	
	void seeStaticInner() {
//		System.out.println(nonstatic);
//		System.out.println(StaticInner.nonstatic);
		System.out.println(new StaticInner().nonstatic);
		System.out.println(StaticInner.s);
	}
	
	public static void main(String[] args) {
//		System.out.println(s);
		System.out.println(StaticInner.s);
		StaticOuter so = new StaticOuter();
		so.seeStaticInner();
	}
	
	static class StaticInner {
		String nonstatic = "Static Inner Class, non-static string";
		static String s = "Static Inner class, static string";
		
		StaticOuter so = new StaticOuter();
		
		void getNonStaticOuter() {
			System.out.println(so.a);
		}
		
		public static void main( String[] args) {
//			System.out.println(nonstatic);
			System.out.println(s);
			System.out.println(b);
			StaticOuter.StaticInner si = new StaticOuter.StaticInner();
			si.getNonStaticOuter();
		}
	}

}
