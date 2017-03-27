
public class Euler_1 
{
	public static void main (String[]args)
	{
	double i = 0;
	double sum =0;
	double result =0;
	
	
	
	while (result < 1000)
	{
		result++;
		if(result < 1000)
		{
			if(result %5 ==0 || result %3 ==0)
			{
				sum=sum+result;
			}
		}
		
	}
	
	System.out.println(sum);
	
		}
}
	
