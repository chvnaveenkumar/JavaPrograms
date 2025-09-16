package ds.recursion;

public class Power {
	public static void main(String args[]) {
		System.out.println(power(2, 3));
	}

	public static int power(int base, int exp) {
		if(base < 0 || exp < 0) {
			return -1;
		}
		if(exp == 0) {
			return 1;
		}
		return base * power(base, exp -1);
	}
}