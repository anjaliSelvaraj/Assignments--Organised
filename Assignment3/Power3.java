import java.util.Scanner;

public class power3 {
	public int[] find3Pow(int n)
	{ 
		int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    	a[i]=(int) Math.pow(3, i);
	    
		return a;
	}
	public static void main(String arg[])
	{
		Scanner s1=new Scanner(System.in);
			System.out.println("enter n");
		int n=s1.nextInt();
		power3 p1=new power3();
		int a[]=new int[n];
		a=p1.find3Pow(n);
		System.out.println("The " +n + " powers of 3 are ");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		
		
		
	}

}
