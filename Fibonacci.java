package week1.assignment;

public class Fibonacci {

	public static void main(String[] args) {
		
		int f=0;
		  int sum;
		  System.out.println(f);
		  int s=1;
		  System.out.println(s);
		  for (int i =2; i<=8; i++) {
			  sum=f+s;
			  System.out.println(sum);
			  f=s;
			  s=sum;
	}

}
}
