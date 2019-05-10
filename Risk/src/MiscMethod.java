
public class MiscMethod {

	/*
	 * Converts likely country names to absolute names
	 */
	public static String convertToCommon(String in) { 
		in = in.toLowerCase();
		if(in.contains("east")) {
			if(in.contains("africa")) {
				return "East Africa";
			} else if(in.contains("australia")) {
				return "Eastern Australia";
			} else if(in.contains("middle")) {
				return "Middle East";
			} else if(in.contains("us") || in.contains("united") || in.contains("states")) {
				return "Eastern Enited States";
			} else {
				return in;
			}
		} else if(in.contains("west")) {
			if(in.contains("europe")) {
				return "Western Europe";
			} else if(in.contains("australia")) {
				return "Western Australia";
			} else if(in.contains("north") || in.contains("territory")) {
				return "Northwest Territory";
			} else if(in.contains("us") || in.contains("united") || in.contains("states")) {
				return "Western United States";
			} else {
				return in;
			}
		} else if(in.contains("north")) {
			if(in.contains("africa")) {
				return "North Africa";
			} else if(in.contains("europe")) {
				return "Northern Europe";
			} else {
				return in;
			}
		} else if(in.contains("south")) {
			if(in.contains("africa")) {
				return "South Africa";
			} else if(in.contains("europe")) {
				return "Southern Europe";
			} else if(in.contains("west") || in.contains("territory")) {
				return "Northwest Territory";
			} else {
				return in;
			}
		} else if(in.contains("central") || in.contains("america")) {
			return "Central America";
		} else if(in.contains("great") || in.contains("britain")) {
			return "Great Britain";
		} else if(in.contains("new") || in.contains("guinea")) {
			return "New Guinea";
		} else {
			in = in.substring(0,1).toUpperCase() + in.substring(1);
			return in;
		}
	}

	public static String capitalizeAll(String initial) {
		int first = 0, space;
		String out;
		Boolean end = false;
		space = initial.indexOf(' ');
		if(space < 0) {
			space = initial.length();
			end = true;
			System.out.println("space flag set");
		}
		System.out.println(space);
		out = initial.substring(first, first + 1).toUpperCase() + initial.substring(first + 1, space);
		while(!end && initial.substring(space + 1).contains(" ")) {
			first = space + 1;
			space = initial.length() + initial.substring(first).indexOf(' ');
			if(space < 0) {
				space = initial.length();
				end = true;
			}
			System.out.println("space = " + space);
			out = out + initial.substring(first, first + 1).toUpperCase()
					+ initial.substring(first + 1, space);
			System.out.println("Passing gate with space value = " + space);
		}
		
		/**
		if(end) {
			first = space + 1;
			space = initial.length() + initial.substring(first).indexOf(20);
			if(space < 0) {
				space = initial.length();
				end = true;
			}
			out = out + initial.substring(first, first + 1).toUpperCase()
					+ initial.substring(first + 1, space);
		}
		*/
		return out;
	}
}
