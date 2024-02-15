package apple.infosys;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrays {
	public static void main(String args[]) {
		int[] arr1 = {1,2,8,15};
		int[] arr2 = {16,5,8,19};
		
		int[] mergedArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().toArray();
		int[] sortArray = Arrays.stream(mergedArray).sorted().toArray();
		System.out.println(Arrays.toString(sortArray));
	}
}
