package method;

public class ReverseString {
	public static void main(String[] args)
	{
		String name="THRIVENI";
		char a;
		String rname="       ";
		for(int i=0;i<name.length();i++)
		{
			a=name.charAt(i);
			rname=a+rname;
		}
		System.out.println("the given String is   "+name);
		System.out.println("reversed String is  "+rname);
	}
	

}
