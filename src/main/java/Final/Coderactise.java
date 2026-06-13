package Final;

 class Coderactise implements Runnable
	
{
	
	
	public void run()
	{
		
		
		System.out.print("shivam");
	}
	
	public static void main(String[]args)
	{
		
		
		
		Thread t=new Thread(new Coderactise());
		
		t.start();
		
	}
	
}