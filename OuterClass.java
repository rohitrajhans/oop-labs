package lab6;

public class OuterClass {
	Inner i1 = new Inner();
	
	private String s = "Outer String";
	
	void getS() {
		System.out.println(s);
	}
	
	void getInnerS() {
		System.out.println(i1.s);
	}
	
	class Inner {
		private String s = "Inner String";
		
		void getS() {
			System.out.println(s);
		}
		
		void getOuterS() {
			System.out.println(OuterClass.this.s);
		}
	}
	
	public static void main( String[] args) {
		OuterClass o = new OuterClass();
		
		OuterClass.Inner oi = o.new Inner();
//		OuterClass.Inner oi = new OuterClass().new Inner();
		// can also be instantiated ^ this way
		o.getS();
		oi.getS();
		o.getInnerS();
		oi.getOuterS();
		
	}
}
