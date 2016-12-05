package practice;

import java.util.Scanner;

public class MessageSOS {

	int findReplaced(String msg,String predict)
	{   char[] messg=msg.toCharArray();
	char[] pre=predict.toCharArray();
		int replaced=0;
		int i,j;
		for(i=0,j=0;i< msg.toCharArray().length;i++,j++)
		{
			if(messg[i]!=pre[j])
				replaced++;
		}
		return replaced;
		
    }

	public String getAString() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		return s.next();
	}
	 String predictAString(char[] msg)
	{    String predict="";
	int n=0;
		if(msg.length%3==0)
		{   while(n<=msg.length)
			{
				predict=predict+"SOS";
				n=n+3;
			}
	    }
		else
		{
			int predictSize=msg.length;
			while(predictSize%3!=0)
				predictSize++;
			while(n<=predictSize)
			{
				predict=predict+"SOS";
				n=n+3;
			}
		}
	return predict;
	}
	 
}
package practice;

public class MessageSOSMain {
public static void main(String args[])
{
	MessageSOS m=new MessageSOS();
	String message=m.getAString();
	String predict=m.predictAString(message.toCharArray());
	System.out.println(m.findReplaced(message,predict));
}
}

