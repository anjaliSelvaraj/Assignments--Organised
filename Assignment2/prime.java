void isPrime(int n)
{
int f=1;
for(int i=2;i<= math.sqrt(n);i++)
 {
if(n%i==0)
f=0;
break;
}
if(f==1)
System.out.println(n+ "is prime");
else 
System.out.println(n + "is not prime");
}
