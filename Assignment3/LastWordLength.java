import java.util.Scanner;

public class LastWordLength {
	int lastWordLen(String s)
	{
		char a[]=s.toCharArray();
		int count=0;
		for(int i=a.length-1;i>=0;i--)
			if(a[i]!=' ')
				count++;
			else 
				break;
		    
			return count;
		
	}
	
	
	
	public static void main(String arg[])
	{
		Scanner s1=new Scanner(System.in);
		String s= s1.nextLine();
		LastWordLength lw=new LastWordLength();
		System.out.println(lw.lastWordLen(s));
	}

}
