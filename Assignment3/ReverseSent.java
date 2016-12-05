import java.util.Scanner;

public class RevreseSent {
	char[] revSent(String s)
	{
		char c1[]=s.toCharArray();
		char c2[]=new char[s.length()];
		int j=0; int l=0;int i1;
		for(int i=c1.length-1; i>=0;i--)
		{
			l++;
			if(c1[i]==' '|| i==0)
			{
				if(i==0)
					while(j<c2.length)
					{
						c2[j]=c1[i];
					    i++;j++;
					}
				else
				{
				i1=i+1;
				while(l-1!=0)
			{
				c2[j]=c1[i1];
				j++;i1++;
				l--;
			}
				c2[j++]=' ';
				}
			}
		}
		return c2;
		
	}
	public static void main(String arg[])
	{   				Scanner s1=new Scanner(System.in);
		System.out.println("enter a sentence");
		String s=s1.nextLine();
		RevreseSent rs=new RevreseSent();
		char c[]=new char[s.length()];
		c=rs.revSent(s);
		for(int i=0;i<s.length();i++)
			System.out.print(c[i]);
		
			}
	}


