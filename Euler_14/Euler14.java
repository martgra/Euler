
public class Euler14
{
	
	public static void main(String[] args)
	{
		 int count =0;
		 long number =0;
		  for (long i =1; i < 1000000; i ++)
		  {
			Chain task = new Chain();
			task.even(i);
			if (count < task.getIterations())
			{
				count = task.getIterations();
				number = i;
			}
				
		  }
		  
		  System.out.println("the number is " + number + " and the chain is " + count + " long");
	}

	

	
}
