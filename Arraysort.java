package Array;


import java.util.Arrays;

public class Arraysort {

	public static void main(String[] args) {
		int[] arr= {3,2,6,1,5,4};
		//sorting of array
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
	}

}
