
public class Euler_3 {

	public static void main(String[] args) {
	long tall = 600851475143L; 
	boolean check;
	long n, status = 1, num = 3;
	
	for (long i=2; i<(tall/i); i++)
	{
		if(tall%i==0)
		{
			check=isPrime(i);
			if (check==true)
			{
				System.out.println(i);
			}
		}
	
	}
	
	}
	
	static boolean isPrime(long n) 
	{
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(long i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}


}
