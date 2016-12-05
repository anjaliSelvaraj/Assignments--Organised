package practice;

import java.util.Scanner;

public class AddDigits {
	public int getInt()
{   
		Scanner s=new Scanner(System.in);
	System.out.println("Enter a number");
	return s.nextInt();
}
	int addDigits(int n)
	{  
		int m=n;
	    int s=0;
	     int r;
		while(n!=0)
		{
			r=n%10;
			s=s+r;
			n=n/10;
		}
		return s;
	}
	public void printInt(int s)
	{
		System.out.println(s);
	}
}
package practice;

public class AddDigitsMain {
public static void main(String args[])
{
	AddDigits ad=new AddDigits();
	int n=ad.getInt();
	int sum=ad.addDigits(n);
	ad.printInt(sum);
}
}
