package String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//Declare a String 
		String text1 = "stops";
		//Declare another String
		String text2="potss";
		
		//a) Check length of the strings are same then (Use A Condition)
		//b) Convert both Strings in to characters
		//c) Sort Both the arrays
		//d) Check both the arrays has same value
		
		if(text1.equals(text2)) {
					System.out.println("same");
				}
				else {
					System.out.println("not same");
				}
				
				//a) Check length of the strings are same then (Use A Condition)
				if (text1.length() ==text2.length()) {
				
				System.out.println("Same");
				}
				else { 
					System.out.println("not same");
				}
				//b) Convert both Strings in to characters
					char arr1[] = text1.toCharArray();
					char arr2[] = text2.toCharArray();
					
		          //c) Sort Both the arrays
					Arrays.sort(arr1);
					Arrays.sort(arr2);		
					
			//d) Check both the arrays has same value
					if (Arrays.equals(arr1, arr2))
						System.out.println("Anagram");
					else
						System.out.println("Not Anagram");

	}

}
