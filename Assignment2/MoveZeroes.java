package practice;

import java.util.Scanner;

public class MoveZeroes {
int first, next;
public int[] getIntArray()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=s.nextInt();
	System.out.println("Enter the elements");
	int input[]=new int[n];
	for(int i=0;i<n;i++)
	{
		input[i]=s.nextInt();
	}
	return input;
}
int[] moveZeroes(int[] num)
{   
	//int moved[]=new int[num.length];
	first=0;
	next=1;
	int temp;
	while(next!=num.length)
	{
			if(num[first]==0) 
			{
				if(num[next]!=0)
            {
			temp=num[first];
			num[first]=num[next];
			num[next]=temp;
			first++;
			next++;
			}
            else{
            	next++;
            }
			
	}
	}
	return num;
}
public void printIntArray(int[] arr)
{
	for(int i:arr)
	{
		System.out.println(i);
	}
}
}
package practice;

public class MoveZeroesMain {
public static void main(String arg[])
{
	MoveZeroes mz=new MoveZeroes();
	int input[]=mz.getIntArray();
	int moved[]=mz.moveZeroes(input);
	mz.printIntArray(moved);
}
}
