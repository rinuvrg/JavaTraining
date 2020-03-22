package threading;

public class SampleThread implements Runnable 
{
	public void run()
	{
		System.out.println("Thread Starting");
	}
	
	public static void main(String arg[])
	{
		SampleThread st=new SampleThread();
		Thread t=new Thread(st);
		t.start();
	}
}
