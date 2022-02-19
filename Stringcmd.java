package String;

public class Stringcmd {

	
	public static void main(String[] args) {
	
		String object=new String("Sowmiya ayyadurai");
		String obj=new String("sowmiya ayyadurai");
		int a=71;
		int b=7;
		
		//find length
		int length=object.length();
		System.out.println(length);
		
		char[] charArray=object.toCharArray();
		System.out.println(charArray);
		//print 8th index value
		System.out.println(object.charAt(8));
		
	    //partial verified
		System.out.println(object.contains("sowmi"));
		
		// find char index value
		System.out.println(object.indexOf('m'));
		 
		//upper or lower case same length - true
		System.out.println(object.equalsIgnoreCase(obj));
		
		//find locate
		System.out.println(object==obj);
		System.out.println(a==b);
		
		//print lower case
		System.out.println(object.toLowerCase());
		
		//concatination print uppercase
		System.out.println("uppercase output"+obj.toUpperCase());
		System.out.println(object.equals(obj));
		 
		
	}

}
