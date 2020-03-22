package loop;

public class WhileLoop 
{

	public static void main(String srg[])
	{
		int i=0;
		while(i<10)
		{
			System.out.println("Value : "+i);
			i++;
		}
		
		do
		{
			System.out.println("Value : "+i);
			i++;
		}
		while(i<10);
	}
}
