package assignment;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		for(int number=2; number<=100; number++)
		{
			boolean isprime = true;
			
			for(int i=2; i<number; i++)
			{
				if(number%i==0)
				{
					isprime = false;
					break;
				}
			}
			
			if(isprime)
			{
				System.out.println(number);
			}
		}
	}

}
