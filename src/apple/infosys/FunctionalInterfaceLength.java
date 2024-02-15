package apple.infosys;

import java.util.function.Function;

public class FunctionalInterfaceLength {
	
	public static void main(String args[]) {
		
		String name ="abcdefg";
		Function<String, Integer> stringLength = (input) -> input.length();
		Function<Integer, Integer> multiplyLength = (input) -> input * 2;
		
		int stringMultiLength = stringLength.andThen(multiplyLength).apply(name);
		System.out.println(stringMultiLength);
	}

}
