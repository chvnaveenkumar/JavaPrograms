package apple.infosys;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharactersJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "aabcdec";
	        Map<Character, Integer> charCountMap = new HashMap<>();
	        for (char c : str.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }
	        System.out.print("Non-repeated characters: ");
	        for (char c : str.toCharArray()) {
	            if (charCountMap.get(c) == 1) {
	                System.out.print(c);
	            }
	        }

	}

}
