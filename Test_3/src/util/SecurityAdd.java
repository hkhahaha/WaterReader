package util;

import java.util.HashMap;
import java.util.Map;

public class SecurityAdd {
	public static Map<String, String> getMapData() {
	    Map<String, String> map = new HashMap<String, String>();
	    map.put("0", "a");
	    map.put("1", "b");
	    map.put("2", "c");
	    map.put("3", "d");
	    map.put("4", "e");
	    map.put("5", "f");
	    map.put("6", "g");
	    map.put("7", "h");
	    map.put("8", "i");
	    map.put("9", "j");
	    return map;
	}
	public static String setSecurityPassword(String password) {
	    
	    String name = "";
	    for (int i = 0; i < password.length(); i++) {
	        name = name + getMapData().get(String.valueOf(password.charAt(i)));
	    }
	    return name;
	}
}
