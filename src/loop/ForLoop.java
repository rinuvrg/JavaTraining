package loop;

public class ForLoop 
{
	public static void main(String arg[])
	{
		String ab[]=new String[10];
	
		//Normal Loop
		for(int i=0;i<ab.length;i++)
		{
			ab[i]=i+"abcd - "+i;
		}
		
		//For each loop
		for(String ar:ab)
		{
			System.out.println("Data : "+ar);
		}
		
		//labeled loop
		System.out.println("****************** Label LOOP *********************");

		aa:
		for(String ar:ab)
		{
			System.out.println("Data : "+ar);
			bb:
				for(int i=0;i<1;i++)
				{
					if((2+"abcd - "+2).equals(ar))
						break bb;
					else
						System.out.println("Inner Loop");
							
				}
				
		}
			
		
	}
}
