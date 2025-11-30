package ds.arrays;

import java.util.Arrays;

/*Best Score
Given an array, write a function to get first, second best scores from the array and return it in new array.

Array may contain duplicates.

Example

myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
firstSecond(myArray) // {90, 87}
*/
public class ImpTopTwoScores {

	public static void main(String[] args) {
		int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
		int[] score = firstSecond(myArray);
		System.out.println(Arrays.toString(score));

	}

	private static int[] firstSecond(int[] myArray) {
		int firstScore = Integer.MIN_VALUE;
		int secondScore = Integer.MAX_VALUE;
		
		for(int score: myArray) {
			if(score > firstScore) {
				secondScore = firstScore;
				firstScore = score;
			} else if(score > secondScore && score < firstScore){
				secondScore = score;
			}
		}
		
		return new int[] {firstScore, secondScore};
	}
	
	

}
