package String;

public class Palindrome {

	public static void main(String[] args) {
		String text="madam";
		String text1=" ";
		for (int i =text.length()-1; i>=0; i--) {
			System.out.println(text.charAt(i));
			text1=text1+text.charAt(i);
		}
		System.out.println(text1);
if(text.equals(text1))
{
	System.out.println("Given string is palindrome");
}
else
{
	System.out.println("Given string is not palindrome");
}
	}
}


