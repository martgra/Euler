import java.util.Arrays;
public class Euler10 
{

	public static void main(String[] args) 
	{
		int twoMill = 2000000;
		boolean[] list = new boolean[twoMill];
		Arrays.fill(list, true);
		int k=0;
		long sum=0;
		
		for (int i = 2; i < Math.sqrt(twoMill); i++)
		{
			if (list[i] == true)
			{
				for (int j = (int) Math.pow((i),2); j<twoMill; j=(int) Math.pow((i),2)+k*(i))
				{
					k++;
					list[j]=false;
				}
				k=0;
			}
		}
		for (int m =2; m < twoMill; m++)
		{
			if (list[m]==true)
			{
				sum=sum+m;
				System.out.println(m);
			}
		}
		
		System.out.println(sum);
		System.out.println(sum+sum);
		

	}

}
