package Demo;

public class First {
	public static void main(String[] args)
	{
		try
		{
			int data=100/0;
			
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}catch(Exception e) { System.out.println(e);}
		finally {System.out.println("finally block is always executed");} 
		
		System.out.println("rest of the code");
	}

}
