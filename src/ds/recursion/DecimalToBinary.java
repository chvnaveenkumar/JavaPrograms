package ds.recursion;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println(decimalToBinary(10));
	}
	
	/*
	 * Step 1 : Divide the number by 2 Step 2 : Get the integer quotient for the
	 * next iteration Step 3 : Get the remainder for the binary digit Step 3 :
	 * Repeat the steps until the quotient is equal to 0
	 */
	public static int decimalToBinary(int num) {
		if(num <0) {
			return -1;
		}
		if(num == 0) {
			return 0;
		}
		return num % 2 + 10 * decimalToBinary(num/2);
	}

}
