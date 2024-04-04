package apple.infosys;

import java.util.stream.Collectors;

public class NonRepeatedCharactersJava8 {
	public static void main(String args[]) {
		String input = "aabcdec";
	    
	   input.chars()
	             .mapToObj(c -> (char) c)
	             .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
	             .entrySet()
	             .stream()
	             .filter(entry -> entry.getValue() == 1)
	             .map(entry -> entry.getKey())
	             .forEach(System.out::print);
	    		
	   Long max = input.chars()
       .mapToObj(c -> (char) c)
       .collect(Collectors.groupingBy(c -> c, Collectors.counting())).values().stream().max(Long::compareTo).orElse(null);
	   System.out.println(max);
	}
}
