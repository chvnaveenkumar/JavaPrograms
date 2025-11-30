package ds.arrays;


/*Given 2D array calculate the sum of diagonal elements.

Example
myArray2D= {{1,2,3},{4,5,6},{7,8,9}}; 
sumDiagonalElements(myArray2D)*/

public class TwoDArray {
	
	public static void main(String args[]) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		int sum = sumDiagonalElements(arr);
		System.out.println(sum);
		//***Imp
		int sumDiagonal = sumDiagonalElements2(arr);
		System.out.println(sumDiagonal);
		
	}
	
	public static int sumDiagonalElements(int[][] array) {
		int sum = 0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(i == j) {
					sum += array[i][j];					
				}
			}
		}
		return sum;
	}
	
	public static int sumDiagonalElements2(int[][] array) {
		int sum = 0;
		for(int i=0;i<array.length;i++) {
			sum += array[i][i];					
		}
		return sum;
	}
}
