import java.util.*;

public class Poop {
	public Other poop(String a) {
		Map<String,Other> changer = new TreeMap<String,Other>();
		changer.put(a, new Other());
		Other newOther = changer.get(a);
		return newOther;
	}
}
