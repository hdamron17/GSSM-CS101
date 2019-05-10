package playingAroundWithAbstracts;

public class Test {
	class Class {
		private int a, b, c;
		private String name;
		
		public Class(int a, int b, int c, String name) {
			this.a = a;
			this.b = b;
			this.c = c;
			this.name = name;
		}
		
		public int getSum() {
			return a + b + c;
		}
		
		public String getName() {
			return name;
		}
	}
	
	class SubClass extends Class {
		private int d;
		public SubClass(int a, int b, int c, int d, String name) {
			super(a, b, c, name);
			this.d = d;
		}
	}
	
	class Inheriter implements Interface1, Interface2 {
		
	}
	
	interface Interface1 {
		
	}
	
	interface Interface2 {
		
	}
}