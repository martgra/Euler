
public class Euler_2 {

	public static void main(String[] args) 
	{
		int first =1;
		int second =2;
		int sum =0;
		int grandresult=2;
		
		System.out.println(first +"\n" +second);
		while (sum < 4000000)
		{
			if (sum %2 ==0)
				grandresult=grandresult+sum;	
			if (sum>=3)
					System.out.println(sum);				
				sum=first+second;
				first=second;
				second=sum;
				
				
		}
		System.out.println(grandresult);
		
	}

}
