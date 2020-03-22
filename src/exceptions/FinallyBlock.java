package exceptions;

public class FinallyBlock {

	public FinallyBlock() 
	{
		System.out.println("I'm Constructor");
	}

	public static void main(String[] args) 
	{
		try {
			System.out.println("Value : "+10/10);
			Class c=FinallyBlock.class;
			System.out.println(c.getClassLoader());
		}
		finally
		{
			System.out.println("Im Finally ");			
		}
		
	}

}
