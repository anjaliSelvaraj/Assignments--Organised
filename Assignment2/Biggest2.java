import java.util.Scanner;

public class Biggest2 {
	int firstBiggest;
	int secondBiggest;

	void input() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=s.nextInt();
		System.out.println("Enter the elements");
		int num[]=new int[n];
		for(int i=0;i<n;i++)
		{
			num[i]=s.nextInt();
		}
		findFirstBiggest(num,n);
	}
	void findFirstBiggest(int[] num, int n)
	{
		firstBiggest=num[0];
		int i,j=0;
		for(i=0;i<n;i++)
			if(num[i]>firstBiggest)
			{
				firstBiggest=num[i];
				j=i;
			}
		num[j]=0;
	 findSecondBiggest(num,n);
	}
	void findSecondBiggest(int[] num,int n)
	{
		secondBiggest=num[0];
		int i;
		for(i=0;i<n;i++)
		{
			if(num[i]>secondBiggest && num[i]!=firstBiggest)
				secondBiggest=num[i];
		}
		
		
		public class Biggest2Main {
public static void main(String args[])
{
Biggest2 b2=new Biggest2();
b2.input();

}
}
		output();
	}
	void output()
	{
		System.out.println(firstBiggest);
		System.out.println(secondBiggest);
	}
}
