package arrays;

public class IntegerArray 
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int b[]={10,15,13};
		String ar[]=new String[10];
		String ab[]= {"a","b"};
		
//		for(int i=0;i<10;i++)
//		{
//			a[i]=i;
//			ar[i]=i+"abcd-123-klhko--"+i;
//		}
//		
//		for(int i=0;i<(ar.length-1);i++)
//		{
//			System.out.println("Integer Array : "+a[i]);
//			System.out.println("String  Array : "+ar [i]);
//		}
		String first="Yes, we all' really 'like 'pizza-!.";
		String second="Where can we buy pizza around here?";
		
		IntegerArray arr=new IntegerArray();
		//arr.numberOfCommonWords(first, second);
		arr.longestStrictPalindrome("bob has a racecar and a bike malayalam aaaaaaaaa ");
	}
	
	String longestStrictPalindrome(String input) 
	{
	    String inp[]=input.split(" ");
	    String out=" ";
	    String temp=null;
	    String temr=null;

	    for(int i=0;i<inp.length;i++)
	    {
	        
	        temp=(new StringBuilder(inp[i]).reverse()).toString();
	        if(temp.equals(inp[i]))
	        {

	            String prevchar=null;
	            String nextchar=null;
	            
	            if(i>0)
	            {
	             if(inp[i-1]!=null)
	             {
	                 String tm=inp[i-1];

	                 if(tm.length()>1)
	                 {
	                     prevchar=String.valueOf(tm.charAt(tm.length()-1));
	                 }
	                 else{
	                     prevchar=tm;
	                 }
	             }
	             }
	              if(i+1<inp.length)
	            {
	                	System.out.println("-------*************----");

	                if(inp[i+1]!=null){
	                    if(inp[i+1].length()>1)
	                    {
	                        nextchar=String.valueOf(inp[i+1].charAt(0));
	                    }
	                    else{
	                        nextchar=inp[i+1];
	                    }
	                }
	            }
	              
	              if(nextchar !=null && nextchar.equals(prevchar))
	              {
	            	  System.out.println(prevchar+"////////////////////"+nextchar);
	                  temp=prevchar+" "+temp+" "+nextchar;
	              }

	            if(out.length()<temp.length())
	            {
	                out=temp;
	            }
	            
	        }

	    }

	    return out;
	}
	
	int numberOfCommonWords(String first, String second) 
	{
	    int count=0;
	    try{
	        String firstString[]=first.split("[, ?.@!-']+") ;
	        String secondString[]=second.split("[, ?.@!-']+");

	        for(int i=0;i<firstString.length;i++)
	        {
	            for(int j=0;j<secondString.length;j++)
	            {

                  System.out.println("First Word : "+firstString[i]+" -- Secound Word  : "+secondString[j]);

	                if(firstString[i].equalsIgnoreCase(secondString[j]))
	                {
	                   System.out.println("Intial Count : "+count);	                   
	                    count++;
		                   System.out.println("Final Count : "+count);

	                }
	            }
	        }


	    }catch (Exception e){e.printStackTrace();}
	return count;

	}
	
	int nsew2(String directions) 
	{
	    char direct[]=directions.toCharArray();
	    int count=0;
	    
	    for(int i=0;i<direct.length;i++)
	    {
	        int value=0;

	        
	    }
	    return count;
	}

}
