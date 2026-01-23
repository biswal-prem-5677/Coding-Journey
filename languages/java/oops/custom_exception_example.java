import java.util.*;

class TooYoungException extends RuntimeException
{
    	public TooYoungException(String S)
    	{
        	super(S);
    	}
}
class TooOldException extends RuntimeException
{
    	public TooOldException(String S)
    	{
        	super(S);
    	}
}
class CustomizedException
{
    	public static void main(String arg[])
    	{
        	Scanner sc = new Scanner(System.in);
        	System.out.println("enter your age");
        	int age=sc.nextInt();
        	if(age<=18)
        	{
            		throw new TooYoungException("You are too young");
        	}
        	else if(age>60)
        	{
            		throw new TooOldException("You are too old");
        	}
        	else {
            		 System.out.println("Congratulations......!!");
        	}

    	}
}