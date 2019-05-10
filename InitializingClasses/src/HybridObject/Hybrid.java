package HybridObject;

public class Hybrid {
	public static void main(String[] args) {
		C c = new C();
		B b = new B();
		A a = new A();
		a.runa();
		b.runb();
		c.runc();
		System.out.println("a.var = " + a.var);
	}
}
