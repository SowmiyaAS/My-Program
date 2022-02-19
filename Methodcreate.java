package week1.assignment;

public class Methodcreate {
	
	public void sendMessage()
	{
		System.out.println("hi");
	}
	public void shareDocument()
	{
		System.out.println("document");
	}
	public void callMe()
	{
		System.out.println("call");
	}

	public static void main(String[] args)
	{
		Methodcreate mobile=new Methodcreate();
		mobile.sendMessage();
   mobile.shareDocument();
   mobile.callMe();
		}
	}


