package ds.arrays;

import java.util.Arrays;

/*Write a function called middle that takes an array and returns a new array that contains all 
  but the first and last elements.
 

myArray = [1, 2, 3, 4]
middle(myArray)  # [2,3]. */

public class MiddleFunction {

	public static void main(String args[]) {
		int[] array = {1,2,3,4};
		System.out.println(Arrays.toString(array));
	}
	
	public static int[] middleFunction(int[] array)
	{
		if(array.length <= 2) {
			return new int[0];
		}
		
		int[] arr = new int[array.length - 2];
		
		int index = 0;
		while(index < array.length - 2) {
			arr[index] = array[index + 1];
			index++;
		}
		return arr;
	}
}
