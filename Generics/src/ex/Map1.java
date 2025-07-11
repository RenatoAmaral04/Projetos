package ex;

import java.util.Map;
import java.util.TreeMap;

public class Map1 {

	public static void main(String[] args) {
	
		Map<Integer, String> cookies = new TreeMap<>();
		cookies.put(1, "Renato");
		cookies.put(2, "Renat");
		cookies.put(3, "Rena");
		cookies.put(4, "Ren");
		cookies.put(5, "Re");
		cookies.put(6, "R");
		
		for (Integer inta : cookies.keySet()) {
			
			System.out.println(inta + ": " + cookies.get(inta));
		}
	}

}
