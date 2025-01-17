
@org.jmlspecs.annotation.NullableByDefault
public class TestObject {

	@org.jmlspecs.annotation.SkipEsc
	public static void main(String... args) {
		esc();
	}
	
	public static void esc() {
		Object a = new Object();
		Object b = new Object();
		//@ assert a != null;
		//@ assert b != null;
		//@ assert a != b;
		int i1 = a.hashCode();
		int i2 = a.hashCode();
		//@ assert i1 == i2;
		//@ assert a.equals(a); 
		//@ assert !a.equals(b); 
		//@ assert !a.equals(null); 
		//@ assert a.getClass() == \erasure(\typeof(a));
		//@ assert a.getClass() == b.getClass();
		//@ assert \typeof(a) == \typeof(b);
		// FIXME - no tests of toString
	}
}
