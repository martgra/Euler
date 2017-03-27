
class Chain
{
	int counter;
	public void even (long even)
	{
		counter ++;
		if (even == 1)
		return;
		else if (even%2==0)
		{
			//System.out.println(even);
			even(even/2);
		}
		else 
		{
			//System.out.println(even);
			even(3*even+1);
			
		}
	}
	
	public int getIterations() 
	{
		return counter;
	}
	
	
	
	
}
