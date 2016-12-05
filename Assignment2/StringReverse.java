package rev;

import java.util.Scanner;

public class rev {
	public static void main(String args[])
	{
	System.out.println("Enter a string to reverse");
	Scanner s1=new Scanner(System.in);
	String a=s1.next();
	int l=a.length();
	int m=l;
	System.out.println("reverse:");
	for(int i=0;i<l;i++)
	{
	char r1= a.charAt(m-1);
	System.out.print(r1);
	m--;
	}
	}

}
