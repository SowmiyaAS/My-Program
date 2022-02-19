package String;

public class Finderror {

	public static void main(String[] args) {
		//declare string
		String[] name=new String[5];
		name[0]="bruits";
		name[1]="animals";
		name[2]="birds";
		name[3]="humans";
		name[4]="trees";
		// error - Index 5 out of bounds for length 5
		//name[5]="nature";
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
			
		}
		}

}
