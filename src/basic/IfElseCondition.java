package basic;

public class IfElseCondition 
{
	public boolean isLeapYear(int year)
	{
		boolean status=false;
		
		if(((year%4==0) && (year %100 !=0)) || year %400 ==0)
		{
			status=true;
		}
		
		
		return status;
	}
	
	public static void main(String arg[])
	{
		int year=2020;
		boolean isLeap=new IfElseCondition().isLeapYear(year);
		if(isLeap)
		{
			System.out.println("******** "+year+" is a Leap Year ***********");
		}
		else
		{
			System.out.println("******** "+year+" is not a Leap Year ***********");
		}
	}
}
