package lc.arrays;

import java.util.Arrays;

/*Write a function which takes integer array as a parameter and returns a new 
integer array with unique elements. (remove duplicates)

Example

removeDuplicates({1, 1, 2, 2, 3, 4, 5})
Output : [1, 2, 3, 4, 5]
*/
public class RemoveDuplicates {
	
	public static void main(String args[]) {
		int[] array = {1, 1, 2, 2, 3, 4, 5};
		int[] arr = removeDuplicates(array);
		System.out.println(Arrays.toString(arr));
		
		int[] streamArray = removeDuplicatesStreams(array);
		System.out.println(Arrays.toString(streamArray));
	}
	
	private static int[] removeDuplicatesStreams(int[] array) {
		int[] arr = Arrays.stream(array) // convert into Streams
						  .distinct() // Remove duplicates
						  .toArray(); // convert into Array
		return null;
	}

	public static int[] removeDuplicates(int[] arr) {
		
		int[] uniqueArray = new int[arr.length];
		int index = 0;
		for(int i=0;i<arr.length - 1;i++) {
			boolean isDuplicate = false;
			for(int j= i +1;j<arr.length;j++) {
				if(arr[i]== arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				uniqueArray[index++] = arr[i];
			}
		}
		
		
		
		return Arrays.copyOf(uniqueArray, index);
		
	}

}
