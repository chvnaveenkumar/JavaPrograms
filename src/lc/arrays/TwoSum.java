package lc.arrays;

import java.util.Arrays;

/*Two Sum - LeetCode 1
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1]*/
		
public class TwoSum {

	public static void main(String args[]) {
		int[] arr = {2,7,11,15};
		int target = 9;
		int[] twoSum = twoSum(arr, target);
		System.out.println(Arrays.toString(twoSum));
	}
	
	public static int[] twoSum(int[] arr, int target) {
		
		for(int i=0;i<arr.length - 1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] + arr[j] == target)
				{
					return new int[] {i,j};
				}
			}
		}
		
		return new int[0];
		
	}
}
