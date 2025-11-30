package lc.arrays;

import java.util.Arrays;

/*Remove Duplicates from Sorted Array - LeetCode 26

Input: nums = [1, 1, 2,2,5,6] 
Output: [1,2,5,6]*/

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,5,6};
		int[] array = removeDuplicates(arr);
		System.out.println(Arrays.toString(array));
	}
	
	public static int[] removeDuplicates(int[] array) {
		
		int[] arr = new int[array.length];
		int i = 0;
		
		arr[0] = array[0];
		for(int j=1;j<array.length;j++) {
			if(array[j] != arr[i]) {  // Here is the logic missing
				i++;
				arr[i] = array[j];			
			}
		}
		
		return Arrays.copyOf(arr, i+1 );
	}
}
