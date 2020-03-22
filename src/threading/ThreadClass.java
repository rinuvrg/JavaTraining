package threading;

import java.util.Calendar;
import java.util.Date;

public class ThreadClass extends Thread
{
	public void run()
	{
		while(true)
		{
			try {
			Thread.sleep(2000);
			}catch(Exception e) {e.printStackTrace();}
			System.out.println(new Date()+":: Thread Started :: Server Instantiated");
		}
	}
	
	public static void main(String arg[])
	{
		ThreadClass t=new ThreadClass();
		t.start();
	}
}
