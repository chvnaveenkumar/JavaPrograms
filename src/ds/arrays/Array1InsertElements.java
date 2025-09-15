package ds.arrays;

public class Array1InsertElements {

	public static void main(String args[]) {
		
		Array1InsertElements aie = new Array1InsertElements();
		//Declare Variable
		int a[] = new int[5];
		int b[] = {1,2,5,6,8};
		
		//Default values were assigned
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		a[0] = 0;
		a[1] = 1;
		a[2] = 2;
		a[3] = 3;
		a[4] = 4;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nInsert an element 15 at start");
		int value = 15;
		
		for(int i=a.length -1;i>0;i--) {
			a[i] = a[i-1];
		}
		a[0] = value;
		aie.printArray(a);
	
		System.out.println("\nInsert an element 20 at position 2");
		int value2 = 20;
		int position = 2;
		
		for(int i=a.length-1; i>position;i--) {
			a[i] = a[i-1];
		}
		a[position] = value2;
		aie.printArray(a);
	}
	
	public void printArray(int a[]) {
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}	
	}
}
