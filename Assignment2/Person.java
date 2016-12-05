import java.util.Scanner;
class PersonMain{
	
	public static void main(String args[])
	{
		// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);
boolean g1 = true;
		
        System.out.println("enter the age(decimals are accepted)");
float a1= s1.nextFloat();
        
        System.out.println(" Type 'yes' for female and 'no' for male");
        if( s1.next()=="yes")
      g1= true;
        if(s1.next()=="no")
	  g1=false;
        
        Person p1=new Person(a1,g1);
       p1.personType(a1, g1);
	}
}

class Person 
{
float age;
boolean gender; 
Person(float age, boolean gender)
{
	this.age= age;
	this.gender= gender;

}

String personType(float age, boolean gender)
{

	if(age<=1.0f)
	return "infant";
	
	if(age<=3.0f)
		return "toddler";
	
	if(age<=5.0f)
		return "Pre Schooler";
	
	if(age>5f && age<=6f)
		if(gender==true)
			return "KG girl";
	    if(gender==false)
	    	return "KG boy";
	    
	    	return "adult"; 
}
}
