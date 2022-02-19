package Globalvariable;

public class Calculator {

	
		//declare global variable
		public int c;
		
         public void addTwoNumber()
		{
			int a=10;
			int b=42;
			c=a+b;
			System.out.println(c);
		}
		public void SubTwoNumber()
		{
			//local variable
			int l=23;
			int m=12;
			c=l-m;
			System.out.println(c);
		}
		//argument pass
		public void mulTwoNumber(double a,double b)
		{
			double d=a*b;
	System.out.println(d);
		}
		
		
		
		public static void main(String[] args)
		{
			Calculator calc=new Calculator();
			calc.addTwoNumber();
			calc.SubTwoNumber();
			calc.mulTwoNumber(23.6,65.4);
			
			
			}
		}
