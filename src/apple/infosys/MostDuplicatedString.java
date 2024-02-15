package apple.infosys;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostDuplicatedString {
	  public static void main(String[] args) {
		  			
		String[] strings = {"apple", "banana", "apple", "banana", "banana", "apple"};
		Map<String, Long> frequencyMap = Arrays.stream(strings)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        long maxFrequency = frequencyMap.values().stream().max(Long::compareTo).orElse(0L);

        List<String> output = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == maxFrequency)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        
        System.out.println(output);
	  }

}
