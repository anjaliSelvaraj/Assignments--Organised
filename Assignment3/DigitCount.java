package digitCount;

import java.util.Scanner;

public class DigitCount {
	int countDigit(int n){
		int count=0;
		while(n!=0)
		{
		n=n/10;
		count++;
		}
		return count;
	}
	public static void main(String arg[])
	{
		DigitCount dc=new DigitCount();
		Scanner s1 =new Scanner(System.in);
		System.out.println("enter a number");
		int n=s1.nextInt();
		System.out.println(dc.countDigit(n));
	}

}
