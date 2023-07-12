package assignment;

public class CheckNoIsPrimeOrNot 
{
	public static void main(String[] args)
	{
		int a=13;
		boolean isprime = true;
		for(int i=2; i<a; i++)
		{
			if(a%i==0)
			{
				isprime=false;
				break;
			}
		}
		System.out.println(isprime);
	}

}
