
public class Euler12 
{

	public static void main(String[] args) 
	{
		int x=0;
		int i=0;
		int z=0;
		while (x < 500)
		{
			z = triangle(i);
			x=0;
			if (z%2==0 && z%3==0  && z%5==0 && z%7==0 && z%11==0 && z%13==0 && z%17==0)
			{
				for (int j=1; j<z/2; j ++)
				{
					if(z%j == 0)
						x++;
				}
			}
			
			System.out.println(x);
			i++;
		}
		System.out.println(z);
	}
	
	public static int triangle (int n)
	{
		if (n==0 || n==1)
			return 1;
		else
			return n+triangle(n-1);
	}
	
}

