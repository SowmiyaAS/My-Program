package String;

public class Charoccurance {

	public static void main(String[] args) {
		String str="welcome to chennai";
	
		char find='e';
		int count=0;
		for (int i= 0; i < str.length(); i++)
		{
			if(find==str.charAt(i)) 
			count++;
			}
			System.out.println(count);
			
		}
		

	}

