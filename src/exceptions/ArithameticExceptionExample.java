package exceptions;

public class ArithameticExceptionExample 
{

	public ArithameticExceptionExample() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String arg[])
	{
		int ink =main1(arg);
		
	
		int age=18;
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible for voting");
			
		}
		else
		{
			System.out.println("Eligible for Vote");
		}
	}
	
	public static int main1(String arg[])
	{
		int age=18;
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible for voting");
			
		}
		else
		{
			System.out.println("Eligible for Vote");
		}
		return 1;
	}

}
