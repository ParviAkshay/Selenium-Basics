package regularpractice;

import java.util.Arrays;

public class ArraysPractice 
{
//	WAP to addition of all the element in array
	
	public static void main(String[] args) {
		
	
	int a[]= {10,20,30,40,};
	
	int sum = 0;
	
	for(int i=0; i<a.length; i++ )
	{
		sum = sum + a[i];
	}
	System.out.println(sum);

	
//	WAP to add of all element in array which are even index position
	
	int b[]= {2,3,5,6,7,8};
	
	int sum1 = 0;
	
	for (int i=0; i<b.length; i++)
	{
		if(i%2==0)
		{
			sum1 = sum1 + b[i];
		}
	}
	System.out.println(sum1);
	
//	WAP to add all element in array which are odd index position
	
	int sum2 =0;
	
	for(int i=0; i<b.length; i++)
	{
		if(!(i%2==0))
		{
			sum2 = sum2 + b[i];
		}
	}
	System.out.println(sum2);
	
//	WAp to print the add of all the element of array which are even index position
	
	int c[] = {10,20,30,13,11,77,2};
	
	int csum =0;
	
	for (int i=0; i<c.length; i++)
	{
		if(c[i]%2==0)
		{
			csum = csum + c[i];
		}
	}
	System.out.println(csum);

//	WAp add of all the element are odd inside an array 
	
	int csum1=0;
	 for (int i=0; i<c.length; i++)
	 {
		 if (!(c[i]%2==0))
		 {
			 csum1 = csum1 + c[i];
		 }
	 }
	System.out.println(csum1);
	
//	for each Loop/ Advance for loop
	
	int d[]= {7,5,8,3,4,6,8,3,32,1};
	
	for (int w:d)
	{
		System.out.print(w+"-");
	}
	System.out.println();
	
//	WAP to find the missing no of an array
	
	int e[]= {1,2,4,5,6,8};
	
	for(int i=0;i<e.length-1;i++)
	{
		if(!(e[i]+1==e[i+1]))
		{
			System.out.println(e[i]+1);
		}
	}
	
//	sorting an array
	
	Arrays.sort(e);
	for (int w1:e)
	{
		System.out.print(w1+"-");
	}
	System.out.println();
//	WAp to swapping the array
	
	int f[]= {2,1,4,3,6,5,8,7};
	int g =0;
	for (int i=0; i<f.length; i++)
	{
		for (int j=0; j<f.length; j++)
		{
			if(f[i]<f[j])
			{
//				g=f[j];
//				f[j]=f[i];
//				f[i]=g;
				
				g=f[i];
				f[i]=f[j];
				f[j]=g;
			}
		}
	}
	for (int w3 : f)
	{
		System.out.print(w3+" ");
	}
	System.out.println();
	
//	reverse String
	
	String h = "ROTATOR";
	String h1 = "";
	
	for(int i=h.length()-1; i>=0; i--)
	{
		h1 = h1 + h.charAt(i);
	}
	System.out.println(h1);
	
//	
	String j = "Never odd or even";
	 String[] j1 = j.split(" ");
	String j2 = "";
	
	for(int i=j1.length-1; i>=0; i--)
	{
	     String s6 = j1[i];
		 System.out.print(s6+" ");
	}
	
	
	
	
	
	
	}	
}