import java.util.HashMap;

class Tester {
	int var;
	Tester(int var) {
		this.var = var;
	}
	int getVar() {
		return var;
	}
	void increaseVar(int incrementer) {
		var += incrementer;
	}
}

public class Testing1 {
	public static void main(String[] args) {
		HashMap<String,Tester> hm = new HashMap<String, Tester>();
		Tester A = new Tester(5);
		Tester B = new Tester(34);
		String test = "BaLlIn' LiKe StAlIn";
		hm.put("A", A);
		hm.put("B", B);
		System.out.println("A reads " + ((Tester)hm.get("A")).getVar());
		((Tester)hm.get("A")).increaseVar(5);
		System.out.println("A reads " + ((Tester)hm.get("A")).getVar());
		System.out.println("String test is " + test);
		test = test.toLowerCase();
		System.out.println("String test is " + test);
	}
}
