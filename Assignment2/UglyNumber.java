public class UglyNumFinder {
	boolean isUgly(int num)
	{  boolean ugly=true;
			if(num>6 && num>1)
			{   
				for(int i=7;i<num;i++)
					if(isPrime(i)&& num%i==0)
					{
						ugly=false;
					}
			}
			
				return ugly; 
	
	}
	boolean isPrime(int n){
		boolean flag=true;
		for(int i=2;i<= Math.sqrt(n);i++)
			if(n%i==0)
			{
				flag=false;
				break;
			}
		return flag;
	}
}
package practice;

import java.util.Scanner;

public class UglyNumFinderMain {
	public static void main(String arg[])
	{   Scanner s=new Scanner(System.in);
		UglyNumFinder ugf=new UglyNumFinder();
		System.out.println("Enter the number");
		System.out.println(ugf.isUgly(s.nextInt()));
	}

}
